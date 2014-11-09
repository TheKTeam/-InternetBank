package Integration_layer;

import java.sql.Date;
import javax.persistence.Entity;

@Entity
public class Message {
	private Date dataOfCreating;
	private long resiver;
	private long sender;
	private String text;
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