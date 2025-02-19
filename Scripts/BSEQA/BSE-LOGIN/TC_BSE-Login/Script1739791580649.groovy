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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.starmfv2.remiges.tech/auth/realms/starmfv2-qa/protocol/openid-connect/auth?client_id=starmfv2-qa-web-client&redirect_uri=https%3A%2F%2Fqa.starmfv2.remiges.tech&state=1607f349-5e01-47c8-8fcd-9ff44a0a1d2a&response_mode=fragment&response_type=code&scope=openid&nonce=b9764689-707b-4a5b-81d2-ac9b8b013f65&code_challenge=peNmIDDpRcumleA8unaWrr8TGAQF2uiPkCSoP-LfJSs&code_challenge_method=S256')

WebUI.selectOptionByValue(findTestObject('Object Repository/BSE_Login/select_I am a MemberI am an AMCI am an Exch_0b0339'), 
    'exchange', true)

WebUI.setText(findTestObject('Object Repository/BSE_Login/input_Sign In With Your BSE StAR MF Account_e76d55'), s1)

WebUI.setText(findTestObject('Object Repository/BSE_Login/input_Sign In With Your BSE StAR MF Account_userId'), s2)

WebUI.setEncryptedText(findTestObject('Object Repository/BSE_Login/input_Password_password'), 'cX9mQrRnatgxE2mWh+Fbtw==')

WebUI.setText(findTestObject('Object Repository/BSE_Login/input_Password_user_captcha'), s3)

WebUI.scrollToElement(findTestObject('Object Repository/BSE_Login/button_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/BSE_Login/button_Sign In'))

WebUI.closeBrowser()

