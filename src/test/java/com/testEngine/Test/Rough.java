package com.testEngine.Test;
import org.testng.annotations.Test;
import com.testEngine.utilities.ReadXML;

public class Rough {

	/**
	 * @param args
	 */
	@Test
	public void readVal()throws Exception{
		ReadXML read = new ReadXML(System.getProperty("user.dir")+"\\src\\test\\java\\com\\testEngine\\utilities\\objectRepo.xml");
	System.out.println(read.xmlRead("//GiftCards/SendGiftCard"));
	
	}

	
}
