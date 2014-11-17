package Integration_layer.Entitys;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;
import org.springframework.format.annotation.DateTimeFormat;

import Enums.AccountType;

@Entity
@Table(name = "accounts")
public class Account extends DomainObject {
    @ManyToOne
    @JoinColumn(name = "user_id")
	private User user;    
    @Column(name = "data_of_creating")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private DateTime dataOfCreating;
    @NotEmpty
    @Column(name = "money")	
    private float money;
	@NotEmpty
    @Column(name = "type")
	private AccountType type;
    @OneToMany(mappedBy = "user1")
    private Set<Transaction> transactions1;
    @OneToMany(mappedBy = "user2")
    private Set<Transaction> transactions2;    
	
	public Account(){
		this.dataOfCreating = new DateTime();
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
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

	public DateTime getDataOfCreating() {
		return dataOfCreating;
	}

	public void setDataOfCreating(DateTime dataOfCreating) {
		this.dataOfCreating = dataOfCreating;
	}	
	
    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.getId())
                .append("new", this.isNew())
                .append("money", this.money)
                .append("data_of_creating", dataOfCreating)
                .append("type", this.type)
                .append("city", this.user.getId())
                .toString();
    }

    protected void setTransactionsInternal1(Set<Transaction> transactions) {
        this.transactions1 = transactions;
    }

    protected Set<Transaction> getTransactionsInternal1() {
        if (this.transactions1 == null) {
            this.transactions1 = new HashSet<Transaction>();
        }
        return this.transactions1;
    }    
    
	public List<Transaction> getTransactions1() {
        List<Transaction> sortedTransactions = new ArrayList<Transaction>(getTransactionsInternal1());
        PropertyComparator.sort(sortedTransactions, new MutableSortDefinition("data", true, true));
        return Collections.unmodifiableList(sortedTransactions);
	}

	public void setTransactions1(Set<Transaction> transactions1) {
		this.transactions1 = transactions1;
	}
	
    public void addTransaction1(Transaction transaction) {
        getTransactionsInternal1().add(transaction);
        transaction.setAccount(this);
    }

    protected void setTransactionsInternal2(Set<Transaction> transactions) {
        this.transactions2 = transactions;
    }

    protected Set<Transaction> getTransactionsInternal2() {
        if (this.transactions2 == null) {
            this.transactions2 = new HashSet<Transaction>();
        }
        return this.transactions2;
    }    
    
	public List<Transaction> getTransactions2() {
        List<Transaction> sortedTransactions = new ArrayList<Transaction>(getTransactionsInternal2());
        PropertyComparator.sort(sortedTransactions, new MutableSortDefinition("data", true, true));
        return Collections.unmodifiableList(sortedTransactions);
	}

	public void setTransactions2(Set<Transaction> transactions2) {
		this.transactions2 = transactions2;
	}
	
    public void addTransaction2(Transaction transaction) {
        getTransactionsInternal2().add(transaction);
        transaction.setAccount(this);
    }
}