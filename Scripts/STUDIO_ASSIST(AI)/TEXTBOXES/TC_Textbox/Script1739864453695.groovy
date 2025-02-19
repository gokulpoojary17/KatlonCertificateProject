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
 * Open Browser
 * Navigate to url "https://demoqa.com/text-box"
 * scroll to text "Textbox'
 * Verify text present "Textbox"
 * Close browser
 * 
 * 
 */
// Open a browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://demoqa.com/text-box')

// Scroll to the text "Textbox"
WebUI.scrollToElement(findTestObject('TextBox/h1_Text Box'), 10)

// Verify that the text "Textbox" is present on the page
WebUI.verifyElementText(findTestObject('TextBox/h1_Text Box'), 'Text Box')

// Close the browser
WebUI.closeBrowser()

