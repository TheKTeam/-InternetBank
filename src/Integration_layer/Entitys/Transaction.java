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
	@Column(name = "account_id1")	
	private Account account1;
	@Column(name = "account_id2")	
	private Account account2;	
	@Column(name = "commission")
	private float commission;
	@Column(name = "date_of_creating")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private DateTime date_of_creating;
	@Column(name = "money")
	private float money;
	@Column(name = "type")
	private TransactionsType type;
	
	public Transaction(){
		this.date_of_creating = new DateTime();
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
	
    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.getId())
                .append("new", this.isNew())
                .append("user1", this.user1.getId())
                .append("user2", this.user2.getId())
                .append("date", this.date_of_creating)
                .append("type", this.type)
                .append("commission", this.commission)
                .append("money", this.money)
                .append("account1", this.account1.getId())
                .append("account2", this.account2.getId())
                .toString();
    }

	public DateTime getDate_of_creating() {
		return date_of_creating;
	}

	public void setDate_of_creating(DateTime date_of_creating) {
		this.date_of_creating = date_of_creating;
	}	
}