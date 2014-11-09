package Integration_layer;

import java.sql.Date;
import javax.persistence.Entity;

@Entity
public class Account {
	private long client;
	private Date dataCreate;
	private float money;
	private AccountType type;
	
	public long getClient() {
		return client;
	}
	
	public void setClient(long client) {
		this.client = client;
	}
	
	public Date getDataCreate() {
		return dataCreate;
	}
	
	public void setDataCreate(Date dataCreate) {
		this.dataCreate = dataCreate;
	}
	
	public float getMoney() {
		return money;
	}
	
	public void setMoney(float money) {
		this.money = money;
	}
	
	public AccountType getType() {
		return type;
	}
	
	public void setType(AccountType type) {
		this.type = type;
	}	
}
