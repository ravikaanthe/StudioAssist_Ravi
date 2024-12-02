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
 * The following use case is for generating the script that creates CSV test data with StudioAssist
 */

/*
 * - Create a CSV file named 'Data Files/data.csv' using java.io, listout libraries need to import
 * - Add inot data.csv file with 3 columns: Facility, Visit_Date, Comment with 5 rows that comply with the rules as follows:
 * + 'Facility' must be one of the following values: 'Tokyo CURA Healthcare Center', 'Hongkond CURA Healthcare Center', 'Seoul CURA Healthcare Center'
 * + 'Visit_Date' in dd/mm/yyyy format
 * + 'Comment' is a setence describing issue regrading making appointment
 */
// Importing the necessary libraries
import java.io.FileWriter
import java.io.BufferedWriter
import java.text.SimpleDateFormat
import java.util.Date

// Creating a CSV file named 'Data Files/data.csv' and adding data with 3 columns: Facility, Visit_Date, Comment
FileWriter fileWriter = new FileWriter('Data Files/data.csv')
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)

// Writing the header row
bufferedWriter.write("Facility,Visit_Date,Comment")
bufferedWriter.newLine()

// Generating 5 rows of data
List<String> facilities = ["Tokyo CURA Healthcare Center", "Hongkong CURA Healthcare Center", "Seoul CURA Healthcare Center"]
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy")
for (int i = 0; i < 5; i++) {
    String facility = facilities[i % 3]
    String visitDate = dateFormat.format(new Date())
    String comment = "Issue regarding making appointment " + (i + 1)
    
    // Writing data to the CSV file
    bufferedWriter.write("$facility,$visitDate,$comment")
    bufferedWriter.newLine()
}

// Closing the BufferedWriter
bufferedWriter.close()