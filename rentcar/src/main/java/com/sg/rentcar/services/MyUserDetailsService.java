
package com.sg.rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.UserPrincipal;
import com.sg.rentcar.models.User;
import com.sg.rentcar.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = usersRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found!");
		}
		return new UserPrincipal(user);
	}

}
