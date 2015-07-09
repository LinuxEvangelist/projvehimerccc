package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.VehiculoDao;
import com.reglamb.projvehimerc.domain.Vehiculo;
@Repository("vehiculoDao")
public class VehiculoDaoHibernate implements VehiculoDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Vehiculo get(Long id) {
		// TODO Auto-generated method stub
		return (Vehiculo)sessionFactory.getCurrentSession().get(Vehiculo.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `VEHICULO`").list();
	}

	@Override
	public void save(Vehiculo object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);
		
	}

	@Override
	public void delete(Vehiculo object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);
		
	}
	
	@Override
	public void update(Vehiculo object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);
	}

	@Override
	public void saveVehiculo(Vehiculo vehiculo) {
//		getHibernateTemplate().saveOrUpdate(vehiculo);
	}

	@Override
	public void deleteVehiculo(String vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehiculo> getAllVehiculo(Vehiculo vehiculo) {
//		return getHibernateTemplate().find("from "
//                + Vehiculo.class.getName());
		return null;
	}

	@Override
	public Vehiculo selectVehiculoById(Long idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
