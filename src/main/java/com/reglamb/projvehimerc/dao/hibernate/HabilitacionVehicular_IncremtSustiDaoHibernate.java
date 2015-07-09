package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.HabilitacionVehicular_IncremtSustiDao;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_IncremtSusti;

@Repository("incrementsustitransportistaDao")
public class HabilitacionVehicular_IncremtSustiDaoHibernate  implements HabilitacionVehicular_IncremtSustiDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public HabilitacionVehicular_IncremtSusti get(Long id) {
		// TODO Auto-generated method stub
		return (HabilitacionVehicular_IncremtSusti)sessionFactory.getCurrentSession().get(HabilitacionVehicular_IncremtSusti.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HabilitacionVehicular_IncremtSusti> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from 'HABILITACIONVEHICULAR_INCREMTSUSTI'").list();
	}

	@Override
	public void save(HabilitacionVehicular_IncremtSusti object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);
	}

	@Override
	public void delete(HabilitacionVehicular_IncremtSusti object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);		
	}
	
	@Override
	public void update(HabilitacionVehicular_IncremtSusti object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object) ;		
	}
	
	@Override
	public HabilitacionVehicular_IncremtSusti selectHabilitacionVehicularIncremtSustiById(
			Long idhabilitacionincremtsusti) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteHabilitacionVehicularIncremtSusti(
			String habilitacionincremtsusti) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<HabilitacionVehicular_IncremtSusti> getAllHabilitacionVehicularIncremtSusti(
			HabilitacionVehicular_IncremtSusti habilitacionincremtsusti) {
//		return getHibernateTemplate().find("from "
//                + HabilitacionVehicular_IncremtSusti.class.getName());
		return null;
	}

	


}
