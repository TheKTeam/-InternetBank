package Integration_layer;

import javax.persistence.Entity;

@Entity
public class Money {
	private String name;
	private float value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
}