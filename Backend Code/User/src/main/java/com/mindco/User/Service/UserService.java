package com.mindco.User.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mindco.User.Entity.User;
import com.mindco.User.Repository.UserRepository;
import com.mindco.User.VO.Department;
import com.mindco.User.VO.ResponseTemplateVO;

import lombok.Data;


@Service

public class UserService {

	private static final String DepartmentId = null;

	@Autowired
	private UserRepository userRepository;	
	
	@Autowired
	private static RestTemplate restTemplate;
	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public static  ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = UserRepository.findByUserId(userId);
		
		String url;
		Department department =
				restTemplate.getForObject(url = "http://localhost:9001/departments/" + UserRepository.getDepartmentId(DepartmentId), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

	
	
}
