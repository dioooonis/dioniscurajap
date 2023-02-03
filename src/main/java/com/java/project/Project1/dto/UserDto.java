package com.java.project.Project1.dto;

import com.java.project.Project1.model.Customer;
import lombok.Data;

@Data
public class UserDto {
  private Long id;
  private String firstname;
  private String lastname;
  private String username;
  private boolean logged;

    public UserDto() {
    }

    public UserDto(Long id, String firstname, String lastname, String username, boolean logged) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.logged = logged;
    }
}
