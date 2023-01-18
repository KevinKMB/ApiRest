package com.kevinapi.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kevinapi.app.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
