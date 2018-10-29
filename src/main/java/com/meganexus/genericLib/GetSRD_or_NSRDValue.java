package com.meganexus.genericLib;

import java.net.URL;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.IOException;
import org.xml.sax.SAXException;

import java.io.FileNotFoundException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;

import org.junit.Test;

public class GetSRD_or_NSRDValue {

	@SuppressWarnings("unused")
	public static String getUIValue_from_SRD20(String DomainName, String Code) {
		if (DomainName == " "){
			if (Code == "Y")
				return "Yes";
			else if (Code == "N")
				return "No";
			else if (Code == "U")
				return "Undefined";
		}
		
		URL url = Test.class.getClassLoader().getResource("srdc20.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		factory.setIgnoringElementContentWhitespace(true);

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File file = new File(url.getPath());
			Document doc = builder.parse(file);

			XPathFactory xFactory = XPathFactory.newInstance();
			XPath xPath = xFactory.newXPath();
			XPathExpression exp = xPath.compile("//DomainName[text()='" + DomainName
					+ "']/following-sibling::DomainItems//Code[text()='" + Code + "']/following-sibling::Description");

			NodeList nl = (NodeList) exp.evaluate(doc.getFirstChild(), XPathConstants.NODESET);
			for (int index = 0; index < nl.getLength(); index++) {

				Node node = nl.item(index);
				System.out.println(node.getTextContent());
				return node.getTextContent();

			} // End of For

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return null;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@SuppressWarnings("unused")
	public static String getUIValue_from_NSRD20(String DomainName, String Code) {
		if (DomainName == " "){
			if (Code == "Y")
				return "Yes";
			else if (Code == "N")
				return "No";
			else if (Code == "U")
				return "Undefined";
		}
		
		URL url = Test.class.getClassLoader().getResource("nsrdc20.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		factory.setIgnoringElementContentWhitespace(true);

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File file = new File(url.getPath());
			Document doc = builder.parse(file);
			XPathFactory xFactory = XPathFactory.newInstance();
			XPath xPath = xFactory.newXPath();
			XPathExpression exp = xPath.compile("//DomainName[text()='" + DomainName
					+ "']/following-sibling::ComplexReferenceDataList//Code[text()='" + Code
					+ "']/following-sibling::Description");

			NodeList nl = (NodeList) exp.evaluate(doc.getFirstChild(), XPathConstants.NODESET);
			for (int index = 0; index < nl.getLength(); index++) {

				Node node = nl.item(index);
				System.out.println(node.getTextContent());
				return node.getTextContent();

			} // End of For

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return null;
	}

	// if you want to check what value you are getting from srd and nsrd
	/*
	 * public static void main (String[] args){
	 * getUIValue_from_SRD20("GENDER","M"); //getUIValue_from_NSRD20(
	 * "COURT REPORT TYPE", "BIR"); }
	 */// end of method
}
