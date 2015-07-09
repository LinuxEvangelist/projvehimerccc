package com.reglamb.projvehimerc.dao;

import java.util.Collection;

import com.reglamb.projvehimerc.domain.DomainObject;

public interface GenericDao <T extends DomainObject>{
	public T get(Long id);
	public Collection<T> getAll();
	public void save(T object);
	public void delete(T object);
	public void update(T object);
}
