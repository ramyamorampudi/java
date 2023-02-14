package com.ex;

import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class CollegeDao extends JdbcDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void intialize() {
		setDataSource(dataSource);
	}
		public void insert(College c) {
			JdbcTemplate jt=getJdbcTemplate();
	jt.execute("insert into college values("+c.getSt_id()+",'"+c.getS_name()+"','"+c.getS_marks()+"','"+c.getSection()+"','"+c.getBranch()+"')");
	
	}
		public void update(College c) {
			JdbcTemplate jt=getJdbcTemplate();
			jt.update("update college set sname='" + c.getS_name() + "', smarks='" + c.getS_marks() + "', section='" + c.getSection() + "', branch='" + c.getBranch() + "' WHERE id='" + c.getSt_id() + "'");

		}
		public void delete(College c) {
			  JdbcTemplate jt = getJdbcTemplate();
			  jt.update("delete from college where id='" + c.getSt_id() + "'");
			}

	public void select(){
		JdbcTemplate jt=getJdbcTemplate();
		List li=jt.queryForList("select * from college");
		Iterator i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}