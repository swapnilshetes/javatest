package com.indecomm.scripts.el;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indecomm.api.AppiumDriverContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class LoginTestAndroid {
	AppiumDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver=AppiumDriverContext.getDriver("Android");
		System.out.println("First Test Android +++++"+driver);
		Thread.sleep(4000);
		//WebElement continueButton=driver.findElementByXPath("//android.view.View[@content-desc=\"CONTINUE\"]");
		//WebElement continueButton=(WebElement) driver.findElementsByAccessibilityId("CONTINUE");
		
		//MobileElement continueButton = (MobileElement) driver.findElementByAccessibilityId("CONTINUE");
		//WebElement continueButton=driver.findElementByXPath("//*[@text='CONTINUE']");
		
		//WebDriverWait wait = new WebDriverWait(driver,3);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
		
		//WebElement btn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"CONTINUE\"]"));
		
		//continueButton.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated((MobileBy.xpath("//android.view.View[@content-desc=\"CONTINUE\"]"))));
        continueButton.click();
        Thread.sleep(4000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		//WebElement continueButton=driver.findElementByXPath("//android.view.View[@text =\"CONTINUE\"]");
		//continueButton.click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		WebElement username=driver.findElementByXPath("//*[@class='android.widget.EditText'][1]");
		username.sendKeys("electrolux.test2018@gmail.com");
		WebElement password=driver.findElementByXPath("//*[@class='android.widget.EditText'][2]");
		password.sendKeys("Indecomm@123");
		WebElement login=driver.findElementByXPath("//android.view.View[@content-desc=\"LOG IN\"]");
		login.click();
		
		 //WebDriverWait wait = new WebDriverWait(driver,1);
		 //WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated((MobileBy.xpath("//android.view.View[@text='LOG IN']"))));
		 //login.click();
	        
		 Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	   // throw new PendingException();
	}
}
