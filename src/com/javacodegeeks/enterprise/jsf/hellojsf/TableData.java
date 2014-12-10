package com.javacodegeeks.enterprise.jsf.hellojsf;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import java.util.Random;
import java.lang.*;

import com.javacodegeeks.enterprise.jsf.hellojsf.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

//import org.apache.tomcat.jni.User;

// or import javax.enterprise.context.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean
// or @Named
@SessionScoped
public class TableData implements Serializable {
	Long min = 1000000L;
	Long max = 9999999L;
	String bufForSecsesfulCreation;
	Integer CountOfAccountUser = 0;
	String fio = "";
	String nameTd = "";
	String accDestinetion = "";
	String money = "";
	String selectedAcc = "";
	String otziv="";
	FacesContext context = FacesContext.getCurrentInstance();
	ValueBinding binding = context.getApplication().createValueBinding(
			"#{user.name}");
	String ownerFromForm = (String) binding.getValue(context);

	ValueBinding binding2 = context.getApplication().createValueBinding(
			"#{user.password}");
	String password = (String) binding.getValue(context);
	private ArrayList<AccountBean> acc = new ArrayList<AccountBean>(
			Arrays.asList(new AccountBean("Кредитный", (float) 1000, "01-01-2001",
					1934567L, "Активный", "lol"), new AccountBean(
					"Накопительный", (float) 5000, "02-02-2002", 1354567L, "Активный",
					"lol"), new AccountBean("Сберегательный", (float) 0, "03-03-2004",
					1534567L, "На обработке", "lol"), new AccountBean(
					"Кредитный", (float) 7000, "04-04-2005", 9234567L, "Активный",
					"user1")));

	private ArrayList<Client> cl = new ArrayList<Client>(Arrays.asList(
			new Client("Антон", "Чехов", "Павлович", "lol", "123"), new Client(
					"Александ", "Пушкин", "Сергеевич", "user1", "123")));

	private ArrayList<Client> listDestClient = new ArrayList<Client>();
	
	

	public ArrayList<Client> getListDestClient() {
		return listDestClient;
	}

	public void setListDestClient(ArrayList<Client> listDestClient) {
		this.listDestClient = listDestClient;
	}

	public ArrayList<Client> getCl() {
		return cl;
	}

	public void setCl(ArrayList<Client> cl) {
		this.cl = cl;
	}

	public String getOtziv() {
		return otziv;
	}

	public void setOtziv(String otziv) {
		this.otziv = otziv;
	}
	
	public String getAccDestinetion() {
		return accDestinetion;
	}

