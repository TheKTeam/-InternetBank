package PresentationLayer.meneger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="currencies")
@SessionScoped
public class CurrenciesBean {
	
	public Long currencies_id;
	public String name;
	public Float value;
	
	public CurrenciesBean(Long currencies_id,String name, Float value){
		this.currencies_id=currencies_id;
		this.name = name;
		this.value = value;
	}
	
}