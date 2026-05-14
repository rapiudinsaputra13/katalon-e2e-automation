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

//end
'Open your Web\r\n'
WebUI.openBrowser('')

'URL this Website\r\n'
def BASE_URL = 'https://victory-staging.samasamaapp.com'

WebUI.comment('[Common] Opening Victory and logging in...')

'Open URL\r\n'
WebUI.openBrowser(BASE_URL)

'Maximum Browser\r\n'
WebUI.maximizeWindow()

'Delay 5 second'
WebUI.waitForPageLoad(5)

'Input Yout Phonr Number\r\n'
WebUI.setText(findTestObject('Victory SamaSama Web/mobile phone number'), '639677891276')

'Click Field Phone Number\r\n'
WebUI.click(findTestObject('Victory SamaSama Web/mobile phone number'))

'Delay 5 second'
WebUI.waitForPageLoad(5)

'Delay 5 second'
WebUI.waitForPageLoad(5)

'Click Button Next'
WebUI.click(findTestObject('Victory SamaSama Web/next button'))

'Delay 5 second'
WebUI.waitForPageLoad(5)

'Input Your Password'
WebUI.setText(findTestObject('Victory SamaSama Web/mobile phone number'), 'SamaSama2026@!')

'Delay 5 second'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Click Button Next'
WebUI.click(findTestObject('Victory SamaSama Web/next button'))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Click Wholesaler\r\n'
WebUI.click(findTestObject('Victory SamaSama Web/Clik wholesaler'))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Continue in Longlat Salesman'
WebUI.click(findTestObject('Victory SamaSama Web/Click longlat continous'))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Start Attendance'
WebUI.click(findTestObject('Victory SamaSama Web/Click_Start_activity'))

'Reason Attendance'
WebUI.click(findTestObject('Victory SamaSama Web/Click Fill Reason to Attendance'))

'Click Selfie absen Wholesaler\r\n'
WebUI.click(findTestObject('Victory SamaSama Web/Click Selfie'))

'Click Selfie absen Wholesaler\r\n'
WebUI.delay(15)

'Click Selfie absen Wholesaler\r\n'
WebUI.click(findTestObject('Victory SamaSama Web/get Icon Camera'))

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Click Selfie absen Wholesaler\r\n'
WebUI.click(findTestObject('Victory SamaSama Web/click_btn_confirm_selfie'))

