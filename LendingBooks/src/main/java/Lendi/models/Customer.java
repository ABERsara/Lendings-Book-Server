package Lendi.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {
  public Customer() {
	  
  }
  @Id
  @Column(length = 9)
  private String id; // Primary key with maximum length of 9 characters


@Column 
private String fName;
 

@Column
private String lName;

@Column
private String phone;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

}
