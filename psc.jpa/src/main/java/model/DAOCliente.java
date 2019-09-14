
package model;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.From;

import org.hibernate.sql.Select;

import psc.jpa.UtilJpa;

public class DAOCliente extends DAOgenerico<Cliente> {

	private static EntityManager em  = UtilJpa.getEntityManager();	 
	String consulta = "Select c from Cliente c";
	//Query queryConsulta = em.createQuery(consulta,Cliente.class);
	public Collection<Cliente>findAll(Class<Cliente> Cliente){
		TypedQuery<Cliente>queryConsultaCliente = em.createQuery(consulta,Cliente.class);
		Collection<Cliente>registros = queryConsultaCliente.getResultList();
		return registros;
		
	}
}
