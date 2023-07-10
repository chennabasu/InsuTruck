package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.genericLibrary.Base;
import com.pomRepository.InsuTruckPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsuTruck{
	Base base;
	InsuTruckPage insuTruckPage = null;
	public InsuTruck(Base base) {
	this.base=base;
	insuTruckPage = new InsuTruckPage(base.driver);
	
	}
	
	@Given("Browser is Open and {string} is entered")
	public void browser_is_open_and_is_entered(String string) {

	}

	@And("User clicks on truck link and provide all vehicle details and clicks on next button")
	public void user_clicks_on_truck_link_and_provide_all_vehicle_data_and_clicks_on_next_button() {
	  
	  
	  insuTruckPage.navigateToTruck().click();
	  insuTruckPage.entervehicledata().click();
	  
	}

	@And("User enter insurant data and clicks on next botton")
	public void user_enter_insurant_data_and_clicks_on_next_botton() throws InterruptedException {
					
		Select select = new Select(insuTruckPage.getMake());
		select.selectByVisibleText("BMW");
		
		insuTruckPage.getEngineperformance().sendKeys("20");
				
		insuTruckPage.getDateofmanufacture().sendKeys(insuTruckPage.getDate());
				
		insuTruckPage.getMake().click();
						
		insuTruckPage.Payload().sendKeys("300");
						
		insuTruckPage.totalWeight().sendKeys("1000");
						
		insuTruckPage.listPrice().sendKeys("20000");
						
		insuTruckPage.licenseNumber().sendKeys("12345");
						
		insuTruckPage.annualMilage().sendKeys("8000");
								
		insuTruckPage.numberOfSeats().click();
		
		Select select2 = new Select(base.driver.findElement(By.id("numberofseats")));
		select2.selectByVisibleText("5");
			
		insuTruckPage.fuelType().click();
		Select select3 = new Select(base.driver.findElement(By.id("fuel")));
		select3.selectByVisibleText("Gas");
				
		insuTruckPage.idealStep1().click();
		
		insuTruckPage.nextInsurant().click();
		
	   
	}

	@And("user enter all product data and clicks on next button")
	public void user_enter_all_product_data_and_clicks_on_next_button() throws InterruptedException {
		
		insuTruckPage.firstNameID().sendKeys("Simon");
	   	    
	    insuTruckPage.lastNameID().sendKeys("Harbor");
	    	    
	    insuTruckPage.radioID1().click();
	    	    
	    insuTruckPage.streetAddressID().sendKeys("23, West Street");
	   	    
	    insuTruckPage.cityID().sendKeys("NY");
	    	    
	    insuTruckPage.idealCheckBoxOtherID().click();
	   	    
	    insuTruckPage.webSiteID().sendKeys("www.vehicleNew.com");
	   	    
	    insuTruckPage.countryID().click();
	    
	    Select select4 = new Select(base.driver.findElement(By.xpath("//select[@id='country']")));
	    select4.selectByVisibleText("Australia");
	    	    
	    insuTruckPage.occupationID().click();
	    Select select5 = new Select (base.driver.findElement(By.xpath("//select[@id='occupation']")));
	    select5.selectByVisibleText("Farmer");
	    	   
	    insuTruckPage.zipcodeID().sendKeys("12901");
	    	    
	    insuTruckPage.birthDateID().sendKeys("12/31/1974");
	    Thread.sleep(1000);
	    	    
	    insuTruckPage.nextProdDataID().click();
	    Thread.sleep(1000);
	    	  
	}

	@And("user select choise of price option and clicks on view quote button")
	public void user_select_choise_of_price_option_and_clicks_on_view_quote_button() throws InterruptedException {
		insuTruckPage.startDatePD().sendKeys("08/07/2023");
		
		insuTruckPage.insuranceSumPD().click();
		Select select5 = new Select(base.driver.findElement(By.xpath("//select[@id='insurancesum']")));
		select5.selectByVisibleText("3.000.000,00");
		insuTruckPage.clickOutPD1().click();
		
		//insuTruckPage.meritRatingPD().click();
		//Select select6 = new Select(base.driver.findElement(By.xpath("//select[@id='meritrating']")));
		//select6.selectByVisibleText("Super Bonus");
		
		insuTruckPage.damageInsurancePD().click();
		Select select7 = new Select(base.driver.findElement(By.xpath("//select[@id='damageinsurance']")));
		select7.selectByVisibleText("Full Coverage");
		
		insuTruckPage.checkEuroProtectionPD().click();
		
//		insuTruckPage.courtesyCarPD().click();
//		Select select8 = new Select(base.driver.findElement(By.xpath("(//span[@class='ideal-check'])[6]")));
//		select8.selectByVisibleText("Yes");
//		Thread.sleep(2000);
		
		insuTruckPage.nextbtnPriceOptionPD().click();
		Thread.sleep(1000);
		
		insuTruckPage.selectGoldPO().click();
		Thread.sleep(1000);
		
		insuTruckPage.nextbtnToSendQuotePO().click();
		Thread.sleep(1000);
	}

	@When("user enters mailing valid data and clicks on next button")
	public void user_enters_mailing_valid_data_and_clicks_on_next_button() {
	    
	    insuTruckPage.emailQP().sendKeys("chennabasu@gmail.com");
	    
	    insuTruckPage.phoneNumberQP().sendKeys("9986383619");
	    
	    insuTruckPage.userNameQP().sendKeys("Chenna");
	    
	    insuTruckPage.passwordQP().sendKeys("Harihara@1914");
	    
	    insuTruckPage.confirmPasswordQP().sendKeys("Harihara@1914");
	    
	    insuTruckPage.commentTextQP().sendKeys("Please Send Quotation ASAP.");
	    
	    insuTruckPage.sendEmailQP().click();
	}

	@Then("user is promted with sending email success message")
	public void user_is_promted_with_sending_email_success_message() {
	   
	}

	@And("user clicks on ok button of successfull message board")
	public void user_clicks_on_ok_button_of_successfull_message_board() {
	   
	   insuTruckPage.sendinEmailSuccss().click();
	}

	@And("user clicks on home button at footer page to land on home page")
	public void user_clicks_on_home_button_at_footer_page_to_land_on_home_page() {
		insuTruckPage.homebtnFooterPage().click();
	    
	}

}
