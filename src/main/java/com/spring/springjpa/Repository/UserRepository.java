package com.spring.springjpa.Repository;

import com.spring.springjpa.Model.User;
import com.spring.springjpa.Model.UserPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
