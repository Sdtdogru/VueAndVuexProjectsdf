package com.backendvue.backendvue.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"https://192.168.1.22:8080","file://",  "http://localhost:8080"})
public class UserController {
    @Autowired
    UserService userService;
     @PostMapping("/user")
    public UserEntity userSave(@RequestBody UserEntity userEntity){
        return userService.userSave(userEntity);
    }

    @GetMapping("/user/{email}")
    public UserEntity getUser  (@PathVariable String email ){
         return userService.getUser(email);
    }
}
