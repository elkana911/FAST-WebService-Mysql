package com.ppu.fast.ws.DAO.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.ppu.fast.ws.DAO.IFastDao;
import com.ppu.fast.ws.domain.HistInstallments;
import com.ppu.fast.ws.domain.MstCities;
import com.ppu.fast.ws.domain.MstDelqReasons;
import com.ppu.fast.ws.domain.MstKecamatan;
import com.ppu.fast.ws.domain.MstKelurahan;
import com.ppu.fast.ws.domain.MstLDVClassifications;
import com.ppu.fast.ws.domain.MstLDVParameters;
import com.ppu.fast.ws.domain.MstLDVStatus;
import com.ppu.fast.ws.domain.MstOffices;
import com.ppu.fast.ws.domain.MstProvinsi;
import com.ppu.fast.ws.domain.MstSecUserVO;
import com.ppu.fast.ws.domain.MstUserVO;
import com.ppu.fast.ws.domain.MstZip;
import com.ppu.fast.ws.domain.ProcessLog;
import com.ppu.fast.ws.domain.TrnBastbj;
import com.ppu.fast.ws.domain.TrnChangeAddr;
import com.ppu.fast.ws.domain.TrnCollectAddr;
import com.ppu.fast.ws.domain.TrnContractBuckets;
import com.ppu.fast.ws.domain.TrnLDVComments;
import com.ppu.fast.ws.domain.TrnLDVDetails;
import com.ppu.fast.ws.domain.TrnLDVHeader;
import com.ppu.fast.ws.domain.TrnRVB;
import com.ppu.fast.ws.domain.TrnRVColl;
import com.ppu.fast.ws.domain.TrnRepo;
import com.ppu.fast.ws.domain.TrnVehicleInfo;
import com.ppu.fast.ws.exception.InvalidUserException;
import com.ppu.fast.ws.exception.LKPNotFoundException;
import com.ppu.fast.ws.pojo.Area;
import com.ppu.fast.ws.pojo.AreaList;
import com.ppu.fast.ws.pojo.LKPData;
import com.ppu.fast.ws.pojo.MasterArea;
import com.ppu.fast.ws.pojo.MasterData;
import com.ppu.fast.ws.pojo.UserData;
import com.ppu.fast.ws.util.Utils;

@Repository("fastDao")
public class FastDaoImpl extends BasicHibernate implements IFastDao {

	@Override
	public UserData login(final String id, final String password) {
		
//		Criteria criteria = getSession().createCriteria(MstUserVO.class,"a")
//			    .createAlias("MstSecUserVO","b")
//			    .add(Restrictions.eq("a.userId", id))
//			    .add(Restrictions.eq("b.userPwd", password))
//			    ;
//		List list = criteria.list();
			    
		/*
		String sql = "SELECT b.* FROM mb_mst_user a, mb_sec_users b where a.USER_ID=b.USER_NAME and a.USER_ID=:userId and b.USER_PWD=:pwd"; 
		SQLQuery q = getSession().createSQLQuery(sql);
		q.addScalar("email_addr", StandardBasicTypes.STRING);
		q.addScalar("user_name", StandardBasicTypes.STRING);
		q.addScalar("user_pwd", StandardBasicTypes.STRING);
		q.addScalar("modul_id", StandardBasicTypes.STRING);
		q.addScalar("birth_place", StandardBasicTypes.STRING);
		q.addScalar("birth_date", StandardBasicTypes.TIMESTAMP);
		q.addScalar("mobile_phone", StandardBasicTypes.STRING);
		q.addScalar("started_timestamp", StandardBasicTypes.TIMESTAMP);
		q.addScalar("last", StandardBasicTypes.TIMESTAMP);
		q.addScalar("status", StandardBasicTypes.STRING);
		q.addScalar("delivered_date", StandardBasicTypes.TIMESTAMP);
		q.addScalar("cancel_by", StandardBasicTypes.STRING);
		q.addScalar("distance", StandardBasicTypes.LONG);
		q.addScalar("pick_date", StandardBasicTypes.TIMESTAMP);
		q.addScalar("order_name", StandardBasicTypes.STRING);
		q.addScalar("order_phone", StandardBasicTypes.STRING);
		q.addScalar("pick_lat", StandardBasicTypes.STRING);
		q.addScalar("pick_lon", StandardBasicTypes.STRING);
		q.addScalar("drop_lat", StandardBasicTypes.STRING);
		q.addScalar("drop_lon", StandardBasicTypes.STRING);
		q.setResultTransformer(Transformers.aliasToBean(MstSecUserVO.class));
			     */
		/*
        SQLQuery q = getSession().createSQLQuery("SELECT b.* FROM mb_mst_user a, mb_sec_users b where a.USER_ID=b.USER_NAME and a.USER_ID=:userId and b.USER_PWD=:pwd"
                );
		q.setParameter("userId", id);
		q.setParameter("pwd", password);
		
		q.addEntity(MstSecUserVO.class);
		
        if (q.list().size() > 0)
			return (MstSecUserVO) q.list().get(0);
        else
       	 return null;
		 */

		
        Criteria c = getSession().createCriteria(MstSecUserVO.class);
        c.add(Restrictions.eq("userName", id));
//        c.add(Restrictions.eq("userPwd", password));
        
        if (c.list().size() > 0) {
        	
        	MstSecUserVO secUser = (MstSecUserVO) c.list().get(0); 
        	
        	if (secUser.getUserPwd() != null) {
        		if (!secUser.getUserPwd().equals(password))
        			return null;
        	}else
        		if (!Utils.isEmpty(password)) {
        			return null;
        		}
        	
        	UserData data = new UserData();
        	
        	data.setSecUser(c.list());
        	
        	c = getSession().createCriteria(MstUserVO.class);
            c.add(Restrictions.eq("userId", id));
            c.add(Restrictions.eq("userStatus", "Y"));

            if (c.list().size() < 1)
            	return null;
            
            data.setUser(c.list());
            
            //get offices
            /*
            List<String> branches = new ArrayList<String>();
            for (MstUserVO obj : data.getUser()) {
            	branches.add(obj.getBranchId());
            }

            c = getSession().createCriteria(MstOffices.class);
            c.add(Restrictions.in("officeCode", branches));
            
            data.setOffices(c.list());
            */
        	return data;
        }else
        	return null;
        
        /*
        list = getSession().doReturningWork(new ReturningWork<List<MstUserVO>>() {

             @Override
             public List<MstUserVO> execute(Connection arg0) throws SQLException {
           	  
             List<MstUserVO> _list = new ArrayList<MstUserVO>();
                  CallableStatement statement = null;
             String sqlString ="{? = call MC_TOOLS_PKG.F_LOGIN_VALIDATION_CUR(?, ?)}";
             statement = arg0.prepareCall(sqlString);

             statement.registerOutParameter(1, OracleTypes.CURSOR);
             statement.setString(2, id);
             statement.setString(3, password);
             
             statement.execute();     //selalu false
            
             ResultSet rs = ((OracleCallableStatement)statement).getCursor(1);
             
//             ResultSet rs = statement.getResultSet();
            
             if (rs == null)
                  return _list;
            
             while (rs.next()){
            	 MstUserVO _pm = new MstUserVO();
            	 
            	 _pm.setCreated_by(rs.getString("CREATED_BY"));
            	 _pm.setCreated_date(rs.getDate("CREATED_DATE"));
            	 _pm.setLastupdated_by(rs.getString("LASTUPDATED_BY"));
            	 _pm.setLastupdated_date(rs.getDate("LASTUPDATED_DATE"));

            	 _pm.setId(rs.getString("COLL_ID"));
            	 _pm.setActive(rs.getString("COLL_ACTIVE"));
            	 _pm.setBranch(rs.getString("COLL_BRANCH"));
            	 _pm.setEmail(rs.getString("COLL_EMAIL"));
            	 _pm.setHandphone(rs.getString("COLL_HANDPHONE"));
            	 _pm.setName(rs.getString("COLL_NAME"));
            	 _pm.setPassword(rs.getString("COLL_PASSWORD"));
            	 _pm.setStatus(rs.getString("COLL_STATUS"));

                  _list.add(_pm);
             }
            
             return _list;
             }
        });              
        if (list.size() > 0)
			return (MstSecUserVO) list.get(0);
        else
       	 return null;
         */
	}

