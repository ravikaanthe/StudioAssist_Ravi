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
 * The following use case is for generating script that uses CSV file with StudioAssist
 */

/*
 * I have a list of test object:
 * - Options: 'Page_CuraAppointment/lst_Facility'
 * - Health Program: 'Page_CuraAppointment/chk_Medicaid'
 * - Date: 'Page_CuraAppointment/txt_VisitDate'
 * - Comment: 'Page_CuraAppointment/txt_Comment'
 * - Make Appointment button: 'Page_CuraAppointment/btn_BookAppointment'
 * 
 * Write me a script to perfomr the steps as follows:
 *  - Find and call the 'StudioAssist/Reusable Tests/Login' test case with the variable 'Username' as 'John Doe' and 'Password' as the Password variable to login
 * - Select the option with the variable 'Facility' and the label is not a regex
 * - Check teh health program option
 * - Set the date with the 'Visit_Date' variable
 * - Write comment with the value in the 'Comment' variable
 * - Submit the appointment
 * - Capture the screenshot of the page
 * - Close the browser
 */
// Find and call the 'StudioAssist/Reusable Tests/Login' test case with the variable 'Username' as 'John Doe' and 'Password' as the Password variable to login
WebUI.callTestCase(findTestCase('StudioAssist/Reusable Tests/Login'), [('Username') : 'John Doe', ('Password') : Password])

// Select the option with the variable 'Facility' and the label is not a regex
WebUI.selectOptionByLabel(findTestObject('Page_CuraAppointment/lst_Facility'), Facility, false)

// Check the health program option
WebUI.check(findTestObject('Page_CuraAppointment/chk_Medicaid'))

// Set the date with the 'Visit_Date' variable
WebUI.setText(findTestObject('Page_CuraAppointment/txt_VisitDate'), Visit_Date)

// Write comment with the value in the 'Comment' variable
WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), Comment)

// Submit the appointment
WebUI.click(findTestObject('Page_CuraAppointment/btn_BookAppointment'))

// Capture the screenshot of the page
WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()
