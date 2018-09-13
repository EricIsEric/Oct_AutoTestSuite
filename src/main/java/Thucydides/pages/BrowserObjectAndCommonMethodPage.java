package Thucydides.pages;

import org.openqa.selenium.By;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/


import net.thucydides.core.pages.PageObject;


public class BrowserObjectAndCommonMethodPage extends PageObject {

//	private static Logger logger = LoggerFactory.getLogger(BrowserObjectAndCommonMethodPage.class);

	public void openURL(String url) throws Exception {

		getDriver().get(url);
		getDriver().manage().window().maximize();
		Thread.sleep(5000);
	}

	public void deleteAllCookies() {
		getDriver().manage().deleteAllCookies();
		getDriver().close();
	}

	public void closeDriver() {
		getDriver().close();
	}

	public void ClickLoginBtn() throws Exception {
		find(By.xpath("//button[@data-aid='login-app-buttons-authenticate']")).click();
	}
	
	
	
}
