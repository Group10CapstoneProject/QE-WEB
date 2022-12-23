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

WebUI.setText(findTestObject('Object Repository/2trainer/Page_AltaGym/input_Email_input input-bordered w-full'), 'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/2trainer/Page_AltaGym/input_Password_input input-bordered w-full'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/2trainer/Page_AltaGym/button_MASUK'))

WebUI.click(findTestObject('Object Repository/2trainer/Page_AltaGym/label_Trainer'))

WebUI.click(findTestObject('Object Repository/2trainer/Page_AltaGym/a_Skills'))

WebUI.verifyElementText(findTestObject('Object Repository/2trainer/Page_AltaGym/h4_Daftar Skill'), 'Daftar Skill')

WebUI.click(findTestObject('Object Repository/2trainer/Page_AltaGym/label_Tambah Skill'))

WebUI.setText(findTestObject('Object Repository/2trainer/Page_AltaGym/input_Deskripsi_name'), 'testttt')

WebUI.setText(findTestObject('Object Repository/2trainer/Page_AltaGym/textarea_Deskripsi_description'), 'iyaa')

WebUI.click(findTestObject('Object Repository/2trainer/Page_AltaGym/button_simpan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/2trainer/Page_AltaGym/div_new trainer skill success created'))

WebUI.closeBrowser()

