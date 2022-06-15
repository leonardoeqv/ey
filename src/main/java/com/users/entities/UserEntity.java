package com.users.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
@Table(name = "tbl_users")
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = -321199134768970668L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_user", updatable = false, nullable = false)
	private int id;
	
	@Column(name = "tx_name")
	private String name;
        
	@Column(name = "tx_email")
	private String email;
	
	@Column(name = "tx_password")
	private String password;
	
	@Basic
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "fe_created", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private java.sql.Timestamp created;
	
	@Basic
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "fe_update", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private java.sql.Timestamp update;
        
        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "co_user_fk")
        private List<PhoneEntity> phone;
        
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.sql.Timestamp getCreated() {
		return created;
	}

	public java.sql.Timestamp getUpdate() {
		return update;
	}

	public List<PhoneEntity> getPhone() {
		return phone;
	}

	public void setPhone(List<PhoneEntity> phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
                
	}
	
}
