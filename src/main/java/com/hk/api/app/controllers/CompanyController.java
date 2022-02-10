package com.hk.api.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hk.api.app.models.Company;
import com.hk.api.app.models.Employ;

@RestController
public class CompanyController {
	List<Employ> employList;

	@GetMapping("/company")
	public Company getCompany() {
		employList = new ArrayList<Employ>();
		employList = getEmployData();
		return new Company("Ak trade", employList);
	}

	private List<Employ> getEmployData() {
		// TODO Auto-generated method stub
		Employ e1 = new Employ("101", "Hk", "Dev");
		Employ e2 = new Employ("101", "Hk", "Dev");
		Employ e3 = new Employ("101", "Hk", "Dev");
		employList.add(e1);
		employList.add(e2);
		employList.add(e3);
		return employList;
	}
}
