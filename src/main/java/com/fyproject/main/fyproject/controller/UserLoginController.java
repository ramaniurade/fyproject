package com.fyproject.main.fyproject.controller;

import com.fyproject.main.fyproject.model.UserDetails;
import com.fyproject.main.fyproject.service.UserDetailService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class UserLoginController {

    @Autowired
    private UserDetailService userDetailService;


    @PostMapping(value = "/saveUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveUser(UserDetails userDetails) {
        return userDetailService.saveUser(userDetails);
    }

    @GetMapping(value = "/dummyUserSave")
    public String dummyUserSave() {
        return userDetailService.saveUser(new UserDetails("abd", "def"));
    }

    @GetMapping(value = "/getUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUser() {
        return userDetailService.getUser("abd");
    }

}
