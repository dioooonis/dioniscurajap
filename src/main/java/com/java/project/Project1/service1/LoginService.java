
package com.java.project.Project1.service1;

import com.java.project.Project1.dto.LoginRequestDto;
import com.java.project.Project1.dto.UserDto;


public interface LoginService {
    
    public UserDto login(LoginRequestDto dto);
    
}