	@Override
	public UserData getUsers() {
		
		UserData data = new UserData();
		
		Criteria criteria = getSession().createCriteria(MstUserVO.class);
		List list = criteria.list();
		
		if (list.size() > 0) {
			data.setUser(list);
			
			criteria = getSession().createCriteria(MstSecUserVO.class);
			
			data.setSecUser(criteria.list());

		}
		
		return data;
	}

	@Override
	public LKPData getLKP(String collectorCode) {
		
		LKPData data = new LKPData();
		
//		Date sysDate = new Date();
		Date sysDate = Utils.String2Date("20160920", "yyyyMMdd"); // utk debug
		
		String createdBy = "JOB" + Utils.Date2String(sysDate, "yyyyMMdd");
		
		MstUserVO user = getUser(collectorCode);
		
		if (user == null)
			throw new InvalidUserException("Collector not found");
		
		Criteria criteria = getSession().createCriteria(TrnRVB.class);
		criteria.add(Restrictions.eq("rvbOnHand", collectorCode));
		criteria.add(Restrictions.eq("officeCode", user.getBranchId()));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		
		List list = criteria.list();
		
//		if (list.size() < 1) 
//			return null;	// skip for debug
		
		// ini penting, jika cheque/voucher kosong < jumlah lkp maka tidak bisa nagih
		// sementara di skip dulu
		
		data.setRvb(list);
		
		criteria = getSession().createCriteria(TrnLDVHeader.class);
		criteria.add(Restrictions.eq("collCode", collectorCode));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		
		list = criteria.list();
		
		if (list.size() < 1)
			throw new LKPNotFoundException("LKP for collector " + collectorCode + " not found");
		
		TrnLDVHeader header = (TrnLDVHeader) list.get(0);

		data.setHeader(header);

		criteria = getSession().createCriteria(TrnLDVDetails.class);
		criteria.add(Restrictions.eq("pk.ldvNo", header.getLdvNo()));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		List details = criteria.list();

		data.setDetails(details);

		// get bastbj
		criteria = getSession().createCriteria(TrnBastbj.class);
		criteria.add(Restrictions.eq("officeCode", header.getOfficeCode()));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		list = criteria.list();
		
		data.setBastbj(list);
		

		List<TrnCollectAddr> address = new ArrayList<TrnCollectAddr>();
		List<TrnContractBuckets> buckets = new ArrayList<TrnContractBuckets>();
		List<TrnVehicleInfo> vehicleInfo = new ArrayList<TrnVehicleInfo>();
		List<HistInstallments> historyInstallments = new ArrayList<HistInstallments>();
		
		for (Object dtl : details) {
			String _contractNo = ((TrnLDVDetails) dtl).getContractNo();
			
			Criteria _criteria = getSession().createCriteria(TrnCollectAddr.class);
			_criteria.add(Restrictions.eq("pk.contractNo", _contractNo));
			criteria.add(Restrictions.eq("createdBy", createdBy));
			List _list = _criteria.list();

			address.addAll(_list);

			// get buckets
			_criteria = getSession().createCriteria(TrnContractBuckets.class);
			_criteria.add(Restrictions.eq("pk.contractNo", _contractNo));
			// must restrict second pk for faster search
//			_criteria.add(Restrictions.eq("pk.period", ((TrnLDVDetails) dtl).getPeriod()));
			_criteria.add(Restrictions.eq("createdBy", createdBy));
			_list = _criteria.list();

			buckets.addAll(_list);

			// get vehicle info
			_criteria = getSession().createCriteria(TrnVehicleInfo.class);
			_criteria.add(Restrictions.eq("contractNo", _contractNo));
			_criteria.add(Restrictions.eq("createdBy", createdBy));
			_list = _criteria.list();

			vehicleInfo.addAll(_list);

			// get payment history. tarik semua per contract. jumlahnya 1980
			_criteria  = getSession().createCriteria(HistInstallments.class);
			_criteria.add(Restrictions.eq("pk.contractNo", _contractNo));
			_criteria.add(Restrictions.eq("createdBy", createdBy));
			_list = _criteria.list();
			historyInstallments.addAll(_list);
		
		}
		data.setAddress(address);		
		data.setBuckets(buckets);
		data.setVehicleInfo(vehicleInfo);
		data.setHistoryInstallments(historyInstallments);
		
		/*
		List<TrnHistInstallments> historyInstallments = new ArrayList<TrnHistInstallments>();
		for (Object dtl : details) {
			
			// query manual krn ga ada pk
	        SQLQuery qs = getSession().createSQLQuery("SELECT contract_no, inst_no, due_date, penalty_amt, paid_date, prnc_amt_dtl_cust, intr_amt_dtl_ar, coll_fee, started_timestamp, created_by, created_timestamp, lastupdate_by, lastupdate_timestamp FROM mc_trn_hist_installments a where a.contract_no = :contractNo");
	        
			qs.addScalar("CONTRACT_NO", StandardBasicTypes.STRING);
			qs.addScalar("INST_NO", StandardBasicTypes.LONG);	//alasannya di realm blm handle bigdecimal
			qs.addScalar("DUE_DATE", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("PENALTY_AMT", StandardBasicTypes.LONG);
			qs.addScalar("PAID_DATE", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("PRNC_AMT_DTL_CUST", StandardBasicTypes.LONG);
			qs.addScalar("INTR_AMT_DTL_AR", StandardBasicTypes.LONG);
			qs.addScalar("COLL_FEE", StandardBasicTypes.LONG);
			qs.addScalar("STARTED_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("CREATED_BY", StandardBasicTypes.STRING);
			qs.addScalar("CREATED_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("LASTUPDATE_BY", StandardBasicTypes.STRING);
			qs.addScalar("LASTUPDATE_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
	 
			qs.setParameter("contractNo", ((TrnLDVDetails) dtl).getContractNo());
			List<Object[]> rows = qs.list();
			
	 		for (Object[] obj : rows) {
	 			TrnHistInstallments t = new TrnHistInstallments();
	 			t.setContractNo((String)obj[0]);
	 			t.setInstNo((Long)obj[1]);
	 			t.setDueDate((Date)obj[2]);
	 			t.setPenaltyAmt((Long)obj[3]);
	 			t.setPaidDate((Date)obj[4]);
	 			t.setPrncAmtDtlCust((Long)obj[5]);
	 			t.setIntrAmtDtlAr((Long)obj[6]);
	 			t.setCollFee((Long)obj[7]);
	 			t.setStartedTimestamp((Date)obj[8]);
	 			t.setCreatedBy((String)obj[9]);
	 			t.setCreatedTimestamp((Date)obj[10]);
	 			t.setLastupdateBy((String)obj[11]);
	 			t.setLastupdateTimestamp((Date)obj[12]);

	 			historyInstallments.add(t);
	 		}

		}
		data.setHistoryInstallments(historyInstallments);
		*/

		// get ldp status. jumlahnya 6
		/*
		criteria = getSession().createCriteria(MstLDVStatus.class);
		data.setLdpStatus(criteria.list());
		
		// get ldp parameter. jumlahnya 15
		criteria = getSession().createCriteria(MstLDVParameters.class);
		data.setLdpParameters(criteria.list());
		
		// get ldp classifications. jumlahnya 4
		criteria = getSession().createCriteria(MstLDVClassifications.class);
		data.setLdpClassifications(criteria.list());
		
		// get del. jumlahnya 61
		criteria = getSession().createCriteria(MstDelqReasons.class);
		data.setDelqReasons(criteria.list());
		*/
		return data;
	}

