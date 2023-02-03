package com.java.project.Project1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;



@Data
@Entity

public class Cart implements Serializable{
 
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private LocalDate date;
    @Column
    private String state;

    public Cart() {
    }

    public Cart(Long id, LocalDate date, String state) {
        this.id = id;
        this.date = date;
        this.state = state;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

   
    public String getState() {
        return state;
    }

   
    public void setState(String state) {
        this.state = state;
    }
    
}
