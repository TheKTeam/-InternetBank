package Integration_layer;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class DomainObject {
	@Id
	private long id;

	public long getId() {
	return id;
	}

	public void setId(long id) {
	this.id = id;
	}
}