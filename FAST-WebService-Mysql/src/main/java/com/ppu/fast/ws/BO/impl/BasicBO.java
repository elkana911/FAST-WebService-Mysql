package com.ppu.fast.ws.BO.impl;

import com.ppu.fast.ws.common.ErrorName;
import com.ppu.fast.ws.service.response.ErrorResponse;

public class BasicBO {
	protected ErrorResponse getErrorResponse(ErrorName errorCode) {
		ErrorResponse error = new ErrorResponse();
		
		error.setErrorCode(errorCode.getErrorCode());
		error.setErrorName(errorCode.getErrorName());
		error.setErrorDesc(errorCode.getErrorDesc());
		
		return error;
	}
	
	protected ErrorResponse getErrorResponse(ErrorName errorCode, String customMessage) {
		ErrorResponse error = new ErrorResponse();
		
		error.setErrorCode(errorCode.getErrorCode());
		error.setErrorName(errorCode.getErrorName());
		error.setErrorDesc(errorCode.getErrorDesc());
		
		return error;
	}
}
