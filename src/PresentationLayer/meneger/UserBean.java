package PresentationLayer.meneger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="users")
@SessionScoped
public class UserBean {

	public String email;
	public String firstname;	
	public String lastname;
	public String surname;
	public String password;
	public String role;
	public String birthday;
	public Boolean sex;
	public Long user_id;
	
	public UserBean(Long user_id,String email,String firstname,String lastname,String surname,String password,String role,String birthday,
			Boolean sex){
		this.user_id = user_id;
		this.email=email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.surname = surname;
		this.password = password;
		this.role=role;
		this.birthday = birthday;
		this.sex = sex;
	}	
	
}