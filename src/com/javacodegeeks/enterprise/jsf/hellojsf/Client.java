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

@ManagedBean(name="client") // or @Named("user")
@SessionScoped
public class Client {
	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getOtchestvo() {
		return otchestvo;
	}

	public void setOtchestvo(String otchestvo) {
		this.otchestvo = otchestvo;
	}

	public String firsName;
	public String secondName;
	public String otchestvo;
	public String accName;
	public String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public Client(String firsName,String secondName,String otchestvo,String accName,String pass){
		this.firsName=firsName;
		this.secondName = secondName;
		this.otchestvo = otchestvo;
		this.accName= accName;
		this.pass = pass;

	}
}
