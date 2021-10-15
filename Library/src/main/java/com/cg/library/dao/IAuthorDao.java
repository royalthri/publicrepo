package com.cg.library.dao;

import com.cg.library.entities.Author;

public interface IAuthorDao {
	public boolean storeAuthorData(Author a);
	public Author getAuthorData(int id);
	public boolean removeAuthor(int id);
	public boolean updateAuthor(Author a);
}
