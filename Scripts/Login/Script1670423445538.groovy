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

int x = findTestData('Login').getRowNumbers()

for (i = 1; i <= x; i++) {
    WebUI.navigateToUrl('https://altagym-agillstrz.vercel.app/login')

    WebUI.verifyElementPresent(findTestObject('login/icon altagym'), 0)

    WebUI.setText(findTestObject('Object Repository/login/input_Email_input input-bordered w-full'), findTestData(
            'Login').getValue(1, i))

    WebUI.setText(findTestObject('Object Repository/login/input_Password_input input-bordered w-full'), findTestData(
            'Login').getValue(2, i))

    if (i==9) {
        WebUI.click(findTestObject('Object Repository/login/input'))
    }
    
    WebUI.click(findTestObject('Object Repository/login/button_MASUK'))
}

WebUI.verifyElementPresent(findTestObject('Object Repository/login/img_hola_w-32'), 0)

WebUI.closeBrowser()

