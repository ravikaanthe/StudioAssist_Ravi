import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/**
 * The following usecae is for generating the script that contains custom keyword with StudioAssist
 */

/*
 * 1. Open a browser to the GlobalVariable.G_SiteURL URL
 * 2. Click the 'Page_CuraHomepage/btn_MakeAppointment' button using the 'com.example.CustomKeyword.clickElement'(String testObjectId) custom keyword
 * 3. Set the username object 'Page_Login/txt_UserName' with the 'Username' local variable
 * 4. Set the password object 'Page_Login/txt_Password' with the 'Password' local variable
 * 5. Click the 'Page_Login/btn_Login' login button with the same 'clickElement' custom keyword
 * 		in step 2
 * 6. Verify that the 'Page_CuraAppointment/div_Appointment' element is present with 10 seconds timeout
 * 7. Close the browser
 */
// 1. Open a browser to the GlobalVariable.G_SiteURL URL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// 2. Click the 'Page_CuraHomepage/btn_MakeAppointment' button using the 'com.example.CustomKeyword.clickElement'(String testObjectId) custom keyword
CustomKeywords.'com.example.CustomKeyword.ClickElement'('Page_CuraHomepage/btn_MakeAppointment')

// 3. Set the username object 'Page_Login/txt_UserName' with the 'Username' local variable
WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)

// 4. Set the password object 'Page_Login/txt_Password' with the 'Password' local variable
WebUI.setText(findTestObject('Page_Login/txt_Password'), Password)

// 5. Click the 'Page_Login/btn_Login' login button with the same 'clickElement' custom keyword used in step 2
CustomKeywords.'com.example.CustomKeyword.ClickElement'('Page_Login/btn_Login')

// 6. Verify that the 'Page_CuraAppointment/div_Appointment' element is present with 10 seconds timeout
WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), 10)

// 7. Close the browser
WebUI.closeBrowser()
