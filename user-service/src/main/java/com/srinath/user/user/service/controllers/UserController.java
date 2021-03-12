package com.srinath.user.user.service.controllers;

import com.srinath.user.user.service.entities.User;
import com.srinath.user.user.service.services.UserService;
import com.srinath.user.user.service.vos.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Calling service to save user : {}", user);
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findUserByIdWithDepartment(@PathVariable("id") Long userId){
        return userService.findUserByIdWithDepartment(userId);
    }

}
