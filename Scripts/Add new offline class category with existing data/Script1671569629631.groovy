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

WebUI.setText(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/input_Email_input input-bordered w-full'), 
    'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/input_Password_input input-bordered w-full'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/label_Offline'))

WebUI.click(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/a_Kategori Kelas'))

WebUI.verifyElementText(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/h4_Kategori Kelas Offline'), 
    'Kategori Kelas Offline')

WebUI.click(findTestObject('Object Repository/Add new offline class category/Page_React App/label_Tambah Kategori'))

WebUI.setText(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/input_Deskripsi_name'), 
    'Zumba gym')

WebUI.setText(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/input_Deskripsi_description'), 
    'Ini kategori untuk kelas zumba')

WebUI.click(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/button_simpan'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Add new offline class category with existing data/Page_React App/div_duplicate record'), 
    10)

WebUI.closeBrowser()
