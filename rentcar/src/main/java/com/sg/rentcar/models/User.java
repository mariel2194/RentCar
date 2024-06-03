
package com.sg.rentcar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data

@NoArgsConstructor

@AllArgsConstructor
public class User {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column
	private String username;

	@Column
	private String password;

	@Column
	private boolean activo;

	public String getPassword() { // TODO Auto-generated method stub return
		return password;
	}

	public String getUsername() { // TODO Auto-generated method stub return
		return username;
	}

}
