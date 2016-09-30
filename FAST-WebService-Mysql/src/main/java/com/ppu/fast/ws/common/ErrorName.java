package com.ppu.fast.ws.common;

public enum ErrorName {
	// validation error
	NOTFOUND("DATA_NOT_FOUND", 001, "Data not found"),
	INPUT_MISSING_FNAME("MISSING_FNAME", 002, "First Name is missing in input"),
	INPUT_MISSING_LNAME("MISSING_LNAME", 003, "Last Name is missing in input"), 
	INPUT_MISSING_SALARY("MISSING_SALARY", 004, "Salary is missing in input"),
	INPUT_MISSING("INPUT MISSING", 005, "Missing input in request"),
	JSON_ERROR("JSON EXCEPTION", 006, "Data Error. Please contact administrator !"),
	
	UNKNOWN_ERROR("UNKNOWN ERROR", -1, "Unknown error. Please contact Administrator."), 
	TIMEOUT("TIMEOUT", -2, "Server Process timeout. Please try again later."), 
	SESSION_TIMEOUT("TIMEOUT", -3, "Session timeout. Please login again."), 
	BROWSER_PROBLEM("BROWSER PROBLEM", 400, "Browser problem occurred. Please try again later."), 
	UNAUTHORIZED_LOGIN("UNAUTHORIZED LOGIN", 401, "Unauthorized user. User not found or invalid password."), 
	FUNCTION_ERROR("METHOD PROBLEM", 501, "Method problem. Please contact Administrator."),
	DATABASE_ERROR("DATABASE PROBLEM", 601, ""),

	// business error
	APP_CHANGED_ERROR("QUERY PROBLEM", 701, "Application has changed. Please update your app or contact your administrator."),
	LKP_INCOMPLETE_ERROR("STAGING PROBLEM", 702, "LKP List is not ready. Please try again later."),
	LKP_NOTFOUND("LKP_NOT_FOUND", 703, "LKP not found"),
	COLLECTOR_NOTFOUND("COLLECTOR_NOT_FOUND", 705, "Collector not found")
	;
	
	private String errorName;
	private Integer errorCode;
	private String errorDesc;
	
	private ErrorName(String errorName, Integer errorCode, String errorDesc) {
		this.errorName = errorName;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public String getErrorName() {
		return errorName;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

}
