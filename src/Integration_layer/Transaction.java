package Integration_layer;

import java.sql.Date;
import javax.persistence.Entity;

@Entity
public class Transaction {
	private long account;
	private float commission;
	private Date date;
	private float money;
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