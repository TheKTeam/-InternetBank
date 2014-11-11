package Integration_layer;

import java.sql.Date;
import javax.persistence.*;

@Entity
//@EntityListeners({AuditingEntityListener.class})
public class Message extends DomainObject {
	@Column
	private Date dataOfCreating;
	@Column
	private long resiver;
	@Column
	private long sender;
	@Column
	private String text;
	@Column
	private String topic;
	
	public Date getDataOfCreating() {
		return dataOfCreating;
	}
	
	public void setDataOfCreating(Date dataOfCreating) {
		this.dataOfCreating = dataOfCreating;
	}
	
	public long getResiver() {
		return resiver;
	}
	
	public void setResiver(long resiver) {
		this.resiver = resiver;
	}
	
	public long getSender() {
		return sender;
	}
	
	public void setSender(long sender) {
		this.sender = sender;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}