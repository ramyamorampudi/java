package com.ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfosysService {

	@Autowired
	InfosysRepository ir;
	
	public void insert(Infosys s) {
		ir.save(s);
	}
	public List<Infosys> select(){
		List<Infosys> li=ir.findAll();
		return li;
	}
	public void delete(int id) {
		ir.deleteById(id);
	}
	public void update(int salary,int id) {
		ir.update(salary,id);
	}
}