package com.testEngine.utilities;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class ReadXML {
 String filePath; 
 File file;
 String fileName;
 Document doc;
 public ReadXML(String fileName){
	this.fileName = fileName; 
 }

public String xmlRead(String element )throws Exception{
	//this.filePath = filePath;
	
//	File file = new File(System.getProperty("user.dir")+filePath);
	SAXReader saxReader = new SAXReader();	
	
	doc = saxReader.read(fileName);
	String xpathElement = doc.selectSingleNode(element).getText();

	return xpathElement;
	
	
	
}










}