	@Override
	public LKPData getLKPByDate(String collectorCode, String yyyyMMdd) {
		LKPData data = new LKPData();
		
		Date sysDate = Utils.isEmpty(yyyyMMdd) ? new Date() : Utils.String2Date(yyyyMMdd, "yyyyMMdd"); 

//		Date sysDate = Utils.String2Date("20160920", "yyyyMMdd"); // utk debug
		
		String createdBy = "JOB" + Utils.Date2String(sysDate, "yyyyMMdd");
		
		MstUserVO user = getUser(collectorCode);
		
		if (user == null)
			throw new InvalidUserException("Collector not found");
		
		Criteria criteria = getSession().createCriteria(TrnRVB.class);
		criteria.add(Restrictions.eq("rvbOnHand", collectorCode));
		criteria.add(Restrictions.eq("officeCode", user.getBranchId()));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		
		List list = criteria.list();
		
//		if (list.size() < 1) 
//			return null;	// skip for debug
		
		// ini penting, jika cheque/voucher kosong < jumlah lkp maka tidak bisa nagih
		// sementara di skip dulu
		
		data.setRvb(list);
		
		criteria = getSession().createCriteria(TrnLDVHeader.class);
		criteria.add(Restrictions.eq("collCode", collectorCode));
		criteria.add(Restrictions.eq("createdBy", createdBy));
//		criteria.add(Restrictions.ne("closeBatch", "Y").);
		criteria.add(Restrictions.or(Restrictions.ne("closeBatch", "Y"), Restrictions.isNull("closeBatch")));
				
		list = criteria.list();
		
		if (list.size() < 1)
			throw new LKPNotFoundException("LKP for collector " + collectorCode + " not found or probably closed");
		
		TrnLDVHeader header = (TrnLDVHeader) list.get(0);

		data.setHeader(header);

		criteria = getSession().createCriteria(TrnLDVDetails.class);
		criteria.add(Restrictions.eq("pk.ldvNo", header.getLdvNo()));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		List details = criteria.list();

		data.setDetails(details);

		// get bastbj
		criteria = getSession().createCriteria(TrnBastbj.class);
		criteria.add(Restrictions.eq("officeCode", header.getOfficeCode()));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		list = criteria.list();
		
		data.setBastbj(list);

		
		Date fromDate = Utils.getDateWithoutTime(sysDate);
		Date toDate = Utils.getDateWithoutTime(Utils.getTomorrowDate(sysDate));
		
		criteria = getSession().createCriteria(TrnRepo.class);
		criteria.add(Restrictions.eq("createdBy", "MOBCOL"));
		criteria.add(Restrictions.ge("createdTimestamp", fromDate));
		criteria.add(Restrictions.le("createdTimestamp", toDate));
		list = criteria.list();
		data.setRepo(list);

		criteria = getSession().createCriteria(TrnLDVComments.class);
		criteria.add(Restrictions.eq("createdBy", "MOBCOL"));
		criteria.add(Restrictions.ge("createdTimestamp", fromDate));
		criteria.add(Restrictions.le("createdTimestamp", toDate));
		list = criteria.list();
		data.setLdvComments(list);

		criteria = getSession().createCriteria(TrnRVColl.class);
		criteria.add(Restrictions.eq("createdBy", "MOBCOL"));
		criteria.add(Restrictions.ge("createdTimestamp", fromDate));
		criteria.add(Restrictions.le("createdTimestamp", toDate));
		list = criteria.list();
		data.setRvColl(list);


		List<TrnCollectAddr> address = new ArrayList<TrnCollectAddr>();
		List<TrnContractBuckets> buckets = new ArrayList<TrnContractBuckets>();
		List<TrnVehicleInfo> vehicleInfo = new ArrayList<TrnVehicleInfo>();
		List<HistInstallments> historyInstallments = new ArrayList<HistInstallments>();

		for (Object dtl : details) {
			String _contractNo = ((TrnLDVDetails) dtl).getContractNo();
			
			Criteria _criteria = getSession().createCriteria(TrnCollectAddr.class);
			_criteria.add(Restrictions.eq("pk.contractNo", _contractNo));
			criteria.add(Restrictions.eq("createdBy", createdBy));
			List _list = _criteria.list();

			address.addAll(_list);

			// get buckets
			_criteria = getSession().createCriteria(TrnContractBuckets.class);
			_criteria.add(Restrictions.eq("pk.contractNo", _contractNo));
			// must restrict second pk for faster search
//			_criteria.add(Restrictions.eq("pk.period", ((TrnLDVDetails) dtl).getPeriod()));
			_criteria.add(Restrictions.eq("createdBy", createdBy));
			_list = _criteria.list();

			buckets.addAll(_list);

			// get vehicle info
			_criteria = getSession().createCriteria(TrnVehicleInfo.class);
			_criteria.add(Restrictions.eq("contractNo", _contractNo));
			_criteria.add(Restrictions.eq("createdBy", createdBy));
			_list = _criteria.list();

			vehicleInfo.addAll(_list);

			// get payment history. tarik semua per contract. jumlahnya 1980
			_criteria  = getSession().createCriteria(HistInstallments.class);
			_criteria.add(Restrictions.eq("pk.contractNo", _contractNo));
			_criteria.add(Restrictions.eq("createdBy", createdBy));
			_list = _criteria.list();
			historyInstallments.addAll(_list);
		
		}
		data.setAddress(address);		
		data.setBuckets(buckets);
		data.setVehicleInfo(vehicleInfo);
		data.setHistoryInstallments(historyInstallments);
		
		/*
		List<TrnHistInstallments> historyInstallments = new ArrayList<TrnHistInstallments>();
		for (Object dtl : details) {
			
			// query manual krn ga ada pk
	        SQLQuery qs = getSession().createSQLQuery("SELECT contract_no, inst_no, due_date, penalty_amt, paid_date, prnc_amt_dtl_cust, intr_amt_dtl_ar, coll_fee, started_timestamp, created_by, created_timestamp, lastupdate_by, lastupdate_timestamp FROM mc_trn_hist_installments a where a.contract_no = :contractNo");
	        
			qs.addScalar("CONTRACT_NO", StandardBasicTypes.STRING);
			qs.addScalar("INST_NO", StandardBasicTypes.LONG);	//alasannya di realm blm handle bigdecimal
			qs.addScalar("DUE_DATE", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("PENALTY_AMT", StandardBasicTypes.LONG);
			qs.addScalar("PAID_DATE", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("PRNC_AMT_DTL_CUST", StandardBasicTypes.LONG);
			qs.addScalar("INTR_AMT_DTL_AR", StandardBasicTypes.LONG);
			qs.addScalar("COLL_FEE", StandardBasicTypes.LONG);
			qs.addScalar("STARTED_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("CREATED_BY", StandardBasicTypes.STRING);
			qs.addScalar("CREATED_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("LASTUPDATE_BY", StandardBasicTypes.STRING);
			qs.addScalar("LASTUPDATE_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
	 
			qs.setParameter("contractNo", ((TrnLDVDetails) dtl).getContractNo());
			List<Object[]> rows = qs.list();
			
	 		for (Object[] obj : rows) {
	 			TrnHistInstallments t = new TrnHistInstallments();
	 			t.setContractNo((String)obj[0]);
	 			t.setInstNo((Long)obj[1]);
	 			t.setDueDate((Date)obj[2]);
	 			t.setPenaltyAmt((Long)obj[3]);
	 			t.setPaidDate((Date)obj[4]);
	 			t.setPrncAmtDtlCust((Long)obj[5]);
	 			t.setIntrAmtDtlAr((Long)obj[6]);
	 			t.setCollFee((Long)obj[7]);
	 			t.setStartedTimestamp((Date)obj[8]);
	 			t.setCreatedBy((String)obj[9]);
	 			t.setCreatedTimestamp((Date)obj[10]);
	 			t.setLastupdateBy((String)obj[11]);
	 			t.setLastupdateTimestamp((Date)obj[12]);

	 			historyInstallments.add(t);
	 		}

		}
		data.setHistoryInstallments(historyInstallments);
		*/

		// get ldp status. jumlahnya 6
		/*
		criteria = getSession().createCriteria(MstLDVStatus.class);
		data.setLdpStatus(criteria.list());
		
		// get ldp parameter. jumlahnya 15
		criteria = getSession().createCriteria(MstLDVParameters.class);
		data.setLdpParameters(criteria.list());
		
		// get ldp classifications. jumlahnya 4
		criteria = getSession().createCriteria(MstLDVClassifications.class);
		data.setLdpClassifications(criteria.list());
		
		// get del. jumlahnya 61
		criteria = getSession().createCriteria(MstDelqReasons.class);
		data.setDelqReasons(criteria.list());
		*/
		return data;
	}
	
