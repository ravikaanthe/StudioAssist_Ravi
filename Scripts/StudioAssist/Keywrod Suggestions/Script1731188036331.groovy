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

/*
 * Clcik the make appointment button with the id 'Object Repository/Page_CuraHomepage/btn_MakeAppointment'
 * Duble click the make appoiontment button with the id 'Object Repository/Page_CuraHomepage/btn_MakeAppointment'
 * Mobile tap the make appointment button with the id 'Object Repository/Page_CuraHomepage/btn_MakeAppointment'
 * Fill in the username 'Object Repository/Page_Login/txt_UserName' with the value of 'John Doe'
 * Clear text from username 'Object Repository/Page_Login/txt_UserName'
 * Scroll to text of the element username 'Object Repository/Page_Login/txt_UserName'
 * Verify element text of appointment div 'Object Repository/Page_CuraAppointment/div_Appointment'
 * Verify if element appointment div 'Object Repository/Page_CuraAppointment/div_Appointment' is visible
 * Verify if element appointment div 'Object Repository/Page_CuraAppointment/div_Appointment' exists
 */
// Click the make appointment button with the id 'Object Repository/Page_CuraHomepage/btn_MakeAppointment'
WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

// Double click the make appointment button with the id 'Object Repository/Page_CuraHomepage/btn_MakeAppointment'
WebUI.doubleClick(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

// Mobile tap the make appointment button with the id 'Object Repository/Page_CuraHomepage/btn_MakeAppointment'
Mobile.tap(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

// Fill in the username 'Object Repository/Page_Login/txt_UserName' with the value of 'John Doe'
WebUI.setText(findTestObject('Page_Login/txt_UserName'), 'John Doe')

// Clear text from username 'Object Repository/Page_Login/txt_UserName'
WebUI.clearText(findTestObject('Page_Login/txt_UserName'))

// Scroll to text of the element username 'Object Repository/Page_Login/txt_UserName'
WebUI.scrollToElement(findTestObject('Page_Login/txt_UserName'))

// Verify element text of appointment div 'Object Repository/Page_CuraAppointment/div_Appointment'
WebUI.verifyElementText(findTestObject('Page_CuraAppointment/div_Appointment'), 'expected text')

// Verify if element appointment div 'Object Repository/Page_CuraAppointment/div_Appointment' is visible
WebUI.verifyElementVisible(findTestObject('Page_CuraAppointment/div_Appointment'))

// Verify if element appointment div 'Object Repository/Page_CuraAppointment/div_Appointment' exists
WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'))
