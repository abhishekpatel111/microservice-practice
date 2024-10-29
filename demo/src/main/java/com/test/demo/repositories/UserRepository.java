package com.test.demo.repositories;

// UserRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
