package PresentationLayer.meneger;

import integration_layer.SenderTls;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import service_layer.MailSender;

@ManagedBean
public class SendEmailBean {

	private int namberOfAccounts;
	private String role;
	private ArrayList<ClientFromList> listUsers = new ArrayList<ClientFromList>();
	private String message;
	private String subjectMess;

	public String getSubjectMess() {
		return subjectMess;
	}

	public void setSubjectMess(String subjectMess) {
		this.subjectMess = subjectMess;
	}

	public void selectUsersList(){
		
		System.out.println("выполняем выборку");
		//временно
		/*listUsers.add(new ClientFromList(1, "Ваня Дурачек", "Клиент", 5,"test1@test"));
		listUsers.add(new ClientFromList(2, "Васиа Кавказ", "Клиент",4,"test2@test"));*/
		listUsers.add(new ClientFromList(3, "Светка Соколова", "Клиент",3,"maxkomar65@gmail.com"));
		listUsers.add(new ClientFromList(4, "Просковья Афанаcьева", "Консультант",2,"maxkomar65@gmail.com"));
		listUsers.add(new ClientFromList(5, "Федька Заводила", "Консультант",1,"maxkomar65@gmail.com"));
		

		
		//вызвать функцию из сервисов и передать параметры
		
	}

	public void sendEmails(){
		
		selectUsersList();
		

		//MailSender.send(subjectMess, message, "maxkomar65@gmail.com");
		for (ClientFromList clientFromList : listUsers) {
			MailSender.send(subjectMess, message, clientFromList.getEmail());
		}
		System.out.println("отправка сообщений");
		//namberOfAccounts = 10;
	}
	
	public int getNamberOfAccounts() {
		return namberOfAccounts;
	}
	public void setNamberOfAccounts(int namberOfAccounts) {
		this.namberOfAccounts = namberOfAccounts;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<ClientFromList> getListUsers() {
		return listUsers;
	}
	public void setListUsers(ArrayList<ClientFromList> listUsers) {
		this.listUsers = listUsers;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
