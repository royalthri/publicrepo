package com.cg.library.services;

import com.cg.library.dao.AuthorDaoImpl;
import com.cg.library.dao.IAuthorDao;
import com.cg.library.entities.Author;

public class AuthorServicesImpl implements IAuthorServices{
	
	IAuthorDao iad;
    public AuthorServicesImpl() {
    	iad =new AuthorDaoImpl();
    }
    
	@Override
	public boolean storeAuthorData(Author a) {
		// TODO Auto-generated method stub
		return iad.storeAuthorData(a);
	}

	@Override
	public Author getAuthorData(int id) {
		// TODO Auto-generated method stub
		return iad.getAuthorData(id);
	}

	@Override
	public boolean removeAuthor(int id) {
		// TODO Auto-generated method stub
		return iad.removeAuthor(id);
	}

	@Override
	public boolean updateAuthor(Author a) {
		// TODO Auto-generated method stub
		return iad.updateAuthor(a);
	}

}
