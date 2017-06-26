package vnpt;

import java.io.IOException;
import java.rmi.RemoteException;

import org.tempuri.PublishServiceSoap;
import org.tempuri.PublishServiceSoapProxy;





import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.message.MessageReturnUtils;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.Header.From;
import vn.dtt.gt.dk.nsw.Header.Reference;
import vn.dtt.gt.dk.nsw.Header.Subject;
import vn.dtt.gt.dk.nsw.Header.To;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.Customers;
import vn.dtt.gt.dk.nsw.model.Invoices;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.FormatData;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;


public class CallWebserviceClient {
	
		private static Log log = LogFactoryUtil.getLog(CallWebserviceClient.class);
		
	  public PublishServiceSoap getPublishServiceSoap(){
		  return (new PublishServiceSoapProxy()).getPublishServiceSoap();
	  }
	  
	  public static int updateCus(Customers customers) throws IOException,
		RemoteException {
		CallWebserviceClient callWebserviceClient = new CallWebserviceClient();
		  PublishServiceSoap publishServiceSoap = callWebserviceClient.getPublishServiceSoap();
		  String	xml = MessageFactory.convertObjectToXml(customers);
		  int test1= publishServiceSoap.updateCus(xml, "vrservice", "Dangkiem@2015", 0);
		return test1;
	  }
	  
	  public static String importAndPublishInv(Invoices invoices)
				throws IOException, RemoteException {
			CallWebserviceClient callWebserviceClient = new CallWebserviceClient();
			  PublishServiceSoap publishServiceSoap = callWebserviceClient.getPublishServiceSoap();
			  String	xml2 = MessageFactory.convertObjectToXml(invoices);			
			  log.debug(xml2);
			  //String test2= publishServiceSoap.importAndPublishInv("test1", "123456", xml2, "vrservice","Dangkiem@2015",  "", "", 1);
			  String test2= publishServiceSoap.importAndPublishInv("ddt", "ddtaA@", xml2, "vrservice","Dangkiem@2015",  "01GTKT0/001", "AA/17E", 0);
			  return test2;
	  }
	  
	  public static Header createHeaderVNPT( String function, int messageType, String userName, String messageIdSentToVNPT, String version,TthcHoSoThuTuc hoSoThuTuc) {
			try {
				
				TthcThuTucHanhChinh tthcThuTucHanhChinh =  TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
//				log.info("tthcThuTucHanhChinh   "+tthcThuTucHanhChinh.getMaThuTuc());
				Header header = new Header();
				Subject subject = new Subject();
				subject.setDocumentType(tthcThuTucHanhChinh.getMaThuTuc());//matthc
				
				subject.setDocumentYear(Integer.parseInt( FormatData.getYear(hoSoThuTuc.getNgayGuiHoSo())));
				subject.setPreReference(Long.valueOf( hoSoThuTuc.getMaSoHoSo()));
				subject.setReference(Long.valueOf( hoSoThuTuc.getMaSoHoSo()));
				
				subject.setFunction(function);
				subject.setSendDate(FormatData.parseDateToTring(new Date()));
				subject.setType(messageType);
				
				From from = new From();
				//TODO chua biet lay dau
				from.setIdentity("System");
				from.setName(userName);
				from.setCountryCode("VN");
				from.setMinistryCode("BGTVT");
				from.setOrganizationCode("BGTVT");
				from.setUnitCode(hoSoThuTuc.getMaDonViTiepNhan());
				
				To to = new To();
				to.setIdentity(hoSoThuTuc.getMaSoChuHoSo());
				to.setName(hoSoThuTuc.getTenChuHoSo());
				to.setCountryCode("VN");
				to.setMinistryCode("BTTTT");
				to.setOrganizationCode("BTTTT");
				to.setUnitCode("VNPT");
				
				Reference ref = new Reference();
				ref.setMessageId(messageIdSentToVNPT);
				ref.setVersion(version);
				
				header.setFrom(from);
				header.setTo(to);
				header.setReference(ref);
				header.setSubject(subject);
				
				return header;
			} catch (Exception e) {
				log.error(e);
			}
			return null;
		}