	@Override
	public List<HistInstallments> getHistoryInstallments(String contractNo) {
		Criteria c = getSession().createCriteria(HistInstallments.class);
		c.add(Restrictions.eq("pk.contractNo", contractNo));
		
		return c.list();
		
		/*
		for (Object dtl : details) {
			
			// query manual krn ga ada pk
	        SQLQuery qs = getSession().createSQLQuery("SELECT contract_no, inst_no, due_date, penalty_amt, paid_date, prnc_amt_dtl_cust, intr_amt_dtl_ar, coll_fee, started_timestamp, created_by, created_timestamp, lastupdate_by, lastupdate_timestamp FROM mc_trn_hist_installments a where a.contract_no = :contractNo");
	        
			qs.addScalar("CONTRACT_NO", StandardBasicTypes.STRING);
			qs.addScalar("INST_NO", StandardBasicTypes.LONG);	//alasannya di realm blm handle bigdecimal
			qs.addScalar("DUE_DATE", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("PENALTY_AMT", StandardBasicTypes.LONG);
			qs.addScalar("PAID_DATE", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("PRNC_AMT_DTL_CUST", StandardBasicTypes.LONG);
			qs.addScalar("INTR_AMT_DTL_AR", StandardBasicTypes.LONG);
			qs.addScalar("COLL_FEE", StandardBasicTypes.LONG);
			qs.addScalar("STARTED_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("CREATED_BY", StandardBasicTypes.STRING);
			qs.addScalar("CREATED_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
			qs.addScalar("LASTUPDATE_BY", StandardBasicTypes.STRING);
			qs.addScalar("LASTUPDATE_TIMESTAMP", StandardBasicTypes.TIMESTAMP);
	 
			qs.setParameter("contractNo", ((TrnLDVDetails) dtl).getContractNo());
			List<Object[]> rows = qs.list();
			
	 		for (Object[] obj : rows) {
	 			TrnHistInstallments t = new TrnHistInstallments();
	 			t.setContractNo((String)obj[0]);
	 			t.setInstNo((Long)obj[1]);
	 			t.setDueDate((Date)obj[2]);
	 			t.setPenaltyAmt((Long)obj[3]);
	 			t.setPaidDate((Date)obj[4]);
	 			t.setPrncAmtDtlCust((Long)obj[5]);
	 			t.setIntrAmtDtlAr((Long)obj[6]);
	 			t.setCollFee((Long)obj[7]);
	 			t.setStartedTimestamp((Date)obj[8]);
	 			t.setCreatedBy((String)obj[9]);
	 			t.setCreatedTimestamp((Date)obj[10]);
	 			t.setLastupdateBy((String)obj[11]);
	 			t.setLastupdateTimestamp((Date)obj[12]);

	 			historyInstallments.add(t);
	 		}

		}*/
		
	}

