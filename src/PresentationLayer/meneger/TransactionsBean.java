package PresentationLayer.meneger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="transactions")
@SessionScoped
public class TransactionsBean {

	public Long transaction_id;
	public Float money;
	public Float commission;
	public String type;
	public String date_of_creating;
	public Long account_id1;
	public Long account_id2;
	public Long user_id1;
	public Long user_id2;
	
	public TransactionsBean(Long transaction_id,Float money,Float commission,String type,String date_of_creating,Long account_id1,
			Long account_id2,Long user_id1,Long user_id2){
		this.transaction_id=transaction_id;
		this.money = money;
		this.commission = commission;
		this.type=type;
		this.date_of_creating = date_of_creating;
		this.account_id1 = account_id1;
		this.account_id2=account_id2;
		this.user_id1 = user_id1;
		this.user_id2 = user_id2;
	}
	
}