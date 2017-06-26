<%@page import="java.io.InputStream"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%
boolean isMultipart = ServletFileUpload.isMultipartContent(request);
String url = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/DangKiemApp-portlet/kysotemp/";
try{
	//Create a factory for disk-based file items
	DiskFileItemFactory factory = new DiskFileItemFactory();
	
	String relativeWebPath = "/";
	String absoluteFilePath = getServletContext().getRealPath(relativeWebPath);
    // constructs path of the directory to save uploaded file
    String savePath = absoluteFilePath + File.separator + "kysotemp";
    File fileSaveDir = new File(savePath);
    if (!fileSaveDir.exists()) {
        fileSaveDir.mkdir();
    }
	//Configure a repository (to ensure a secure temp location is used)
	ServletContext servletContext = this.getServletConfig().getServletContext();
	File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
	factory.setRepository(repository);
	
	//Create a new file upload handler
	 ServletFileUpload upload = new ServletFileUpload(factory);
	
	//Parse the request
	List<FileItem> items = upload.parseRequest(request);
	Iterator<FileItem> iter = items.iterator();
	while (iter.hasNext()) {
	    FileItem item = iter.next();
	    if (!item.isFormField()) {
	   	    File uploadedFile = new File(fileSaveDir.getAbsolutePath()+File.separator+item.getName());
	   	    item.write(uploadedFile);
	   	    out.print(url+uploadedFile.getName());
	    	break;
	    }
	} 
}catch(Exception ex){
	out.print(ex.toString());
	System.out.print(ex.toString());
}
%>