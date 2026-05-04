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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.MobileTestObject

// ============================================================
// TC: Login Flow - SamaSama Staging
// Module  : Authentication
// Author  : QA Team
// Version : 1.0
// ============================================================
// Config
def PHONE    = '639677891276'
def PASSWORD = 'SamaSama2026@!'
def WAIT     = 15

def objPassword = findTestObject('SamaSama_apps/Enter Password')

// START
println 'TC_A_001 - Start Login Test'

// STEP 1
println 'TC_A_001 - STEP 1 - Launch App'
Mobile.startExistingApplication('lpi.samasama.staging')
Mobile.waitForElementPresent(findTestObject('SamaSama_apps/Phone Number'), WAIT, FailureHandling.STOP_ON_FAILURE)

// STEP 2
println 'TC_A_001 - STEP 2 - Input Phone'
Mobile.tap(findTestObject('SamaSama_apps/Phone Number'), WAIT, FailureHandling.STOP_ON_FAILURE)
Mobile.setText(findTestObject('SamaSama_apps/Phone Number'), PHONE, WAIT, FailureHandling.STOP_ON_FAILURE)
Mobile.pressBack()
Mobile.delay(2)

// STEP 3
println 'TC_A_001 - STEP 3 - Input Password'
Mobile.tap(objPassword, WAIT, FailureHandling.STOP_ON_FAILURE)
Mobile.setText(objPassword, PASSWORD, WAIT, FailureHandling.STOP_ON_FAILURE)
Mobile.pressBack()
Mobile.delay(2)

// STEP 4
println 'TC_A_001 - STEP 4 - Tap Login'
Mobile.tap(findTestObject('SamaSama_apps/LoginButton'), WAIT, FailureHandling.STOP_ON_FAILURE)

println 'TC_A_001 - LOGIN SUCCESS'