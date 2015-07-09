package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.TransportistaJuridicoDao;
import com.reglamb.projvehimerc.domain.TransportistaJuridico;

@Repository("transportistaJuriDao")
public class TransportistaJuridDaoHibernate  implements TransportistaJuridicoDao{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public TransportistaJuridico get(Long id) {
		// TODO Auto-generated method stub
		return (TransportistaJuridico)sessionFactory.getCurrentSession().get(TransportistaJuridico.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TransportistaJuridico> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `TRANSPORTISTA_JURIDICO`").list();
	}

	@Override
	public void save(TransportistaJuridico object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);		
	}

	@Override
	public void delete(TransportistaJuridico object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);		

	}
	@Override
	public void update(TransportistaJuridico object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);		
	}

	@Override
	public void saveTransportistaJuridDao(
			TransportistaJuridico transportistajurid) {
//		getHibernateTemplate().saveOrUpdate(transportistajurid);
	}

	@Override
	public void deleteTransportistaJuridDao(String transportistajurid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TransportistaJuridico> getAllTransportistaJuridDao(
			TransportistaJuridico transportistajurid) {
//		return getHibernateTemplate().find("from "
//                + TransportistaJuridico.class.getName());
		return null;
	}

	@Override
	public TransportistaJuridico selectTransportistaJuridDaoById(
			Long idtransportistajurid) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
