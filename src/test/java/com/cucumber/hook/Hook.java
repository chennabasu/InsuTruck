package com.cucumber.hook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.genericLibrary.Base;
import com.genericLibrary.PropertyFileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends Base{
	
	Base base;
	
	public Hook(Base base) {
		this.base=base;
	}
	
	@Before
	public void setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		PropertyFileReader propertyFileReader = new PropertyFileReader();
		base.driver=new ChromeDriver();
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//base.driver.get(base.PropertyFileReader.readpropertyFileReader("url"));
		System.out.println("inside hook ************************" +base.driver);
		//base.driver.get("http://sampleapp.tricentis.com/101/");
		base.driver.get(propertyFileReader.readPropertyFile("url"));
	}
	
//	@After
//	public void tearDown() {
//		base.driver.close();
//		
//	}

}