	@Override
	public MasterData getMasterData() {
		MasterData data = new MasterData();

		Criteria criteria = getSession().createCriteria(MstLDVStatus.class);
		data.setLdpStatus(criteria.list());
		
		// get ldp parameter. jumlahnya 15
		criteria = getSession().createCriteria(MstLDVParameters.class);
		data.setLdpParameters(criteria.list());
		
		// get ldp classifications. jumlahnya 4
		criteria = getSession().createCriteria(MstLDVClassifications.class);
		data.setLdpClassifications(criteria.list());
		
		// get del. jumlahnya 61
		criteria = getSession().createCriteria(MstDelqReasons.class);
		data.setDelqReasons(criteria.list());
		
		// get del. jumlahnya 69
		criteria = getSession().createCriteria(MstOffices.class);
		data.setOffices(criteria.list());
		
		return data;
	}
	
	@Override
	public MasterArea getMasterArea() {
		MasterArea data = new MasterArea();

		Criteria criteria = getSession().createCriteria(MstKelurahan.class);
		data.setKelurahan(criteria.list());
		
		// get ldp parameter. jumlahnya 15
		criteria = getSession().createCriteria(MstKecamatan.class);
		data.setKecamatan(criteria.list());
		
		// get ldp classifications. jumlahnya 4
		criteria = getSession().createCriteria(MstCities.class);
		data.setCity(criteria.list());
		
		// get del. jumlahnya 61
		criteria = getSession().createCriteria(MstProvinsi.class);
		data.setProvinsi(criteria.list());
		
		return data;
	}



