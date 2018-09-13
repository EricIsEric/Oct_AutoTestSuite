package Thucydides.steps;

import Thucydides.pages.OctaneTestSuitePage;
import net.thucydides.core.annotations.Step;

public class OctaneTestSuiteSteps {
	OctaneTestSuitePage octaneTestSuitePage;
	
	@Step
	public void DelCookies() {
		octaneTestSuitePage.DelCookies();
	}
	
	@Step
	public void accessOctaneURL() throws Exception {
		octaneTestSuitePage.accessOctaneURL();
	}
	
	@Step
	public void EnterLoginInfo() {
		octaneTestSuitePage.EnterLoginInfo("sa@nga", "Welcome1");
	}
	
	@Step
	public void ClickLoginBtn() throws Exception {
		octaneTestSuitePage.ClickLoginBtn();
	}

	@Step
	public void LoginAssertion() {
		octaneTestSuitePage.LoginAssertion();
	}
	
	@Step
	public void ClickDefault() throws Exception {
	octaneTestSuitePage.ClickDefault();	
	}

	@Step
	public void ClickAddUser_Steps() throws Exception {
		octaneTestSuitePage.ClickAddUser_Page();
	}

	@Step
	public void LoginName_Steps() throws Exception {
		octaneTestSuitePage.Pub_LoginName("中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga");
		
	}

	@Step
	public void InputFirstName() throws Exception {
		octaneTestSuitePage.Pub_FirstName("中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢ 1");
	}

	@Step
	public void InputLastName() throws Exception {
		octaneTestSuitePage.Pub_LastName("中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢ 2");
		
	}

	@Step
	public void InputeEmail() throws Exception {
		octaneTestSuitePage.Pub_Email("中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga");
	}

	@Step
	public void InputPhoneNum() throws Exception {
		octaneTestSuitePage.InputPhoneNum("12345678");
	}
	
	@Step
	public void InputPhoneNumAfter() throws Exception {
		octaneTestSuitePage.InputPhoneNumForAfter("12345678");
	}


