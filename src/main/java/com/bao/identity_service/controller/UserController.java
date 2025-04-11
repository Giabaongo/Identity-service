package com.bao.identity_service.controller;

import com.bao.identity_service.dto.request.UserCreateionRequest;
import com.bao.identity_service.entity.User;
import com.bao.identity_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreateionRequest request){
        return userService.createUser(request);

    }

}
