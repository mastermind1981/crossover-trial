package com.trial.crossover.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by: dambros
 * Date: 12/2/2015
 */
@Entity
@Table(name = "sales_orders")
public class SalesOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sales_order_id")
	private Long id;

	@Column(name = "sales_order_number", nullable = false)
	private long orderNumber;

	@Column(name = "sales_order_total_price", nullable = false)
	private float totalPrice;

	@OneToMany(fetch = FetchType.LAZY)
	private List<Product> products;

	@ManyToOne
	@JoinColumn(name = "sales_order_customer_id", nullable = false)
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}