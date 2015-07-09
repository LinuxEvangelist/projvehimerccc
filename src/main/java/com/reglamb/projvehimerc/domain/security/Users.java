package com.reglamb.projvehimerc.domain.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import com.reglamb.projvehimerc.domain.DomainObject;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_IncremtSusti;
import com.reglamb.projvehimerc.domain.HabilitacionVehicular_Inscripcion;

/**
 * @author  mastervodoo
 */
@Entity  
@SequenceGenerator(
	    name="SEQ_STORE",
	    sequenceName="sequenceusers",
	    initialValue= 1 ,
	    allocationSize=20)
@Table(name="users")  
public class Users implements Serializable,DomainObject{  
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")  
    private Integer id;  
    private String login;
    private String name_user;
    private String password;
    private Boolean enabled;
    /**
	 * @uml.property  name="habilitacionVehicular_Inscripcion"
	 */
//	private Set<HabilitacionVehicular_Inscripcion> habilitacionVehicular_Inscripcion=new HashSet<HabilitacionVehicular_Inscripcion>();
//	/**
//	 * @uml.property  name="habilitacionVehicular_IncremtSusti"
//	 */
//	private Set<HabilitacionVehicular_IncremtSusti> habilitacionVehicular_IncremtSusti=new HashSet<HabilitacionVehicular_IncremtSusti>();

    
    @OneToOne(cascade=CascadeType.ALL)  
    @JoinTable(name="users_authorities",  
        joinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")},  
        inverseJoinColumns = {@JoinColumn(name="authorities_id", referencedColumnName="id")}  
    )  
    private Authorities authorities;  
  
    public Integer getId() {  
        return id;  
    }  
  
    public void setId(Integer id) {  
        this.id = id;  
    }  
  
    public String getLogin() {  
        return login;  
    }  
  
    public void setLogin(String login) {  
        this.login = login;  
    }  
  
    public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Authorities getauthorities() {  
        return authorities;  
    }  
  
    public void setAuthorities(Authorities authorities) {  
        this.authorities = authorities;  
    }
	/**
	 * @param habilitacionvehicularinscripcion
	 * @uml.property  name="habilitacionVehicular_Inscripcion"
	 */
//	@OneToMany(targetEntity=HabilitacionVehicular_Inscripcion.class,
//			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
//			@JoinColumn(name="id")
//	public Set<HabilitacionVehicular_Inscripcion> getHabilitacionVehicular_Inscripcion() {
//		return habilitacionVehicular_Inscripcion;
//	}
//	public void setHabilitacionVehicular_Inscripcion(
//			Set<HabilitacionVehicular_Inscripcion> habilitacionVehicular_Inscripcion) {
//		this.habilitacionVehicular_Inscripcion = habilitacionVehicular_Inscripcion;
//	}
//	/**
//	 * @param habilitacionvehicularinscripcion
//	 * @uml.property  name="habilitacionVehicular_IncremtSusti"
//	 */
//	@OneToMany(targetEntity=HabilitacionVehicular_IncremtSusti.class,
//			orphanRemoval = true,cascade={javax.persistence.CascadeType.ALL})
//			@JoinColumn(name="id")
//	public Set<HabilitacionVehicular_IncremtSusti> getHabilitacionVehicular_IncremtSusti() {
//		return habilitacionVehicular_IncremtSusti;
//	}
//	public void setHabilitacionVehicular_IncremtSusti(
//			Set<HabilitacionVehicular_IncremtSusti> habilitacionVehicular_IncremtSusti) {
//		this.habilitacionVehicular_IncremtSusti = habilitacionVehicular_IncremtSusti;
//	}

}  