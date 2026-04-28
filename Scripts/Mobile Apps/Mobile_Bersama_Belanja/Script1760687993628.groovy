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

Mobile.tap(findTestObject('Project_Mobile_Tahap2/Tap - Belanja'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1a.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Project_Mobile_Tahap2/Tap - GROSIR PINTAR DAAN MOGOT'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1b.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Project_Mobile_Tahap2/Tap - Lanjutkan'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1c.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Project_Mobile_Tahap2/Klik - Beli'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1e.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Project_Mobile_Tahap2/android.widget.TextView -'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1f.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Project_Mobile_Tahap2/Tap - Beli'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1g.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Project_Mobile_Tahap2/Klik - Bayar'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1h.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Project_Mobile_Tahap2/LANJUT PEMBAYARAN'), 0)

Mobile.takeScreenshot('D:\\ss mobile\\Login1i.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication(FailureHandling.STOP_ON_FAILURE)


