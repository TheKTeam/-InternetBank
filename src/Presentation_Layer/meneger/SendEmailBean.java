package PresentationLayer.meneger;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SendEmailBean {

	private int namberOfAccounts;
	private String role;
	private ArrayList<ClientFromList> listUsers = new ArrayList<ClientFromList>();
	private String message;
	

	public void selectUsersList(){
		
		System.out.println("��������� �������");
		//��������
		listUsers.add(new ClientFromList(1, "���� �������", "������", 5,"test1@test"));
		listUsers.add(new ClientFromList(2, "����� ������", "������",4,"test2@test"));
		listUsers.add(new ClientFromList(3, "������ ��������", "������",3,"test3@test"));
		listUsers.add(new ClientFromList(4, "��������� �����c����", "�����������",2,"test4@test"));
		listUsers.add(new ClientFromList(5, "������ ��������", "�����������",1,"test5@test"));
		
		//������� ������� �� �������� � �������� ���������
		
	}

	public void sendEmails(){
		System.out.println("�������� ���������");
		
		namberOfAccounts = 10;
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
