package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.TransportistaNaturalDao;
import com.reglamb.projvehimerc.domain.TransportistaNatural;
@Repository("transportistaNatuDao")
public class TransportistaNatuDaoHibernate implements TransportistaNaturalDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public TransportistaNatural get(Long id) {
		// TODO Auto-generated method stub
		return (TransportistaNatural)sessionFactory.getCurrentSession().get(TransportistaNatural.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TransportistaNatural> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `TRANSPORTISTA_NATURAL`").list();
	}

	@Override
	public void save(TransportistaNatural object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);		

	}

	@Override
	public void delete(TransportistaNatural object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);		

	}
	@Override
	public void update(TransportistaNatural object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);		

	}

	@Override
	public void saveTransportistaNatuDao(TransportistaNatural transportistanatu) {
//		getHibernateTemplate().saveOrUpdate(transportistanatu);
		
	}

	@Override
	public void deleteTransportistaNatuDao(String transportistanatu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TransportistaNatural> getAllTransportistaNatuDao(
			TransportistaNatural transportistanatu) {
//		return getHibernateTemplate().find("from "
//                + TransportistaNatural.class.getName());
		return null;
	}

	@Override
	public TransportistaNatural selectTransportistaNatuDaoById(
			Long idtransportistanatu) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
