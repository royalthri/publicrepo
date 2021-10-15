package com.cg.library.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.cg.library.entities.Author;
import com.cg.library.util.HibernateUtil;

public class AuthorDaoImpl implements IAuthorDao {

	EntityManager em;
	public AuthorDaoImpl() {
		 em= HibernateUtil.getEmf().createEntityManager();
		
	}
	
	@Override
	public boolean storeAuthorData(Author a) {
		
		em.getTransaction().begin();
		try {
			em.persist(a);
			em.getTransaction().commit();
			em.close();
			return true;
		}
		catch(PersistenceException pe) {
			System.out.println(pe);
		}
		return false;
		
	}

	@Override
	public Author getAuthorData(int id) {
		try 
		{
			em.getTransaction().begin();
			Author a=em.find(Author.class, id);
			return a;
		}
		catch(PersistenceException pe) 
		{
			System.out.println(pe);
		}
		return null;
	}

	@Override
	public boolean removeAuthor(int id) {
		try 
		{
			em.getTransaction().begin();
			em.remove(em.find(Author.class, id));
			em.getTransaction().commit();
			em.close();
			return true;
			
		}
		catch(PersistenceException pe)
		{
			System.out.println(pe);
		}
		return false;
	}

	@Override
	public boolean updateAuthor(Author a) {
		em.getTransaction().begin();
		try 
		{
			Author a1=em.find(Author.class, a.getAuthorId());
			em.remove(a1);
			return true;
		}
		catch(PersistenceException pe)
		{
			System.out.println(pe);
		}
		return false;
	}


	
	
	
	

}
