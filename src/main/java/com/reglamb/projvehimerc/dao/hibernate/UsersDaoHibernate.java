package com.reglamb.projvehimerc.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reglamb.projvehimerc.dao.UsersDao;
import com.reglamb.projvehimerc.domain.security.Users;
@Repository("usersDao")
public class UsersDaoHibernate implements UsersDao{
    
    @Autowired
	SessionFactory sessionFactory;

	@Override
	public Users get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from users").list();

	}

	@Override
	public void save(Users object) {
//		System.out.println("Create User in DAOIMPL..");
//		String encodedPassword = passwordEncoder.encode(object.getPassword());
//        object.setPassword(encodedPassword);
//        getSession().saveOrUpdate("users",object);
//                getSession().close();
//                System.out.println("Updated or Created........."+object.getLogin());
		sessionFactory.getCurrentSession().persist(object);

	}

	@Override
	public void delete(Users object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users getUser(String name_user) {
//		List<Users> userList = new ArrayList<Users>();  
//        Query query = openSession().createQuery("from Users u where u.login = :login");  
//        query.setParameter("login", login);  
//        userList = query.list();  
//        if (userList.size() > 0)  
//            return userList.get(0);  
//        else
//            return null;
		return (Users) sessionFactory.getCurrentSession()
				.createQuery("from Users usr " +
				"where usr.login = :login")
				.setParameter("login", name_user)
				.uniqueResult();

	}
	@Override
	public void update(Users object) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(object) ;
		
	}

}
