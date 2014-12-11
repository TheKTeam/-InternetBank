package Service_layer;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import Integration_layer.ConstructorsForXML;
import PresentationLayer.meneger.Message;

public class AddAndGetSuggest {

	
	
	public static void addSuggest(String name, String date, String text){
		
		try {
			ConstructorsForXML.writeParamXML(name, date, text);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void getSuggest(ArrayList<Message> listSt){
		
		ConstructorsForXML.openFileXML(listSt);
		
	}
	
}
