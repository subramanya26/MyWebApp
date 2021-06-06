package com.mindco.User.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mindco.User.Repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_TBL")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long UserId;
	private String Firstname;
	private String LastName;
	private String EmailId;
	private String Password;
	private String DepartmentId;
	public String getDepartmentId() {
		return UserRepository.getDepartmentId(DepartmentId);
	}

		
}
