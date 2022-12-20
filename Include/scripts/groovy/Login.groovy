import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Login {
	@Given("I want to write a step with login")
	def I_want_to_write_a_step_with_login() {
		WebUI.openBrowser('')
		
		int x = findTestData('Login').getRowNumbers()
		
		for (int i = 1; i <= x; i++) {
			WebUI.navigateToUrl('https://altagym-agillstrz.vercel.app/login')
			WebUI.setText(findTestObject('Object Repository/login/input_Email_input input-bordered w-full'), findTestData(
				'Login').getValue(1, i))
	
		WebUI.setText(findTestObject('Object Repository/login/input_Password_input input-bordered w-full'), findTestData(
				'Login').getValue(2, i))
	
		if (i==9) {
			WebUI.click(findTestObject('Object Repository/login/input'))
		}
	
		WebUI.click(findTestObject('Object Repository/login/button_MASUK'))
	}
	}

	@When("I input email")
	def I_input_email() {
	}

	@And ("I input password")
	def I_input_password() {
	}

	@And ("I check the remember me")
	def I_check_the_remember_me() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/login/img_hola_w-32'), 0)
	}

	@Then("I can login")
	def I_can_login() {
		WebUI.closeBrowser()
	}
}