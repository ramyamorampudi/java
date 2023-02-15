package com.ex;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CollegeRepository extends JpaRepository<College,Integer> {

		@Modifying
		@Transactional
		@Query("update College c set c.s_marks=?1 where c.st_id=?2")
		int update(int s_marks,int st_id);
		
}