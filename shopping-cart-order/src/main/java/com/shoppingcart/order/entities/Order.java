package com.shoppingcart.order.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Order Information.
 * 
 * @author Chetan
 *
 */
public class Order {
	
	/**
	 * Order id. Primary key.
	 */
	private Long id;
	
	/**
	 * Order Number.
	 */
	private String orderNumber;
	
	/**
	 * Order date.
	 */
	private Date orderDate;
	
	/**
	 * Order state.
	 */
	private String orderState;
	
	/**
	 * Order Total.
	 */
	private BigDecimal orderSubTotal;
	
	/**
	 * Tax amount.
	 */
	private BigDecimal taxAmount;
	
	/**
	 * Order Total.
	 */
	private BigDecimal orderTotal;
	
	/**
	 * Set of order items.
	 */
	private Set<OrderItem> orderItems;
	
	/**
	 * Shipping address.
	 */
	private Address shippingAddress;
	
	/**
	 * Billing address.
	 */
	private Address billingAddress;
	
	/**
	 * Customer Id.
	 */
	private String customerId;

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
	 * Getter method for orderNumber
	 *
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Setter method for orderNumber
	 *
	 * @param orderNumber 
	 *			the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Getter method for orderSubTotal
	 *
	 * @return the orderSubTotal
	 */
	public BigDecimal getOrderSubTotal() {
		return orderSubTotal;
	}

	/**
	 * Setter method for orderSubTotal
	 *
	 * @param orderSubTotal 
	 *			the orderSubTotal to set
	 */
	public void setOrderSubTotal(BigDecimal orderSubTotal) {
		this.orderSubTotal = orderSubTotal;
	}

	/**
	 * Getter method for taxAmount
	 *
	 * @return the taxAmount
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * Setter method for taxAmount
	 *
	 * @param taxAmount 
	 *			the taxAmount to set
	 */
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * Getter method for orderTotal
	 *
	 * @return the orderTotal
	 */
	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	/**
	 * Setter method for orderTotal
	 *
	 * @param orderTotal 
	 *			the orderTotal to set
	 */
	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	/**
	 * Getter method for orderItems
	 *
	 * @return the orderItems
	 */
	public Set<OrderItem> getOrderItems() {
		if (orderItems == null) {
			/*
			 * Linked Hashset to maintain the order in which items are added to order.
			 */
			orderItems = new LinkedHashSet<>();
		}
		return orderItems;
	}

	/**
	 * Setter method for orderItems
	 *
	 * @param orderItems 
	 *			the orderItems to set
	 */
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * Getter method for orderDate
	 *
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * Setter method for orderDate
	 *
	 * @param orderDate 
	 *			the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * Getter method for orderState
	 *
	 * @return the orderState
	 */
	public String getOrderState() {
		return orderState;
	}

	/**
	 * Setter method for orderState
	 *
	 * @param orderState 
	 *			the orderState to set
	 */
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	/**
	 * Getter method for shippingAddress
	 *
	 * @return the shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * Setter method for shippingAddress
	 *
	 * @param shippingAddress 
	 *			the shippingAddress to set
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * Getter method for billingAddress
	 *
	 * @return the billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * Setter method for billingAddress
	 *
	 * @param billingAddress 
	 *			the billingAddress to set
	 */
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * Getter method for customerId
	 *
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Setter method for customerId
	 *
	 * @param customerId 
	 *			the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
