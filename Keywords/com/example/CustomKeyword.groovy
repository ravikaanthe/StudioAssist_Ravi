package com.example

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import internal.GlobalVariable

public class CustomKeyword {

	/**
	 * The following prompt is for generating a custom keyword with Studio Assist to click an element that we pass in the function
	 */

	/*
	 * Write me a ClickElement keyword that receives a test object id of type String and does as follows
	 * 1. Click the element
	 * 2. If cannot click the element, catch WebElementNotFoundException exception and use KeywordUtil.markFailed to say that you cannot find the element
	 * 3. If other errors, catch Exception saying that you failed to click element with the KeuwordUtil.markFailed
	 * 4. Otherwise, mark the keyword as succeed
	 * 
	 */
	// ClickElement keyword to click an element identified by test object id
	@Keyword
	def ClickElement(String testObjectId) {
		try {
			WebUI.click(findTestObject(testObjectId))
			KeywordUtil.markPassed("Element clicked successfully")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Cannot find the element")
		} catch (Exception ex) {
			KeywordUtil.markFailed("Failed to click element")
		}
	}
}
