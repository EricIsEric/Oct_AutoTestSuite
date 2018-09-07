package Thucydides.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class OctaneTestSuitePage extends PageObject {
	
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;

	public void DelCookies() {
		browserObjectAndCommonMethodPage.deleteAllCookies();
	}

	public void accessOctaneURL() throws Exception {
		browserObjectAndCommonMethodPage.openURL("http://myd-vm00464.hpeswlab.net:20942/ui/?p=1001/1002#/");
//		browserObjectAndCommonMethodPage.openURL(System.getProperty("JenkinsURL"));
	}

	public void EnterLoginInfo(String username, String password) {
		WebElement usernameInput = find(By.id("inputUsername"));
		  usernameInput.sendKeys(username);
		WebElement passwordInput = find(By.id("inputPassword"));
		  passwordInput.sendKeys(password);
		
	}

	public void ClickLoginBtn() throws Exception {
		browserObjectAndCommonMethodPage.ClickLoginBtn();
	}

	public void LoginAssertion() {
		find(By.tagName("body")).getText().contains("OCT");
	}

	public void ClickSettings() throws Exception {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement SetBtn = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/ng-include/div/div/div/div[2]/div[2]"));
		SetBtn.click();
		Thread.sleep(1500);
	}

	public void ClickSpaces() throws Exception {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement SpacesBtn = find(org.openqa.selenium.By.xpath("/html/body/div[6]/div/div[2]/a"));
		SpacesBtn.click();
	}
	
	
	public void ClickUsers() {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement USERS = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/span"));
		USERS.click();
	}
	
	
	int TotalUserBefore = 0;
	public void ClickDefaultIsolated_Page() throws Exception {
		Thread.sleep(20000);
		
		
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement DefaultIso = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[1]/div[2]/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[1]/div/div[1]/div/span"));
		DefaultIso.click();
		Thread.sleep(3000);
		DefaultIso.click();
		
		
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
		Thread.sleep(10000);
		System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
		TotalUserBefore = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
		System.out.println("TotalUserBefore is: " + TotalUserBefore );
	}

	public void ClickAddUser_Page() throws Exception {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement AddUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/div[1]/div[1]/div[1]/ng-switch/div/button/div/span"));
		AddUser.click();
	}
	
	
	//公共输入LoginName
	public void Pub_LoginName(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}
	
	//公共输入FirstName
	public void Pub_FirstName(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}
	
	//公共输入LastName
	public void Pub_LastName(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}
	
	//公共输入Email
	public void Pub_Email(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}
	
	//公共选择Language
	public void Pub_SelLanguage(String Path1, String Path2) throws Exception {
		WebElement LangListBox = find(org.openqa.selenium.By.xpath(Path1));
		LangListBox.click();
		Thread.sleep(1000);
		WebElement CurrLanguage = find(org.openqa.selenium.By.xpath(Path2));
		CurrLanguage.click();
		Thread.sleep(1000);
	}
	
	

	public void InputLoginName_Page(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void InputFirstName(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void InputLastName(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void InputeEmail(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}

	public void InputPhoneNum(String Phone) throws Exception {
		WebElement InputPhone = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[5]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputPhone.click();
		WebElement InputPhone_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[5]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputPhone_Same.sendKeys(Phone);
	}

	public void SelectLanguage() throws Exception {
		WebElement LangListBox = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/field-editor-value-viewer/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div"));
		LangListBox.click();
		Thread.sleep(1000);
		WebElement Chinese = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[1]/div/div[1]/div/span"));
		Chinese.click();
		Thread.sleep(1000);
	}

	public void InputPwd() throws Exception {
		WebElement PrePwd = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[7]/alm-presenter/label/div/password-field-editor/div/div[1]/div[1]/input"));
		PrePwd.click();
		PrePwd.sendKeys("Welcome1");
		Thread.sleep(1000);
		WebElement ConPwd = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[7]/alm-presenter/label/div/password-field-editor/div/div[3]/div[1]/input"));
		ConPwd.click();
		ConPwd.sendKeys("Welcome1");
		Thread.sleep(1000);
	}

	public void SelectRole1() throws Exception {
		WebElement RoleListBox = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[1]/div[1]/alm-presenter/label/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div"));
		RoleListBox.click();
		WebElement Role1Item = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[1]/div[1]/alm-presenter/label/div/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[6]/div/div[1]/div/span"));
		Role1Item.click();
	}

	public void CheckWorkspacesRole1() throws Exception {
		WebElement InWork = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[1]/div[4]/alm-presenter/label/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div"));
		if(!InWork.getText().contains("default_workspace")) {
			InWork.click();
			WebElement InWorkItem = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[1]/div[4]/alm-presenter/label/div/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li/div/div[1]"));
			InWorkItem.click();
			WebElement OkBtn = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[1]/div[4]/alm-presenter/label/div/smart-editor/div/div/div/div/div/div[2]/button[1]"));
			OkBtn.click();
		}
	}

	public void ClickAddRoleBtn() throws Exception {
		WebElement AddRoleBtn = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[2]/div"));
		AddRoleBtn.click();
		Thread.sleep(1000);
		
	}

	public void SelectRole2() throws Exception {
		WebElement RoleListBox = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[2]/div[1]/alm-presenter/label/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div"));
		RoleListBox.click();
		WebElement Role2Item = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[8]/alm-presenter/label/div/workspace-role-field-editor/div/div[2]/div[2]/div[1]/alm-presenter/label/div/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[3]/div/div[1]/div/span"));
		Role2Item.click();
		Thread.sleep(3000);
	}

	public void ClickAddAnoButn() throws Exception {
		WebElement AddBtn = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[3]/div[1]/div/button[3]/translate"));
		AddBtn.click();
		Thread.sleep(20000);
	}
	
	int TotalUserAc1=0;
	public void RefreshAc1() throws Exception {
		getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				TotalUserAc1 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				TotalUserAc1 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
			}
			
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				TotalUserAc1 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				TotalUserAc1 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
			}
			
		}
	}
	
	public void DisplayAC1Result() throws Exception {
		if(TotalUserAc1-TotalUserBefore==1) {
			System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println();
			System.out.print("┃"+" AccountAdded: "+"CHS1"+"  ┃");
			System.out.println();
			System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc1-TotalUserBefore==0) {
			System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
			System.out.println();
			System.out.print("┃"+" DataDuplicated: CHS1"+" ┃");
			System.out.println();
			System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc1-TotalUserBefore>1) {
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}
	}
	
	
	int TotalUserAc2=0;
	public void RefreshAc2() throws Exception {
		getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
				TotalUserAc2 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
				TotalUserAc2 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
			}
			
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
				TotalUserAc2 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc1 is: " + TotalUserAc1);
				TotalUserAc2 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
			}
			
		}
	}
	
	
	public void DisplayAC2Result() throws Exception {
		if(TotalUserAc2-TotalUserAc1==1) {
			System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println();
			System.out.print("┃"+" AccountAdded: "+"CHS2"+"  ┃");
			System.out.println();
			System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc2-TotalUserAc1==0) {
			System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
			System.out.println();
			System.out.print("┃"+" DataDuplicated: CHS2"+" ┃");
			System.out.println();
			System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc2-TotalUserAc1>1) {
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}
	}
	
	
	int TotalUserAc3=0;
	public void RefreshAc3() throws Exception {
		getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc3 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
				TotalUserAc3 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
			}
			
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc3 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc2 is: " + TotalUserAc2);
				TotalUserAc3 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
			}
			
		}
	}
	
	public void DisplayAC3Result() throws Exception {
		if(TotalUserAc3-TotalUserAc2==1) {
			System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"JPN"+"  ┃");
			System.out.println();
			System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc3-TotalUserAc2==0) {
			System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
			System.out.println();
			System.out.print("┃"+"  DataDuplicated: JPN"+" ┃");
			System.out.println();
			System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc3-TotalUserAc2>1) {
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}
	}
	
	
	
	int TotalUserAc4=0;
	public void RefreshAc4() throws Exception {
		getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc4 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
				TotalUserAc4 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
			}
			
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc4 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc3 is: " + TotalUserAc3);
				TotalUserAc4 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
			}
			
		}
	}
	
	public void DisplayAC4Result() throws Exception {
		if(TotalUserAc4-TotalUserAc3==1) {
			System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"FRA"+"  ┃");
			System.out.println();
			System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc4-TotalUserAc3==0) {
			System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
			System.out.println();
			System.out.print("┃"+"  DataDuplicated: FRA"+" ┃");
			System.out.println();
			System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc4-TotalUserAc3>1) {
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}
	}
	
	
	
	int TotalUserAc5=0;
	public void RefreshAc5() throws Exception {
		getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc5 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
				TotalUserAc5 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
			}
			
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc5 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc4 is: " + TotalUserAc4);
				TotalUserAc5 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
			}
			
		}
	}
	
	public void DisplayAC5Result() throws Exception {
		if(TotalUserAc5-TotalUserAc4==1) {
			System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"DEU"+"  ┃");
			System.out.println();
			System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc5-TotalUserAc4==0) {
			System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
			System.out.println();
			System.out.print("┃"+"  DataDuplicated: DEU"+" ┃");
			System.out.println();
			System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc5-TotalUserAc4>1) {
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}
	}
	
	
	
	int TotalUserAc6=0;
	public void RefreshAc6() throws Exception {
		getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc6 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
				TotalUserAc6 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
			}
			
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc6 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc5 is: " + TotalUserAc5);
				TotalUserAc6 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
			}
			
		}
	}
	
	public void DisplayAC6Result() throws Exception {
		if(TotalUserAc6-TotalUserAc5==1) {
			System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"RUS"+"  ┃");
			System.out.println();
			System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc6-TotalUserAc5==0) {
			System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
			System.out.println();
			System.out.print("┃"+"  DataDuplicated: RUS"+" ┃");
			System.out.println();
			System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc6-TotalUserAc5>1) {
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}
	}
	
	
	
	int TotalUserAc7=0;
	public void RefreshAc7() throws Exception{
		getDriver().navigate().refresh();
		Thread.sleep(10000);
		
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc7 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
				System.out.println("TotalUserAc7 is: " + TotalUserAc7);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
				TotalUserAc7 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc7 is: " + TotalUserAc7);
			}
			
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Thread.sleep(15000);
			
			try {
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				TotalUserAc7 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
				System.out.println("TotalUserAc7 is: " + TotalUserAc7);
			} catch (Exception NumberFormatException) {
				Thread.sleep(15000);
				WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
				System.out.println("TotalUserAc6 is: " + TotalUserAc6);
				TotalUserAc7 = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
				System.out.println("TotalUserAc7 is: " + TotalUserAc7);
			}
			
		}
	}
	
	public void DisplayAC7Result() throws Exception {
		if(TotalUserAc7-TotalUserAc6==1) {
			System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"ESP"+"  ┃");
			System.out.println();
			System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc7-TotalUserAc6==0) {
			System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
			System.out.println();
			System.out.print("┃"+"  DataDuplicated: ESP"+" ┃");
			System.out.println();
			System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
			System.out.println();
			System.out.println();
		}else if (TotalUserAc7-TotalUserAc6>1) {
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
			System.out.println();
		}
	}


	


	
	
	
	
	public void ClickAddUserBtn() throws Exception {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement AddUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/div[1]/div[1]/div[1]/ng-switch/div/button/div/span"));
		AddUser.click();
	}
	
	

	public void LoginNameAc2(String LoginName) throws Exception {
			WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
			LoginN.click();
			LoginN.sendKeys(LoginName);
			Thread.sleep(1000);	
	}

	public void FirNameAc2(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LasNameAc2(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc2(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}

	public void LoginNameAc3(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc3(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc3(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc3(String Email) {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}

	public void LoginNameAc4(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc4(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc4(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc4(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}

	
	
	public void LoginNameAc5(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc5(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc5(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc5(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}
	
	
	

	public void LoginNameAc6(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc6(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc6(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc6(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}
	
	
	
	

	public void LoginNameAc7(String LoginName)throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc7(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc7(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[3]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc7(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-preeditor/div/div[1]/div"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[4]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
		InputEmail_Same.sendKeys(Email);
	}

	
	

	

	

	

	
	
	

	

	

	

	

	

	

}
