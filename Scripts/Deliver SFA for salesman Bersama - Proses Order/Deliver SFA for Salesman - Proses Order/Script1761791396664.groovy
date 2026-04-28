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

WebUI.navigateToUrl('https://victory-staging.bersama.co.id/')

WebUI.maximizeWindow()

//WebUI.setText(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/input_Masukkan nomor handphone anda_fnt_ntv_3ea348'), 
//    '081290691757')
WebUI.setText(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/input_Masukkan nomor handphone anda_fnt_ntv_3ea348'), 
    '08986955067')

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/span'))

// Tambah delay 0,5 detik
WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/input_Nomor sudah terdaftar, silahkan masuk_d3f864_5'), 
    'OphxTXElBG4=')

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/div_Nomor sudah terdaftar, silahkan masukka_85e78a'))

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/div'))

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/div_tidak bisa scan silahkan_crs_pointer nt_445d32'))

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/div_Pilih Alasan Tidak Melakukan Scan_fnt_b_ac52c6'))

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/div_Pemilik Sedang Keluar_crs_pointer fnt_b_530e44'))

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/span_1'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/SFA Order Login and Absensi Sales/Page_Victory Tokopintar/span_Ambil Foto Selfie_fnt_wht_a txt_12'))

