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
	public void ClickSettings() throws Exception {
		octaneTestSuitePage.ClickSettings();
	}

	@Step
	public void ClickSpaces() throws Exception {
		octaneTestSuitePage.ClickSpaces();
	}

	@Step
	public void ClickDefaultIsolated_Steps() throws Exception {
		octaneTestSuitePage.ClickDefaultIsolated_Page();
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
	public void SelectLanguage() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/field-editor-value-viewer/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div", "/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[1]/div/div[1]/div/span");
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
	public void CheckWorkspacesRole1() throws Exception {
		octaneTestSuitePage.CheckWorkspacesRole1();
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
	public void ShowResult1() throws Exception {
		octaneTestSuitePage.ShowResult1();
	}

	@Step
	public void ClickUsers() {
		octaneTestSuitePage.ClickUsers();
	}
	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//

	@Step
	public void PrevStatus() throws Exception {
		octaneTestSuitePage.PrevStatus();
	}
	
	@Step
	public void LoginNameAc2() throws Exception {
		octaneTestSuitePage.Pub_LoginName("chs@nga");
	}

	@Step
	public void FirNameAc2() throws Exception {
		octaneTestSuitePage.Pub_FirstName("Chs1");
	}

	@Step
	public void LasNameAc2() throws Exception {
		octaneTestSuitePage.Pub_LastName("Chs2");
	}

	@Step
	public void EmailAc2() throws Exception {
		octaneTestSuitePage.Pub_Email("chs@nga");
	}

	@Step
	public void ShowResult2() {
		octaneTestSuitePage.ShowResult2();
	}
	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//	

	@Step
	public void LoginNameAc3() throws Exception {
		octaneTestSuitePage.Pub_LoginName("jpn@nga");
	}

	@Step
	public void FirstNameAc3() throws Exception {
		octaneTestSuitePage.Pub_FirstName("Jpn1");
	}

	@Step
	public void LastNameAc3() throws Exception {
		octaneTestSuitePage.Pub_LastName("Jpn2");
	}

	@Step
	public void EmailAc3() throws Exception {
		octaneTestSuitePage.Pub_Email("jpn@nga");
	}

	@Step
	public void LangForAc3() throws Exception {
//		octaneTestSuitePage.LangForAc3();
		octaneTestSuitePage.Pub_SelLanguage("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/field-editor-value-viewer/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div", "/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[5]/div/div[1]/div/span");
	}

	@Step
	public void ShowResult3() {
		octaneTestSuitePage.ShowResult3();
	}

	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//	
	
	@Step
	public void LoginNameAc4() throws Exception {
		octaneTestSuitePage.Pub_LoginName("fra@nga");
	}

	@Step
	public void FirstNameAc4() throws Exception {
		octaneTestSuitePage.Pub_FirstName("Fra1");
	}

	@Step
	public void LastNameAc4() throws Exception {
		octaneTestSuitePage.Pub_LastName("Fra2");
	}

	@Step
	public void EmailAC4() throws Exception {
		octaneTestSuitePage.Pub_Email("fra@nga");
	}

	@Step
	public void LangForAc4() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/field-editor-value-viewer/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div", "/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[3]/div/div[1]/div/span");
	}

	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//		
	
	@Step
	public void LoginNameAc5() throws Exception {
		octaneTestSuitePage.Pub_LoginName("deu@nga");
	}

	@Step
	public void FirstNameAc5() throws Exception{
		octaneTestSuitePage.Pub_FirstName("Deu1");
	}

	@Step
	public void LastNameAc5() throws Exception {
		octaneTestSuitePage.Pub_LastName("Deu2");
	}

	@Step
	public void EmailAc5() throws Exception {
		octaneTestSuitePage.Pub_Email("deu@nga");
	}

	@Step
	public void LangForAc5() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/field-editor-value-viewer/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div", "/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[4]/div/div[1]/div/span");
	}

	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//		
	
	@Step
	public void LoginNameAc6() throws Exception {
		octaneTestSuitePage.Pub_LoginName("rus@nga");
	}
	
	@Step
	public void FirstNameAc6() throws Exception {
		octaneTestSuitePage.Pub_FirstName("Rus1");
	}

	@Step
	public void LastNameAc6() throws Exception {
		octaneTestSuitePage.Pub_LastName("Rus2");
	}

	@Step
	public void EmailAc6() throws Exception {
		octaneTestSuitePage.Pub_Email("rus@nga");
	}

	@Step
	public void LangForAc6() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/field-editor-value-viewer/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div", "/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[6]/div/div[1]/div/span");
	}
	
	
	//-=-=-=-=-=-=-==-=-=-=-=-=-==-=--=-=-=-==-=-//		

	@Step
	public void LoginNameAc7() throws Exception  {
		octaneTestSuitePage.Pub_LoginName("esp@nga");
	}

	@Step
	public void FirstNameAc7() throws Exception {
		octaneTestSuitePage.Pub_FirstName("Esp1");
	}

	@Step
	public void LastNameAc7() throws Exception {
		octaneTestSuitePage.Pub_LastName("Esp2");
	}

	@Step
	public void EmailAc7() throws Exception {
		octaneTestSuitePage.Pub_Email("esp@nga");
	}

	@Step
	public void LangForAc7() throws Exception {
		octaneTestSuitePage.Pub_SelLanguage("/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/field-editor-value-viewer/div/reference-field-editor-preeditor/div/div/field-editor-preeditor/div/div/div[1]/div/div", "/html/body/div[2]/div[5]/div[2]/div/div[2]/div/form/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div[6]/alm-presenter/label/div/string-as-list-editor/smart-editor/div/div/div/div/field-editor-selector/div/div/selector-search-list/div/div/ul/li/ul/li[7]/div/div[1]/div/span");
	}

	@Step
	public void ReloadPage() throws Exception {
		octaneTestSuitePage.ReloadPage();
	}

	
	

}
