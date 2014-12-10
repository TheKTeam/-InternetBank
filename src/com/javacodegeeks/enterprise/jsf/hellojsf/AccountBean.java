package com.javacodegeeks.enterprise.jsf.hellojsf;
import java.io.Serializable;
import java.util.Date;

import javafx.scene.chart.PieChart.Data;

import javax.faces.bean.ManagedBean; 
   // or import javax.inject.Named;
import javax.faces.bean.SessionScoped; 
   


import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.javacodegeeks.enterprise.jsf.hellojsf.UserBean;
// or import javax.enterprise.context.SessionScoped;

@ManagedBean(name="account") // or @Named("user")
@SessionScoped
public class AccountBean implements Serializable {
	public String typeOfAccount;
	public Float money;
	public String dateOfCreation;
	public Long numberOfAccount;
	public String status;
	public String owner;

	public AccountBean(String typeOfAccount,Float money, String dateOfCreation,Long numberOfAccount, String status,String owner){
		this.typeOfAccount=typeOfAccount;
		this.money = money;
		this.dateOfCreation = dateOfCreation;
		this.numberOfAccount = numberOfAccount;
		this.status = status;
		this.owner = owner;
	}
public String getTypeOfAccount() {
	return typeOfAccount;
}
public void setTypeOfAccount(String typeOfAccount) {
	this.typeOfAccount = typeOfAccount;
}
public Float getMoney() {
	return money;
}
public void setMoney(Float money) {
	this.money = money;
}
public String getDateOfCreation() {
	return dateOfCreation;
}
public void setDateOfCreation(String dateOfCreation) {
	this.dateOfCreation = dateOfCreation;
}
public Long getNumberOfAccount() {
	return numberOfAccount;
}
public void setNumberOfAccount(Long numberOfAccount) {
	this.numberOfAccount = numberOfAccount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
/*
 * long x = 1000000L;
long y = 9999999L;
Random r = new Random()
long number = x+((long)(r.nextDouble()*(y-x)));
 * */
}
