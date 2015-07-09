package com.reglamb.projvehimerc.dao.hibernate.transportista;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Transportista_SucursalDao;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Sucursal;
@Repository("transsucursalDao")
public class Transportista_SucursalDaoHibernate implements Transportista_SucursalDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Transportista_Sucursal get(Long id) {
		// TODO Auto-generated method stub
		return (Transportista_Sucursal)sessionFactory.getCurrentSession().get(Transportista_Sucursal.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transportista_Sucursal> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `TRANSPORTISTA_SUCURSAL`").list();
	}

	@Override
	public void save(Transportista_Sucursal object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Transportista_Sucursal object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveTransportistaSucursal(
			Transportista_Sucursal transportistasucu) {
//		getHibernateTemplate().saveOrUpdate(transportistasucu);
	}

	@Override
	public void deleteTransportistaSucursal(String transportistasucu) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(transportistasucu);
		
	}

	@Override
	public List<Transportista_Sucursal> getAllTransportistaSucursal(
			Transportista_Sucursal transportistasucu) {
//		return getHibernateTemplate().find("from "
//                + Transportista_Sucursal.class.getName());
		return null;
	}

	@Override
	public Transportista_Sucursal selectTransportistaSucursalById(
			Long idtransportistasucu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Transportista_Sucursal object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}