	/*  public static void main1(String[]  abc){
		  try{
			  // Tao du lieu khach hang --- for updateCus
			  Customers customers = new Customers();
			  Customers.Customer customer = new Customers.Customer();
			  customer.setName("Công ty TNHH Bảo Minh Motor Việt Nam");
			  customer.setCode("0105580911");
			  customer.setTaxCode("0105580911");
			  customer.setAddress("Số 239, ngõ 281, đường Trần Khát Chân, phường Thanh Nhàn, quận Hai Bà Trưng, TP.Hà Nội");
			  customer.setBankAccountName("Quỹ Nhân ái – Báo Khuyến học và Dân trí");
			  customer.setBankName("Ngân hàng TMCP Ngoại Thương Việt Nam - Vietcombank");
			  customer.setBankNumber("0451001944487");
			  customer.setEmail("dk4@abc.vn");
			  customer.setFax("0439330233");
			  customer.setPhone("0913528485");
			  customer.setContactPerson("Huỳnh Ngọc Đức");
			  customer.setRepresentPerson("Huỳnh Ngọc Đức");
			  String sLoaiHinhDoanhNghiep = "CÔNG TY";
			  
			  if (customer.getName().toUpperCase().contains(sLoaiHinhDoanhNghiep.toUpperCase()))
			  {
				  customer.setCusType("1");
			  } else
			  {
				  customer.setCusType("0");
			  }			 		  
			  customers.getCustomer().add(customer);
			 			  
			  int test1 = updateCus(customers);
			  log.info("test1 " +test1);

//			  String test= publishServiceSoap.importAndPublishInv("test1", "123456", stringBuffer.toString(), "vrservice","Dangkiem@2015",  "", "", 1);
			//  hInv("test1", "123456", stringBuffer.toString(),"vrservice", "Dangkiem@2015","ana","akak", i);
			 // int test= publishServiceSoap.importAndPublishInv("test1", "123456", stringBuffer.toString(),"vrservice", "Dangkiem@2015","ana","akak", 1);
			  //int test= publishServiceSoap.importAndPublishInv("test1", "123456", stringBuffer.toString(),"vrservice", "Dangkiem@2015", 1);
			//  log.info("test "+test);

			  
			  // Tao du lieu hoa don --- for importAndPublishInv
			  Invoices invoices = new Invoices();
			  Invoices.Inv inv = new Invoices.Inv();
			  inv.setKey("1449816310162");
			  
			  Invoices.Inv.Invoice invoiceDetails = new Invoices.Inv.Invoice();
			  invoiceDetails.setCusCode("0105580911");
			  invoiceDetails.setCusName("Công ty TNHH Bảo Minh Motor Việt Nam");
			  invoiceDetails.setCusAddress("Số 239, ngõ 281, đường Trần Khát Chân, phường Thanh Nhàn, quận Hai Bà Trưng, TP.Hà Nội");
			  invoiceDetails.setCusPhone("0913528485");
			  invoiceDetails.setCusTaxCode("0105580911");
			  invoiceDetails.setPaymentMethod("--TIỀN MẶT--");
			  invoiceDetails.setKindOfService("201512");
			  // Chi tiet tung dong ghi tren hoa don
			  Invoices.Inv.Invoice.Products products = new Invoices.Inv.Invoice.Products();  
			  Invoices.Inv.Invoice.Products.Product product = new Invoices.Inv.Invoice.Products.Product();
			  // lan 1
			  product.setProdName("Số ĐKKT "+"000064/15OT (1_xe)");
			  product.setProdUnit("Bộ");
			  product.setProdQuantity("1");
			  product.setProdPrice("954545");
			  product.setAmount("954545");
			  products.getProduct().add(product);
			  
			  Invoices.Inv.Invoice.Products.Product product2 = new Invoices.Inv.Invoice.Products.Product();
			  // lan n khong co text so dkkt
			  product2.setProdName("        "+"000065/15OT (10_xe)");
			  product2.setProdUnit("Bộ");
			  product2.setProdQuantity("1");
			  product2.setProdPrice("9545450");
			  product2.setAmount("9545450");
			  products.getProduct().add(product2);
			  
			  invoiceDetails.setProducts(products);
			  
			  invoiceDetails.setTotal("10499995");
			  invoiceDetails.setDiscountAmount("0");
			  invoiceDetails.setVATRate("10");
			  invoiceDetails.setVATAmount("1050005");
			  invoiceDetails.setExtra("550000");
			  invoiceDetails.setAmount("12100000");
			  invoiceDetails.setAmountInWords("Mười hai triệu một trăm ngàn đồng chẵn./");
			  inv.getInvoice().add(invoiceDetails);
			  
			  invoices.getInv().add(inv);
			  
			  String test2 = importAndPublishInv(invoices);
			  log.info("test2 " +test2);
			  
			  				 
			  testXuatHoaDon_DuLieuGiaLap();
			  
		  }catch(Exception e){
		  }
	  }*/

