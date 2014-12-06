package Integration_layer.Entitys;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.core.style.ToStringCreator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "messages")
public class Message extends DomainObject {
	@Column(name = "date_of_creating")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(pattern = "yyyy/MM/dd")	
	private DateTime dateOfCreating;
    @ManyToOne
    @JoinColumn(name = "resiver_id")
	private User resiver;
    @ManyToOne
    @JoinColumn(name = "sender_id")
	private User sender;
	@Column(name = "text")
	private String text;
	@Column(name = "topic")
	private String topic;
	
	public DateTime getDateOfCreating() {
		return dateOfCreating;
	}
	
	public void setDateOfCreating(DateTime dateOfCreating) {
		this.dateOfCreating = dateOfCreating;
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

	public User getResiver() {
		return resiver;
	}

	public void setResiver(User resiver) {
		this.resiver = resiver;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}	
	
    @Override
    public String toString() {
        return new ToStringCreator(this)
                .append("id", this.getId())
                .append("new", this.isNew())
                .append("resiver", this.resiver.getId())
                .append("sender", this.sender.getId())
                .append("dataOfCreating", this.dateOfCreating)
                .append("topic", this.topic)
                .append("text", this.text)
                .toString();
    }	
}