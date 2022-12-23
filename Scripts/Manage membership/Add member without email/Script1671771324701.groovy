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

WebUI.setText(findTestObject('Object Repository/1member/Page_React App/input_Email_input input-bordered w-full'), 'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/1member/Page_React App/input_Password_input input-bordered w-full'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/1member/Page_React App/button_MASUK'))

WebUI.click(findTestObject('Object Repository/1member/Page_React App/span_Membership'))

WebUI.click(findTestObject('Object Repository/1member/Page_React App/a_Kelola Member'))

WebUI.verifyElementText(findTestObject('Object Repository/1member/Page_React App/h4_Kelola Member'), 'Kelola Member')

WebUI.click(findTestObject('Object Repository/1member/Page_React App/label_Tambah member'))

WebUI.selectOptionByValue(findTestObject('Object Repository/1member/Page_React App/select_pilih tipe memberPlatinumBronzeSilverGold'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/1member/Page_React App/input_total_duration'), '2')

WebUI.setText(findTestObject('Object Repository/1member/Page_React App/input_total_total'), '50000')

WebUI.click(findTestObject('Object Repository/1member/Page_React App/button_Tambah'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1member/Page_React App/div_Email is required'))

WebUI.closeBrowser()

