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

public class Autocomplete {

	@Keyword

	def autocomplete() {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://demoqa.com/text-box')

		WebUI.scrollToElement(findTestObject('Object Repository/autocomplte1/div_'), 0)

		WebUI.click(findTestObject('Object Repository/autocomplte1/div_'))

		WebUI.click(findTestObject('Object Repository/autocomplte1/span_Auto Complete'))

		WebUI.scrollToElement(findTestObject('Object Repository/autocomplte1/div_Type multiple color names_auto-complete_ecc757'),
				0)

		WebUI.click(findTestObject('Object Repository/autocomplte1/div_Type multiple color names_auto-complete_ecc757'))

		WebUI.setText(findTestObject('Object Repository/autocomplte1/input_Type multiple color names_autoComplet_e23c2f'), 'ye')

		WebUI.click(findTestObject('Object Repository/autocomplte1/div_Yellow'))

		WebUI.setText(findTestObject('Object Repository/autocomplte1/input_Type multiple color names_autoComplet_e23c2f'), 'gr')

		WebUI.click(findTestObject('Object Repository/autocomplte1/div_Green'))

		WebUI.setText(findTestObject('Object Repository/autocomplte1/input_Type multiple color names_autoComplet_e23c2f'), 'b')

		WebUI.click(findTestObject('Object Repository/autocomplte1/div_Blue'))



		WebUI.closeBrowser()
	}
}
