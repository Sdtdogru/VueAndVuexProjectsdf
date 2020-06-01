package com.backendvue.backendvue.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
     @PostMapping("/user")
    public UserEntity userSave(@RequestBody UserEntity userEntity){
        return userService.userSave(userEntity);
    }

}
