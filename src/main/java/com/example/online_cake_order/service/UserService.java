package com.example.online_cake_order.service;

import com.example.online_cake_order.dto.Userdto;
import com.example.online_cake_order.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String save(Userdto userdto);

    List<User> getAll();
    Optional<User> getById(Integer id);
    void deleteById(Integer id);
}