	public void setAccDestinetion(String accDestinetion) {
		this.accDestinetion = accDestinetion;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getSelectedAcc() {
		return selectedAcc;
	}

	public void setSelectedAcc(String selectedAcc) {
		this.selectedAcc = selectedAcc;
	}

	public void setCountOfAccountUser(Integer countOfAccountUser) {
		CountOfAccountUser = countOfAccountUser;
	}

	public Long blockAcc;

	public Long getBlockAcc() {
		return blockAcc;
	}

	public void setBlockAcc(Long blockAcc) {
		this.blockAcc = blockAcc;
	}

	public String typeOfAccountFromForm;

	public String getTypeOfAccountFromForm() {
		return typeOfAccountFromForm;
	}

	public void setTypeOfAccountFromForm(String typeOfAccountFromForm) {
		this.typeOfAccountFromForm = typeOfAccountFromForm;
	}

	// String lol = "lol";

	public String getCurrentUser() {
		for (int i = 0; i < cl.size(); i++) {
			if ((ownerFromForm.equals(cl.get(i).accName))
					& (password.equals(cl.get(i).pass))) {
				fio = cl.get(i).getSecondName() + " " + cl.get(i).getFirsName()
						+ " " + cl.get(i).getOtchestvo();
			} else {
				fio = "";
			}
		}
		return fio;
	}

	public void setCurrentUser(String newValue) {
		nameTd = newValue;
	}

	public ArrayList<AccountBean> getShowAll(ArrayList<AccountBean> old) {
		ArrayList<AccountBean> acc2 = new ArrayList<AccountBean>();
		acc2 = old;
		return acc2;
	}

	public ArrayList<AccountBean> getAccs() {
		ArrayList<AccountBean> acc2 = new ArrayList<AccountBean>();
		for (int i = 0; i < acc.size(); i++) {
			AccountBean auction = acc.get(i);
			if (ownerFromForm.equals(auction.getOwner())) {
				acc2.add(auction);
			}
		}
		return getShowAll(acc2);

	}

	public Integer getCountOfAccountUser() {
		ArrayList<AccountBean> acc2 = new ArrayList<AccountBean>();
		acc2 = acc;
		Integer i2 = 0;
		for (int i = 0; i < acc2.size(); i++) {
			AccountBean auction = acc2.get(i);
			if (ownerFromForm.equals(auction.getOwner())) {
				i2++;
			}
		}
		return i2;

	}

	public ArrayList<AccountBean> getdeleteRow() {
		int a = 0;
		if (blockAcc != null) {
			ArrayList<AccountBean> acc2 = new ArrayList<AccountBean>();
			for (int i = 0; i < acc.size(); i++) {
				AccountBean auction = acc.get(i);
				if (ownerFromForm.equals(auction.getOwner())
						& (a == auction.getNumberOfAccount()
								.compareTo(blockAcc))) {
					acc.remove(i);
					// return "Dell";//acc2.add(auction);
				} else {
					// return "NotDel";
				}
			}
		}
		// return "123";
		return getShowAll(acc);
	}

	public String getMessageAbCreatin() {
		return bufForSecsesfulCreation;
	}

	public String getaddNewAccount() {
		Random random = new Random();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		ArrayList<AccountBean> acc2 = new ArrayList<AccountBean>();
		AccountBean newEl = new AccountBean(typeOfAccountFromForm, (float) 0,
				reportDate, min + (long) (random.nextDouble() * (max - min)),
				"Активный", ownerFromForm);
		// newEl.dateOfCreation=reportDate;
		// newEl.money=0;
		// newEl.numberOfAccount=min + (long)(random.nextDouble()*(max - min));
		// newEl.status="На обработке";
		// newEl.typeOfAccount=typeOfAccountFromForm;
		// newEl.owner=ownerFromForm;
		Boolean rezult = acc.add(newEl);

		if (rezult = true) {
			setCountOfAccountUser(CountOfAccountUser+1);
			bufForSecsesfulCreation = "Счет успешно добавлен!";
			return getMessageAbCreatin();
		} else {
			bufForSecsesfulCreation = " Счет не добавлен. Возможно вы исчерпали лимит счетов. Обратитесь к администрации.";
			return getMessageAbCreatin();
		}
	}

	public String getsendMoney() {
		ArrayList<AccountBean> acc2 = new ArrayList<AccountBean>();
		acc2 = acc;
		String answ = "";
		for (int i = 0; i < acc2.size(); i++) {
			if (selectedAcc.equals(Long.toString(acc2.get(i)
					.getNumberOfAccount()))
					& (ownerFromForm.equals(acc2.get(i).getOwner()))) {
				for (int i2 = 0; i2 < acc2.size(); i2++) {
					if (accDestinetion.equals(Long.toString(acc2.get(i2)
							.getNumberOfAccount()))) {
						if ((Integer.parseInt(money)) <= (acc2.get(i)
								.getMoney()) & (acc2.get(i).getMoney() > 0)) {
							acc2.get(i).setMoney(
									acc2.get(i).getMoney()
											- Integer.parseInt(money));
							acc2.get(i2).setMoney(
									acc2.get(i2).getMoney()
											+ Integer.parseInt(money));
							return answ = "Платеж проведен успешно!";
						} else {
							return answ = "У вас недостаточно денег на счету";
						}
					} else {
						answ = "Счет назначения не существует";
					}

				}
			} else {
				answ = "Выбраный исходный счет не существует";
			}

		}
		getShowAll(acc);
		return answ;
	}

	public void showDistination() {
		AccountBean destAcc = null;
		for (AccountBean accountBean : acc) {
			
			if (accountBean.getNumberOfAccount().longValue() == Long
					.valueOf(accDestinetion).longValue()) {
				destAcc = accountBean;
				break;
			}
		}
		//System.out.println(destAcc.getDateOfCreation());
		Client destClient = null;
		if (destAcc != null) {
			for (Client client : cl) {
				if (client.getAccName().equals(destAcc.getOwner())) {
					destClient = client;
				}
			}
			//System.out.println("==================ok================");
			listDestClient.clear();
			listDestClient.add(destClient);

		} else {
			// not found
		}
	}
	
	public void clearAllFilds(){
//		FacesMessage fm = new FacesMessage();
//		
//		fm.setSeverity(FacesMessage.SEVERITY_INFO);
//		fm.setSummary("ERROR MESSAGE");
//		fm.setDetail("ERROR MESSAGE");
//		FacesContext.getCurrentInstance().addMessage("formID:tableID", fm);
//		
		//context.addMessage(null, fm);
		setAccDestinetion("");
		setMoney("");
		setSelectedAcc("");
		listDestClient.clear();
	}
	
	public void clearSendDeal(){
		setOtziv("");
		//otziv("");
		
	}

}