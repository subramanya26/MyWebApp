package com.mindco.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindco.User.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	static User findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	static String getDepartmentId(String departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
