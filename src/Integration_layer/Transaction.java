package Integration_layer;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Transaction extends DomainObject {
	@Column	
	private long account;
	@Column
	private float commission;
	@Column
	private Date date;
	@Column
	private float money;
	@Column
	private TransactionsType type;
	
	public long getAccount() {
		return account;
	}
	
	public void setAccount(long account) {
		this.account = account;
	}
	
	public float getCommission() {
		return commission;
	}
	
	public void setCommission(float commission) {
		this.commission = commission;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
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
}