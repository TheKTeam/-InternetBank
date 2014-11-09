package Integration_layer;

public enum AccountType {
	CREDIT	("credit"),
	SAVINGS	("saving"),
	DEPOSIT	("deposit");
	
	private final String value;
	
	AccountType(String v) { value = v; }
	
	public String value() { return value; }
	
	public static AccountType fromValue(String v) {
		for (AccountType c: AccountType.values()) {
			if (c.value.equals(v)) {return c;}
		}
		throw new
		IllegalArgumentException(v.toString());
	}
}