	@Override
	public boolean isLKPComplete(String collectorCode) {
		boolean complete = true;
		
//		String[] tables = {"MC_HIST_INSTALLMENTS", "MC_TRN_COLLECT_ADDR", "MC_TRN_CONTRACT_BUCKETS"
//				, "MC_TRN_LDV_DTLS", "MC_TRN_LDV_HDRS", "MC_TRN_RVB"
//				};
		
		Date sysDate = new Date();
		String createdBy = "JOB" + Utils.Date2String(sysDate, "yyyyMMdd");

		String[] tables = {"MC_TRN_LDV_DTLS"};
		
		for (String table : tables) {
			
			Criteria criteria = getSession().createCriteria(ProcessLog.class);
			criteria.add(Restrictions.eq("pk.tableName", table));
			criteria.add(Restrictions.eq("pk.emplCode", collectorCode)); 
			criteria.add(Restrictions.eq("createdBy", createdBy));
			
			List<ProcessLog> list = criteria.list();
			
			if (list.size() > 0) {
				ProcessLog row = list.get(0);
				
				Long countRecOracle = row.getCountRecOracle();
				Long countRecMySql = row.getCountRecMySql();
				
				if (countRecMySql.longValue() !=  countRecOracle.longValue()) {
					// brarti ada yg ga valid
					complete = false;
					break;
				}
				
			}
			
		}
		
		return complete;
	}

