package Thucydides.jbehave;


import org.jbehave.core.annotations.*;


import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.pages.OctaneTestSuitePage;
import Thucydides.steps.OctaneTestSuiteSteps;
import net.thucydides.core.annotations.Steps;
public class OctaneTestSuite{
	
	@Steps
	OctaneTestSuiteSteps steps;
	OctaneTestSuitePage octaneTestSuitePage;
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;
	
	@Given("Delete all cookies before start testing")
	public void DelCookies(){
		steps.DelCookies();
		System.out.println("No Cookies Detected!!");
	}
	
	@When("the user has opened the Octane webpage")
	public void accessOctaneURL() throws Exception{
		steps.accessOctaneURL(); 
	}
	
	@Then("the user enters username sa@nga and password Welcome1 to Octane login page")
	public void EnterLoginInfo(){
		 steps.EnterLoginInfo(); 
	}
	
	@Then("click the Login submit button of Octane Page")
	public void ClickLoginBtn() throws Exception{
		 steps.ClickLoginBtn(); 
	}
	
	@Then("the Octane main page should be displayed")
	public void LoginAssertion(){
		 steps.LoginAssertion(); 
	}
	
	@Then("click DefaultIsoSpaces Area")
	public void ClickDefault() throws Exception {
		steps.ClickDefault();
	}
	
	@Then("click Add User button")
	public void ClickAddUser() throws Exception{
		 steps.ClickAddUser_Steps();   
	}
	
	@Then("input Login name as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga")
	public void LoginName() throws Exception{
		steps.LoginName_Steps();  
	}
	
	@Then("input First name as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢ 1")
	public void InputFirstName() throws Exception{
		 steps.InputFirstName();   
	}
	
	@Then("input Last name as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢ 2")
	public void InputLastName() throws Exception{
		 steps.InputLastName();  
	}
	
	@Then("input Email as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga")
	public void InputeEmail() throws Exception{
		 steps.InputeEmail();   
	}
	
	@Then("input Phone as 12345678")
	public void InputPhoneNum() throws Exception{
		 steps.InputPhoneNum(); 
	}
	
	@Then("input Phone as 12345678 for Ac7")
	public void PhoneNumAc7() throws Exception{
		 steps.PhoneNumAc7(); 
	}
	
	@Then("input Phone as 12345678 for Ac6")
	public void PhoneNumAc6() throws Exception{
		 steps.PhoneNumAc6(); 
	}
	
	@Then("input Phone as 12345678 for Ac5")
	public void PhoneNumAc5() throws Exception{
		 steps.PhoneNumAc5(); 
	}
	
	@Then("input Phone as 12345678 for Ac4")
	public void PhoneNum() throws Exception{
		 steps.PhoneNumAc4(); 
	}
	
	@Then("input Phone as 12345678 for AC3")  
	public void PhoneNumAc3() throws Exception{
		 steps.PhoneNumAc3(); 
	}
	
	@Then("select Language as Chinese")
	public void SelectLanguage() throws Exception{
		 steps.SelectLanguage();  
	}
	
	@Then("input and confirm password as Welcome1")
	public void InputPwd() throws Exception{
		 steps.InputPwd();  
	}
	
	@Then("select Role1 as Workspace Admin")
	public void SelectRole1() throws Exception{
		 steps.SelectRole1();   
	}
	
	@Then("click Add role button")
	public void ClickAddRoleBtn() throws Exception{
		 steps.ClickAddRoleBtn();  
	}
	
	@Then("select Role2 as Space Admin")
	public void SelectRole2() throws Exception{
		 steps.SelectRole2();  
	}
	
	@Then("click the ADD&ANOTHER button")
	public void ClickAddAnoButn() throws Exception {
		steps.ClickAddAnoButn();  
	}
	
	@Then("check account result")
	public void CheckPerOneResult() {
		steps.CheckPerOneResult();
	}
	
	@Then("clear content of LoginName field")
	public void ClearLoginName() throws Exception {
		steps.ClearLoginName();
	}
	
	@Then("clear content of FirstName field")
	public void ClearFirstName() throws Exception {
		steps.ClearFirstName();
	}
	
	@Then("clear content of LastName field")
	public void ClearLastName() throws Exception {
		steps.ClearLastName();
	}
	
	@Then("clear content of Email field")
	public void ClearEmail() throws Exception {
		steps.ClearEmail();
	}
	
	@Then("clear content of Phone field")
	public void ClearPhone() throws Exception {
		steps.ClearPhone();
	}
	
