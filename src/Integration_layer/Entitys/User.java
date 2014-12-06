package Integration_layer.Entitys;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;*/

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
//import org.springframework.beans.support.MutableSortDefinition;
//import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;
import org.springframework.format.annotation.DateTimeFormat;

import Enums.UserType;

@Entity
@Table(name = "users")
public class User extends DomainObject {
	@NotEmpty
    @Column(name = "email")
	private String email;
    @Column(name = "firstname")
	private String firstname;
    @Column(name = "lastname")
	private String lastname;	
    @Column(name = "surname")
	private String surname;
	@NotEmpty
    @Column(name = "password")
	private String password;
	@NotEmpty
    @Column(name = "role")
	private UserType role;
	@NotEmpty
    @Column(name = "sex")
	private boolean sex;
    @Column(name = "birthday")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(pattern = "yyyy/MM/dd")    
	private DateTime birthday;
/*    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Account> accounts;
    @OneToMany(mappedBy = "sender")
    private Set<Message> messageSent;
    @OneToMany(mappedBy = "resiver")
    private Set<Message>  messegeReceiv; */   
	    
    public User(){ 
    	this.birthday = new DateTime();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	
    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.getId())
                .append("new", this.isNew())
                .append("sex", this.sex)
                .append("birthday", this.birthday)
                .append("email", this.email)
                .append("firstname", this.firstname)
                .append("lastname", this.lastname)
                .append("surname", this.surname)
                .append("password", this.password)
                .append("role", this.role)
                .toString();
    }	
/*    protected void setAccountsInternal(Set<Account> accounts) {
        this.accounts = accounts;
    }
    protected Set<Account> getAccountsInternal() {
        if (this.accounts == null) {
            this.accounts = new HashSet<Account>();
        }
        return this.accounts;
    }    
	public List<Account> getAccounts() {
        List<Account> sortedAccounts = new ArrayList<Account>(getAccountsInternal());
        PropertyComparator.sort(sortedAccounts, new MutableSortDefinition("dataOfCreating", true, true));
        return Collections.unmodifiableList(sortedAccounts);
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}	
    public void addAccount(Account account) {
        getAccountsInternal().add(account);
        account.setUser(this);
    }
    protected void setMessageSentInternal(Set<Message> messageSent) {
        this.messageSent = messageSent;
    }
    protected Set<Message> getMessageSentInternal() {
        if (this.messageSent == null) {
            this.messageSent = new HashSet<Message>();
        }
        return this.messageSent;
    }    
	public List<Message> getMessageSent() {
        List<Message> sortedMessageSent = new ArrayList<Message>(getMessageSentInternal());
        PropertyComparator.sort(sortedMessageSent, new MutableSortDefinition("dataOfCreating", true, true));
        return Collections.unmodifiableList(sortedMessageSent);
	}
	public void setMessageSent(Set<Message> messageSent) {
		this.messageSent = messageSent;
	}	
    public void addToMessageSent(Message message) {
        getMessageSentInternal().add(message);
        message.setSender(this);
    }
    protected void setMessegeReceivInternal(Set<Message> messegeReceiv) {
        this.messegeReceiv = messegeReceiv;
    }
    protected Set<Message> getMessegeReceivInternal() {
        if (this.messegeReceiv == null) {
            this.messegeReceiv = new HashSet<Message>();
        }
        return this.messageSent;
    }    
	public List<Message> getMessegeReceiv() {
        List<Message> sortedMessegeReceiv = new ArrayList<Message>(getMessegeReceivInternal());
        PropertyComparator.sort(sortedMessegeReceiv, new MutableSortDefinition("dataOfCreating", true, true));
        return Collections.unmodifiableList(sortedMessegeReceiv);
	}
	public void setMessegeReceiv(Set<Message> messegaReceiv) {
		this.messegeReceiv = messegaReceiv;
	}	
    public void addToMessegeReceiv(Message message) {
        getMessegeReceivInternal().add(message);
        message.setResiver(this);
    } */   
}