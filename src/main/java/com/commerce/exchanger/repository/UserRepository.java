package com.commerce.exchanger.repository;

import com.commerce.exchanger.model.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {

}