package com.springboot.mysql.repository.jpa;

import com.springboot.mysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{


}
