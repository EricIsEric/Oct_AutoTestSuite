package Thucydides.pages;


import java.util.concurrent.TimeUnit;

import javax.enterprise.inject.Default;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class OctaneTestSuitePage extends PageObject {
	
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;

	public void DelCookies() {
		browserObjectAndCommonMethodPage.deleteAllCookies();
	}

	public void accessOctaneURL() throws Exception {
//		browserObjectAndCommonMethodPage.openURL("http://myd-vm00464.hpeswlab.net:20942/ui/?p=1001/1002#/");
//		browserObjectAndCommonMethodPage.openURL("http://myd-vm00464.hpeswlab.net:20032/ui/?admin&p=1001/1002#/settings/shared-space/users");
		browserObjectAndCommonMethodPage.openURL(System.getProperty("JenkinsURL"));
//		browserObjectAndCommonMethodPage.openURL("http://myd-vm00464.hpeswlab.net:20942/ui/?admin&p=1001/1002#/settings/shared-space/users");
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
	
	//以下方法是防止当前不在DefaultIso的Space页面
	public void ClickDefault() throws Exception {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement DefaultSpaces = find(org.openqa.selenium.By.xpath("//span[@data-aid='500']"));
		DefaultSpaces.click();
		System.out.println("【===Default Spaces Switched Successfully===】");
		Thread.sleep(3000);
		
	}


	public void ClickAddUser_Page() throws Exception {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement AddUser = find(org.openqa.selenium.By.xpath("//button[@data-action-name='add']"));
		AddUser.click();
	}
	
	
	//公共输入LoginName
	public void Pub_LoginName(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}
	
	//公共输入FirstName
	public void Pub_FirstName(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}
	
	public void FirstNameForAc(String FirstName) throws Exception {
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}
	
	//公共输入LastName
	public void Pub_LastName(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}
	
	public void LastNameForAc(String LastName) throws Exception {
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}
	
	//公共输入Email
	String ThisEmail="";
	public void Pub_Email(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
		ThisEmail=Email;
	}
	
	
	String ThisEmail2="";
	public void EmailForAc(String Email) throws Exception {
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
		ThisEmail2=Email;
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
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void InputFirstName(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void InputLastName(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void InputeEmail(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
	}

	public void InputPhoneNum(String Phone) throws Exception {
		WebElement InputPhone = find(org.openqa.selenium.By.xpath("//div[@data-aid='phone1']"));
		InputPhone.click();
		WebElement InputPhone_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='phone1']//input[@autocomplete='off']"));
		InputPhone_Same.sendKeys(Phone);
	}
	
	public void PhoneNumAcs(String Phone) throws Exception {
		WebElement PhoneNum = find(org.openqa.selenium.By.xpath("//div[@data-aid='phone1']//input[@autocomplete='off']"));
		PhoneNum.sendKeys(Phone);
	}
	
	public void InputPhoneNumForAfter(String Phone) throws Exception {
		WebElement InputPhone_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='phone1']//input[@autocomplete='off']"));
		InputPhone_Same.sendKeys(Phone);
	}

	public void InputPwd() throws Exception {
		WebElement PrePwd = find(org.openqa.selenium.By.xpath("//input[@placeholder='New Password']"));
		PrePwd.click();
		PrePwd.sendKeys("Welcome1");
		Thread.sleep(1000);
		WebElement ConPwd = find(org.openqa.selenium.By.xpath("//input[@placeholder='Confirm Password']"));
		ConPwd.click();
		ConPwd.sendKeys("Welcome1");
		Thread.sleep(1000);
	}

	
	public void SelectRole1() throws Exception {
		WebElement RoleListBox = find(org.openqa.selenium.By.xpath("//div[@data-aid='role-assignment-1']//div[@data-aid='role']"));
		RoleListBox.click();
		Thread.sleep(3000);
		WebElement Role1Item = find(By.xpath("//div[@data-aid='role-assignment-1']//span[@title='Workspace Admin']"));
		Role1Item.click();
	}

	public void ClickAddRoleBtn() throws Exception {
		WebElement AddRoleBtn = find(org.openqa.selenium.By.xpath("//div[@data-aid='add-role-assignment']"));
		AddRoleBtn.click();
		Thread.sleep(1000);
		
	}

	public void SelectRole2() throws Exception {
		WebElement RoleListBox = find(org.openqa.selenium.By.xpath("//div[@data-aid='role-assignment-2']//div[@data-aid='role']"));
		RoleListBox.click();
		Thread.sleep(3000);
		WebElement Role2Item = find(org.openqa.selenium.By.xpath("//div[@data-aid='role-assignment-2']//span[@title='Space Admin']"));
		Role2Item.click();
		Thread.sleep(3000);
	}

	public void ClickAddAnoButn() throws Exception {
		WebElement AddBtn = find(org.openqa.selenium.By.xpath("//button[@data-aid='alm-entity-form-buttons-add-another']"));
		AddBtn.click();
		Thread.sleep(20000);
	}
	
	public void ClickAddUserBtn() throws Exception {
		getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement AddUser = find(org.openqa.selenium.By.xpath("//button[@data-action-name='add']"));
		AddUser.click();
	}
	
	

	public void LoginNameAc2(String LoginName) throws Exception {
			WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
			LoginN.click();
			LoginN.sendKeys(LoginName);
			Thread.sleep(1000);	
	}

	public void FirNameAc2(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LasNameAc2(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc2(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
	}

	public void LoginNameAc3(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc3(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc3(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc3(String Email) {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
	}

	public void LoginNameAc4(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc4(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc4(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc4(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
	}

	
	
	public void LoginNameAc5(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc5(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc5(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc5(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
	}
	
	
	

	public void LoginNameAc6(String LoginName) throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc6(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc6(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc6(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
	}
	
	
	
	

	public void LoginNameAc7(String LoginName)throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		LoginN.click();
		LoginN.sendKeys(LoginName);
		Thread.sleep(1000);
	}

	public void FirstNameAc7(String FirstName) throws Exception {
		WebElement FirstN = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']"));
		FirstN.click();
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		FirstN_Same.sendKeys(FirstName);
		Thread.sleep(1000);
	}

	public void LastNameAc7(String LastName) throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']"));
		LastN.click();
		WebElement LastN_Same = find(By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		LastN_Same.sendKeys(LastName);
		Thread.sleep(1000);
	}

	public void EmailAc7(String Email) throws Exception {
		WebElement InputEmail = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']"));
		InputEmail.click();
		WebElement InputEmail_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		InputEmail_Same.sendKeys(Email);
	}

	
	
	
	
	
	public void CheckPerOneResult() {
		System.out.println("!!!!!!!!Start CPOR!!!!!!!!");
		try {
			WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
			LoginN.click();
			
			if(ThisEmail=="中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga" || ThisEmail2=="中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga") {
				System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
				System.out.println();
				System.out.print("┃"+" AccountAdded: "+"CHS1"+"  ┃");
				System.out.println();
				System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="chs@nga" || ThisEmail2=="chs@nga") {
				System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
				System.out.println();
				System.out.print("┃"+" AccountAdded: "+"CHS2"+"  ┃");
				System.out.println();
				System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="jpn@nga" || ThisEmail2=="jpn@nga") {
				System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
				System.out.println();
				System.out.print("┃"+"  AccountAdded: "+"JPN"+"  ┃");
				System.out.println();
				System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="fra@nga" || ThisEmail2=="fra@nga") {
				System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
				System.out.println();
				System.out.print("┃"+"  AccountAdded: "+"FRA"+"  ┃");
				System.out.println();
				System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="deu@nga" || ThisEmail2=="deu@nga") {
				System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
				System.out.println();
				System.out.print("┃"+"  AccountAdded: "+"DEU"+"  ┃");
				System.out.println();
				System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="rus@nga" || ThisEmail2=="rus@nga") {
				System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
				System.out.println();
				System.out.print("┃"+"  AccountAdded: "+"RUS"+"  ┃");
				System.out.println();
				System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="esp@nga" || ThisEmail2=="esp@nga") {
				System.out.print("┏"+"━━━━━━━━━━━━━━━━━━━━━"+"┓");
				System.out.println();
				System.out.print("┃"+"  AccountAdded: "+"ESP"+"  ┃");
				System.out.println();
				System.out.print("┗"+"━━━━━━━━━━━━━━━━━━━━━"+"┛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}
			
		} catch (Exception WebDriverException) {
			getDriver().manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			WebElement CloseBtn = find(org.openqa.selenium.By.xpath("//button[@data-aid='dialog.close']"));
			CloseBtn.click();
			
			if(ThisEmail=="中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga" || ThisEmail2=="中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga") {
				System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
				System.out.println();
				System.out.print("┃"+" DataDuplicated: CHS1"+" ┃");
				System.out.println();
				System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="chs@nga" || ThisEmail2=="chs@nga") {
				System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
				System.out.println();
				System.out.print("┃"+" DataDuplicated: CHS2"+" ┃");
				System.out.println();
				System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="jpn@nga" || ThisEmail2=="jpn@nga") {
				System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
				System.out.println();
				System.out.print("┃"+"  DataDuplicated: JPN"+" ┃");
				System.out.println();
				System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="fra@nga" || ThisEmail2=="fra@nga") {
				System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
				System.out.println();
				System.out.print("┃"+"  DataDuplicated: FRA"+" ┃");
				System.out.println();
				System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="deu@nga" || ThisEmail2=="deu@nga") {
				System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
				System.out.println();
				System.out.print("┃"+"  DataDuplicated: DEU"+" ┃");
				System.out.println();
				System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="rus@nga" || ThisEmail2=="rus@nga") {
				System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
				System.out.println();
				System.out.print("┃"+"  DataDuplicated: RUS"+" ┃");
				System.out.println();
				System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}else if (ThisEmail=="esp@nga" || ThisEmail2=="esp@nga") {
				System.out.print("╒"+"━━━━━━━━━━━━━━━━━━━━━━"+"╕");
				System.out.println();
				System.out.print("┃"+"  DataDuplicated: ESP"+" ┃");
				System.out.println();
				System.out.print("╘"+"━━━━━━━━━━━━━━━━━━━━━━"+"╛");
				System.out.println();
				ThisEmail="";
				ThisEmail2="";
			}
			
			
			System.out.println("@@@@@==Now CloseBtn has been clicked==@@@@@");
			
		}
		System.out.println("!!!!!!!!Ended CPOR!!!!!!!!");
	}

	
	
	
	
	public void ClearLoginName() throws Exception {
		WebElement LoginN = find(org.openqa.selenium.By.xpath("//div[@data-aid='name']//input[@autocomplete='off']"));
		System.out.println("Current LoginN is: " + LoginN.getAttribute("value") + ", The length is: " + LoginN.getAttribute("value").length());
		
		if(LoginN.getAttribute("value").length()!=0) {
			System.out.println("==--==--==Start Clear LoginName==--==--==");
			LoginN.clear();
			System.out.println("==--==--==Ended Clear LoginName==--==--==");
		}else {
			System.out.println("====----====LoginName field is empty====----====");
		}
		
	}

	public void ClearFirstName() throws Exception {
		WebElement FirstN_Same = find(org.openqa.selenium.By.xpath("//div[@data-aid='first_name']//input[@autocomplete='off']"));
		System.out.println("Current FirstName is: " + FirstN_Same.getAttribute("value") + ", The length is: " + FirstN_Same.getAttribute("value").length());
		
		if(FirstN_Same.getAttribute("value").length()!=0) {
			System.out.println("==--==--==Start Clear FirstName==--==--==");
			FirstN_Same.clear();
			System.out.println("==--==--==Ended Clear FirstName==--==--==");
		}else {
			System.out.println("====----====FirstName field is empty====----====");
		}
		
	}

	public void ClearLastName() throws Exception {
		WebElement LastN = find(org.openqa.selenium.By.xpath("//div[@data-aid='last_name']//input[@autocomplete='off']"));
		System.out.println("Current LastName is: " + LastN.getAttribute("value") + ", The length is: " + LastN.getAttribute("value").length());
		
		if(LastN.getAttribute("value").length()!=0) {
			System.out.println("==--==--==Start Clear LastName==--==--==");
			LastN.clear();
			System.out.println("==--==--==Ended Clear LastName==--==--==");
		}else {
			System.out.println("====----====LastName field is empty====----====");
		}
		
	}

	public void ClearEmail() throws Exception {
		WebElement Email = find(org.openqa.selenium.By.xpath("//div[@data-aid='email']//input[@autocomplete='off']"));
		System.out.println("Current Email is: " + Email.getAttribute("value") + ", The length is: " + Email.getAttribute("value").length());
		
		if(Email.getAttribute("value").length()!=0) {
			System.out.println("==--==--==Start Clear Email==--==--==");
			Email.clear();
			System.out.println("==--==--==Ended Clear Email==--==--==");
		}else {
			System.out.println("====----====Email field is empty====----====");
		}
		
	}

	public void ClearPhone() throws Exception {
		WebElement Phone = find(org.openqa.selenium.By.xpath("//div[@data-aid='phone1']//input[@autocomplete='off']"));
		System.out.println("Current Phone is: " + Phone.getAttribute("value") + ", The length is: " + Phone.getAttribute("value").length());
		
		if(Phone.getAttribute("value").length()!=0) {
			System.out.println("==--==--==Start Clear Phone==--==--==");
			Phone.clear();
			System.out.println("==--==--==Ended Clear Phone==--==--==");
		}else {
			System.out.println("====----====Phone field is empty====----====");
		}
		
	}

	public void ClearPrePwd() throws Exception {
		WebElement PrePwd = find(org.openqa.selenium.By.xpath("//input[@placeholder='New Password']"));
		System.out.println("Current PrePwd is: " + PrePwd.getAttribute("value") + ", The length is: " + PrePwd.getAttribute("value").length());
		
		if(PrePwd.getAttribute("value").length()!=0) {
			System.out.println("==--==--==Start Clear PrePed==--==--==");
			PrePwd.clear();
			System.out.println("==--==--==Ended Clear PrePed==--==--==");
			Thread.sleep(1000);
		}else {
			System.out.println("====----====PrePwd field is empty====----====");
		}
		
	}

	public void ClearConPwd() throws Exception {
		WebElement ConPwd = find(org.openqa.selenium.By.xpath("//input[@placeholder='Confirm Password']"));
		System.out.println("Current ConPwd is: " + ConPwd.getAttribute("value") + ", The length is: " + ConPwd.getAttribute("value").length());
		
		if(ConPwd.getAttribute("value").length()!=0) {
			System.out.println("==--==--==Start Clear ConPwd==--==--==");
			ConPwd.clear();
			System.out.println("==--==--==Ended Clear ConPwd==--==--==");
			Thread.sleep(1000);
		}else {
			System.out.println("====----====ConPwd field is empty====----====");
		}
		
	}

	
	

	

	
	

	
	

	

	

	

	
	
	

	

	

	

	

	

	

}
