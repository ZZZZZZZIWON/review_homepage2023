package egovframework.let.temp3.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;

public class Temp3VO extends ComDefaultVO implements Serializable{

	private String tempId;
	
	private String tempVal;

	public String getTempId() {
		return tempId;
	}

	public void setTempId(String tempId) {
		this.tempId = tempId;
	}

	public String getTempVal() {
		return tempVal;
	}

	public void setTempVal(String tempVal) {
		this.tempVal = tempVal;
	}
	
	
}
