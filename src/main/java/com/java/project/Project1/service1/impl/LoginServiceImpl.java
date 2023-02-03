
package com.java.project.Project1.service1.impl;


import com.java.project.Project1.dto.LoginRequestDto;
import com.java.project.Project1.dto.UserDto;
import com.java.project.Project1.service1.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LoginServiceImpl implements LoginService{

    @Autowired
    
    
    @Override
    public UserDto login(LoginRequestDto dto) {
  
    }
    
}
