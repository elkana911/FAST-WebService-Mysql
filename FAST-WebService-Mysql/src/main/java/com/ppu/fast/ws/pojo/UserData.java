package com.ppu.fast.ws.pojo;

import java.io.Serializable;
import java.util.List;

import com.ppu.fast.ws.domain.MstSecUserVO;
import com.ppu.fast.ws.domain.MstUserVO;

public class UserData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<MstUserVO> user;
	private List<MstSecUserVO> secUser;
	
	private UserConfig config;
	
	public List<MstUserVO> getUser() {
		return user;
	}
	public void setUser(List<MstUserVO> user) {
		this.user = user;
	}
	public List<MstSecUserVO> getSecUser() {
		return secUser;
	}
	public void setSecUser(List<MstSecUserVO> secUser) {
		this.secUser = secUser;
	}

	public UserConfig getConfig() {
		return config;
	}
	public void setConfig(UserConfig config) {
		this.config = config;
	}
	
}
