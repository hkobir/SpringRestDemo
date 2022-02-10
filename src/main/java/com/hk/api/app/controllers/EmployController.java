package com.hk.api.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hk.api.app.models.Employ;

@RestController
public class EmployController {
	List<Employ> employList = new ArrayList<Employ>();

	@GetMapping("/employ/{id}")
	public Employ getEmploy(@PathVariable("id") String id) {
		employList = getEmployData();
		Employ employ = null;
		for (Employ e : employList) {
			if (e.getId().equals(id))
				employ = e;

		}

		return employ;
	}

	@GetMapping("/emploies")
	public List<Employ> getEmployList() {
		employList = getEmployData();

		return employList;
	}

	private List<Employ> getEmployData() {
		// TODO Auto-generated method stub
		Employ e1 = new Employ("101", "Hk", "Dev");
		Employ e2 = new Employ("102", "Hk", "Drv");
		Employ e3 = new Employ("103", "Hk", "Dyv");
		employList.add(e1);
		employList.add(e2);
		employList.add(e3);
		return employList;
	}

	// Query parameter: http://localhost:8080/emploies/query?id=101&name=Hk
	@GetMapping("/emploies/query")
	public Employ getEmloyByQuery(@RequestParam(name = "id") String id, @RequestParam(name = "name") String name) {
		employList = getEmployData();
		Employ employ = null;
		for (Employ e : employList) {
			if (e.getId().equals(id) && e.getName().equals(name))
				employ = e;

		}

		return employ;
	}
}
