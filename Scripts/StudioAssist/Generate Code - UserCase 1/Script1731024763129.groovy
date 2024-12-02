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
* The following use case is for generating code with StudioAssist by lisitng out actions as steps in plain english language
*/

/*
 * Write a Katalon Studio Test Case to perform the following steps:
 * 
 * 1. Open a Browser to the URL stored in the GlobalVariable.G_SiteURL
 * 2. Click the make appointment button with the id 'Page_CuraHomepage/btn_MakeAppointment'
 * 3. Fill in the username 'Page_Login/txt_UserName' with the value of the local varable 'Username'
 * 4. Fill in the password 'Page_Login/txt_Password' with the value in the local variable 'Password'
 * 5. Click login button with the id 'Object Repository/Page_Login/btn_Login'
 * 6. Verify that the appointment div 'Page_CuraAppointment/div_Appointment' exists with timeout 10s
 * 7. Close the browser
 */
// Open a Browser to the URL stored in the GlobalVariable.G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click the make appointment button with the id 'Page_CuraHomepage/btn_MakeAppointment'
WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

// Fill in the username 'Page_Login/txt_UserName' with the value of the local variable 'Username'
WebUI.setText(findTestObject('Page_Login/txt_UserName'), Username)

// Fill in the password 'Page_Login/txt_Password' with the value in the local variable 'Password'
WebUI.setText(findTestObject('Page_Login/txt_Password'), Password)

// Click login button with the id 'Object Repository/Page_Login/btn_Login'
WebUI.click(findTestObject('Page_Login/btn_Login'))

// Verify that the appointment div 'Page_CuraAppointment/div_Appointment' exists with timeout 10s
WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), 10)

// Close the browser
WebUI.closeBrowser()

