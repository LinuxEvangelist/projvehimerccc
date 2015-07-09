package com.reglamb.projvehimerc.dao;

import java.util.List;

import com.reglamb.projvehimerc.domain.Conductor;

public interface ConductorDao extends GenericDao<Conductor>{
	public void saveConductor(Conductor conductor);
	   public void deleteConductor(String conductor) ;
	   public List<Conductor> getAllConductor() ;
	   public Conductor selectVehiculoById(Long idConductor) ;
	   public Conductor getConductorByName(String nomConductor);
}
