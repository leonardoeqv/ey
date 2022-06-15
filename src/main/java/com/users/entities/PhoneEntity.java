package com.users.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_phones")
public class PhoneEntity implements Serializable{
	
	private static final long serialVersionUID = -321199134768970668L;
	
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "co_phone", updatable = false, nullable = false)
	private int id;
	                
	@Column(name = "tx_number")
	private String number;
	
	@Column(name = "tx_city_code")
	private String citycode;
	
	@Column(name = "tx_contry_code")
	private String contrycode;
        
        @Column(name = "co_user_fk")
	private int co_user_fk;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getContrycode() {
		return contrycode;
	}
	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}

}
