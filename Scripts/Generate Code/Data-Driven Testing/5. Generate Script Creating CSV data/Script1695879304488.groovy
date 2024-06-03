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
 * The following prompt is for generating script that creates CSV test data with StudioAssist
 * 
 * Select the prompt -> Right-click -> StudioAssist -> Generate Code
 */

/* - Create a CSV file named 'Data Files/data.csv' using java.io, listout libraries need to import
 * - Add into data.csv file with 3 columns: Facility, Visit_Date, Comment with 5 rows that comply with the rules as follows:
 * 	+ 'Facility' must be one of the following values: `Tokyo CURA Healthcare Center`, `Hongkong CURA Healthcare Center`and `Seoul CURA Healthcare Center`
 * 	+ 'Visit_Date' in dd/mm/yyyy format
 *  + 'Comment' is a sentence describing issue regarding making appointment
 */
