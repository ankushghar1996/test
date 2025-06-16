package Com_Utility;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ObjectRepo {

    public static ExtentReports extent;
    public static ExtentTest test;
    public static WebDriver driver;
    public static Object startTest;

    public static ExtentReports initializeReport() {
        String reportFolderPath = System.getProperty("user.dir") + File.separator + "test-output" + File.separator + "Extent_Reports" + File.separator;
        File reportDir = new File(reportFolderPath);
        if (!reportDir.exists()) {
            reportDir.mkdirs();
        }
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportFolderPath + "TestReport.html");
        reporter.config().setDocumentTitle("Test Execution Report");
        reporter.config().setReportName("Automation Test Report For Fosroc_HO");
        reporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Browser Name", "Chrome");
        extent.setSystemInfo("QA Name", "Ankush Gharsle, Aniket Jadhav,");
        extent.setSystemInfo("Environment", "QA Environment");
        return extent;
    }

    public static void startTest(String testName, String testDescription) {
        test = extent.createTest(testName, testDescription);
    }

    
    
    public static void startTestAndLog_1(String testNumber, String testDescription) {
        test = extent.createTest(testNumber, testDescription);
    }

    /*
    public static void startTestAndLog_1_SS(String testNumber, String testDescription) {
        test = extent.createTest(testNumber, testDescription);
        try {
            String encodedScreenshot = takeScreenshot();
            if (encodedScreenshot != null && !encodedScreenshot.isEmpty()) {
                test.info(testDescription + " - Screenshot Captured");
                test.addScreenCaptureFromBase64String(encodedScreenshot);
            } else {
                test.fail("Screenshot could not be captured.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Error while capturing screenshot: " + e.getMessage());
        }
    }
    */
    
    /*
    public static void startTestAndLog_1_SS(String testNumber, String testDescription, Runnable action) {
        // Start the test
        test = extent.createTest(testNumber, testDescription);

        try {
            // Perform the test action
            action.run();
            test.pass(testDescription + " - Step Passed");

            // Capture screenshot only if driver is initialized
            if (driver != null) {
                String encodedScreenshot = takeScreenshot();
                if (encodedScreenshot != null && !encodedScreenshot.isEmpty()) {
                    test.addScreenCaptureFromBase64String(encodedScreenshot, "Screenshot - Passed");
                } else {
                    test.warning("Screenshot could not be captured.");
                }
            } else {
                test.info("Driver not initialized — screenshot skipped.");
            }

        } catch (Exception e) {
            test.fail(testDescription + " - Step Failed: " + e.getMessage());

            // Capture screenshot only if driver is initialized
            if (driver != null) {
                try {
                    String encodedScreenshot = takeScreenshot();
                    if (encodedScreenshot != null && !encodedScreenshot.isEmpty()) {
                        test.addScreenCaptureFromBase64String(encodedScreenshot, "Screenshot - Failed");
                    } else {
                        test.warning("Screenshot could not be captured on failure.");
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                    test.warning("Screenshot capture failed with IOException.");
                }
            } else {
                test.info("Driver not initialized — failure screenshot skipped.");
            }

            throw new RuntimeException(e); // Rethrow to fail the test
        }
    }
    */
    
 // 🔁 NEW METHOD: Flash message support version
    public static void startTestAndLog_1_SS(String testNumber, String testDescription, Runnable action) {
        test = extent.createTest(testNumber, testDescription); // ✅ Same as original

        try {
            test.info(testDescription); // ✅ Log the step

            action.run(); // ✅ Run the user step

            // 🔁 NEW: Flash message check after action
            List<WebElement> flashMessages = driver.findElements(By.xpath("//div[@id='toast-container']"));
            boolean flashFound = false;

            for (WebElement msg : flashMessages) {
                if (msg.isDisplayed()) {
                    String messageText = msg.getText();
                    test.fail("❌ Flash Message Detected: " + messageText); // 🔁 NEW: Log flash failure
                    flashFound = true;

                    // 🔁 NEW: Screenshot for flash error
                    if (driver != null) {
                        try {
                            String screenshot = takeScreenshot();
                            if (screenshot != null && !screenshot.isEmpty()) {
                                test.addScreenCaptureFromBase64String(screenshot, "Screenshot - Flash Error");
                            }
                        } catch (IOException e) {
                            test.warning("Screenshot capture failed: " + e.getMessage());
                        }
                    }
                }
            }

            // 🔁 NEW: Mark pass if no flash
            if (!flashFound) {
                test.pass("✅ " + testDescription);

                if (driver != null) {
                    try {
                        String screenshot = takeScreenshot();
                        if (screenshot != null && !screenshot.isEmpty()) {
                            test.addScreenCaptureFromBase64String(screenshot, "Screenshot - Passed");
                        }
                    } catch (IOException e) {
                        test.warning("Screenshot capture failed: " + e.getMessage());
                    }
                }
            } else {
                // 🔁 NEW: Force test to fail in TestNG if flash was shown
                throw new RuntimeException("Flash error found — test failed.");
            }

        } catch (Exception e) {
            test.fail("❌ Exception in step: " + testDescription + " | " + e.getMessage()); // ✅ Same

            // ✅ Screenshot on exception
            if (driver != null) {
                try {
                    String screenshot = takeScreenshot();
                    if (screenshot != null && !screenshot.isEmpty()) {
                        test.addScreenCaptureFromBase64String(screenshot, "Screenshot - Exception");
                    }
                } catch (IOException ioException) {
                    test.warning("Screenshot capture failed: " + ioException.getMessage());
                }
            }

            throw new RuntimeException(e); // ✅ Keep fail status in TestNG
        }
    }

    

    public static void startTestAndLog_2(String testNumber, String testDescription) {
        test = extent.createTest(testNumber, testDescription);
        test.log(Status.INFO, testDescription);
        
    }

    
    
    public static void AssertTextAndLog(String actualText, String expectedText) throws Exception {
        try {
            Assert.assertEquals(actualText, expectedText);
            test.log(Status.PASS, "| Expected: " + expectedText + " | Actual: " + actualText);
        } catch (AssertionError e) {
            test.fail(" | Expected: " + expectedText + " | Actual: " + actualText);
            String screenshotPath = takeScreenshot();
            test.addScreenCaptureFromPath(screenshotPath);
            throw e;
        }
        
    }
    
    

    public static void logTestResult(String testName, String testDescription, boolean isTestPassed, String additionalInfo) {
        startTest(testName, testDescription);
        if (isTestPassed) {
            test.pass(additionalInfo);
        } else {
            test.fail(additionalInfo);
        }
    }
    
    public static void Headlines_logOnlyDescription(String testDescription) {
        test = extent.createTest(testDescription);
        test.info("📝 " + testDescription);
        System.out.println("🖨️ Logged Only Description: " + testDescription);
    }


    public static void Print_Dynamic_Flash_Massage(WebDriver driver, String xpathLocator, String testNumber_Print_Massage) {
    	
        try {
        	
            test = extent.createTest(testNumber_Print_Massage);
            List<WebElement> errorMessageList = driver.findElements(By.xpath(xpathLocator));
            if (!errorMessageList.isEmpty()) {
                for (WebElement errorMessage : errorMessageList) {
                    if (errorMessage.isDisplayed()) {
                        String errorText = errorMessage.getText();
                        System.out.println("Flash Message Print: " + errorText);
                        System.out.println("Test Case Number: " + testNumber_Print_Massage);
                        test.fail("  Flash Massage: " + errorText);
                        logTestWithScreenshot("Error captured for  " + testNumber_Print_Massage);
                    }
                }
            } else {
                System.out.println("No error message displayed.");
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
            test.fail("An unexpected error occurred: " + e.getMessage());
        }
        
    }
    
    

    public static String takeScreenshot() throws IOException {
        // Ensure the WebDriver is initialized
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }

        // Take screenshot and store it in a temporary file
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Convert the screenshot file to a byte array
        byte[] fileContent = FileUtils.readFileToByteArray(srcFile);

        // Convert the byte array to a Base64 encoded string
        return Base64.getEncoder().encodeToString(fileContent);
    }

    public static void logTestWithScreenshot(String logMessage) {
        try {
            String encodedScreenshot = takeScreenshot();
            if (encodedScreenshot != null && !encodedScreenshot.isEmpty()) {
                test.info(logMessage + " ==>Screenshot Captured");
                test.addScreenCaptureFromBase64String(encodedScreenshot);
            } else {
                test.fail("Screenshot could not be captured.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Error while capturing screenshot: " + e.getMessage());
        }
    }

    public static void finalizeReport() {
        if (extent != null) {
            extent.flush();
        }
        System.out.println("✅ Extent Report flushed successfully...");

        try {
            String reportPath = System.getProperty("user.dir") + "/test-output/Extent_Reports/TestReport.html";
            File reportFile = new File(reportPath);
            if (!reportFile.exists()) {
                System.out.println("❌ Report file not found at: " + reportPath);
                return;
            }
            Thread.sleep(5000);
            Demo_Mail.sendReportEmail();
        } catch (Exception e) {
            System.out.println("❌ Failed to send email: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void finalizeReportAfterClass() {
        finalizeReport();
    }

    public static ExtentReports extentreport() {
        return null;
    }
} 
