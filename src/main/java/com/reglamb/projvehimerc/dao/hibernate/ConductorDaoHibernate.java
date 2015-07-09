package com.reglamb.projvehimerc.dao.hibernate;

import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.ConductorDao;
import com.reglamb.projvehimerc.domain.Conductor;
@Repository("conductorDao")
public class ConductorDaoHibernate implements ConductorDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Conductor get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Conductor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Conductor object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Conductor object) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Conductor object) {
		sessionFactory.getCurrentSession().merge(object) ;
		
	}

	@Override
	public void saveConductor(Conductor conductor) {
		sessionFactory.getCurrentSession().persist(conductor);

	}

	@Override
	public void deleteConductor(String conductor) {
		sessionFactory.getCurrentSession().delete(conductor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Conductor> getAllConductor() {
//		return getHibernateTemplate().find("from "
//        + Conductor.class.getName());
		return sessionFactory.getCurrentSession().createQuery("from 'CONDUCTOR'").list();
	}

	@Override
	public Conductor selectVehiculoById(Long idConductor) {
		// TODO Auto-generated method stub
		return (Conductor)sessionFactory.getCurrentSession().get(Conductor.class, idConductor);

	}
	@Override
	public Conductor getConductorByName(String nomConductor) {
		return (Conductor) sessionFactory.getCurrentSession()
		.createQuery("from 'CONDUCTOR' cdt " +
		"where cdt.NOMBRE_COMPLETO = :NOMBRE_COMPLETO")
		.setParameter("NOMBRE_COMPLETO", nomConductor)
		.uniqueResult();
		}

	

}
