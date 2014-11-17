package Integration_layer.Entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.core.style.ToStringCreator;

@Entity
@Table(name = "currencies")
public class Currencies extends DomainObject {
    @NotEmpty
    @Column(name = "name")
	private String name;
    @NotEmpty
    @Column(name = "value")
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
	
    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.getId())
                .append("new", this.isNew())
                .append("name", this.name)
                .append("value", this.value)
                .toString();
    }	
}