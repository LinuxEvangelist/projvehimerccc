package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.TransportistaDao;
import com.reglamb.projvehimerc.domain.Transportista;
@Repository("transportistaDao")
public class TransportistaDaoHibernate implements TransportistaDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Transportista get(Long id) {
		// TODO Auto-generated method stub
		return (Transportista)sessionFactory.getCurrentSession().get(Transportista.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Transportista> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from `TRANSPORTISTA_JURIDICO`,`TRANSPORTISTA_NATURAL`").list();
	}

	@Override
	public void save(Transportista object) {
		sessionFactory.getCurrentSession().persist(object);		
	}

	@Override
	public void delete(Transportista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);
		
	}
	@Override
	public void update(Transportista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);
		
	}

	@Override
	public void saveTransportista(Transportista transportista) {
//		getHibernateTemplate().saveOrUpdate(transportista);
		
	}

	@Override
	public void deleteTransportista(String transportista) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transportista> getAllTransportista(Transportista transportista) {
//		return getHibernateTemplate().find("from "
//                + Transportista.class.getName());
		return null;
	}

	@Override
	public Transportista selectTransportistaById(Long idtransportista) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