	/*private static void testXuatHoaDon_DuLieuGiaLap() throws RemoteException {
		StringBuffer stringBuffer = new StringBuffer();
		  
		  stringBuffer.append("<Invoices>");			  
		  stringBuffer.append("<Inv>");
		  stringBuffer.append("<key>1441241045637</key>");
		  stringBuffer.append("<Invoice>");
		  stringBuffer.append("<CusCode>MaKhachHang_001</CusCode>");
		  stringBuffer.append("<CusName>Công ty TNHH Yamaha Motor Việt Nam</CusName>");
		  stringBuffer.append("<CusAddress>Xã Trung Giã, huyện Sóc Sơn, thành phố Hà Nội</CusAddress>");
		  stringBuffer.append("<CusPhone>04.37684721</CusPhone>");
		  stringBuffer.append("<CusTaxCode>0100774342</CusTaxCode>");
		  stringBuffer.append("<PaymentMethod>Chuyá»ƒn khoáº£n</PaymentMethod>");
		  stringBuffer.append("<KindOfService></KindOfService>");
		  stringBuffer.append("<Products> <Product>");
		  stringBuffer.append("<ProdName>Kiểm tra chất lượng xe NK NM-X (1441241045637): 000634/15XM</ProdName>");
		  stringBuffer.append("<ProdUnit>bộ</ProdUnit>");
		  stringBuffer.append("<ProdQuantity>32</ProdQuantity>");
		  stringBuffer.append("<ProdPrice>45454</ProdPrice>");
		  stringBuffer.append("<Amount>1454545</Amount>");
		  stringBuffer.append("</Product></Products>");
		  stringBuffer.append("<Total>1454545</Total>");
		  stringBuffer.append("<VATRate>10</VATRate>");
		  stringBuffer.append("<VATAmount>145455</VATAmount>");
		  stringBuffer.append("<Extra>1600000</Extra>");
		  stringBuffer.append("<Amount>3200000</Amount>");
		  stringBuffer.append("<AmountInWords>Ba triệu hai trăm ngàn đồng chẵn.</AmountInWords>");
		  stringBuffer.append("</Invoice>");
		  stringBuffer.append("</Inv>");
		  stringBuffer.append("</Invoices>");
		  
		  

		 
		  CallWebserviceClient callWebserviceClient = new CallWebserviceClient();
		  PublishServiceSoap publishServiceSoap = callWebserviceClient.getPublishServiceSoap();
		  
		  String test= publishServiceSoap.importAndPublishInv("test1", "123456", stringBuffer.toString(), "vrservice","Dangkiem@2015",  "", "", 1);		  
		  log.info("test "+test);
	}*/
	
	
	    public static String formatNumberForRead(double number) {
	        NumberFormat nf = NumberFormat.getInstance();
	        String temp = nf.format(number);
	        String strReturn = "";
	        int slen = temp.length();
	        for (int i = 0; i < slen; i++) {
	            if (String.valueOf(temp.charAt(i)).equals("."))
	                break;
	            else if (Character.isDigit(temp.charAt(i))) {
	                strReturn += String.valueOf(temp.charAt(i));
	            }
	        }
	        return strReturn;

	    }
	    public static String numberToString(double number) {
	        String sNumber = formatNumberForRead(number);
	        // Tao mot bien tra ve
	        String sReturn = "";
	        // Tim chieu dai cua chuoi
	        int iLen = sNumber.length();
	        // Lat nguoc chuoi nay lai
	        String sNumber1 = "";
	        for (int i = iLen - 1; i >= 0; i--) {
	            sNumber1 += sNumber.charAt(i);
	        }
	        // Tao mot vong lap de doc so
	        // Tao mot bien nho vi tri cua sNumber
	        int iRe = 0;
	        do {
	            // Tao mot bien cat tam
	            String sCut = "";
	            if (iLen > 3) {
	                sCut = sNumber1.substring((iRe * 3), (iRe * 3) + 3);
	                sReturn = Read(sCut, iRe) + sReturn;
	                iRe++;
	                iLen -= 3;
	            } else {
	                sCut = sNumber1.substring((iRe * 3), (iRe * 3) + iLen);
	                sReturn = Read(sCut, iRe) + sReturn;
	                break;
	            }
	        } while (true);
	        if(sReturn.length() > 1){
	            sReturn = sReturn.substring(0,1).toUpperCase() + sReturn.substring(1);
	        }
	        
	        sReturn = sReturn + DKConfigurationManager.getStrProp("numberToString.dong.chan", "dong chan.");
	        return sReturn;
	    }

