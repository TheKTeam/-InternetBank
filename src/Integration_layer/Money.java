package Integration_layer;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@EntityListeners({AuditingEntityListener.class})
public class Money extends DomainObject {
	@Column
	private String name;
	@Column
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