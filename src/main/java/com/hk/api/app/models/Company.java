package com.hk.api.app.models;

import java.util.List;

public class Company {
	String name;
	List<Employ> employs;

	public Company(String name, List<Employ> employs) {
		super();
		this.name = name;
		this.employs = employs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employ> getEmploys() {
		return employs;
	}

	public void setEmploys(List<Employ> employs) {
		this.employs = employs;
	}

}
