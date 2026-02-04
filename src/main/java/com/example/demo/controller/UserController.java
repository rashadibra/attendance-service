package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userservice){
        this.userService=userservice;
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<UserDto>> getUsersController(){
        List<UserDto> users=userService.getUsersService();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/User/{id}")
    public UserDto getUserbyId(@RequestParam int userId){
        return UserService.getUserById(userId);
    }
}
