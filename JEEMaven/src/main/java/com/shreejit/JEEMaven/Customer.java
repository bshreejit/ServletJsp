package com.shreejit.JEEMaven;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity will define which objects will be persisted inside the table
@Entity

// Finds the name of the table that will be able to create for our entity
@Table(name = "customer2")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "custID", unique = true)
	private int id;
	
	@Column(name = "firstName", nullable = false)
    private String fName;
 
    @Column(name = "lastName", nullable = false)
    private String lName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	

}
