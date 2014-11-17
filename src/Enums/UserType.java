package Enums;

public enum UserType {
	MANEGER("maneger"),
	CONSULTANT("consultant"),
	CLIENT("client");
	
	private final String value;
	
	UserType(String v) { value = v; }
	
	public String value() { return value; }
	
	public static UserType fromValue(String v) {
		for (UserType c: UserType.values()) {
			if (c.value.equals(v)) {return c;}
		}
		throw new
		IllegalArgumentException(v.toString());
	}	
}
