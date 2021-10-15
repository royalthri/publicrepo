package com.cg.library.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Authors")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Author Id")
	private int authorId;
	
	@Column(name="First Name")
	private String firstName;
	
	@Column(name="Middle Name")
	private String middleName;
	
	@Column(name="Last Name")
	private String lastName;
	
	@Column(name="Phone Number")
	private int phoneNumber;
	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Author() {}
	
	public Author( String firstName, String middleName, String lastName,int phoneNumber) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber=phoneNumber;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		Author a=(Author)obj;
		return authorId==a.authorId && Objects.equals(firstName, a.firstName)
				&& Objects.equals(middleName, a.middleName) && Objects.equals(lastName, a.lastName)
				&& phoneNumber==a.phoneNumber;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + "]";
	}

}
