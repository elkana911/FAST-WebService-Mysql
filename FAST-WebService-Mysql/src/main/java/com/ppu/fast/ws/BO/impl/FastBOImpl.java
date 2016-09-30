package com.ppu.fast.ws.BO.impl;

import java.util.List;

import org.hibernate.QueryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ppu.fast.ws.BO.IFastBO;
import com.ppu.fast.ws.DAO.IFastDao;
import com.ppu.fast.ws.common.ErrorName;
import com.ppu.fast.ws.domain.MstCities;
import com.ppu.fast.ws.domain.MstKecamatan;
import com.ppu.fast.ws.domain.MstKelurahan;
import com.ppu.fast.ws.domain.MstProvinsi;
import com.ppu.fast.ws.domain.MstZip;
import com.ppu.fast.ws.domain.TrnRVB;
import com.ppu.fast.ws.exception.InvalidUserException;
import com.ppu.fast.ws.exception.LKPNotFoundException;
import com.ppu.fast.ws.pojo.Area;
import com.ppu.fast.ws.pojo.AreaList;
import com.ppu.fast.ws.pojo.LKPData;
import com.ppu.fast.ws.pojo.MasterArea;
import com.ppu.fast.ws.pojo.MasterData;
import com.ppu.fast.ws.pojo.UserData;
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
import com.ppu.fast.ws.util.Utils;

@Component("fastBO")
public class FastBOImpl extends BasicBO implements IFastBO {

	@Autowired IFastDao fastDao;
	
	@Override
	public LoginResponse login(LoginRequest loginRequest) throws Exception {
		// validate here
		
		LoginResponse resp = new LoginResponse();
		resp.setIp(Utils.getClientIP());
		
		if (Utils.isEmpty(loginRequest.getId())){
			resp.setError(getErrorResponse(ErrorName.INPUT_MISSING));		
			
			return resp;
		}else{
			UserData ret = null;
			
			if (!Utils.isEmpty(loginRequest.getId()))
			 ret = fastDao.login(loginRequest.getId(), loginRequest.getPassword());
			
			if (ret != null){
				resp.setData(ret);
			}else{
				resp.setError(getErrorResponse(ErrorName.UNAUTHORIZED_LOGIN));
			}
		}
		
		return resp;

	}

