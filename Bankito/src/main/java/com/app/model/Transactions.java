package com.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class Transactions {
	private int customer_id;
	@Id
	@GeneratedValue
	private int transaction_id;
	private String transaction_type;
	private Date transaction_date;
	private float transaction_amount;
	private String transaction_status;

}
