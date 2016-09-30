package com.ppu.fast.ws.exception;

/**
 *
 */
public class LKPNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LKPNotFoundException(Throwable ex) {
        super(ex);
    }
    public LKPNotFoundException(String s) {
        super(s);
    }
}
