import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dashboard.samasamaapp.com/')

//tunggu sampai field muncul
WebUI.waitForElementVisible(findTestObject('Smart Wholesaler/Click Button Username'), 10)

// klik kolom username
WebUI.click(findTestObject('Smart Wholesaler/Click Button Username'))

// isi nomor HP
WebUI.setText(findTestObject('Smart Wholesaler/Click Button Username'), '085321034886')

// input password
WebUI.waitForElementVisible(findTestObject('Smart Wholesaler/Click Button Password'), 10)

WebUI.click(findTestObject('Smart Wholesaler/Click Button Password'))

WebUI.setText(findTestObject('Smart Wholesaler/Click Button Password'), 'Garuda01')

// pause untuk isi captcha manual
WebUI.comment('Silakan isi captcha manual')

WebUI.delay(20 // waktu isi captcha
    )

WebUI.click(findTestObject('Smart Wholesaler/Click Button Login'))

