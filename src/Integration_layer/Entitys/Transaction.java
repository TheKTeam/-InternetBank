package Integration_layer.Entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.core.style.ToStringCreator;
import org.springframework.format.annotation.DateTimeFormat;

import Enums.TransactionsType;

@Entity
@Table(name = "transactions")
public class Transaction extends DomainObject {
    @ManyToOne
    @JoinColumn(name = "user_id1")
	private User user1;
    @ManyToOne
    @JoinColumn(name = "user_id2")
	private User user2; 
	@Column(name = "account")	
	private Account account;
	@Column(name = "commission")
	private float commission;
	@Column(name = "data")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private DateTime date;
	@Column(name = "money")
	private float money;
	@Column(name = "type")
	private TransactionsType type;
	
	public Transaction(){
		this.date = new DateTime();
	}
	
	public float getCommission() {
		return commission;
	}
	
	public void setCommission(float commission) {
		this.commission = commission;
	}
	
	public float getMoney() {
		return money;
	}
	
	public void setMoney(float money) {
		this.money = money;
	}
	
	public TransactionsType getType() {
		return type;
	}
	
	public void setType(TransactionsType type) {
		this.type = type;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}	
	
    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.getId())
                .append("new", this.isNew())
                .append("user1", this.user1.getId())
                .append("user2", this.user2.getId())
                .append("date", this.date)
                .append("type", this.type)
                .append("commission", this.commission)
                .append("money", this.money)
                .append("account", this.account.getId())
                .toString();
    }	
}