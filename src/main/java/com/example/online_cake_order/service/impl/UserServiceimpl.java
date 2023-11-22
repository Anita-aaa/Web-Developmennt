package com.example.online_cake_order.service.impl;

import com.example.online_cake_order.dto.Userdto;
import com.example.online_cake_order.entity.User;
import com.example.online_cake_order.repository.UserRepository;
import com.example.online_cake_order.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public String save(Userdto userdto) {
        User u = new User();

        if(userdto.getId()!=null){
            u=userRepository.findById(userdto.getId()).orElseThrow (()->new NullPointerException("data not found"));
        }

        u.setFullName(userdto.getFullName());
        u.setMobileNo(userdto.getMobileNo());
        u.setEmail(userdto.getEmail());
        u.setPassword(userdto.getPassword());
        userRepository.save(u);
        return "sa";
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getById(Integer id) {
        return userRepository.findById(id);

    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }


}
