package com.demo.exception.handler;

public class ErrorDetails {
	
	private String errorId;
	
	private String errorDescription;

	@Override
	public String toString() {
		return "ErrorDetails [errorId=" + errorId + ", errorDescription=" + errorDescription + "]";
	}

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
