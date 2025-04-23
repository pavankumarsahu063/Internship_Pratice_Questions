package com.security.reposistory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.model.User;

@Repository
public interface UserReposistory extends JpaRepository<User, Integer>{
	Optional<User> findByEmail(String email);
}
