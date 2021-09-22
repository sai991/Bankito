package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
	private int customer_id;
	private String customer_name;
	private String customer_email;
	private String customer_password;
	private long customer_contact;
	//customer_address(improvising)
	private float customer_balance;
}
