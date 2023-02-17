package com.ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfosysController {
	@Autowired
	private InfosysService is;
	
	@RequestMapping(value="addInfosys",method=RequestMethod.POST)
	public void addInfosys(@RequestBody Infosys s) {
		is.insert(s);
	}
	@RequestMapping(value="/getInfosys",method=RequestMethod.GET)
	public List<Infosys> getData(){
		return is.select();	
}
	@RequestMapping(value="/deleteInfosys/{id}",method=RequestMethod.DELETE)
	public void deleteData(@PathVariable int id) {
		is.delete(id);
	}
	@RequestMapping(value="/updateInfosys/{salary}/{id}",method=RequestMethod.PUT)
	public void updateData(@PathVariable int salary,@PathVariable int id) {
		is.update(salary,id);
	}
}			
