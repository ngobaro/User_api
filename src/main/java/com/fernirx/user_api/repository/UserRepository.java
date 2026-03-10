package com.fernirx.user_api.repository;

import com.fernirx.user_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}