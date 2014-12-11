package PresentationLayer.meneger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Service_layer.AddAndGetSuggest;


@ManagedBean
@SessionScoped
public class SuggestBean {
	
	private ArrayList<Message> listMessage = new ArrayList<Message>();

	public ArrayList<Message> getListMessage() {
		listMessage.clear();
		AddAndGetSuggest.getSuggest(listMessage);
		return listMessage;
	}

	public void setListMessage(ArrayList<Message> listMessage) {
		this.listMessage = listMessage;
	}
	
}
