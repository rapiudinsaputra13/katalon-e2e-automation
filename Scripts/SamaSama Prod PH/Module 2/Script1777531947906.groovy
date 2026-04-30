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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

// ============================================================
// TC: Login Flow - SamaSama Staging
// Module  : Authentication
// Author  : QA Team
// Version : 1.0
// ============================================================

// ── Config ──
def PHONE    = '639677891276'
def PASSWORD = 'SamaSama2026@!'
def WAIT     = 15

try {

	// STEP 1 — Launch App
	Mobile.startExistingApplication('lpi.samasama.staging')
	Mobile.waitForElementPresent(findTestObject('SamaSama_apps/Phone Number'), WAIT)
	println '✅ STEP 1 - App launched'

	// STEP 2 — Input Phone Number
	Mobile.tap(findTestObject('SamaSama_apps/Phone Number'), WAIT)
	Mobile.setText(findTestObject('SamaSama_apps/Phone Number'), PHONE, WAIT)
	Mobile.pressBack()
	Mobile.delay(2)
	println '✅ STEP 2 - Phone number entered'

	// STEP 3 — Input Password
	Mobile.tap(findTestObject('SamaSama_apps/Enter Password'), WAIT)
	Mobile.setText(findTestObject('SamaSama_apps/Enter Password'), PASSWORD, WAIT)
	Mobile.pressBack()
	Mobile.delay(2)
	println '✅ STEP 3 - Password entered'

	// STEP 4 — Tap Login
	Mobile.waitForElementPresent(findTestObject('SamaSama_apps/LoginButton'), WAIT)
	Mobile.tap(findTestObject('SamaSama_apps/LoginButton'), WAIT, FailureHandling.STOP_ON_FAILURE)
	Mobile.delay(3)
	println '✅ STEP 4 - Login button tapped'

	println ''
	println '✅ LOGIN FLOW - SUCCESS'

} catch (Exception e) {
	println '❌ LOGIN FAILED: ' + e.getMessage()
	Mobile.takeScreenshot('Reports/login_failed.png')
	throw e
}