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

WebUI.setText(findTestObject('Object Repository/Add new member type/Page_React App/input_Email_input input-bordered w-full'), 
    'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Add new member type/Page_React App/input_Password_input input-bordered w-full'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/label_Membership'))

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/a_Jenis Member'))

WebUI.verifyElementText(findTestObject('Object Repository/Add new member type/Page_React App/h4_Jenis Membership'), 'Jenis Membership')

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/i_Tambah Jenis_bx bx-user-plus bx-sm'))

WebUI.setText(findTestObject('Object Repository/Add new member type/Page_React App/input_Fitur Yang ditawarkan_name'), 'Plati')

WebUI.setText(findTestObject('Object Repository/Add new member type/Page_React App/input_Fitur Yang ditawarkan_price'), 
    '50000')

WebUI.setText(findTestObject('Object Repository/Add new member type/Page_React App/input_Fitur Yang ditawarkan_description'), 
    'plati tes')

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/div_Kelas Offline'))

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/input_Fitur Yang ditawarkan_access_offline_class'))

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/input_Kelas Offline_access_online_class'))

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/input_Kelas Online_access_trainer'))

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/input_Trainer_access_gym'))

WebUI.click(findTestObject('Object Repository/Add new member type/Page_React App/button_simpan'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Add new member type/Page_React App/div_new member type success created'), 
    5)

WebUI.closeBrowser()

