package com.java.project.Project1.controller;


import com.jap.ecommerce.Project.dto.AddToCartDto;
import com.jap.ecommerce.Project.dto.CartDto;
import com.java.project.Project1.service1.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@Slf4j

public class CartController {
     @Autowired
    private CartService cartService;
      @GetMapping("/add")  
      @ResponseBody
     public AddToCartDto addToCart(@RequestBody AddToCartDto dto){
          CartDto cartdto = new CartDto(); 
         return cartdto.getIdCustomer();
     }
}
