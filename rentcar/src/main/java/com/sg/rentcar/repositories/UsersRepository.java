package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sg.rentcar.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	Users findByUsername(String username);
}
