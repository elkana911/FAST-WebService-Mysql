package com.ppu.fast.ws.DAO;

import java.util.List;

import com.ppu.fast.ws.domain.MstSecUserVO;
import com.ppu.fast.ws.pojo.LKPData;

public interface IFastDao {
	
	MstSecUserVO login(String id, String password);

	List<MstSecUserVO> getUsers();

	LKPData getLKP(String collectorCode);
}
