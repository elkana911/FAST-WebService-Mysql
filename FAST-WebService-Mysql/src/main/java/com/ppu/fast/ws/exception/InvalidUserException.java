package com.ppu.fast.ws.exception;

/**
 *
 */
public class InvalidUserException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidUserException(Throwable ex) {
        super(ex);
    }
    public InvalidUserException(String s) {
        super(s);
    }
}
