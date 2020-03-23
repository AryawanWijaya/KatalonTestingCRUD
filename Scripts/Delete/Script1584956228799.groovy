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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.*
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement


WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/CodeIgniter-3.1.11/index.php/news/')

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//tbody'))

List<WebElement> Row = Table.findElements(By.tagName('tr'))

int RowAwal = Row.size()-1

//println(RowAwal)

WebUI.click(findTestObject('Page_CodeIgniter Tutorial/a_Delete'))

WebUI.acceptAlert()

Thread.sleep(2000)

WebElement Table2 = driver.findElement(By.xpath('//tbody'))

List<WebElement> Row2 = Table2.findElements(By.tagName('tr'))

int RowAkhir = Row2.size()

//println(RowAkhir)

WebUI.verifyEqual(RowAwal, RowAkhir)

WebUI.closeBrowser()

