package com.devsuperior.userdept.repositories;

import com.devsuperior.userdept.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
