package demoQa

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

import internal.GlobalVariable

public class Datepicker {

	@Keyword

	def date() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://demoqa.com/text-box')

		WebUI.scrollToElement(findTestObject('Object Repository/datepicker1/path'), 0)

		WebUI.click(findTestObject('Object Repository/datepicker1/path'))

		WebUI.click(findTestObject('Object Repository/datepicker1/span_Date Picker'))

		WebUI.scrollToElement(findTestObject('Object Repository/datepicker1/input_Select Date_datePickerMonthYearInput'), 0)

		WebUI.click(findTestObject('Object Repository/datepicker1/input_Select Date_datePickerMonthYearInput'))


		WebUI.closeBrowser()
	}
}
