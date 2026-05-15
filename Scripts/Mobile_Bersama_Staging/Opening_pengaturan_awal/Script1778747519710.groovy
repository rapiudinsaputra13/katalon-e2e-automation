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

// ============================================================
//// STEP 2 — VERIFIKASI HALAMAN PENGATURAN AWAL
//// ============================================================
//Mobile.verifyElementExist(findTestObject('PengaturanAwal/txt_judul_pengaturan_awal'), TIMEOUT)
//
//Mobile.verifyElementExist(findTestObject('PengaturanAwal/txt_subtitle_instruksi'), TIMEOUT)
// ============================================================
// STEP 3 — SET BAHASA INDONESIA
// ============================================================
//String selectedLang = Mobile.getText(findTestObject('PengaturanAwal/dropdown_bahasa'), TIMEOUT)
//
//if (!(selectedLang.contains('Indonesia'))) {
//    Mobile.tap(findTestObject('PengaturanAwal/dropdown_bahasa'), TIMEOUT)
//
//    Mobile.delay(1)
//
//    Mobile.tap(findTestObject('PengaturanAwal/option_bahasa_indonesia'), TIMEOUT)
//
//    Mobile.delay(1)
//}
// ============================================================
// STEP 4 — VERIFIKASI SECTION PERSETUJUAN APLIKASI
// ============================================================
Mobile.verifyElementExist(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button - Izinkan2x'), TIMEOUT)

Mobile.verifyElementExist(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button - Izinkan2x'), TIMEOUT)

Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button - Izinkan2x'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC00_Button_Lokasi - Saat aplikasi digunakan'), 0)

Mobile.verifyElementExist(findTestObject('COMMERCE/AUTH/Opening_apps/TC-001_Izinkan_Semua'), TIMEOUT)

Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC-001_Izinkan_Semua'), TIMEOUT)

Mobile.verifyElementExist(findTestObject('COMMERCE/AUTH/Opening_apps/TC002-Button_Saat aplikasi digunakan'), TIMEOUT)

Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC002-Button_Saat aplikasi digunakan'), TIMEOUT)

Mobile.verifyElementExist(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button - Izinkan2x'), TIMEOUT)

Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button - Izinkan2x'), TIMEOUT)

Mobile.delay(3)

'untuk Kontak Perizinan\r\n\r\n'
Mobile.verifyElementExist(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button - Izinkan2x'), TIMEOUT)

Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC003_Button - Izinkan2x'), TIMEOUT)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('COMMERCE/AUTH/Opening_apps/TC004_Button_Lanjutkan'), TIMEOUT)

Mobile.tap(findTestObject('COMMERCE/AUTH/Opening_apps/TC004_Button_Lanjutkan'), TIMEOUT)

