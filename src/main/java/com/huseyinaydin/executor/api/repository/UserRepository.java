package com.huseyinaydin.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
