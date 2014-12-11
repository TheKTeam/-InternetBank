package Integration_layer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import org.xml.sax.SAXException;

import PresentationLayer.meneger.Message;

//import PresentationLayer.client.*;

public class ConstructorsForXML {

	private static final String path = "C://temp/kniga.xml";
	
	public static void writeParamXML(String n, String d, String t)
			throws TransformerException, IOException, SAXException,
			ParserConfigurationException {

		System.out.println("file opening");
		
		File xmlFile = new File(path);
		SAXBuilder builder = new SAXBuilder();

		Document document;
		try {
			document = (Document) builder.build(xmlFile);

			Element root = document.getRootElement();

			Element new_el = new Element("Message");

			new_el.addContent((new Element("Author")).setText(n));
			new_el.addContent((new Element("DateTime")).setText(d));
			new_el.addContent((new Element("Text")).setText(t));

			root.addContent(new_el);

			XMLOutputter out = new XMLOutputter();
			out.output(document, new OutputStreamWriter(new FileOutputStream(
					path), "utf-8"));

			System.out.println("file writing!");

		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void openFileXML(ArrayList<Message> listSt) {

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

				Element el = (Element)nodes.get(i);

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