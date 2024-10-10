package com.app.application.service;

import com.app.application.data.userRepository;
import com.app.application.dto.userDto;
import com.app.application.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private userRepository userRepo;

    @Override
    public List<userDto> getUsers() {
        return userRepo.findAll().stream().map( u -> new userDto(u)).toList();
    }
}
