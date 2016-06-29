package com.weqia.pojo;

import java.io.File;


public class FileUploadForm {
	
	private File[] files;
	
	private String[] contentTypes;
	
	private String[] fileNames;

	private int itype;

	private String openId;
		
	/**
	 * 文件类型 1-图片 2-语音 3-视频 4-文件
	 */
	private Byte[] fileTypes;	

	public Byte[] getFileTypes() {
		return fileTypes;
	}

	public void setFileTypes(Byte[] fileTypes) {
		this.fileTypes = fileTypes;
	}

	/**
	 * 
	 * 文件播放时长
	 * 
	 */
	private Integer[] playTimes;
	
//	public String getExtName(){
//		if(null == fileName)
//			return null;
//		if(fileName.lastIndexOf(".") != -1)
//			return fileName.substring(fileName.lastIndexOf(".") + 1);
//		return null;
//	}	


	public Integer[] getPlayTimes() {
		return playTimes;
	}

	public void setPlayTimes(Integer[] playTimes) {
		this.playTimes = playTimes;
	}

	public int getItype() {
		return itype;
	}

	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
	}

	public String[] getContentTypes() {
		return contentTypes;
	}

	public void setContentTypes(String[] contentTypes) {
		this.contentTypes = contentTypes;
	}

	public String[] getFileNames() {
		return fileNames;
	}

	public void setFileNames(String[] fileNames) {
		this.fileNames = fileNames;
	}

	public void setItype(int itype) {
		this.itype = itype;
	}
	
	/**
	 * 上传的多个文件总共大小,单位 KByte
	 * @return
	 */
//	public double getFileSize(){
//		if(null == files || files.length == 0)
//			return 0;
//		double file_size =0;
//		for(File file: files){
//			if (file !=null)
//				file_size =ArithUtil.add(file_size, ArithUtil.div(file.length(), 1024, 2)) ;
//		}
//			
//		return file_size;
//	}
	
	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * 
	 * @Description 获取指定文件的大小，单位M
	 * @param i
	 * @return  
	 *
	 */
	public double getFileSizeM(int i){

		if(null == files || files.length == 0)
			return 0;
		
		if (null == files[i])
			return 0;
		
		double file_size = ArithUtil.div(files[i].length(), 1024*1024, 2) ;
		
		return file_size;
	}

}