	    // Khoi tao ham Read
	    public static String Read(String sNumber, int iPo) {
	        // Tao mot bien tra ve
	        String sReturn = "";
	        // Tao mot bien so
	        String sPo[] = { "", DKConfigurationManager.getStrProp("numberToString.ngan", "ngan") + " ",
	        		DKConfigurationManager.getStrProp("numberToString.trieu", "trieu") + " ", DKConfigurationManager.getStrProp("numberToString.ty", "ty") + " " };
	        String sSo[] = { DKConfigurationManager.getStrProp("numberToString.0", "khong") + " ", DKConfigurationManager.getStrProp("numberToString.1", "mot") + " ",
	        		DKConfigurationManager.getStrProp("numberToString.2", "hai") + " ", DKConfigurationManager.getStrProp("numberToString.3", "ba") + " ",
	        		DKConfigurationManager.getStrProp("numberToString.4", "bon") + " ", DKConfigurationManager.getStrProp("numberToString.5", "nam") + " ",
	        		DKConfigurationManager.getStrProp("numberToString.6", "sau") + " ", DKConfigurationManager.getStrProp("numberToString.7", "bay") + " ",
	        		DKConfigurationManager.getStrProp("numberToString.8", "tam") + " ", DKConfigurationManager.getStrProp("numberToString.9", "chin") + " " };
	        String sDonvi[] = { "", DKConfigurationManager.getStrProp("numberToString.muoi", "muoi") + " ",
	        		DKConfigurationManager.getStrProp("numberToString.tram", "tram") + " " };
	        // Tim chieu dai cua chuoi
	        int iLen = sNumber.length();
	        // Tao mot bien nho vi tri doc
	        int iRe = 0;
	        // Tao mot vong lap de doc so
	        for (int i = 0; i < iLen; i++) {
	            String sTemp = "" + sNumber.charAt(i);
	            int iTemp = Integer.parseInt(sTemp);
	            // Tao mot bien ket qua
	            String sRead = "";
	            // Kiem tra xem so nhan vao co = 0 hay ko
	            if (iTemp == 0) {
	                switch (iRe) {
	                case 0:
	                    break;// Khong lam gi ca
	                case 1: {
	                    if (Integer.parseInt("" + sNumber.charAt(0)) != 0) {
	                        sRead = DKConfigurationManager.getStrProp("numberToString.le", "le") + " ";
	                    }
	                    break;
	                }
	                case 2: {
	                    if (Integer.parseInt("" + sNumber.charAt(0)) != 0
	                            && Integer.parseInt("" + sNumber.charAt(1)) != 0) {
	                        sRead = DKConfigurationManager.getStrProp("numberToString.khong.tram", "khong tram") + " ";
	                    }
	                    break;
	                }

	    	        
	                }
	            } else if (iTemp == 1) {
	                switch (iRe) {
	                case 1:
	                    sRead = DKConfigurationManager.getStrProp("numberToString.10", "muoi") + " ";
	                    break;
	                default:
	                    sRead = DKConfigurationManager.getStrProp("numberToString.1", "mot") + " " + sDonvi[iRe];
	                    break;
	                }
	            } else if (iTemp == 5) {
	                switch (iRe) {
	                case 0: {
	                    if(sNumber.length() <= 1){
	                        sRead = DKConfigurationManager.getStrProp("numberToString.nam", "nam") + " ";
	                    }
	                    else if (Integer.parseInt("" + sNumber.charAt(1)) != 0) {
	                        sRead = DKConfigurationManager.getStrProp("numberToString.lam", "lam") + " ";
	                    } else
	                        sRead = DKConfigurationManager.getStrProp("numberToString.nam", "nam") + " ";
	                    break;
	                }
	                default:
	                    sRead = sSo[iTemp] + sDonvi[iRe];
	                }
	            } else {
	                sRead = sSo[iTemp] + sDonvi[iRe];
	            }

	            sReturn = sRead + sReturn;
	            iRe++;
	        }
	        if (sReturn.length() > 0) {
	            sReturn += sPo[iPo];
	        }

	        return sReturn;
	    }

	    public static String getRomanNumerals(int Int) {
	        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
	        roman_numerals.put("M", 1000);
	        roman_numerals.put("CM", 900);
	        roman_numerals.put("D", 500);
	        roman_numerals.put("CD", 400);
	        roman_numerals.put("C", 100);
	        roman_numerals.put("XC", 90);
	        roman_numerals.put("L", 50);
	        roman_numerals.put("XL", 40);
	        roman_numerals.put("X", 10);
	        roman_numerals.put("IX", 9);
	        roman_numerals.put("V", 5);
	        roman_numerals.put("IV", 4);
	        roman_numerals.put("I", 1);
	        String res = "";
	        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
	          int matches = Int/entry.getValue();
	          res += repeat(entry.getKey(), matches);
	          Int = Int % entry.getValue();
	        }
	        return res;
	  }
	  public static String repeat(String s, int n) {
	    if(s == null) {
	        return null;
	    }
	    final StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++) {
	        sb.append(s);
	    }
	    return sb.toString();
	  }
	

	
}
	  

