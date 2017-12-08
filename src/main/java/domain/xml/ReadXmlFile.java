package domain.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import domain.db.DestinationRepo;
import domain.model.Destination;

public class ReadXmlFile {
	
	public static void readXml(DestinationRepo repo) {
		try {
			File file = new File("src/main/java/domain/xml/destinations.xml");
			
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);
			
			NodeList nList = doc.getElementsByTagName("destination");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					
					String name = eElement.getElementsByTagName("name").item(0).getTextContent();
					String province = eElement.getElementsByTagName("province").item(0).getTextContent();
					String coordinates = eElement.getElementsByTagName("coordinates").item(0).getTextContent();
					String postalcode = eElement.getElementsByTagName("postalcode").item(0).getTextContent();
					String flag = eElement.getElementsByTagName("flag").item(0).getTextContent();
					String description = eElement.getElementsByTagName("description").item(0).getTextContent();
					
					Destination d = new Destination(name, province, coordinates, postalcode, flag, description);
					
					repo.addDestination(d);
				}
			}
		} catch (Exception e) {
			
		}
	}
}
