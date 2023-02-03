
package com.java.project.Project1.controller;

import com.jap.ecommerce.Project.dto.LoginRequestDto;
import com.jap.ecommerce.Project.dto.UserDto;
import com.java.project.Project1.service1.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class SecurityController {
    @Autowired
    LoginService loginService;
    
    @RequestMapping("/login")
    @ResponseBody
    public UserDto login(@RequestBody LoginRequestDto dto){
        UserDto u=(UserDto) loginService.login(dto);
        return u;   
 }
    
    
    
}
