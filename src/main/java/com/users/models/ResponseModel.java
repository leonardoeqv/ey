package com.users.models;

public class ResponseModel {
	private int code;
	private String mensaje;
	private Object data;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getInformation() {
		return mensaje;
	}
	public void setInformation(String information) {
		this.mensaje = information;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
