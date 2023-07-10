package com.pomRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.template.SimpleDate;

public class InsuTruckPage {
	
public InsuTruckPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "(//a[@id='nav_truck'])[1]")
private WebElement navigateToTruck;

public WebElement navigateToTruck() {
	return navigateToTruck;
}

@FindBy(id = "entervehicledata")
private WebElement entervehicledata;

public WebElement entervehicledata() {
	return entervehicledata;
}

@FindBy(xpath = "//select[@id='make']")
private WebElement make;

public WebElement getMake() {
	return make;
}
@FindBy(xpath ="//input[@id='engineperformance']")
private WebElement engineperformance;

public WebElement getEngineperformance() {
	return engineperformance;
}
@FindBy(xpath="//input[@id='dateofmanufacture']") 
private WebElement dateofmanufacture;

public WebElement getDateofmanufacture() {
	return dateofmanufacture;
}

private Date date;
public String  getDate() {
	String pattern = "MM/dd/yyyy";
	DateFormat df = new SimpleDateFormat(pattern);
	Date today = new Date("06/28/2023") ;   
	String todayAsString = df.format(today);
	
	return todayAsString;
}

@FindBy(xpath="//input[@name='Payload']") 
private WebElement payload;

public WebElement Payload() {
	return payload;

}

@FindBy(xpath="//input[@id='totalweight']")
private WebElement totalWeight;

public WebElement totalWeight() {
	return totalWeight;
}

@FindBy(xpath = "//input[@id='listprice']")
private WebElement listPrice;

public WebElement listPrice() {
	return listPrice;
}

@FindBy(xpath = "//input[@id='licenseplatenumber']")
private WebElement licenseNubmber;

public WebElement licenseNumber() {
	return licenseNubmber;
}

@FindBy(xpath = "//input[@id='annualmileage']")
private WebElement annualMilage;

public WebElement annualMilage() {
	return annualMilage;
}

@FindBy(xpath = "//select[@id='numberofseats']")
private WebElement numberOfSeats;

public WebElement numberOfSeats() {
	return numberOfSeats;
}

@FindBy(xpath = "//select[@name='Fuel Type']")
private WebElement fuelType;

public WebElement fuelType() {
	return fuelType;

}

@FindBy(xpath = "//section[@class='idealsteps-step']")
private WebElement idealStep1;

public WebElement idealStep1() {
	return idealStep1;

}
		//@ID="Insurant Data Page"

@FindBy(xpath = "//button[@id='nextenterinsurantdata']")
private WebElement nextInsurant;

public WebElement nextInsurant() {
	return nextInsurant;

}

@FindBy(xpath = "//input[@id='firstname']")
private WebElement firstNameID;

public WebElement firstNameID() {
	return firstNameID;

}

@FindBy(xpath = "//input[@id='lastname']")
private WebElement lastNameID;

public WebElement lastNameID() {
	return lastNameID;

}

@FindBy(xpath = "(//span[@class='ideal-radio'])[1]")
private WebElement radioID1;

public WebElement radioID1() {
	return radioID1;

}

@FindBy(xpath = "//input[@id='streetaddress']")
private WebElement streetAddressID;

public WebElement streetAddressID() {
	return streetAddressID;

}

@FindBy(xpath = "//input[@id='city']")
private WebElement cityID;

public WebElement cityID() {
	return cityID;

}

@FindBy(xpath = "(//span[@class='ideal-check'])[5]")
private WebElement idealCheckBoxOtherID;

public WebElement idealCheckBoxOtherID() {
	return idealCheckBoxOtherID;

}

@FindBy(xpath = "//input[@id='website']")
private WebElement webSiteID;

public WebElement webSiteID() {
	return webSiteID;

}

@FindBy(xpath = "//select[@id='country']")
private WebElement countryID;

public WebElement countryID() {
	return countryID;

}

@FindBy(xpath = "//select[@id='occupation']")
private WebElement occupationID;

