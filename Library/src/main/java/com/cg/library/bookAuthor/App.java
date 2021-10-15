package com.cg.library.bookAuthor;

import com.cg.library.entities.Author;
import com.cg.library.services.AuthorServicesImpl;
import com.cg.library.services.IAuthorServices;

public class App {
  public static void main(String[] args) {
	  
	  
	  IAuthorServices ia=new AuthorServicesImpl();
	  boolean b=ia.storeAuthorData(new Author("Lee","Min","Hoo",231456874));
	  if(b)   System.out.println("Successfully added !");
	  else System.out.println("Failed to add author");
	  
  }
}
