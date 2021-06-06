package com.mindco.Department.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindco.Department.Entity.department;
import com.mindco.Department.Service.DepartmentService;




@RestController
@RequestMapping("/departments")

public class DepartmentController {

	@Autowired
	private DepartmentService DepartmentService;
	
	@PostMapping("/")
	public department saveDepartment(@RequestBody department department) {
		
		return DepartmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public department findDepartmentbyId(@PathVariable("id") Long DepartmentId) {
		
		return DepartmentService.findDepartmentbyId(DepartmentId);
		
	}
}
