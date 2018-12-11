package com.testEngine.Test;
import org.testng.annotations.Test;

import com.testEngine.testBase.testBase;

public class GiftCard extends testBase{

	@Test
	public void navigateGiftCard()throws Exception{
		openBrowser("Chrome");
		giftCard();
		
	}
	}

