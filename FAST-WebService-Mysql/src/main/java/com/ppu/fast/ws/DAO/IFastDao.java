package com.ppu.fast.ws.DAO;

import java.util.List;

import org.springframework.scheduling.annotation.Async;

import com.ppu.fast.ws.domain.HistInstallments;
import com.ppu.fast.ws.domain.MstCities;
import com.ppu.fast.ws.domain.MstKecamatan;
import com.ppu.fast.ws.domain.MstKelurahan;
import com.ppu.fast.ws.domain.MstProvinsi;
import com.ppu.fast.ws.domain.MstUserVO;
import com.ppu.fast.ws.domain.MstZip;
import com.ppu.fast.ws.domain.TrnBastbj;
import com.ppu.fast.ws.domain.TrnChangeAddr;
import com.ppu.fast.ws.domain.TrnLDVComments;
import com.ppu.fast.ws.domain.TrnLDVDetails;
import com.ppu.fast.ws.domain.TrnLDVHeader;
import com.ppu.fast.ws.domain.TrnRVB;
import com.ppu.fast.ws.domain.TrnRVColl;
import com.ppu.fast.ws.domain.TrnRepo;
import com.ppu.fast.ws.pojo.Area;
import com.ppu.fast.ws.pojo.AreaList;
import com.ppu.fast.ws.pojo.LKPData;
import com.ppu.fast.ws.pojo.MasterArea;
import com.ppu.fast.ws.pojo.MasterData;
import com.ppu.fast.ws.pojo.UserData;

public interface IFastDao {
	
	List<HistInstallments> getHistoryInstallments(String contractNo);
	
	UserData login(String id, String password);

	MstUserVO getUser(String id);

	UserData getUsers();

	@Deprecated
	LKPData getLKP(String collectorCode);
	
	LKPData getLKPByDate(String collectorCode, String yyyyMMdd);
	
	MasterData getMasterData();

	MasterArea getMasterArea();

	boolean isLKPComplete(String collectorCode);

	int syncChangeAddress(List<TrnChangeAddr> data);

	List<MstZip> getZip(List<String> zipCode);

	List<MstKelurahan> getKelurahan(String name);
	MstKelurahan getKelurahanByCode(String kelCode);

	List<MstProvinsi> getProvinsi(String name);
	MstProvinsi getProvinsiByCode(String provinsiCode);

	List<MstCities> getCities(String name);
	MstCities getCityByCode(String cityCode);

	List<MstKecamatan> getKecamatan(String name);
	MstKecamatan getKecamatanByCode(String kecCode);

	Area getAreaByKelurahan(String kelurahan);
	AreaList getAreaListByKelurahan(String kelurahan);
	AreaList getAreaListByZipCode(String zipCode);

	Area getAreaByZipCode(String zipCode);

	@Async
	void doAsync();

	void syncLKP(List<TrnLDVDetails> ldvDetails, List<TrnRVColl> rvColl, List<TrnRVB> rvb);
	
	void syncLKPHeader(List<TrnLDVHeader> list);
	
	void syncLKPDetails(List<TrnLDVDetails> list);
	
	void syncRVColl(List<TrnRVColl> list);
	
	void syncRVB(List<TrnRVB> list);

	void syncLKPComments(List<TrnLDVComments> list);

	void syncBastbj(List<TrnBastbj> list);

	void syncRepo(List<TrnRepo> list);

	List<TrnRVB> getRVB(String collectorId);
	
}
