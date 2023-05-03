package egovframework.let.crud.service;

import java.io.Serializable;

import egovframework.com.cmm.ComDefaultVO;

public class CrudVO extends ComDefaultVO implements Serializable{

	private String CrudId;
	
	private String CrudSj;
	
	private String CrudCn;
	
	private String UserNm;
	
	private java.util.Date frstRegistPnttm;

	public String getCrudId() {
		return CrudId;
	}

	public void setCrudId(String crudId) {
		CrudId = crudId;
	}

	public String getCrudSj() {
		return CrudSj;
	}

	public void setCrudSj(String crudSj) {
		CrudSj = crudSj;
	}

	public String getCrudCn() {
		return CrudCn;
	}

	public void setCrudCn(String crudCn) {
		CrudCn = crudCn;
	}

	public String getUserNm() {
		return UserNm;
	}

	public void setUserNm(String userNm) {
		UserNm = userNm;
	}

	public java.util.Date getFrstRegistPnttm() {
		return frstRegistPnttm;
	}

	public void setFrstRegistPnttm(java.util.Date frstRegistPnttm) {
		this.frstRegistPnttm = frstRegistPnttm;
	}
}
