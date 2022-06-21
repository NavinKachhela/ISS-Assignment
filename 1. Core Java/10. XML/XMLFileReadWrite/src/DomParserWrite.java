import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DomParserWrite {
	
	public static void main(String args[]) {
		//an instance of factory that gives a document builder  
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
		Element e = null;
		try {
			
			//an instance of builder to parse the specified xml file 
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document dom = builder.newDocument();
			
			// root element
			Element rootEle = dom.createElement("class");
			
			// firstName element
			e = dom.createElement("firstName");
			e.appendChild(dom.createTextNode("Ajay"));
			rootEle.appendChild(e);
			
			// lastName element
			e = dom.createElement("lastName");
			e.appendChild(dom.createTextNode("Kachhela"));
			rootEle.appendChild(e);
			
			// subject element
			e = dom.createElement("subject");
			e.appendChild(dom.createTextNode("Maths"));
			rootEle.appendChild(e);
			
			// marks element
			e = dom.createElement("marks");
			e.appendChild(dom.createTextNode("85"));
			rootEle.appendChild(e);
			
			dom.appendChild(rootEle);
			
			try {
	            Transformer tr = TransformerFactory.newInstance().newTransformer();
	            tr.setOutputProperty(OutputKeys.INDENT, "yes");
	            tr.setOutputProperty(OutputKeys.METHOD, "xml");
	            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

	            // send DOM to file
	            tr.transform(new DOMSource(dom), 
	                                 new StreamResult(new FileOutputStream("S tudentWrite.xml")));

	        } catch (TransformerException te) {
	            System.out.println(te.getMessage());
	        } catch (IOException ioe) {
	            System.out.println(ioe.getMessage());
	        }
		} catch (ParserConfigurationException pc) {
			// TODO Auto-generated catch block
			pc.printStackTrace();
		}
		
	}
}
