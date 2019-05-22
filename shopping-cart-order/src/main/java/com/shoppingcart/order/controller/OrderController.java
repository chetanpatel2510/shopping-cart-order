package com.shoppingcart.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.order.util.OrderLogger;

/**
 * This method will expose the rest end points for order.
 * 
 * @author Chetan
 *
 */
@RestController
@CrossOrigin
public class OrderController {
	
	/**
	 * logger declaration.
	 */
	@Autowired
	private OrderLogger logger;
	
	@PostMapping("/addToCart")
	public void addToCart() {
		logger.info(this, "Adding product to cart.");
	}
	
	@PostMapping("/checkout")
	public void checkout() {
		
	}
	
	@PostMapping("/addShippingAddress")
	public void addShippingAddress() {
		
	}
	
	@PostMapping("/placeOrder")
	public void placeOrder() {
		
	}
}
