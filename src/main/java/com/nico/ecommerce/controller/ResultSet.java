package com.nico.ecommerce.controller;

public class ResultSet {
	
	private boolean success;
	private String message;
	private Object data;
	private String StackTrace;
	
	public static ResultSet negativeInstance() {
		ResultSet res = new ResultSet();
		res.setSuccess(false);
		return res;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getStackTrace() {
		return StackTrace;
	}
	public void setStackTrace(String stackTrace) {
		StackTrace = stackTrace;
	}
	
	
}
