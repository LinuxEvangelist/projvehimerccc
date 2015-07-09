package com.reglamb.projvehimerc.dao.hibernate.transportista;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.Transportista_RepresentanteDao;
import com.reglamb.projvehimerc.domain.transportista.Transportista_Representante;

@Repository("transrepresentanteDao")
public class Transportista_RepresentanteDaoHibernate implements Transportista_RepresentanteDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Transportista_Representante get(Long id) {
		// TODO Auto-generated method stub
		return (Transportista_Representante)sessionFactory.getCurrentSession().get(Transportista_Representante.class, id);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transportista_Representante> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `TRANSPORTISTA_REPRESENTANTE`").list();
	}

	@Override
	public void save(Transportista_Representante object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Transportista_Representante object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveTransportistaRepresentate(
			Transportista_Representante transportistarepre) {
//		getHibernateTemplate().saveOrUpdate(transportistarepre);
		
	}

	@Override
	public void deleteTransportistaRepresentate(String transportistarepre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transportista_Representante> getAllTransportistaRepresentate(
			Transportista_Representante transportistarepre) {
//		return getHibernateTemplate().find("from "
//                + Transportista_Representante.class.getName());
		return null;
	}

	@Override
	public Transportista_Representante selectTransportistaRepresentateById(
			Long idtransportistarepre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Transportista_Representante object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);
		
	}

}
