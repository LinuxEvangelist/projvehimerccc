package com.reglamb.projvehimerc.dao.hibernate.vehiculo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Vehiculo_CitvDao;
//import com.reglamb.projvehimerc.domain.TransportistaNatural;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Citv;
@Repository("vehiculocitvDao")
public class Vehiculo_CitvDaoHibernate implements Vehiculo_CitvDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Vehiculo_Citv get(Long id) {
		// TODO Auto-generated method stub
		return (Vehiculo_Citv)sessionFactory.getCurrentSession().get(Vehiculo_Citv.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo_Citv> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `VEHICULO_CITV`").list();
	}

	@Override
	public void save(Vehiculo_Citv object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Vehiculo_Citv object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveVehiculoCitv(Vehiculo_Citv vehiculocitv) {
//		getHibernateTemplate().saveOrUpdate(vehiculocitv);
	}

	@Override
	public void deleteVehiculoCitv(String vehiculocitv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehiculo_Citv> getAllVehiculoCitv(Vehiculo_Citv vehiculocitv) {
//		return getHibernateTemplate().find("from "
//                + Vehiculo_Citv.class.getName());
		return null;
	}
	
	@Override
	public Vehiculo_Citv selectVehiculoCitvById(Long idvehiculocitv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Vehiculo_Citv object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}
