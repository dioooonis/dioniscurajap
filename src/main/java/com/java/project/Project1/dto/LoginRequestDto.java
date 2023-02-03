
package com.java.project.Project1.dto;

import com.java.project.Project1.model.Customer;
import lombok.Data;

@Data
public class LoginRequestDto {
    private String username;
    private String password;

    public LoginRequestDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginRequestDto(Customer customer) {
        this.setUsername(customer.getUsername());
        this.setPassword(customer.getPassword());
    }
    
    
}
