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

WebUI.navigateToUrl('https://altagym-agillstrz.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/input_Email_input input-bordered w-full'), 
    'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/input_Password_input input-bordered w-full'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/i_Booking_bx bx-sm bx-chevron-down'))

WebUI.click(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/a_Offline'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/h1_DAFTAR BOOKING CLASS'), 
    'DAFTAR BOOKING CLASS')

WebUI.click(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/button_Detail'))

WebUI.click(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/button_Edit'))

WebUI.click(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Edit offline class bookings without changing anything/Page_React App/div_success update offline class booking'))

WebUI.closeBrowser()

