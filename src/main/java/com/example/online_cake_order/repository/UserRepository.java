package com.example.online_cake_order.repository;

import com.example.online_cake_order.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}