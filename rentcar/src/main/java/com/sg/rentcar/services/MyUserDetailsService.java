package com.sg.rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sg.rentcar.models.Users;
import com.sg.rentcar.repositories.UsersRepository;

public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired UsersRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = usersRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found!");
		}
		return new UserPrincipal(user);
	}

}
