package com.srinath.user.user.service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/users")
public class DynamicPropertiesController {

    @Value("${app.title}")
    private String value;

    @GetMapping("/getDynamicProperty")
    public ResponseEntity<String> getUserWithDepartmentById(){
        return new ResponseEntity<>("Value offrom Config Server: " + value, HttpStatus.OK);
    }

}
