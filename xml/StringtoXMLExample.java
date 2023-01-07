package com.connection.test;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
 
public class StringtoXMLExample 
{
  public static void main(String[] args) 
  {
    final String xmlStr = "<Groups>\r\n"
    		+ "<Group>\r\n"
    		+ "<GroupId>4</GroupId>\r\n"
    		+ "<Id>4</Id>\r\n"
    		+ "<LogicalName>hp.platform.viewer</LogicalName>\r\n"
    		+ "<Name>Viewer</Name>\r\n"
    		+ "<IsSystem>true</IsSystem>\r\n"
    		+ "</Group>\r\n"
    		+ "<Group>\r\n"
    		+ "<GroupId>5</GroupId>\r\n"
    		+ "<Id>1002</Id>\r\n"
    		+ "<LogicalName>user.4c2feee6-4964-405e-a07f-5700936fd855</LogicalName>\r\n"
    		+ "<Name>C2N_Admin</Name>\r\n"
    		+ "<IsSystem>false</IsSystem>\r\n"
    		+ "</Group>\r\n"
    		+ "<Group>\r\n"
    		+ "<GroupId>12</GroupId>\r\n"
    		+ "<Id>1009</Id>\r\n"
    		+ "<LogicalName>user.8e387a9f-caea-437f-905b-98c8329e78f6</LogicalName>\r\n"
    		+ "<Name>C2N_VAL_Lead</Name>\r\n"
    		+ "<IsSystem>false</IsSystem>\r\n"
    		+ "</Group>\r\n"
    		+ "</Groups>";
     
    //Use method to convert XML string content to XML Document object
    Document doc = convertStringToXMLDocument( xmlStr );
     
    //Verify XML document is build correctly
    String mainNode = doc.getFirstChild().getNodeName();
    NodeList group = doc.getElementsByTagName("Group");
    
    for(int i =0; i < group.getLength(); i++)
    {
    	Node node = group.item(i);
    	//System.out.println("Current Element:"+node.getNodeName());
    	if (node.getNodeType()==Node.ELEMENT_NODE)
    	{
    		Element element = (Element) node;
    		 System.out.println("First Name : " 
                     + element
                     .getElementsByTagName("Name")
                     .item(0)
                     .getTextContent());
    	}
    }
    
    System.out.println(doc.getFirstChild().getNodeName()); //Groups
    if(doc.getFirstChild().hasChildNodes())
	{
    	System.out.println("Has Child nodes proceeding");
    	System.out.println(doc.getElementsByTagName("Name"));//
    	
	}
   // System.out.println(doc.getNextSibling().getNodeName());
    
  }
 
  private static Document convertStringToXMLDocument(String xmlString) 
  {
    //Parser that produces DOM object trees from XML content
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
     
    //API to obtain DOM Document instance
    DocumentBuilder builder = null;
    try
    {
      //Create DocumentBuilder with default configuration
      builder = factory.newDocumentBuilder();
       
      //Parse the content to Document object
      Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
      return doc;
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
    return null;
  }
}
