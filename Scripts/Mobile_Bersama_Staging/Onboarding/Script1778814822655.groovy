import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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
 * ============================================================
 * TEST CASE  : TC_PengaturanAwal_OpeningApp
 * DESCRIPTION: Automation script untuk halaman "Pengaturan Awal"
 *              saat pertama kali membuka aplikasi MyBoss Staging.
 * PLATFORM   : Android
 * DEVICE     : Xiaomi 23122PCD1G
 * APP        : lpi.myboss.staging
 * TOOL       : Katalon Studio
 * LANGUAGE   : Groovy
 * ============================================================
 */
// ============================================================
// KONSTANTA
// ============================================================
String APP_PACKAGE = 'lpi.myboss.staging'

String APP_ACTIVITY = '.MainActivity'

String DEVICE_ID = 'Xiaomi|23122PCD1G|a40f4bbb-e7ed-422c-9b42-816267f0c6f0'

int TIMEOUT = 15

// ============================================================
// STEP 1 — START APLIKASI
// ============================================================
Mobile.startExistingApplication(APP_PACKAGE)

Mobile.delay(3)

'Tap Button Lanjutkan Onboarding 1 \r\n'
Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC001_Button_Onboarding01'), 0)

'Tap Button Lanjutkan Onboarding 2\r\n'
Mobile.tapAndHold(findTestObject('COMMERCE/AUTH/Opening_apps/TC001_Button_Onboarding01'), 0, 0)

'Tap Button Lanjutkan Onboarding 3\r\n'
Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC001_Button_Onboarding01'), 0, FailureHandling.STOP_ON_FAILURE)

'Tap Button Lanjutkan Onboarding 4\r\n'
Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC001_Button_Onboarding01'), 0, FailureHandling.STOP_ON_FAILURE)

'Tap Button Lanjutkan Onboarding 5\r\n'
Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC001_Button_Onboarding01'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

'Tap Button Lanjutkan Onboarding 5\r\n'
Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button_Daftar'), 0, FailureHandling.STOP_ON_FAILURE)

