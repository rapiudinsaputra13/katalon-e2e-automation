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

Mobile.startExistingApplication('lpi.samasama')

Mobile.tap(findTestObject('SamaSama_apps/Food_Icon'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SamaSama_apps/Product_C2_apple_SOLO'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SamaSama_apps/Add_To_Cart'), 0)

Mobile.tap(findTestObject('SamaSama_apps/Product_coke_290ML'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('SamaSama_apps/BuyButton'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('SamaSama_apps/Button_Payment'), 0, 0)

int deviceHeight = Mobile.getDeviceHeight()

int deviceWidth = Mobile.getDeviceWidth()

int startX = deviceWidth / 2

int startY = deviceHeight * 0.8 // Mulai dari bawah (80% layar)

int endY = deviceHeight * 0.2 // Tarik ke atas (20% layar)

// Lakukan swipe 2 \kali untuk memastikan sampai ke bawah
for (int i = 0; i < 3; i++) {
    Mobile.swipe(startX, startY, startX, endY)

    Mobile.delay(1 // Beri jeda agar render Flutter selesai
        )
}

Mobile.tap(findTestObject('SamaSama_apps/Select Payment Button'), 0)

Mobile.tap(findTestObject('SamaSama_apps/Payment Button 2'), 0)

Mobile.tap(findTestObject('SamaSama_apps/Tap Enter PIN Set Teks'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('SamaSama_apps/Tap Enter PIN Set Teks'), '320510', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('SamaSama_apps/Confirmation_Pin'), 0)

Mobile.comment('start 28-04-2026')