	@Then("clear content of Pre-Password field")
	public void ClearPrePwd() throws Exception {
		steps.ClearPrePwd();
	}
	
	@Then("clear content of Con-Password field")
	public void ClearConPwd() throws Exception {
		steps.ClearConPwd();
	}
	
	//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//
	
	@Then("click AddUser button")
	public void ClickAddUserBtn() throws Exception {
		steps.ClickAddUserBtn();
	}
	
	@Then("input Login name as chs@nga")
	public void LoginNameAc2() throws Exception {
		steps.LoginNameAc2();
	}
	
	@Then("input First name as Chs1")
	public void FirNameAc2() throws Exception {
		steps.FirNameAc();
	}
	
	@Then("input Last name as Chs2")
	public void LasNameAc2() throws Exception {
		steps.LasNameAc2();
	}
	
	@Then("input Email as chs@nga")
	public void EmailAc2() throws Exception {
		steps.EmailAc2();
	}
	
	@Then("input Phone as 12345678 for Ac2")
	public void PhoneNumAc2() throws Exception {
		steps.PhoneNumAc2();
	}
	
	
	//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//
	
	
	@Then("input Login name as jpn@nga")
	public void LoginNameAc3() throws Exception{
		steps.LoginNameAc3();
	}
	
	@Then("input First name as Jpn1")
	public void FirstNameAc3() throws Exception {
		steps.FirNameAc3();
	}
	
	@Then("input Last name as Jpn2")
	public void LastNameAc3() throws Exception {
		steps.LastNameAc3();
	}
	
	@Then("input Email as jpn@nga")
	public void EmailAc3() throws Exception {
		steps.EmailAc3();
	}
	
	@Then("select Language as Japanese")
	public void LangForAc3() throws Exception {
		steps.LangForAc3();
	}
	
	//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//
	
	@Then("input Login name as fra@nga")
	public void LoginNameAc4() throws Exception {
		steps.LoginNameAc4();
	}
	
	@Then("input First name as Fra1")
	public void FirstNameAc4() throws Exception {
		steps.FirstNameAc4();
	}
	
	@Then("input Last name as Fra2")
	public void LastNameAc4() throws Exception {
		steps.LastNameAc4();
	}
	
	@Then("input Email as fra@nga")
	public void EmailAC4() throws Exception {
		steps.EmailAC4();
	}
	
	@Then("select Language as French")
	public void LangForAc4() throws Exception {
		steps.LangForAc4();
	}
	
	//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//
	
	@Then("input Login name as deu@nga")
	public void LoginNameAc5() throws Exception {
		steps.LoginNameAc5();
	}
	
	@Then("input First name as Deu1")
	public void FirstNameAc5() throws Exception {
		steps.FirstNameAc5();
	}
	
	@Then("input Last name as Deu2")
	public void LastNameAc5() throws Exception {
		steps.LastNameAc5();
	}
	
	@Then("input Email as deu@nga")
	public void EmailAc5() throws Exception {
		steps.EmailAc5();
	}
	
	@Then("select Language as German")
	public void LangForAc5() throws Exception {
		steps.LangForAc5();
	}
	
	//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//
	
	@Then("input Login name as rus@nga")
	public void LoginNameAc6() throws Exception {
		steps.LoginNameAc6();
	}
	
	@Then("input First name as Rus1")
	public void FirstNameAc6() throws Exception {
		steps.FirstNameAc6();	
	}
	
	@Then("input Last name as Rus2")
	public void LastNameAc6() throws Exception {
		steps.LastNameAc6();
	}
	
	@Then("input Email as rus@nga")
	public void EmailAc6() throws Exception {
		steps.EmailAc6();
	}
	
	@Then("select Language as Russian")
	public void LangForAc6() throws Exception {
		steps.LangForAc6();
	}
	
	//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-//	
	
	@Then("input Login name as esp@nga")
	public void LoginNameAc7() throws Exception {
		steps.LoginNameAc7();
	}
	
	@Then("input First name as Esp1")
	public void FirstNameAc7() throws Exception {
		steps.FirstNameAc7();
	}
	
	@Then("input Last name as Esp2")
	public void LastNameAc7() throws Exception {
		steps.LastNameAc7();
	}
	
	@Then("input Email as esp@nga")
	public void EmailAc7() throws Exception {
		steps.EmailAc7();
	}
	
	@Then("select Language as Spanish")
	public void LangForAc7() throws Exception {
		steps.LangForAc7();
	}
	
}