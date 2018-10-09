/**
 * 
 */
package com.indecomm.api;

/**
 * @author navjotkochar
 */

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;


public class AppiumDriverContext {
	//public static IOSDriverContext driverContext;
	public static AppiumDriver driver;  
	
	public static AppiumDriver getDriver(String device) throws IOException
	{
		if(device.equalsIgnoreCase("Android") )
		{
			if(driver == null)
			{
				
				DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
				
				desiredCapabilities.setCapability("platformName","Android");
				desiredCapabilities.setCapability("platformVersion", "6.0.1");
	            //desiredCapabilities.setCapability("appPackage","com.elux.electroluxlife");
	            //desiredCapabilities.setCapability("appActivity","com.elux.electroluxlife.MainActivity");
	            //desiredCapabilities.setCapability("udid","SH44LWM03798");
	            desiredCapabilities.setCapability("appWaitActivity","SplashActivity, SplashActivity,OtherActivity, *, *.SplashActivity");
	            desiredCapabilities.setCapability("deviceName", "shri papa");
	            desiredCapabilities.setCapability("noReset", true);
	           // desiredCapabilities.setCapability("automationName","uiautomator2");
	          //  desiredCapabilities.setCapability("resetKeyboard", true);
	           // desiredCapabilities.setCapability("unicodeKeyboard", true);
	        	desiredCapabilities.setCapability("app", "D:\\QATest\\Test.apk");
	        	//desiredCapabilities.setCapability("simpleIsVisibleCheck", environmentData.get("simpleIsVisibleCheck"));
	        	//desiredCapabilities.setCapability("preventWDAAttachments", environmentData.get("preventWDAAttachments"));
	            // Not able to search when we use below setting
	            //desiredCapabilities.setCapability("sendKeyStrategy", "setValue");
				driver= new AppiumDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);		
			
			
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
				
				//System.out.println("Driver created ===="+driver);
			}
		}
		else if (device.equalsIgnoreCase("iOS"))
			{
				DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			//	System.out.println("UDID ="+environmentData.get("udid"));
				
				desiredCapabilities.setCapability("platformName","iOS");
			    desiredCapabilities.setCapability("platformVersion", "12.0");
			    //desiredCapabilities.setCapability("xcodeOrgId", "SCW6PHDY3U");
			    //desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
			    //desiredCapabilities.setCapability("UDID", "c6fe10b15bc02bf2a3eb4561c7ef274bec48abe1");
		        
			    desiredCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.elux.electroluxlife");
		        
			    //desiredCapabilities.setCapability("deviceName", "c6fe10b15bc02bf2a3eb4561c7ef274bec48abe1");
		        //iPhone 12 Capabilities   
		        desiredCapabilities.setCapability("deviceName", "iPhone");
		        desiredCapabilities.setCapability("udid", "b3979ad44c700aeca5a184eb527e214e303cf795");
		       // desiredCapabilities.setCapability("deviceName", "c6fe10b15bc02bf2a3eb4561c7ef274bec48abe1");
		        desiredCapabilities.setCapability("automationName","XCUITest");

		        // desiredCapabilities.setCapability("app", "/Users/navjotkochar/Documents/AEG/Builds/Electrolux_Life.ipa");
	    	
		        desiredCapabilities.setCapability("appPackage","com.elux.electroluxlife");
	            desiredCapabilities.setCapability("appActivity","com.elux.electroluxlife.MainActivity");
		        
		        
		        //	desiredCapabilities.setCapability("resetKeyboard", true);
			//	desiredCapabilities.setCapability("unicodeKeyboard", true);
			//	desiredCapabilities.setCapability("newCommandTimeout", 300);
			//desiredCapabilities.setCapability("appPath", environmentData.get("appPath"));
				//desiredCapabilities.setCapability("xcodeOrgId", environmentData.get("xcodeOrgId"));
				//desiredCapabilities.setCapability("xcodeSigningId", environmentData.get("xcodeSigningId"));
				//desiredCapabilities.setCapability("newCommandTimeout", 300);
				//desiredCapabilities.setCapability("simpleIsVisibleCheck", environmentData.get("simpleIsVisibleCheck"));
				//desiredCapabilities.setCapability("preventWDAAttachments", environmentData.get("preventWDAAttachments"));
				// Not able to search when we use below setting
				//desiredCapabilities.setCapability("sendKeyStrategy", "setValue");
				driver= new IOSDriver(new URL("http://localhost:4222/wd/hub"), desiredCapabilities);	
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
		return driver;
		
	}
	
	public static void closeDriver()
	{
		if(null != driver)
		{
			//driver.resetApp();
		driver.closeApp();
		driver.launchApp();
		//driver = null;
		}
	}	

}