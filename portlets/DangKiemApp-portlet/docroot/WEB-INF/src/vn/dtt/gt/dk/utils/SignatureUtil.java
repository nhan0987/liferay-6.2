package vn.dtt.gt.dk.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

import javax.imageio.ImageIO;

import vgca.svrsigner.ServerSigner;

import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.StreamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;

public class SignatureUtil {

	public static Certificate getCertificateByPath(String path)
			throws CertificateException, FileNotFoundException,
			URISyntaxException {
		
		InputStream is = null;
		Certificate cert = null;
		
		try {
			is = new FileInputStream(new File(path));
			
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
	
			cert = cf.generateCertificate(is);
		} finally {
			StreamUtil.cleanUp(is);
		}

		return cert;
	}

	public static ServerSigner getServerSigner(String fullPath,
			Certificate cert, String imageBase64) {
		ServerSigner signer = new ServerSigner(fullPath, cert);
		signer.setSignatureGraphic(imageBase64);
		signer.setSignatureAppearance(PdfSignatureAppearance.RenderingMode.GRAPHIC_AND_DESCRIPTION);
		return signer;
	}

	public static String getSignatureImageBase64(String url) {

		String base64 = StringPool.BLANK;

		InputStream is = null;

		ByteArrayOutputStream os = null;

		try {
			is = new URL(url).openStream();
			os = new ByteArrayOutputStream();

			byte[] buffer = new byte[1024];

			byte[] imageBuff = null;

			int length;

			while ((length = is.read(buffer)) != -1)
				os.write(buffer, 0, length); // copy streams

			imageBuff = os.toByteArray();

			base64 = Base64.encode(imageBuff);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				_log.error(e);
			}
		}
		return base64;
	}

	public static String getSignatureImageBase64ByPath(String fullPath) {

		String base64 = StringPool.BLANK;

		try {
			InputStream is = new FileInputStream(new File(fullPath));

			base64 = getSignatureImageBase64ByInputStream(is);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return base64;
	}
	
	public static String getSignatureImageBase64ByInputStream(InputStream is) {

		String base64 = StringPool.BLANK;

		ByteArrayOutputStream os = null;

		try {
			os = new ByteArrayOutputStream();

			byte[] buffer = new byte[1024];

			byte[] imageBuff = null;

			int length;

			while ((length = is.read(buffer)) != -1)
				os.write(buffer, 0, length); // copy streams

			imageBuff = os.toByteArray();

			base64 = Base64.encode(imageBuff);

		} catch (Exception e) {
			_log.error(e);
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				_log.error(e);
			}
		}
		
		return base64;
	}

	public static BufferedImage getImage(String url) throws IOException,
			URISyntaxException {
		InputStream is = null;
		BufferedImage bimg = null;
		try {
			is = new URL(url).openStream();
			bimg = ImageIO.read(is);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
		}

		return bimg;
	}

	public static BufferedImage getImageByPath(String fullPath)
			throws IOException, URISyntaxException {
		InputStream is = null;
		BufferedImage bimg = null;
		try {
			is = new FileInputStream(new File(fullPath));
			bimg = ImageIO.read(is);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
		}

		return bimg;
	}
	
	public static BufferedImage getImageByInputStream(InputStream is)
			throws IOException, URISyntaxException {
		BufferedImage bimg = null;
		
		try {
			bimg = ImageIO.read(is);
		} catch (Exception e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
		}

		return bimg;
	}

	public static String saveAsPdf(String dest, long fileId) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		String imagePath = StringPool.BLANK;
		try {

			FileEntry fileEntry = getFileEntry(fileId);
			if(fileEntry==null) return null;
			is = fileEntry.getContentStream();
			imagePath = dest +"/"+ fileEntry.getTitle() ;

			os = new FileOutputStream(imagePath);

			byte[] b = new byte[1024];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

		} catch (Exception e) {
			
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		
		return imagePath;
	}

	public static String saveAsImage(String dest, String email,
			String ext, long fileId) throws IOException {
		// BufferedImage image = null;
		InputStream is = null;
		OutputStream os = null;
		String imagePath = StringPool.BLANK;
		try {

			is = getInputStreamByFileEntryId(fileId);
			imagePath = dest + email + "." + ext;

			os = new FileOutputStream(imagePath);

			byte[] b = new byte[1024];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

		} catch (IOException e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		return imagePath;
	}

	public static FileEntry getFileEntry(long fileEnTryId) {
		FileEntry fileEntry = null;

		try {
			fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEnTryId);

		} catch (Exception e) {
			_log.error(e);
		}

		return fileEntry;
	}
	public static InputStream getInputStreamByFileEntryId(long fileEnTryId) {
		InputStream inputStream = null;

		try {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileEnTryId);

			inputStream = fileEntry.getContentStream();
		} catch (Exception e) {
			_log.error(e);
		}

		return inputStream;
	}

	private static Log _log = LogFactoryUtil.getLog(SignatureUtil.class);
}
