package Integration_layer;

import java.sql.Date;

import javax.persistence.*;

@Entity
//@EntityListeners({AuditingEntityListener.class})
public class Account extends DomainObject {
	@Basic
	@Column
	private long client;
	@Basic
	@Column
	private Date dataCreate;
	@Basic
	@Column
	private float money;
	@Basic
	@Column	
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
