package PresentationLayer.meneger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="messeges")
@SessionScoped
public class MessageBean {
	
	public Long message_id;
	public String topic;
	public String text;
	public String dateOfCreation;	
	public Long sender_id;
	public Long resiver_id;	

	public MessageBean(Long message_id,Integer money, String topic,String text,String dateOfCreation,Long sender_id,Long resiver_id){
		this.message_id=message_id;
		this.topic = topic;
		this.text = text;
		this.dateOfCreation = dateOfCreation;
		this.sender_id = sender_id;
		this.resiver_id = resiver_id;
	}	
	
}