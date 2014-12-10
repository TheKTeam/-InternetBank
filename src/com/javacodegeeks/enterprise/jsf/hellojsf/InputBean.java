package com.javacodegeeks.enterprise.jsf.hellojsf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
 
import java.nio.file.Paths;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
//import javax.servlet.http.Part;
 
@ManagedBean(name = "inputBean")
@ViewScoped
public class InputBean implements Serializable {
 
	//private static final long serialVersionUID = 9040359120893077422L;
 
	private Part part;
	private String statusMessage;
 
	public String uploadFile() throws IOException {
 
		// Extract file name from content-disposition header of file part
		String fileName = getFileName(part);
		System.out.println("***** fileName: " + fileName);
		//System.out.println(getClass().getResource("WebContent/resources/img/1.jpg").getPath());
  ///указать директорию с img d:\ForKyrs2\HelloJSF\WebContent\resources\img\
		//String basePath = "c:" + File.separator + "temp" + File.separator  ;
		//String basePath = "\\WebContent/resources/img/"  ;
		
		String basePath = "D:"+ File.separator + "ForKyrs2"+ File.separator + "HelloJSF"+ File.separator + "WebContent"+ File.separator + "resources"+  File.separator + "img"+ File.separator;
		// basePath = File.separator;
		int index = fileName.lastIndexOf(".");
		String trimedName = fileName.substring(index-1);
		//System.out.println(p2+" ------------");
		File outputFilePath = new File(basePath + trimedName);
 System.out.println(outputFilePath.toString()+" trimed");
 System.out.println(basePath+" base");
		// Copy uploaded file to destination path
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = part.getInputStream();
			outputStream = new FileOutputStream(outputFilePath);
 
			int read = 0;
			final byte[] bytes = new byte[1024];
			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
 
			statusMessage = "File upload successfull !!";
		} catch (IOException e) {
			e.printStackTrace();
			statusMessage = "File upload failed !!";
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
		}
		return null;    // return to same page
	}
 
	public Part getPart() {
		return part;
	}
 
	public void setPart(Part part) {
		this.part = part;
	}
 
	public String getStatusMessage() {
		return statusMessage;
	}
 
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
 
	// Extract file name from content-disposition header of file part
	private String getFileName(Part part) {
		final String partHeader = part.getHeader("content-disposition");
		System.out.println("***** partHeader: " + partHeader);
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				System.out.println("lol" + content.substring(content.indexOf('=') + 1).trim()
						.replace("\"", ""));
				return content.substring(content.indexOf('=') + 1).trim()
						.replace("\"", "");
			}
		}
		return null;
	}
}