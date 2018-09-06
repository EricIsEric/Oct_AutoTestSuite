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
		browserObjectAndCommonMethodPage.openURL("http://myd-vm00464.hpeswlab.net:20942/ui/?p=1001/1002#/");  //需要参数化
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
		Thread.sleep(10000);
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
		System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
		TotalUserBefore = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
		
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement DefaultIso = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[1]/div[2]/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[1]/div/div[1]/div/span"));
		DefaultIso.click();
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

	public void ShowResult1() throws Exception {
		WebElement DupMsg = find(org.openqa.selenium.By.xpath("/html/body/div[7]/div/div[2]/div/div[2]"));
		if(DupMsg==null) {
			System.out.print("┏"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"中一"+"     ┃");
			System.out.println();
			System.out.print("┗"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"┛");
			System.out.println();
		}else {
			System.out.print("╒"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"╕");
			System.out.println();
			System.out.print("┃"+"   DataDuplicated"+"   ┃");
			System.out.println();
			System.out.print("╘"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"╛");
			System.out.println();
		}
		
	}
	
	
	
	public void PrevStatus() throws Exception {
		getDriver().navigate().refresh();
		Thread.sleep(1000);
		
		//对正常添加账户的情况下尝试刷新页面的时候没有alert弹窗的情形的处理
		try {
			getDriver().switchTo().alert().accept();
			
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			WebElement AddUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/div[1]/div[1]/div[1]/ng-switch/div/button/div/span"));
			AddUser.click();
		} catch (Exception NoAlertPresentException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			WebElement AddUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/div[1]/div[1]/div[1]/ng-switch/div/button/div/span"));
			AddUser.click();
		}
		
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

	public void ShowResult2() {
//		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
//		WebElement LoginN = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/alm-presenter/label/div/alm-string-field-editor/div/div[1]/input"));
//		WebElement SucMsg = find(org.openqa.selenium.By.xpath("/html/body/div[4]/ng-include/div/div/div/span"));
		WebElement DupMsg = find(org.openqa.selenium.By.xpath("/html/body/div[7]/div/div[2]/div/div[2]"));
		if(getDriver().findElement(org.openqa.selenium.By.tagName("body")).getText().contains("was created with")) {
			System.out.print("┏"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"中二"+"     ┃");
			System.out.println();
			System.out.print("┗"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"┛");
			System.out.println();
		}else if(DupMsg!=null){
			System.out.print("╒"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"╕");
			System.out.println();
			System.out.print("┃"+"   DataDuplicated"+"   ┃");
			System.out.println();
			System.out.print("╘"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"╛");
			System.out.println();
		}else {
			System.out.println("!!!!!!!THIS IS TEST MESSAGE!!!!!!!");
		}
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

	public void ShowResult3() {
		WebElement DupMsg = find(org.openqa.selenium.By.xpath("/html/body/div[7]/div/div[2]/div/div[2]"));
		if(DupMsg==null) {
			System.out.print("┏"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"┓");
			System.out.println();
			System.out.print("┃"+"  AccountAdded: "+"日语"+"     ┃");
			System.out.println();
			System.out.print("┗"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"┛");
			System.out.println();
		}else {
			System.out.print("╒"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"╕");
			System.out.println();
			System.out.print("┃"+"   DataDuplicated"+"   ┃");
			System.out.println();
			System.out.print("╘"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"━"+"╛");
			System.out.println();
		}
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
	
	
	int TotalUserAfter = 0;
	public void ReloadPage() throws Exception {
		
		//防止在添加重复账户的情况下尝试刷新页面的时候的alert弹窗
		try {
			getDriver().navigate().refresh();
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/div[1]/div[1]/div[1]/ng-switch/div/button/div/span"));
		} catch (Exception UnhandledAlertException) {
			getDriver().switchTo().alert().accept();
			Thread.sleep(10000);
		}
		
		
		//以下代码需要运行验证,以当前账户总数减去添加之前的账户总数是否等于7来判断7个账户是否已经添加成功
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		
		try {
			WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
			System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
			TotalUserAfter = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
		} catch (Exception NumberFormatException) {
			Thread.sleep(10000);
			WebElement TotalUser = find(org.openqa.selenium.By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/entities-container/div/selection-status-bar/div/span[2]"));
			System.out.println(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
			TotalUserAfter = Integer.parseInt(TotalUser.getText().substring(TotalUser.getText().length()-3).trim());
		}
		
		if(TotalUserAfter-TotalUserBefore==7) {
			System.out.println();
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"The following accounts have been added:                         ┃");
			System.out.println("┃"+"Account 1: "+"\"中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga\" with Password \"Welcome1\""+"   ┃");
			System.out.println("┃"+"Account 2: "+"\"chs@nga\" with Password \"Welcome1\""+"                   ┃");
			System.out.println("┃"+"Account 3: "+"\"jpn@nga\" with Password \"Welcome1\""+"                   ┃");
			System.out.println("┃"+"Account 4: "+"\"fra@nga\" with Password \"Welcome1\""+"                   ┃");
			System.out.println("┃"+"Account 5: "+"\"deu@nga\" with Password \"Welcome1\""+"                   ┃");
			System.out.println("┃"+"Account 6: "+"\"rus@nga\" with Password \"Welcome1\""+"                   ┃");
			System.out.println("┃"+"Account 7: "+"\"esp@nga\" with Password \"Welcome1\""+"                   ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
		}else if (TotalUserAfter-TotalUserBefore>7) {
			System.out.println();
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe someone else had added account while the script is being executing,"+"  ┃");
			System.out.println("┃"+"need to confirm the accounts result on Octane web site."+"                    ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
		}else if (TotalUserAfter-TotalUserBefore<7 && TotalUserAfter-TotalUserBefore!=0) {
			System.out.println();
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe there are some failures existed during the script processing,"+"   ┃");
			System.out.println("┃"+"please confirm the accounts result on Octane web site. "+"               ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
		}else if (TotalUserAfter==TotalUserBefore) {
			System.out.println();
			System.out.println("┏"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┓");
			System.out.println("┃"+"Maybe all the accounts have been duplicated,"+"   ┃");
			System.out.println("┃"+"please confirm the accounts information. "+"      ┃");
			System.out.println("┗"+"━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"+"┛");
			System.out.println();
		}
		
	}

}
