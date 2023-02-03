
package com.java.project.Project1.service1;

import com.java.project.Project1.dto.AddToCartDto;
import com.java.project.Project1.dto.CartDto;
import com.java.project.Project1.dto.CustomerIdDto;
import com.java.project.Project1.dto.RemoveFromCartDto;
import com.java.project.Project1.model.Cart;
import org.springframework.stereotype.Service;
@Service
public interface CartService {
    void addToCart(AddToCartDto addToCartDto);
    CartDto displayCart(CustomerIdDto customerIdDto);
    CartDto removeFromCart(RemoveFromCartDto removeFromCartDto);
    void goToCheckout(CustomerIdDto customerIdDto);
    
    Cart findById(Long Id) ;
}
