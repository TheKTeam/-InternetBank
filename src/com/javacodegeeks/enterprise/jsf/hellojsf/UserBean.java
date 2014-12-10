package com.javacodegeeks.enterprise.jsf.hellojsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean; 
   // or import javax.inject.Named;
import javax.faces.bean.SessionScoped; 
   
import javax.faces.context.FacesContext;

import com.sun.org.apache.bcel.internal.generic.RETURN;
// or import javax.enterprise.context.SessionScoped;

@ManagedBean(name="user") // or @Named("user")
@SessionScoped
public class UserBean implements Serializable {
   public String name;
   public String password;
   public String fio;
   public String message;
   public String messagebuff="";

public String getName() { return name; }   
   public void setName(String newValue) { name = newValue; }
   public String getMessage() { return message; }   
   public void setMessage(String newValue) { message = newValue; }
   public void setCurrentUser(String newValue){ name = newValue;}
   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }  
   
   public void leave() { name = ""; 
   FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
   }  
   
   public String getCurrentUser(){
	   if ((name.equals("lol"))&(password.equals("123"))){
		   fio="Антон Павлович Чехов";
	   }else {
		   fio="NoyName";
	   }
	   return fio;
   }

   public String getMessageOnChat(){
	if (message!=null){
		messagebuff=messagebuff+"\nВы:"+fio+" \nCообщение: "+message+"";
		return messagebuff;
	}
	return "";
   }
   public String getGreeting() { 
	   if (name!=null){
	      if (name.length() == 0) return "__";
	      else return "Welcome to JSF2 + Ajax, " + name + "!"; 
	   } 
	   return "";
	   }
   
}