	@Override
	public ResponseGetUsers getUsers() throws Exception {
		
		ResponseGetUsers resp = new ResponseGetUsers();
		resp.setIp(Utils.getClientIP());

		UserData ret = fastDao.getUsers();
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.DATABASE_ERROR));
		}
		
		return resp;
	}

	@Override
	public ResponseGetLKP getLKP(RequestGetLKP req) throws Exception {
		ResponseGetLKP resp = new ResponseGetLKP();
		resp.setIp(Utils.getClientIP());

		// validasi apakah semua data lkp udah cocok rownya
		boolean complete = fastDao.isLKPComplete(req.getCollectorCode());
		
		if (!complete) {
			resp.setError(getErrorResponse(ErrorName.LKP_INCOMPLETE_ERROR));
			return resp;
		}

		LKPData ret = null;
				
		if (Utils.isEmpty(req.getCollectorCode())) {
			resp.setError(getErrorResponse(ErrorName.INPUT_MISSING));		
			
			return resp;
			
		}else {
			try {
				ret = fastDao.getLKP(req.getCollectorCode());
			} catch (QueryException e) {
				// biasanya struktur table berubah
				e.printStackTrace();
				resp.setError(getErrorResponse(ErrorName.APP_CHANGED_ERROR));
				
				return resp;
			}
		}
		
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseGetLKP getLKPByDate(RequestLKPByDate req) throws Exception {
		ResponseGetLKP resp = new ResponseGetLKP();
		resp.setIp(Utils.getClientIP());
		
		LKPData ret = null;
		
		if (Utils.isEmpty(req.getCollectorCode())) {
			resp.setError(getErrorResponse(ErrorName.INPUT_MISSING));		
			
			return resp;
			
		}else {
			try {
				ret = fastDao.getLKPByDate(req.getCollectorCode(), req.getYyyyMMdd());
			} catch (QueryException e) {
				// biasanya struktur table berubah
				e.printStackTrace();
				resp.setError(getErrorResponse(ErrorName.APP_CHANGED_ERROR));
				
				return resp;
			} catch (InvalidUserException e) {
				e.printStackTrace();
				resp.setError(getErrorResponse(ErrorName.COLLECTOR_NOTFOUND));
				
				return resp;
			} catch (LKPNotFoundException e) {
				e.printStackTrace();
				resp.setError(getErrorResponse(ErrorName.LKP_NOTFOUND));
				
				return resp;
			}
		}
		
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}
	
	@Override
	public ResponseGetMasterData getMasterData() throws Exception {
		
		ResponseGetMasterData resp = new ResponseGetMasterData();
		resp.setIp(Utils.getClientIP());

		MasterData ret = fastDao.getMasterData();
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseGetMasterArea getMasterArea() throws Exception {
		ResponseGetMasterArea resp = new ResponseGetMasterArea();
		resp.setIp(Utils.getClientIP());

		MasterArea ret = fastDao.getMasterArea();
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}


	@Override
	public ResponseSync syncChangeAddress(RequestSyncChangeAddr req) throws Exception {
		ResponseSync resp = new ResponseSync();
		resp.setIp(Utils.getClientIP());

		int ret = fastDao.syncChangeAddress(req.getData());
		
		resp.setData(ret);
		
		return resp;
	}
	

	@Override
	public ResponseSync syncLKP(RequestSyncLKP req) throws Exception {
		ResponseSync resp = new ResponseSync();
		resp.setIp(Utils.getClientIP());

		fastDao.doAsync();
		
//		fastDao.syncLKP(req.getLdvDetails(), req.getRvColl(), req.getRvb());
		
		if (req.getLdvHeader() != null && req.getLdvHeader().size() > 0)
			fastDao.syncLKPHeader(req.getLdvHeader());
		
		if (req.getLdvDetails() != null && req.getLdvDetails().size() > 0)
			fastDao.syncLKPDetails(req.getLdvDetails());
		
		if (req.getLdvComments() != null && req.getLdvComments().size() > 0)
			fastDao.syncLKPComments(req.getLdvComments());
		
		if (req.getRvb() != null && req.getRvb().size() > 0)
			fastDao.syncRVB(req.getRvb());
		
		if (req.getRvColl() != null && req.getRvColl().size() > 0)
			fastDao.syncRVColl(req.getRvColl());
		
		if (req.getBastbj() != null && req.getBastbj().size() > 0)
			fastDao.syncBastbj(req.getBastbj());
		
		if (req.getRepo() != null && req.getRepo().size() > 0)
			fastDao.syncRepo(req.getRepo());
		
		if (req.getChangeAddr() != null && req.getChangeAddr().size() > 0)
			fastDao.syncChangeAddress(req.getChangeAddr());
		
		int ret = 1; 
		
		resp.setData(ret);
		
		return resp;
	}


	@Override
	public ResponseZipCode getZip(RequestZipCode req) throws Exception {
		ResponseZipCode resp = new ResponseZipCode();
		resp.setIp(Utils.getClientIP());

		List<MstZip> ret = fastDao.getZip(req.getZipCode());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseKelurahan getKelurahan(RequestKelurahan req) throws Exception {
		ResponseKelurahan resp = new ResponseKelurahan();
		resp.setIp(Utils.getClientIP());

		List<MstKelurahan> ret = fastDao.getKelurahan(req.getName());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseKecamatan getKecamatan(RequestKecamatan req) throws Exception {
		ResponseKecamatan resp = new ResponseKecamatan();
		resp.setIp(Utils.getClientIP());

		List<MstKecamatan> ret = fastDao.getKecamatan(req.getName());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseProvinsi getProvinsi(RequestProvinsi req) throws Exception {
		ResponseProvinsi resp = new ResponseProvinsi();
		resp.setIp(Utils.getClientIP());

		List<MstProvinsi> ret = fastDao.getProvinsi(req.getName());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseCity getCity(RequestCity req) throws Exception {
		ResponseCity resp = new ResponseCity();
		resp.setIp(Utils.getClientIP());

		List<MstCities> ret = fastDao.getCities(req.getName());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseArea getArea(RequestArea req) throws Exception {
		ResponseArea resp = new ResponseArea();
		resp.setIp(Utils.getClientIP());

		Area ret = null;
		if (!Utils.isEmpty(req.getZipCode()))
			ret = fastDao.getAreaByZipCode(req.getZipCode());
		else
			ret = fastDao.getAreaByKelurahan(req.getKelurahan());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseAreaList getAreaList(RequestArea req) throws Exception {
		ResponseAreaList resp = new ResponseAreaList();
		resp.setIp(Utils.getClientIP());

		AreaList ret = null;
		if (!Utils.isEmpty(req.getZipCode()))
			ret = fastDao.getAreaListByZipCode(req.getZipCode());
		else
			ret = fastDao.getAreaListByKelurahan(req.getKelurahan());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		
		return resp;
	}

	@Override
	public ResponseRVB getRVB(RequestRVB req) throws Exception {
		
		ResponseRVB resp = new ResponseRVB();
		resp.setIp(Utils.getClientIP());

		List<TrnRVB> ret = fastDao.getRVB(req.getCollectorId());
		
		if (ret != null){
			resp.setData(ret);
		}else{
			resp.setError(getErrorResponse(ErrorName.NOTFOUND));
		}
		return resp;
	}

	@Override
	public ResponseSync syncRVB(RequestSyncLKP req) throws Exception {
		ResponseSync resp = new ResponseSync();
		resp.setIp(Utils.getClientIP());
		
		if (req.getRvb() != null && req.getRvb().size() > 0)
			fastDao.syncRVB(req.getRvb());
		int ret = 1; 
		
		resp.setData(ret);
		
		return resp;
	}
}
