import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserRead {
	public static void main(String args[]) {
		
		//an instance of factory that gives a document builder 
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
		
		try {
			
			//an instance of builder to parse the specified xml file  
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			
			Document docObject= builder.parse("student.xml");
			NodeList studentList = docObject.getElementsByTagName("student");
			for(int i=0; i<studentList.getLength(); i++) {
				Node studentNode = studentList.item(i);
				
				if(studentNode.getNodeType() == Node.ELEMENT_NODE);
					Element student = (Element)studentNode;
					String studentId = student.getAttribute("id");
					NodeList studentDetails = student.getChildNodes();
					
					for(int j=0; j<studentDetails.getLength(); j++) {
						Node studentChildNode = studentDetails.item(j);
						
						if(studentChildNode.getNodeType() == Node.ELEMENT_NODE) {
							Element studenChildtElement = (Element)studentChildNode;
							System.out.println("Student " + studentId + ":" + studenChildtElement.getTagName() + "=" + studenChildtElement.getTextContent() + "\n");
						}
					}
					
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
