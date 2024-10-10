package com.app.application.control;

import com.app.application.dto.userDto;
import com.app.application.model.user;
import com.app.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<userDto> getUsers(){
        return service.getUsers();
    }
}