	@Step
	public void SelectLanguage() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("//div[@data-aid='dummy-aid']//div[@class='field-editor-preeditor-single-value-container cols']", "//span[@title='Chinese - 中文（简体）']");
	}

	@Step
	public void InputPwd() throws Exception {
		octaneTestSuitePage.InputPwd();
	}

	@Step
	public void SelectRole1() throws Exception {
		octaneTestSuitePage.SelectRole1();
	}

	@Step
	public void ClickAddRoleBtn() throws Exception {
		octaneTestSuitePage.ClickAddRoleBtn();
	}

	@Step
	public void SelectRole2() throws Exception {
		octaneTestSuitePage.SelectRole2();
	}

	@Step
	public void ClickAddAnoButn() throws Exception {
		octaneTestSuitePage.ClickAddAnoButn();
	}
	
	@Step
	public void CheckPerOneResult() {
		octaneTestSuitePage.CheckPerOneResult();
	}
	
	@Step
	public void ClickAddUserBtn() throws Exception {
		octaneTestSuitePage.ClickAddUserBtn();
	}
	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//
	
	@Step
	public void LoginNameAc2() throws Exception {
		octaneTestSuitePage.Pub_LoginName("chs@nga");
	}

	@Step
	public void FirNameAc() throws Exception {
		octaneTestSuitePage.FirstNameForAc("chs1");
	}
	
	

	@Step
	public void LasNameAc2() throws Exception {
		octaneTestSuitePage.LastNameForAc("chs2");
	}

	@Step
	public void EmailAc2() throws Exception {
		octaneTestSuitePage.EmailForAc("chs@nga");
	}
	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//	

	@Step
	public void LoginNameAc3() throws Exception {
		octaneTestSuitePage.Pub_LoginName("jpn@nga");
	}

	@Step
	public void FirstNameAc3() throws Exception {
		octaneTestSuitePage.Pub_FirstName("jpn1");
	}
	
	@Step
	public void FirNameAc3() throws Exception {
		octaneTestSuitePage.FirstNameForAc("Jpn1");
	}

	@Step
	public void LastNameAc3() throws Exception {
		octaneTestSuitePage.LastNameForAc("jpn2");
	}
	
	@Step
	public void LastNameForAc() throws Exception {
		octaneTestSuitePage.LastNameForAc("Jpn2");
	}

	@Step
	public void EmailAc3() throws Exception {
		octaneTestSuitePage.EmailForAc("jpn@nga");
	}

	@Step
	public void LangForAc3() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("//div[@data-aid='dummy-aid']//div[@class='field-editor-preeditor-single-value-container cols']", "//span[@title='Japanese - 日本語']");
	}

	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//	
	
	@Step
	public void LoginNameAc4() throws Exception {
		octaneTestSuitePage.Pub_LoginName("fra@nga");
	}

	@Step
	public void FirstNameAc4() throws Exception {
		octaneTestSuitePage.FirstNameForAc("fra1");
	}

	@Step
	public void LastNameAc4() throws Exception {
		octaneTestSuitePage.LastNameForAc("fra2");
	}

	@Step
	public void EmailAC4() throws Exception {
		octaneTestSuitePage.EmailForAc("fra@nga");
	}

	@Step
	public void LangForAc4() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("//div[@data-aid='dummy-aid']//div[@class='field-editor-preeditor-single-value-container cols']", "//span[@title='French - français']");
	}


	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//		
	
	@Step
	public void LoginNameAc5() throws Exception {
		octaneTestSuitePage.Pub_LoginName("deu@nga");
	}

	@Step
	public void FirstNameAc5() throws Exception{
		octaneTestSuitePage.FirstNameForAc("deu1");
	}

	@Step
	public void LastNameAc5() throws Exception {
		octaneTestSuitePage.LastNameForAc("deu2");
	}

	@Step
	public void EmailAc5() throws Exception {
		octaneTestSuitePage.EmailForAc("deu@nga");
	}

	@Step
	public void LangForAc5() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("//div[@data-aid='dummy-aid']//div[@class='field-editor-preeditor-single-value-container cols']", "//span[@title='German - Deutsch']");
	}


	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//		
	
	@Step
	public void LoginNameAc6() throws Exception {
		octaneTestSuitePage.Pub_LoginName("rus@nga");
	}
	
	@Step
	public void FirstNameAc6() throws Exception {
		octaneTestSuitePage.FirstNameForAc("rus1");
	}

	@Step
	public void LastNameAc6() throws Exception {
		octaneTestSuitePage.LastNameForAc("rus2");
	}

	@Step
	public void EmailAc6() throws Exception {
		octaneTestSuitePage.EmailForAc("rus@nga");
	}

	@Step
	public void LangForAc6() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("//div[@data-aid='dummy-aid']//div[@class='field-editor-preeditor-single-value-container cols']", "//span[@title='Russian - русский']");
	}
	
	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//		

	@Step
	public void LoginNameAc7() throws Exception  {
		octaneTestSuitePage.Pub_LoginName("esp@nga");
	}

	@Step
	public void FirstNameAc7() throws Exception {
		octaneTestSuitePage.FirstNameForAc("esp1");
	}

	@Step
	public void LastNameAc7() throws Exception {
		octaneTestSuitePage.LastNameForAc("esp2");
	}

	@Step
	public void EmailAc7() throws Exception {
		octaneTestSuitePage.EmailForAc("esp@nga");
	}

	@Step
	public void LangForAc7() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("//div[@data-aid='dummy-aid']//div[@class='field-editor-preeditor-single-value-container cols']", "//div[@data-text-value='Spanish - español']//span[@title='Spanish - español']");
	}

	
	@Step
	public void ClearLoginName() throws Exception {
		octaneTestSuitePage.ClearLoginName();
	}

	
	@Step
	public void ClearFirstName() throws Exception {
		octaneTestSuitePage.ClearFirstName();
	}

	@Step
	public void ClearLastName() throws Exception {
		octaneTestSuitePage.ClearLastName();
	}

	@Step
	public void ClearEmail() throws Exception {
		octaneTestSuitePage.ClearEmail();
	}

	@Step
	public void ClearPhone() throws Exception {
		octaneTestSuitePage.ClearPhone();
	}

	@Step
	public void ClearPrePwd() throws Exception {
		octaneTestSuitePage.ClearPrePwd();
	}

	@Step
	public void ClearConPwd() throws Exception {
		octaneTestSuitePage.ClearConPwd();
	}

	@Step
	public void PhoneNumAc2() throws Exception {
		octaneTestSuitePage.PhoneNumAcs("12345678");
	}
	
	@Step
	public void PhoneNumAc3() throws Exception {
		octaneTestSuitePage.PhoneNumAcs("12345678");
	}
	
	@Step
	public void PhoneNumAc4() throws Exception {
		octaneTestSuitePage.PhoneNumAcs("12345678");
	}
	
	@Step
	public void PhoneNumAc5() throws Exception {
		octaneTestSuitePage.PhoneNumAcs("12345678");
	}
	
	@Step
	public void PhoneNumAc6() throws Exception {
		octaneTestSuitePage.PhoneNumAcs("12345678");
	}
	
	@Step
	public void PhoneNumAc7() throws Exception {
		octaneTestSuitePage.PhoneNumAcs("12345678");
	}

	
	
}
