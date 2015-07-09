package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.HabilitacionVehicular_InscripcionDao;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_Inscripcion;
@Repository("inscriptransportistaDao")
public class HabilitacionVehicular_InscripcionDaoHibernate implements HabilitacionVehicular_InscripcionDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public HabilitacionVehicular_Inscripcion get(Long id) {
		// TODO Auto-generated method stub
		return (HabilitacionVehicular_Inscripcion)sessionFactory.getCurrentSession().get(HabilitacionVehicular_Inscripcion.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HabilitacionVehicular_Inscripcion> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from 'HABILITACIONVEHICULAR_INSCRIPCION'").list();
	}

	@Override
	public void save(HabilitacionVehicular_Inscripcion object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);
	}

	@Override
	public void delete(HabilitacionVehicular_Inscripcion object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);
		
	}
	
	@Override
	public void update(HabilitacionVehicular_Inscripcion object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object) ;
		
	}

	@Override
	public void saveHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip) {
//		getHibernateTemplate().saveOrUpdate(habilitacioninscrip);
	}

	@Override
	public void deleteHabilitacionVehicularInscrip(String habilitacioninscrip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HabilitacionVehicular_Inscripcion> getAllHabilitacionVehicularInscrip(
			HabilitacionVehicular_Inscripcion habilitacioninscrip) {
//		return getHibernateTemplate().find("from "
//                + HabilitacionVehicular_Inscripcion.class.getName());
		return null;
	}

	@Override
	public HabilitacionVehicular_Inscripcion selectHabilitacionVehicularInscripById(
			Long idhabilitacioninscrip) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
