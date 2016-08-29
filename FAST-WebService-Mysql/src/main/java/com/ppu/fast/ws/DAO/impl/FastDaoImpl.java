package com.ppu.fast.ws.DAO.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ppu.fast.ws.DAO.IFastDao;
import com.ppu.fast.ws.domain.MstSecUserVO;
import com.ppu.fast.ws.domain.TrxLDVDetails;
import com.ppu.fast.ws.domain.TrxLDVHeader;
import com.ppu.fast.ws.pojo.LKPData;

@Repository("fastDao")
public class FastDaoImpl extends BasicHibernate implements IFastDao {

	@Override
	public MstSecUserVO login(final String id, final String password) {
		
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
        SQLQuery q = getSession().createSQLQuery("SELECT b.* FROM mb_mst_user a, mb_sec_users b where a.USER_ID=b.USER_NAME and a.USER_ID=:userId and b.USER_PWD=:pwd"
                );
		q.setParameter("userId", id);
		q.setParameter("pwd", password);
		
		q.addEntity(MstSecUserVO.class);
		
//		
//		List<MstSecUserVO> list = q.list();
		
        if (q.list().size() > 0)
			return (MstSecUserVO) q.list().get(0);
        else
       	 return null;

		
//        Criteria c = getSession().createCriteria(MstUserVO.class);
//        c.add(Restrictions.eq("id", id));
//        
//        List<?> list = c.list();
        
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
	public List<MstSecUserVO> getUsers() {
		Criteria criteria = getSession().createCriteria(MstSecUserVO.class);
		List list = criteria.list();
		
		return list;
	}

	@Override
	public LKPData getLKP(String collectorCode) {
		
		LKPData data = new LKPData();
		
		Criteria c = getSession().createCriteria(TrxLDVHeader.class);
		c.add(Restrictions.eq("collCode", collectorCode));
		
		List list = c.list();
		
		if (list.size() > 0) {
			TrxLDVHeader header = (TrxLDVHeader) list.get(0);
			
			data.setHeader(header);
			
			c = getSession().createCriteria(TrxLDVDetails.class);
			c.add(Restrictions.eq("ldvNo", header.getLdvNo()));
			
			List details = c.list();
			
			data.setDetails(details);
		}
		
		return data;
	}

}
