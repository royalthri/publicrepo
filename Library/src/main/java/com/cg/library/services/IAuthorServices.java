package com.cg.library.services;

import com.cg.library.entities.Author;

public interface IAuthorServices {
	public boolean storeAuthorData(Author a);
	public Author getAuthorData(int id);
	public boolean removeAuthor(int id);
	public boolean updateAuthor(Author a);
}
