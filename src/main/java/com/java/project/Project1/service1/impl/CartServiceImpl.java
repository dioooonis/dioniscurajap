
package com.java.project.Project1.service1.impl;
 
import com.java.project.Project1.dto.AddToCartDto;
import com.java.project.Project1.dto.CartDto;
import com.java.project.Project1.dto.CustomerIdDto;
import com.java.project.Project1.dto.RemoveFromCartDto;
import com.java.project.Project1.model.Cart;
import com.java.project.Project1.model.CartQty;
import com.java.project.Project1.repository.CartRepository;
import com.java.project.Project1.service1.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
@Service
public class CartServiceImpl implements CartService{
@Autowired
private CartRepository cartRepository;

    @Override
    public void addToCart(AddToCartDto addToCartDto) {
         CartQty cart = new CartQty(1l, 5);
        cartRepository.save(cart);
    }

    @Override
    public CartDto displayCart(CustomerIdDto customerIdDto) {
       
    }

    @Override
    public CartDto removeFromCart(RemoveFromCartDto removeFromCartDto) {
    
    }

    @Override
    public void goToCheckout(CustomerIdDto customerIdDto) {
    
    }

    @Override
    public Cart findById(Long Id) throws NotFoundException {
     
    }
  

    
}
