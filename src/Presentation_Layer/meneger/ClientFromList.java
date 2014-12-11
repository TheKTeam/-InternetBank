package PresentationLayer.meneger;

public class ClientFromList {
	
	private long id;
	private String name;
	private String role;
	private int numberOfAccount;
	private String email;
	
	
	public ClientFromList(long id, String name, String role, int numberOfAccount, String email) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.numberOfAccount = numberOfAccount;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumberOfAccount() {
		return numberOfAccount;
	}


	public void setNumberOfAccount(int numbersOfAccounts) {
		this.numberOfAccount = numbersOfAccounts;
	}


}
