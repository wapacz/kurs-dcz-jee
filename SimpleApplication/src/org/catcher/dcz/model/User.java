package org.catcher.dcz.model;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -1744283516228245024L;
	private String name;
	private String surname;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
