package com.shoppingcart.order.entities;

import java.math.BigDecimal;

/**
 * This class will hold information for each order item.
 * 
 * @author Chetan
 *
 */
public class OrderItem {

	/**
	 * Primary key.
	 */
	private Long id;
	
	/**
	 * Product code of item.
	 */
	private String productCode;
	
	/**
	 * Product Name.
	 */
	private String name;

	/**
	 * Base price of product.
	 */
	private BigDecimal basePrice;
	
	/**
	 * Selling price of product.
	 */
	private BigDecimal sellPrice;
	
	/**
	 * Discount if any.
	 */
	private BigDecimal discount;
	
	/**
	 * Quantity of item.
	 */
	private int quantity;

	/**
	 * Coupon code if any.
	 */
	private String couponCode;

	/**
	 * Getter method for id
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter method for id
	 *
	 * @param id 
	 *			the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter method for productCode
	 *
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * Setter method for productCode
	 *
	 * @param productCode 
	 *			the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * Getter method for name
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name
	 *
	 * @param name 
	 *			the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for basePrice
	 *
	 * @return the basePrice
	 */
	public BigDecimal getBasePrice() {
		return basePrice;
	}

	/**
	 * Setter method for basePrice
	 *
	 * @param basePrice 
	 *			the basePrice to set
	 */
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * Getter method for sellPrice
	 *
	 * @return the sellPrice
	 */
	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	/**
	 * Setter method for sellPrice
	 *
	 * @param sellPrice 
	 *			the sellPrice to set
	 */
	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * Getter method for quantity
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Setter method for quantity
	 *
	 * @param quantity 
	 *			the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Getter method for couponCode
	 *
	 * @return the couponCode
	 */
	public String getCouponCode() {
		return couponCode;
	}

	/**
	 * Setter method for couponCode
	 *
	 * @param couponCode 
	 *			the couponCode to set
	 */
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * Getter method for discount
	 *
	 * @return the discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}

	/**
	 * Setter method for discount
	 *
	 * @param discount 
	 *			the discount to set
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
}
