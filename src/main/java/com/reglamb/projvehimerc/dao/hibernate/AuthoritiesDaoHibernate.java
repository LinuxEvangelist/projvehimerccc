package com.reglamb.projvehimerc.dao.hibernate;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.AuthoritiesDao;
import com.reglamb.projvehimerc.domain.security.Authorities;
@Repository("authoritiesDao")
public class AuthoritiesDaoHibernate implements AuthoritiesDao{
	
	@Autowired
	SessionFactory sessionFactory;
      

	@Override
	public Authorities get(Long id) {
		// TODO Auto-generated method stub
		return (Authorities)sessionFactory.getCurrentSession().get(Authorities.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Authorities> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from authorities").list();
	}

	@Override
	public void save(Authorities object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);
	}

	@Override
	public void delete(Authorities object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}
	
	@Override
	public void update(Authorities object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object) ;

	}

	@Override
	public Authorities getAuthority(int id) {
		// TODO Auto-generated method stub
//		Authorities authority = (Authorities) getCurrentSession().load(Authorities.class, id);  
//		return authority;
		return null;
	}

}
