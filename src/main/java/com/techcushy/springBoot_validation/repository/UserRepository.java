package com.techcushy.springBoot_validation.repository;

import com.techcushy.springBoot_validation.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
