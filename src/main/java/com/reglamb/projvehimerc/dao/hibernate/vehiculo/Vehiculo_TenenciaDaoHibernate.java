package com.reglamb.projvehimerc.dao.hibernate.vehiculo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Vehiculo_TenenciaDao;
import com.reglamb.projvehimerc.domain.vehiculo.Vehiculo_Tenencia;
@Repository("vehiculoteneciaDao")
public class Vehiculo_TenenciaDaoHibernate implements Vehiculo_TenenciaDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Vehiculo_Tenencia get(Long id) {
		// TODO Auto-generated method stub
		return (Vehiculo_Tenencia)sessionFactory.getCurrentSession().get(Vehiculo_Tenencia.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo_Tenencia> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `VEHICULO_TENENCIA`").list();

	}

	@Override
	public void save(Vehiculo_Tenencia object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Vehiculo_Tenencia object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveVehiculoTenencia(Vehiculo_Tenencia vehiculotenencia) {
//		getHibernateTemplate().saveOrUpdate(vehiculotenencia);
	}

	@Override
	public void deleteVehiculoTenencia(String vehiculotenencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehiculo_Tenencia> getAllVehiculoTenencia(
			Vehiculo_Tenencia vehiculotenencia) {
//		return getHibernateTemplate().find("from "
//                + Vehiculo_Tenencia.class.getName());
		return null;
	}

	@Override
	public Vehiculo_Tenencia selectVehiculoTenenciaById(
			Long idvehiculotenencia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Vehiculo_Tenencia object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}