public WebElement occupationID() {
	return occupationID;

}

@FindBy(xpath = "//input[@id='zipcode']")
private WebElement zipcodeID;

public WebElement zipcodeID() {
	return zipcodeID;

}

@FindBy(xpath = "//input[@id='birthdate']")
private WebElement birthDateID;

public WebElement birthDateID() {
	return birthDateID;

}

@FindBy(xpath = "//button[@id='nextenterproductdata']")
private WebElement nextProdDataID;

public WebElement nextProdDataID() {
	return nextProdDataID;

}
@FindBy(xpath ="//input[@id='startdate']")
private WebElement startDatePD;

public WebElement startDatePD() {
	return startDatePD;

}
@FindBy(xpath ="//select[@id='insurancesum']")
private WebElement insuranceSumPD;

public WebElement insuranceSumPD() {
	return insuranceSumPD;

}
@FindBy(xpath ="(//section[@class='idealsteps-step'])[3]")
private WebElement clickOutPD1;

public WebElement clickOutPD1() {
	return clickOutPD1;

}

@FindBy(xpath ="//select[@id='meritrating']")
private WebElement meritRatingPD;

public WebElement meritRatingPD() {
	return meritRatingPD;

}
@FindBy(xpath ="//select[@id='damageinsurance']")
private WebElement damageInsurancePD;

public WebElement damageInsurancePD() {
	return damageInsurancePD;

}
@FindBy(xpath ="(//span[@class='ideal-check'])[6]")
private WebElement checkEuroProtectionPD;

public WebElement checkEuroProtectionPD() {
	return checkEuroProtectionPD;

}
@FindBy(xpath ="(//select[@id='courtesycar']")
private WebElement courtesyCarPD;

public WebElement courtesyCarPD() {
	return courtesyCarPD;

}
@FindBy(xpath = "((//div[@class='field buttons'])[3]//button)[2]")
private WebElement nextbtnPriceOptionPD;

public WebElement nextbtnPriceOptionPD() {
	return nextbtnPriceOptionPD;

}
@FindBy(xpath = "(//span[@class='ideal-radio'])[3]")
private WebElement selectGoldPO;

public WebElement selectGoldPO() {
	return selectGoldPO;

}
@FindBy(xpath = "(//div[@class='field buttons margin-top-20']//button)[2]")
private WebElement nextbtnToSendQuotePO;

public WebElement nextbtnToSendQuotePO() {
	return nextbtnToSendQuotePO;

}
@FindBy(xpath = "//input[@id='email']")
private WebElement emailQP;

public WebElement emailQP() {
	return emailQP;

}
@FindBy(xpath = "//input[@id='phone']")
private WebElement phoneNumberQP;

public WebElement phoneNumberQP() {
	return phoneNumberQP;

}
@FindBy(xpath = "//input[@id='username']")
private WebElement userNameQP;

public WebElement userNameQP() {
	return userNameQP;

}
@FindBy(xpath = "//input[@id='password']")
private WebElement passwordQP;

public WebElement passwordQP() {
	return passwordQP;

}
@FindBy(xpath = "//input[@id='confirmpassword']")
private WebElement confirmPasswordQP;

public WebElement confirmPasswordQP() {
	return confirmPasswordQP;

}
@FindBy(xpath = "//textarea[@id='Comments']")
private WebElement commentTextQP;

public WebElement commentTextQP() {
	return commentTextQP;

}
@FindBy(xpath = "//button[@id='sendemail']")
private WebElement sendEmailQP;

public WebElement sendEmailQP() {
	return sendEmailQP;

}
@FindBy(xpath = "//div[@class='sa-confirm-button-container']//button")
private WebElement sendinEmailSuccss;

public WebElement sendinEmailSuccss() {
	return sendinEmailSuccss;

}
@FindBy(xpath = "//i[@class='fa fa-home']")
private WebElement homebtnFooterPage;

public WebElement homebtnFooterPage() {
	return homebtnFooterPage;

}

}












