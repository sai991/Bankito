package com.app.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@Entity
@Table
public class Transactions {
	private int customerId;
	@Id
	@GeneratedValue
	private int transactionId;
	private String transactionType;
	private Date transactionDate;
	private float transactionAmount;
	private String transactionStatus;

}
