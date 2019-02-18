import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import java.awt.event.InputEvent as InputEvent
import java.util.Calendar as Calendar
import java.util.GregorianCalendar as GregorianCalendar
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.io.File as File

String hour = findTestData('GoAnywhere').getValue(4, 1)

String Min = findTestData('GoAnywhere').getValue(5, 1)

String HoraExcel = (hour + ':') + Min

String dia = findTestData('GoAnywhere').getValue(7, 1)

String mes = findTestData('GoAnywhere').getValue(8, 1)

String año = findTestData('GoAnywhere').getValue(9, 1)

String ruta = findTestData('GoAnywhere').getValue(3, 1)

String question = findTestData('GoAnywhere').getValue(6, 1)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://10.130.1.184:8001/goanywhere/auth/Login.xhtml')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Login/input_User Name_formPanellogin'), 'proveedor_jbazurto')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Login/input_Password_formPanelloginG'), 'Colombia1+')

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Login/span_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/span_System'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/span_File Manager'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/span_Dawn'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/Diagonal'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/input_Location'), findTestData('GoAnywhere').getValue(
        2, 1))

WebUI.delay(5)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/span_Go'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/span_Upload'))

WebUI.delay(2)

Robot robot = new Robot()

StringSelection selection = new StringSelection(ruta)

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

robot.setAutoDelay(1000)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_V)

robot.setAutoDelay(1000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.mouseMove(360, 300)

robot.setAutoDelay(1000)

robot.mousePress(InputEvent.BUTTON1_MASK)

robot.mouseRelease(InputEvent.BUTTON1_MASK)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_E)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_E)

robot.setAutoDelay(1000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.waitForElementPresent(findTestObject('Page_GoAnywhere 6.0.2 - Upload Files/span_Upload Complete'), 0)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/span_Workflows'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/span_Scheduler'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input_Filter By'), findTestData('GoAnywhere').getValue(
        1, 1))

WebUI.delay(5)

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Desarrollo APP/div_PrimerPion'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Desarrollo APP/span_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/a_Schedule'))

WebUI.delay(2)

String Jan = (((('Jan' + ' ') + dia) + ',') + ' ') + año

String Feb = (((('Feb' + ' ') + dia) + ',') + ' ') + año

String Mar = (((('Mar' + ' ') + dia) + ',') + ' ') + año

String Apr = (((('Apr' + ' ') + dia) + ',') + ' ') + año

String May = (((('May' + ' ') + dia) + ',') + ' ') + año

String Jun = (((('Jun' + ' ') + dia) + ',') + ' ') + año

String Jul = (((('Jul' + ' ') + dia) + ',') + ' ') + año

String Aug = (((('Aug' + ' ') + dia) + ',') + ' ') + año

String Sep = (((('Sep' + ' ') + dia) + ',') + ' ') + año

String Oct = (((('Oct' + ' ') + dia) + ',') + ' ') + año

String Nov = (((('Nov' + ' ') + dia) + ',') + ' ') + año

String Dec = (((('Dec' + ' ') + dia) + ',') + ' ') + año

if (((('enero'.equals(mes) || 'Enero'.equals(mes)) || '1'.equals(mes)) || '01'.equals(mes)) || 'ENERO'.equals(mes)) {
    WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), Jan)
} else {
    if ((('febrero.'.equals(mes) || 'Febrero'.equals(mes)) || '2'.equals(mes)) || '02'.equals(mes)) {
        WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), Feb)
    } else {
        if ('marzo'.equals(mes) || 'Marzo'.equals(mes)) {
            WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), Mar)
        } else {
            if ('abril'.equals(mes) || 'Abril'.equals(mes)) {
                WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), Apr)
            } else {
                if ('mayo'.equals(mes) || 'Mayo'.equals(mes)) {
                    WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), May)
                } else {
                    if ('junio'.equals(mes) || 'Junio'.equals(mes)) {
                        WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), Jun)
                    } else {
                        if ('julio'.equals(mes) || 'Julio'.equals(mes)) {
                            WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), Jul)
                        } else {
                            if ('agosto'.equals(mes) | 'Agosto'.equals(mes)) {
                                WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), Aug)
                            } else {
                                if ('septiembre'.equals(mes) || 'Septiembre'.equals(mes)) {
                                    WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), 
                                        Sep)
                                } else {
                                    if ('octubre'.equals(mes) || 'Octubre'.equals(mes)) {
                                        WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), 
                                            Oct)
                                    } else {
                                        if ('noviembre'.equals(mes) || 'Noviembre'.equals(mes)) {
                                            WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), 
                                                Nov)
                                        } else {
                                            if ('diciembre'.equals(mes) || 'Diciembre'.equals(mes)) {
                                                WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Fecha'), 
                                                    Dec)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/label_Fecha'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/input__Hora'), HoraExcel)

WebUI.delay(2)

WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/span_Save_Schedule'))

if ((((('SI'.equals(question) || 'Si'.equals(question)) || 'si'.equals(question)) || 's'.equals(question)) || 'X'.equals(
    question)) || 'x'.equals(question)) {
    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - Edit Scheduler/span_Workflows'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/span_Completed Jobs'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/span_More Filters'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/span_Project'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/input_Refresh_j_id_84j_id_9a'), findTestData('GoAnywhere').getValue(
            1, 1))

    WebUI.delay(100)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/span_Apply'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/div_Submitted From_gfaces-more'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/span_View Job Details'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/span_View Job Log'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_GoAnywhere 6.0.2 - ValidarLog/span_Download Job Log'))
} else {
    if ((((('NO'.equals(question) || 'No'.equals(question)) || 'no'.equals(question)) || 'n'.equals(question)) || '0'.equals(
        question)) || null.equals(question)) {
        WebUI.delay(5)

        WebUI.closeBrowser()
    } else {
    }
}

