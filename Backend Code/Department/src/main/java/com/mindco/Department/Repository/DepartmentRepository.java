package com.mindco.Department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindco.Department.Entity.department;

@Repository
public interface DepartmentRepository extends JpaRepository<department, Long> {

	department findByDepartmentId(Long departmentId);

}
