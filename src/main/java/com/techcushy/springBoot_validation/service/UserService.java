package com.techcushy.springBoot_validation.service;

import com.techcushy.springBoot_validation.model.Users;
import com.techcushy.springBoot_validation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users createUser(Users users){
        return userRepository.save(users);
    }
}
