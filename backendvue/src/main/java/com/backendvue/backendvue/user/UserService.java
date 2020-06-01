package com.backendvue.backendvue.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserEntity userSave(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
}
