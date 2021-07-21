package com.techcushy.springBoot_validation.controller;

import com.techcushy.springBoot_validation.model.Users;
import com.techcushy.springBoot_validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Users> createUser(@Valid @RequestBody Users users){
       Users savedUser = userService.createUser(users);
       return new ResponseEntity<Users>(savedUser, HttpStatus.CREATED);
    }
}
