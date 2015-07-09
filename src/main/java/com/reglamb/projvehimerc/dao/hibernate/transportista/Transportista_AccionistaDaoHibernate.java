package com.reglamb.projvehimerc.dao.hibernate.transportista;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Transportista_AccionistaDao;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Accionista;
@Repository("transaccionistaDao")
public class Transportista_AccionistaDaoHibernate implements Transportista_AccionistaDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Transportista_Accionista get(Long id) {
		// TODO Auto-generated method stub
		return (Transportista_Accionista)sessionFactory.getCurrentSession().get(Transportista_Accionista.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transportista_Accionista> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `TRANSPORTISTA_ACCIONISTA`").list();

	}

	@Override
	public void save(Transportista_Accionista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Transportista_Accionista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveTransportistaAccionista(
			Transportista_Accionista transportistasaccio) {
//		getHibernateTemplate().saveOrUpdate(transportistasaccio);
	}

	@Override
	public void deleteTransportistaAccionista(String transportistasaccio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transportista_Accionista> getAllTransportistaAccionista(
			Transportista_Accionista transportistasaccio) {
//		return getHibernateTemplate().find("from "
//                + Transportista_Accionista.class.getName());
		return null;
	}

	@Override
	public Transportista_Accionista selectTransportistaAccionistaById(
			Long idtransportistasaccio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Transportista_Accionista object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}
