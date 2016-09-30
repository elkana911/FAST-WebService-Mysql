package com.ppu.fast.ws.pojo;

import java.io.Serializable;

public class UserConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long syncMinute;

	public Long getSyncMinute() {
		return syncMinute;
	}

	public void setSyncMinute(Long syncMinute) {
		this.syncMinute = syncMinute;
	}

}
