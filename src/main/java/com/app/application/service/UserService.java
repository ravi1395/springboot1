package com.app.application.service;

import com.app.application.dto.userDto;
import com.app.application.model.user;

import java.util.List;

public interface UserService {
    List<userDto> getUsers();
}
