package com.ppu.fast.ws.BO;

import com.ppu.fast.ws.service.request.LoginRequest;
import com.ppu.fast.ws.service.request.RequestArea;
import com.ppu.fast.ws.service.request.RequestCity;
import com.ppu.fast.ws.service.request.RequestGetLKP;
import com.ppu.fast.ws.service.request.RequestKecamatan;
import com.ppu.fast.ws.service.request.RequestKelurahan;
import com.ppu.fast.ws.service.request.RequestLKPByDate;
import com.ppu.fast.ws.service.request.RequestProvinsi;
import com.ppu.fast.ws.service.request.RequestRVB;
import com.ppu.fast.ws.service.request.RequestSyncChangeAddr;
import com.ppu.fast.ws.service.request.RequestSyncLKP;
import com.ppu.fast.ws.service.request.RequestZipCode;
import com.ppu.fast.ws.service.response.LoginResponse;
import com.ppu.fast.ws.service.response.ResponseArea;
import com.ppu.fast.ws.service.response.ResponseAreaList;
import com.ppu.fast.ws.service.response.ResponseCity;
import com.ppu.fast.ws.service.response.ResponseGetLKP;
import com.ppu.fast.ws.service.response.ResponseGetMasterArea;
import com.ppu.fast.ws.service.response.ResponseGetMasterData;
import com.ppu.fast.ws.service.response.ResponseGetUsers;
import com.ppu.fast.ws.service.response.ResponseKecamatan;
import com.ppu.fast.ws.service.response.ResponseKelurahan;
import com.ppu.fast.ws.service.response.ResponseProvinsi;
import com.ppu.fast.ws.service.response.ResponseRVB;
import com.ppu.fast.ws.service.response.ResponseSync;
import com.ppu.fast.ws.service.response.ResponseZipCode;

public interface IFastBO {
	
	LoginResponse login(LoginRequest loginRequest) throws Exception;

	ResponseGetUsers getUsers() throws Exception;

	@Deprecated
	ResponseGetLKP getLKP(RequestGetLKP req) throws Exception;

	ResponseGetLKP getLKPByDate(RequestLKPByDate req) throws Exception;

	ResponseGetMasterData getMasterData() throws Exception;

	ResponseGetMasterArea getMasterArea() throws Exception;

	ResponseSync syncChangeAddress(RequestSyncChangeAddr req) throws Exception;

	ResponseZipCode getZip(RequestZipCode req) throws Exception;

	ResponseKelurahan getKelurahan(RequestKelurahan req) throws Exception;

	ResponseKecamatan getKecamatan(RequestKecamatan req) throws Exception;

	ResponseProvinsi getProvinsi(RequestProvinsi req) throws Exception;

	ResponseCity getCity(RequestCity req) throws Exception;

	ResponseArea getArea(RequestArea req) throws Exception;

	ResponseAreaList getAreaList(RequestArea req) throws Exception;

	ResponseSync syncLKP(RequestSyncLKP req) throws Exception;

	ResponseRVB getRVB(RequestRVB req) throws Exception;

	ResponseSync syncRVB(RequestSyncLKP req) throws Exception;


}
