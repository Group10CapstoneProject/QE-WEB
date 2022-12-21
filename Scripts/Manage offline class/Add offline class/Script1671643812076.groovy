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

WebUI.navigateToUrl('https://altagym-agillstrz.vercel.app/')

WebUI.setText(findTestObject('Object Repository/Add offline class/Page_React App/input_Email_input input-bordered w-full'), 
    'superadmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Add offline class/Page_React App/input_Password_input input-bordered w-full'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Add offline class/Page_React App/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Add offline class/Page_React App/label_Offline'))

WebUI.click(findTestObject('Object Repository/Add offline class/Page_React App/a_Kelas offline'))

WebUI.verifyElementText(findTestObject('Object Repository/Add offline class/Page_React App/h4_Kelas Offline'), 'Kelas Offline')

WebUI.click(findTestObject('Object Repository/Add offline class/Page_React App/a_Tambah Kelas'))

WebUI.setText(findTestObject('Object Repository/Add offline class/Page_React App/input_Nama Kelas_title'), 'Zumba gym')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add offline class/Page_React App/select_Plih TraineragilJunaWahyu'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Add offline class/Page_React App/input_Slot_slot'), '5')

WebUI.setText(findTestObject('Object Repository/Add offline class/Page_React App/input_Durasi_duration'), '50')

WebUI.setText(findTestObject('Object Repository/Add offline class/Page_React App/input_Harga_price'), '100000')

WebUI.setText(findTestObject('Object Repository/Add offline class/Page_React App/input_Lokasi_location'), 'Alta Gym, Surabaya')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add offline class/Page_React App/select_Pilih kategoriZumbaaZumba gymMuay Th_d3cc09'), 
    '283', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add offline class/Page_React App/select_Pilih kategoriZumbaaZumba gymMuay Th_d3cc09'), 
    '238', true)

WebUI.setText(findTestObject('Object Repository/Add offline class/Page_React App/textarea_Deskripsi_description'), 'Ini kelas zumba')

WebUI.click(findTestObject('Object Repository/Add offline class/Page_React App/button_Simpan'))

WebUI.closeBrowser()

