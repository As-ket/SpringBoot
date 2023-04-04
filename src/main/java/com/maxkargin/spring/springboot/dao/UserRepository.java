package com.maxkargin.spring.springboot.dao;

import com.maxkargin.spring.springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
