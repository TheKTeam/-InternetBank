package Integration_layer;

public enum TransactionsType {
	OPEN			("credit"),
	CLOSE			("saving"),
	TRANSFER_MONEY	("transferMoney"), 
	MONEY_COME		("moneyCome"),
	MONEY_GONE		("moneyCome");
	
	private final String value;
	
	TransactionsType(String v) { value = v; }
	
	public String value() { return value; }
	
	public static TransactionsType fromValue(String v) {
		for (TransactionsType c: TransactionsType.values()) {
			if (c.value.equals(v)) {return c;}
		}
		throw new
		IllegalArgumentException(v.toString());
	}
}