	@Override
	public int syncChangeAddress(List<TrnChangeAddr> data) {
		
		int successRows = 0;
		
		for (TrnChangeAddr obj : data) {
			
			if (obj == null) continue;
			
			// modify timestamp
			obj.setCreatedTimestamp(new Date());
			obj.setLastupdateTimestamp(new Date());		
			
			try {
				getSession().saveOrUpdate(obj);
				
				successRows += 1;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub
		return successRows;
	}

	@Override
	public List<MstZip> getZip(List<String> zipCode) {
		Criteria c = getSession().createCriteria(MstZip.class);
		
		if (!Utils.isEmpty(zipCode) && zipCode.size() > 0)
			c.add(Restrictions.in("pk.zipCode", zipCode));
		
		return c.list();
	}

	@Override
	public List<MstKelurahan> getKelurahan(String name) {
		Criteria c = getSession().createCriteria(MstKelurahan.class);
		
		if (!Utils.isEmpty(name))
			c.add(Restrictions.like("kelurahan", name + "%"));
		
		return c.list();
	}

	@Override
	public List<MstProvinsi> getProvinsi(String name) {
		Criteria c = getSession().createCriteria(MstProvinsi.class);
		
		if (!Utils.isEmpty(name))
			c.add(Restrictions.like("provinsi", name + "%"));
		
		return c.list();
	}

	@Override
	public List<MstCities> getCities(String name) {
		Criteria c = getSession().createCriteria(MstCities.class);
		
		if (!Utils.isEmpty(name))
			c.add(Restrictions.like("city", name + "%"));
		
		return c.list();
	}

	@Override
	public List<MstKecamatan> getKecamatan(String name) {
		Criteria c = getSession().createCriteria(MstKecamatan.class);
		
		if (!Utils.isEmpty(name))
			c.add(Restrictions.like("kecamatan", name + "%"));
		
		return c.list();
	}

	@Override
	public Area getAreaByKelurahan(String kelurahan) {
		
		Criteria c = getSession().createCriteria(MstKelurahan.class);
		
		if (!Utils.isEmpty(kelurahan))
			c.add(Restrictions.ilike("kelurahan", kelurahan, MatchMode.START));
//		c.add(Restrictions.eq("kelurahan", kelurahan).ignoreCase());
		
		List<MstKelurahan> list = c.list();

		if (list.size() < 1) 
			return null;
		
		Area area = new Area();

		MstKelurahan mstKelurahan = list.get(0);
		
		area.setKelurahan(mstKelurahan);
		
		c = getSession().createCriteria(MstKecamatan.class);
		c.add(Restrictions.eq("kecCode", mstKelurahan.getKecCode()));
		
		if (c.list().size() > 0) {
			MstKecamatan mstKecamatan = (MstKecamatan) c.list().get(0);
			area.setKecamatan(mstKecamatan);

			c = getSession().createCriteria(MstCities.class);
			c.add(Restrictions.eq("cityCode", mstKecamatan.getCityCode()));
			
			if (c.list().size() > 0) {
				MstCities mstCities = (MstCities) c.list().get(0);
				area.setCity(mstCities);
				
				c = getSession().createCriteria(MstProvinsi.class);
				c.add(Restrictions.eq("provCode", mstCities.getProvCode()));
				
				if (c.list().size() > 0) {
					MstProvinsi mstProvinsi = (MstProvinsi) c.list().get(0);
					area.setProvinsi(mstProvinsi);
					
					c = getSession().createCriteria(MstZip.class);
					c.add(Restrictions.eq("provCode", mstProvinsi.getProvCode()));
					c.add(Restrictions.eq("cityCode", mstCities.getCityCode()));
					c.add(Restrictions.eq("kecCode", mstKecamatan.getKecCode()));
					c.add(Restrictions.eq("kelCode", mstKelurahan.getKelCode()));
					
					area.setZip(c.list());
				}
			}
		}
		
		return area;
		
	}


	@Override
	public AreaList getAreaListByKelurahan(String kelurahan) {
		Criteria c = getSession().createCriteria(MstKelurahan.class);
		
		if (!Utils.isEmpty(kelurahan))
			c.add(Restrictions.ilike("kelurahan", kelurahan, MatchMode.START));
//		c.add(Restrictions.eq("kelurahan", kelurahan).ignoreCase());
		
		List<MstKelurahan> list = c.list();

		if (list.size() < 1) 
			return null;
		
		AreaList areaList = new AreaList();

		areaList.setKelurahan(list);
		
		List<String> codes = new ArrayList<>();
		for (int i = 0; i < areaList.getKelurahan().size(); i++) {
			codes.add(areaList.getKelurahan().get(i).getKelCode());
		}
		c = getSession().createCriteria(MstZip.class);
		c.add(Restrictions.in("kelCode", codes));
		areaList.setZip(c.list());

		codes.clear();
		for (int i = 0; i < areaList.getKelurahan().size(); i++) {
			codes.add(areaList.getKelurahan().get(i).getKecCode());
		}
		c = getSession().createCriteria(MstKecamatan.class);
		c.add(Restrictions.in("kecCode", codes));
		areaList.setKecamatan(c.list());
		
		
		codes.clear();
		for (int i = 0; i < areaList.getKecamatan().size(); i++) {
			codes.add(areaList.getKecamatan().get(i).getCityCode());
		}
		c = getSession().createCriteria(MstCities.class);
		c.add(Restrictions.in("cityCode", codes));
		areaList.setCity(c.list());

		codes.clear();
		for (int i = 0; i < areaList.getCity().size(); i++) {
			codes.add(areaList.getCity().get(i).getProvCode());
		}
		c = getSession().createCriteria(MstProvinsi.class);
		c.add(Restrictions.in("provCode", codes));
		areaList.setProvinsi(c.list());

		return areaList;
	}

	@Override
	public Area getAreaByZipCode(String zipCode) {
		Criteria c = getSession().createCriteria(MstZip.class);
		
		if (!Utils.isEmpty(zipCode))
			c.add(Restrictions.eq("pk.zipCode", zipCode));
		
		List<MstZip> list = c.list();

		if (list.size() < 1) 
			return null;
		
		MstZip zip = list.get(0);
		
		Area area = new Area();
		
		area.setKelurahan(getKelurahanByCode(zip.getKelCode()));
		area.setKecamatan(getKecamatanByCode(zip.getKecCode()));
		area.setCity(getCityByCode(zip.getCityCode()));
		area.setProvinsi(getProvinsiByCode(zip.getProvCode()));
		
		return area;
	}

	@Override
	public MstKelurahan getKelurahanByCode(String kelCode) {
		Criteria c = getSession().createCriteria(MstKelurahan.class);
		
		if (!Utils.isEmpty(kelCode))
			c.add(Restrictions.eq("kelCode", kelCode));
		
		List<MstKelurahan> list = c.list();

		if (list.size() < 1) 
			return null;
		
		return list.get(0);
	}

	@Override
	public MstProvinsi getProvinsiByCode(String provinsiCode) {
		Criteria c = getSession().createCriteria(MstProvinsi.class);
		
		if (!Utils.isEmpty(provinsiCode))
			c.add(Restrictions.eq("provCode", provinsiCode));
		
		List<MstProvinsi> list = c.list();

		if (list.size() < 1) 
			return null;
		
		return list.get(0);
	}

	@Override
	public MstCities getCityByCode(String cityCode) {
		Criteria c = getSession().createCriteria(MstCities.class);
		
		if (!Utils.isEmpty(cityCode))
			c.add(Restrictions.eq("cityCode", cityCode));
		
		List<MstCities> list = c.list();

		if (list.size() < 1) 
			return null;
		
		return list.get(0);
	}

	@Override
	public MstKecamatan getKecamatanByCode(String kecCode) {
		Criteria c = getSession().createCriteria(MstKecamatan.class);
		
		if (!Utils.isEmpty(kecCode))
			c.add(Restrictions.eq("kecCode", kecCode));
		
		List<MstKecamatan> list = c.list();

		if (list.size() < 1) 
			return null;
		
		return list.get(0);
	}

	@Override
	public MstUserVO getUser(String id) {
		Criteria c = getSession().createCriteria(MstUserVO.class);
		c.add(Restrictions.eq("userId", id));
		
		if (c.list().size() < 1)
			return null;
		else
			return (MstUserVO) c.list().get(0);
	}

	@Override
	public AreaList getAreaListByZipCode(String zipCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Async
	public void doAsync() {
		// TODO Auto-generated method stub
		System.out.println("doAsync");
	}

	@Override
	@Async
	public void syncLKP(List<TrnLDVDetails> ldvDetails, List<TrnRVColl> rvColl, List<TrnRVB> rvb) {
		// TODO Auto-generated method stub
		// felipe minta data yg update.insert kolom Flag_done='Y' dan date_done
		
		System.out.println("syncLKPDetails:ldvDetails=" + (ldvDetails == null ? null : ldvDetails.size()) 
		+ ",rvColl=" + (rvColl == null ? null : rvColl.size()) 
		+ ",rvb=" + (rvb == null ? null : rvb.size()));
		
	}

	@Override
	public List<TrnRVB> getRVB(String collectorId) {
		Date sysDate = new Date();
		
		String createdBy = "JOB" + Utils.Date2String(sysDate, "yyyyMMdd");

		Criteria criteria = getSession().createCriteria(TrnRVB.class);
		criteria.add(Restrictions.eq("rvbOnHand", collectorId));
//		criteria.add(Restrictions.eq("officeCode", user.getBranchId()));
		criteria.add(Restrictions.eq("createdBy", createdBy));
		
		List list = criteria.list();
		
		return list;
	}

	@Override
	public void syncLKPHeader(List<TrnLDVHeader> list) {
		// update only
		System.out.println("syncLKPHeader=" + (list == null ? null : list.size()));

		for (TrnLDVHeader trnLDVHeader : list) {
			
			StringBuffer sb = new StringBuffer("update " + TrnLDVHeader.class.getSimpleName() + " a");
			sb.append(" set a.workFlag = :workFlag");
			sb.append(", a.lastupdateBy= :lastupdateBy");
			sb.append(", a.lastupdateTimestamp= :lastupdateTimestamp");
			sb.append(", a.flagDone = 'Y'");
			sb.append(", a.dateDone = :dateDone");
			sb.append(" where a.ldvNo = :ldvNo");
			sb.append(" and a.createdBy = :createdBy");
			
			Query query = getSession().createQuery(sb.toString());
			
			query.setString("workFlag", trnLDVHeader.getWorkFlag());
			query.setString("lastupdateBy", trnLDVHeader.getLastupdateBy());
			query.setTimestamp("lastupdateTimestamp", trnLDVHeader.getLastupdateTimestamp());
			query.setTimestamp("dateDone", new Date());
			query.setString("ldvNo", trnLDVHeader.getLdvNo());
			query.setString("createdBy", trnLDVHeader.getCreatedBy());
			query.executeUpdate();
		}
	}

	@Override
	public void syncLKPDetails(List<TrnLDVDetails> list) {
		// update only
		System.out.println("syncLKPDetails=" + (list == null ? null : list.size()));
		
		for (TrnLDVDetails trnLDVDetails : list) {
			
			StringBuffer sb = new StringBuffer("update " + TrnLDVDetails.class.getSimpleName() + " a");
			sb.append(" set a.ldvFlag = :ldvFlag");
			sb.append(", a.workStatus = :workStatus");
			sb.append(", a.lastupdateBy= :lastupdateBy");
			sb.append(", a.lastupdateTimestamp= :lastupdateTimestamp");
			sb.append(", a.flagDone = 'Y'");
			sb.append(", a.dateDone = :dateDone");
			sb.append(" where a.contractNo = :contractNo");
			sb.append(" and a.createdBy = :createdBy");
			sb.append(" and a.pk.ldvNo = :ldvNo");
			
			Query query = getSession().createQuery(sb.toString());
			
			query.setString("ldvFlag", trnLDVDetails.getLdvFlag());
			query.setString("workStatus", trnLDVDetails.getWorkStatus());
			query.setString("lastupdateBy", trnLDVDetails.getLastupdateBy());
			query.setTimestamp("lastupdateTimestamp", trnLDVDetails.getLastupdateTimestamp());
			query.setTimestamp("dateDone", new Date());
			
			query.setString("contractNo", trnLDVDetails.getContractNo());
			query.setString("createdBy", trnLDVDetails.getCreatedBy());
			query.setString("ldvNo", trnLDVDetails.getPk().getLdvNo());
			query.executeUpdate();
		}
	}

	@Override
	public void syncRVColl(List<TrnRVColl> list) {
		// insert only
		System.out.println("syncRVColl=" + (list == null ? null : list.size()));
		
		for (TrnRVColl trnRVColl : list) {
			trnRVColl.setFlagDone("Y");
			trnRVColl.setDateDone(new Date());
			getSession().saveOrUpdate(trnRVColl);
		}
		
	}

	@Override
	public void syncRVB(List<TrnRVB> list) {
		// update only
		System.out.println("syncRVB=" + (list == null ? null : list.size()));

		for (TrnRVB trnRVB : list) {
			
			StringBuffer sb = new StringBuffer("update " + TrnRVB.class.getSimpleName() + " a");
			sb.append(" set a.rvbStatus = :rvbStatus");
			sb.append(", a.lastupdateBy= :lastupdateBy");
			sb.append(", a.lastupdateTimestamp= :lastupdateTimestamp");
			sb.append(", a.flagDone = 'Y'");
			sb.append(", a.dateDone = :dateDone");
			sb.append(" where a.rvbNo = :rvbNo");
			sb.append(" and a.createdBy = :createdBy");
			
			Query query = getSession().createQuery(sb.toString());
			
			query.setString("rvbStatus", trnRVB.getRvbStatus());
			query.setString("lastupdateBy", trnRVB.getLastupdateBy());
			query.setTimestamp("lastupdateTimestamp", trnRVB.getLastupdateTimestamp());
			query.setTimestamp("dateDone", new Date());
			query.setString("rvbNo", trnRVB.getRvbNo());
			query.setString("createdBy", trnRVB.getCreatedBy());
			query.executeUpdate();

		}
	}

	@Override
	public void syncLKPComments(List<TrnLDVComments> list) {
		// insert only
		System.out.println("syncLKPComments=" + (list == null ? null : list.size()));
		
		for (TrnLDVComments trnLDVComments : list) {
			trnLDVComments.setFlagDone("Y");
			trnLDVComments.setDateDone(new Date());
			getSession().saveOrUpdate(trnLDVComments);
		}
	}

	@Override
	public void syncBastbj(List<TrnBastbj> list) {
		// update only
		System.out.println("syncBastbj=" + (list == null ? null : list.size()));

		for (TrnBastbj trnBastbj : list) {
			
			StringBuffer sb = new StringBuffer("update " + TrnBastbj.class.getSimpleName() + " a");
			sb.append(" set a.bastbjStatus = :bastbjStatus");
			sb.append(", a.lastupdateBy= :lastupdateBy");
			sb.append(", a.lastupdateTimestamp= :lastupdateTimestamp");
			sb.append(", a.flagDone = 'Y'");
			sb.append(", a.dateDone = :dateDone");
			sb.append(" where a.bastbjNo = :bastbjNo");
			sb.append(" and a.createdBy = :createdBy");
			
			Query query = getSession().createQuery(sb.toString());
			
			query.setString("bastbjStatus", trnBastbj.getBastbjStatus());
			query.setString("lastupdateBy", trnBastbj.getLastupdateBy());
			query.setTimestamp("lastupdateTimestamp", trnBastbj.getLastupdateTimestamp());
			query.setTimestamp("dateDone", new Date());
			query.setString("bastbjNo", trnBastbj.getBastbjNo());
			query.setString("createdBy", trnBastbj.getCreatedBy());
			query.executeUpdate();
		}
		
	}

	@Override
	public void syncRepo(List<TrnRepo> list) {
		// insert only
		System.out.println("syncRepo=" + (list == null ? null : list.size()));
		
		for (TrnRepo trnRepo : list) {
			trnRepo.setFlagDone("Y");
			trnRepo.setDateDone(new Date());
			getSession().saveOrUpdate(trnRepo);
		}
	}
	
}
