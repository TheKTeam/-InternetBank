package PresentationLayer.meneger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="accounts")
@SessionScoped
public class AccountsBean {
	
	public Float money;
	public String type;
	public String date_of_creating;
	public Long account_id;
	public Long user_id;
	
	public AccountsBean(Float money,String type,String date_of_creating,Long account_id,Long user_id){
		this.money = money;
		this.type=type;
		this.date_of_creating = date_of_creating;
		this.account_id = account_id;
		this.user_id = user_id;
	}
	
}