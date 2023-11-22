package com.example.online_cake_order.controller;

import com.example.online_cake_order.dto.Userdto;
//import com.example.online_cake_order.service.UserService;
import com.example.online_cake_order.entity.User;
import com.example.online_cake_order.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("data")
    public String getData(){

        return "data retrieved";
    }

    @PostMapping("save")
    public String createData(@RequestBody Userdto userdto){
        System.out.println(userdto);
        userService.save(userdto);
        return "created data";
    }

     @GetMapping("getAll")
     public List<User> getAllData(){

         return userService.getAll();
     }
     @GetMapping("getById/{id}")
     public Optional<User> getById(@PathVariable("id")Integer id){
       return userService.getById(id);
    }

     @GetMapping("deleteById/{id}")
    public  void deleteById(@PathVariable ("id") Integer id){
        userService.deleteById(id);

    }
}
