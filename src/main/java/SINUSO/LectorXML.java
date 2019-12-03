package SINUSO;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.events.Attribute;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import BiblioBidebarrieta.LectorFicheros;

public class LectorXML extends LectorFicheros{

	public Document doc;
	public NodeList nList;
	
	public LectorXML() {
		super();
	}
	
	public void parsearDocumento() {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(archivo);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargarNodeList() {
		doc.getDocumentElement().normalize();
		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
		nList = doc.getElementsByTagName(doc.getDocumentElement().getNodeName());
		System.out.println("Root element length: " + nList.getLength());
	}
	
	public void procesarNodeList(){
		// Guardo el nodo raiz
		Node root = nList.item(0);
        // Leo los atributos del nodo principal
        System.out.println("Number of attributes of root: " + root.getAttributes().getLength());
        /*si getLength es 0 es que no hay atributos y getNodeName y getNodeValue son null*/
        //System.out.println("Node name: " + root.getAttributes().item(0).getNodeName());
        //System.out.println("Node value: " + root.getAttributes().item(0).getNodeValue());
        procesarNode(root);
	}
	
	public void procesarNode(Node inputNode) {
		// Recorrer nodos hijo del inputNode
		for(int i=0;i<inputNode.getChildNodes().getLength();i++) {
			// Guardo en node cada nodo que voy leyendo
			Node node = inputNode.getChildNodes().item(i);
			// Si el nodo es de tipo elemento...
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element = (Element) node;
				// Imprimir nombre del nodo
				System.out.print("\nNODO: " + element.getNodeName());
				
				// Si el nodo tiene atributos...
				if(element.hasAttributes()) {
					
					//System.out.print(" ATTR: " + element.getAttributes();		
				}
				
				// Si el nodo tiene hijos...
				if(node.hasChildNodes()) {
					System.out.print(" CONTENT: " + node.getTextContent().trim());
					procesarNode(node);
				}		
			}
			
			//System.out.println("NodeName: " + node.getNodeName() + " NodeValue: " + node.getTextContent());
		}
	}
	
}
