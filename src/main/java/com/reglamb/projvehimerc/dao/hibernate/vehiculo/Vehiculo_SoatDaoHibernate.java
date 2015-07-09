package com.reglamb.projvehimerc.dao.hibernate.vehiculo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Vehiculo_SoatDao;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Soat;
@Repository("vehiculosoatDao")

public class Vehiculo_SoatDaoHibernate implements Vehiculo_SoatDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Vehiculo_Soat get(Long id) {
		// TODO Auto-generated method stub
		return (Vehiculo_Soat)sessionFactory.getCurrentSession().get(Vehiculo_Soat.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo_Soat> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `VEHICULO_SOAT`").list();
	}

	@Override
	public void save(Vehiculo_Soat object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Vehiculo_Soat object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveVehiculoSoat(Vehiculo_Soat vehiculosoat) {
//		getHibernateTemplate().saveOrUpdate(vehiculosoat);
	}

	@Override
	public void deleteVehiculoSoat(String vehiculosoat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehiculo_Soat> getAllVehiculoSoat(Vehiculo_Soat vehiculosoat) {
//		return getHibernateTemplate().find("from "
//                + Vehiculo_Soat.class.getName());
		return null;
	}

	@Override
	public Vehiculo_Soat selectVehiculoSoatById(Long idvehiculosoat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Vehiculo_Soat object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}
