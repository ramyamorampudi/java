package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

	@Autowired
	CollegeRepository collegeRepository;

	public void insert(College c) {
		collegeRepository.save(c);
	}

	public void select() {
		List<College> li = collegeRepository.findAll();
		Iterator<College> i = li.iterator();
		while (i.hasNext()) {
			College c = i.next();
			System.out.println(c.getSt_id() + " " + c.getS_name() + " " + c.getSection() + " " + c.getS_marks() + " " + c.getBranch());
		}
	}
	public void delete(int st_id) {
		collegeRepository.deleteById(st_id);
	}

	public void update(int s_marks, int st_id) {
		collegeRepository.update(s_marks, st_id);
	}
}