package com.mindco.Department.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindco.Department.Entity.department;
import com.mindco.Department.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository DepartmentRepository;

	public department saveDepartment(department DepartmentEntity) {
		// TODO Auto-generated method stub
		return DepartmentRepository.save(DepartmentEntity);
	}

	public department findDepartmentbyId(Long departmentId) {
		// TODO Auto-generated method stub
		return DepartmentRepository.findByDepartmentId(departmentId);
	}
}
