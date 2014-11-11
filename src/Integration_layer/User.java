package Integration_layer;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends DomainObject {
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String surname;
	@Column
	private UserType role;
	@Column
	private boolean sex;
	@Column
	private Date birthday;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public UserType getRole() {
		return role;
	}
	public void setRole(UserType role) {
		this.role = role;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
