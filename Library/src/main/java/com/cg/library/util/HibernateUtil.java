package com.cg.library.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	private static EntityManagerFactory emf;
	
    public static EntityManagerFactory getEmf() {
    	emf = Persistence.createEntityManagerFactory("PU");
		return emf;
	}
	
    public static void closeEmf() {
    	if(emf!=null&& emf.isOpen()) {
    		emf.close();
    	}
    }
	 
}
