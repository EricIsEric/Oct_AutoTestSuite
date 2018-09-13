Meta:
@feature All the testing on Octane site

Scenario: (1) Navigate to the Default Isolated Space page directly
Given Delete all cookies before start testing
When the user has opened the Octane webpage
Then the user enters username sa@nga and password Welcome1 to Octane login page
Then click the Login submit button of Octane Page
Then the Octane main page should be displayed

Scenario: (2) Start to add Account_One (Chinese1)
Then click DefaultIsoSpaces Area
Then click Add User button
Then input Login name as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga
Then input First name as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢ 1
Then input Last name as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢ 2
Then input Email as 中文ボｱБЖÄê¢Àü¢ÁÉ»¢À€¢@nga
Then input Phone as 12345678
Then select Language as Chinese
Then input and confirm password as Welcome1
Then select Role1 as Workspace Admin
Then click Add role button
Then select Role2 as Space Admin
Then click the ADD&ANOTHER button
Then check account result
Then clear content of LoginName field
Then clear content of FirstName field
Then clear content of LastName field
Then clear content of Email field
Then clear content of Phone field
Then clear content of Pre-Password field
Then clear content of Con-Password field

Scenario: (3) Start to add Account_Two (Chinese2)
Then input Login name as chs@nga
Then input First name as Chs1
Then input Last name as Chs2
Then input Email as chs@nga
Then input Phone as 12345678 for Ac2
Then select Language as Chinese
Then input and confirm password as Welcome1
Then click the ADD&ANOTHER button
Then check account result
Then clear content of LoginName field
Then clear content of FirstName field
Then clear content of LastName field
Then clear content of Email field
Then clear content of Phone field
Then clear content of Pre-Password field
Then clear content of Con-Password field

Scenario: (4) Start to add Account_Three (Japanese)
Then input Login name as jpn@nga
Then input First name as Jpn1
Then input Last name as Jpn2
Then input Email as jpn@nga
Then input Phone as 12345678 for AC3
Then select Language as Japanese
Then input and confirm password as Welcome1
Then click the ADD&ANOTHER button
Then check account result
Then clear content of LoginName field
Then clear content of FirstName field
Then clear content of LastName field
Then clear content of Email field
Then clear content of Phone field
Then clear content of Pre-Password field
Then clear content of Con-Password field

Scenario: (5) Start to add Account_Four (French)
Then input Login name as fra@nga
Then input First name as Fra1
Then input Last name as Fra2
Then input Email as fra@nga
Then input Phone as 12345678 for Ac4
Then select Language as French
Then input and confirm password as Welcome1
Then click the ADD&ANOTHER button
Then check account result
Then clear content of LoginName field
Then clear content of FirstName field
Then clear content of LastName field
Then clear content of Email field
Then clear content of Phone field
Then clear content of Pre-Password field
Then clear content of Con-Password field

Scenario: (6) Start to add Account_Five (German)
Then input Login name as deu@nga
Then input First name as Deu1
Then input Last name as Deu2
Then input Email as deu@nga
Then input Phone as 12345678 for Ac5
Then select Language as German
Then input and confirm password as Welcome1
Then click the ADD&ANOTHER button
Then check account result
Then clear content of LoginName field
Then clear content of FirstName field
Then clear content of LastName field
Then clear content of Email field
Then clear content of Phone field
Then clear content of Pre-Password field
Then clear content of Con-Password field

Scenario: (7) Start to add Account_Six (Russian)
Then input Login name as rus@nga
Then input First name as Rus1
Then input Last name as Rus2
Then input Email as rus@nga
Then input Phone as 12345678 for Ac6
Then select Language as Russian
Then input and confirm password as Welcome1
Then click the ADD&ANOTHER button
Then check account result
Then clear content of LoginName field
Then clear content of FirstName field
Then clear content of LastName field
Then clear content of Email field
Then clear content of Phone field
Then clear content of Pre-Password field
Then clear content of Con-Password field

Scenario: (8) Start to add Account_Seven (Spanish)
Then input Login name as esp@nga
Then input First name as Esp1
Then input Last name as Esp2
Then input Email as esp@nga
Then input Phone as 12345678 for Ac7
Then select Language as Spanish
Then input and confirm password as Welcome1
Then click the ADD&ANOTHER button
Then check account result




