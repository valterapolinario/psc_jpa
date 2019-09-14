package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import psc.jpa.UtilJpa;

public abstract class DAOgenerico<T extends EntidadeBase> {
	private static EntityManager em = UtilJpa.getEntityManager();

	public T findById(Class<T> classe, int id) {
		return em.find(classe, id);

	}

	public void saveorUpdate(T obj) {
		try {
			em.getTransaction().begin();
			if (obj.getPK() == null) {
				em.persist(obj);
			} else {
				em.merge(obj);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	public void remove(Class<T> classe, int id) {
		T t = findById(classe, id);
		try {
			em.getTransaction().begin();
			em.remove(t);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

}
