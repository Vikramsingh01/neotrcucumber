package com.meganexus.genericLib;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import junit.framework.Test;

public class ReadXMLData {
//if you want to check what value you are getting from Inbound XML
	/*public static void main(String[] args) {
		
		String data=ReadXMLData.getXMLData("inboundXML/Ao.xml", "//Alias", "./FirstName");
		String data1=ReadXMLData.getXMLData("outboundXML/Alias.xml", "//Contact", "./Provider");
		System.out.println(data);
	}
*/
	
	public static String getXMLData(String XMLName, String parentNode, String childNode) {
		InputStream url = Test.class.getClassLoader().getResourceAsStream(XMLName);
		String fieldValue = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(true);
			dbf.setIgnoringElementContentWhitespace(true);
			
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.parse(url);
			XPath xp = XPathFactory.newInstance().newXPath();
			NodeList nl = (NodeList) xp.compile(parentNode).evaluate(d, XPathConstants.NODESET);
			for (int i = 0; i < nl.getLength(); i++) {
				fieldValue = xp.compile(childNode).evaluate(nl.item(i));
				if (fieldValue.trim().length() != 0) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return fieldValue;
	}

}
