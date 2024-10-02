package com.hibrydfit.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibrydfit.demo.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
