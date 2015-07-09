package com.reglamb.projvehimerc.dao.hibernate.ubigeo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.DepartamentoDao;
import com.reglamb.projvehimerc.domain.ubigeo.Departamento;

@Repository("departamentoDao")
public class DepartamentoDaoHibernate implements DepartamentoDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Departamento get(Long id) {
		// TODO Auto-generated method stub
		return (Departamento)sessionFactory.getCurrentSession().get(Departamento.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Departamento> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from `DEPARTAMENTO`").list();
	}

	@Override
	public void save(Departamento object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Departamento object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(object);

	}

	@Override
	public void saveDepartamento(Departamento departamento) {
//		getHibernateTemplate().saveOrUpdate(departamento);		
		
	}

	@Override
	public void deleteDepartamento(String departamento) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Departamento> getAllDepartamento(Departamento departamento) {
//		return getHibernateTemplate().find("from "
//                + Departamento.class.getName());
		return null;
	}

	@Override
	public Departamento selectDepartamentoById(Long iddepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Departamento object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object);

	}

}
