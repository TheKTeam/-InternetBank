package PresentationLayer.meneger;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UsersBean {

	private ArrayList<ClientFromList> listUsers = new ArrayList<ClientFromList>();
	private long blockUser;

	public UsersBean() {
		listUsers.add(new ClientFromList(1, "���� �������", "������", 5,""));
		listUsers.add(new ClientFromList(2, "����� ������", "������",4,""));
		listUsers.add(new ClientFromList(3, "������ ��������", "������",3,""));
		listUsers.add(new ClientFromList(4, "��������� �����c����", "�����������",2,""));
		listUsers.add(new ClientFromList(5, "������ ��������", "�����������",1,""));
	}

	public long getBlockUser() {
		return blockUser;
	}

	public void setBlockUser(long blockUser) {
		this.blockUser = blockUser;
	}

	public ArrayList<ClientFromList> getListUsers() {

		return listUsers;
	}

	public void setListUsers(ArrayList<ClientFromList> listUsers) {
		this.listUsers = listUsers;
	}

	public void deleteUser() {

		for (ClientFromList clientFromList : listUsers) {
			if (clientFromList.getId() == blockUser) {
				listUsers.remove(clientFromList);
				break;
			}
		}
	}

}
