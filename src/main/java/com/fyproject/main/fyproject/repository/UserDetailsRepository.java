package com.fyproject.main.fyproject.repository;

import com.fyproject.main.fyproject.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity,String> {
}
