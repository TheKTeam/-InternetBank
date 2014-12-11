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


@ManagedBean
@SessionScoped
public class SuggestBean {
	
	private ArrayList<Message> listMessage = new ArrayList<Message>();

	public ArrayList<Message> getListMessage() {
		listMessage.clear();
		this.openFileXML("e:/message.xml", listMessage);
		return listMessage;
	}

	public void setListMessage(ArrayList<Message> listMessage) {
		this.listMessage = listMessage;
	}
	
	private void openFileXML(String path, ArrayList<Message> listSt) {

		File xmlFile = new File(path);
		SAXBuilder builder = new SAXBuilder();

		Document document;
		try {
			document = builder.build(xmlFile);
			Element root = document.getRootElement();
			List nodes = root.getChildren("Message");
			String author = "";
			String date = "";
			String text = "";

			for (int i = 0; i < nodes.size(); i++) {

				Element el = (Element) nodes.get(i);

				author = el.getChildText("Author");
				date = el.getChildText("DateTime");
				text = el.getChildText("Text");

				listSt.add(new Message(author, text, date));
			}
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
