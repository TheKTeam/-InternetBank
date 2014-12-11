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
		listUsers.add(new ClientFromList(1, "Ваня Дурачек", "Клиент", 5,""));
		listUsers.add(new ClientFromList(2, "Васиа Кавказ", "Клиент",4,""));
		listUsers.add(new ClientFromList(3, "Светка Соколова", "Клиент",3,""));
		listUsers.add(new ClientFromList(4, "Просковья Афанаcьева", "Консультант",2,""));
		listUsers.add(new ClientFromList(5, "Федька Заводила", "Консультант",1,""));
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
