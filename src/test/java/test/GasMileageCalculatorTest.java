package test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GasMileageCalculatorPage;
import utilities.Config;
import utilities.Driver;

import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

//public class GasMileageCalculatorTest {
//
//    GasMileageCalculatorPage gasObj;
//
//        private WebDriver driver;
//
//        XSSFWorkbook workbook;
//        XSSFSheet worksheet;
//        FileInputStream  inputStream = new FileInputStream();
//        FileOutputStream outputStream;
//
//
//        @Before
//        public void setUp() throws  Exception{
//
//            driver = Driver.getDriver();
//           driver.get("https://www.calculator.net/gas-mileage-calculator.html");
//
//            inputStream= new FileInputStream(Config.getProperty("gasmileage"));
//            workbook = new XSSFWorkbook(inputStream);
//            worksheet = workbook.getSheet( "chicago");
//
//
//        }
//
//        @Test
//        public void dataDrivenMileageCalculatorTest() throws  Exception{
//
//            gasObj = new GasMileageCalculatorPage();
//
//            for(int rowNum=1; rowNum<worksheet.getPhysicalNumberOfRows(); rowNum++) {
//
//                XSSFRow currentRow = worksheet.getRow(rowNum);
//
//                //double currentOdo = 123000;
//                double currentOdo = currentRow.getCell(1).getNumericCellValue();
//                gasObj.currentOdometerReadingInput.clear();
//                gasObj.currentOdometerReadingInput.sendKeys(String.valueOf(currentOdo));
//
//
//                //double previousOdo = 122000;
//                double previousOdo = currentRow.getCell(2).getNumericCellValue();
//                gasObj.previousOdometerReadingInput.clear();
//                gasObj.previousOdometerReadingInput.sendKeys(String.valueOf(previousOdo));
//
//
//                //double gas = 70;
//                double gas= currentRow.getCell(3).getNumericCellValue();
//                gasObj.gasInput.clear();
//                gasObj.gasInput.sendKeys(String.valueOf(gas));
//
//                gasObj.calculateButton.click();
//
//                double expectedResult = (currentOdo - previousOdo) / gas;
//                System.out.println("Expected result: " + expectedResult);
//
//
//                String[] actualResult = gasObj.resultInGallon.getText().split(" ");
//                System.out.println("Actual result: " + actualResult[0].toString());
//
//                DecimalFormat decimalFormat = new DecimalFormat("#0.00");
//
//                System.out.println("Fomulated result: " + decimalFormat.format(expectedResult));
//
//                if(currentRow.getCell(4) == null) {
//                    currentRow.createCell(4);
//                }
//
//                currentRow.getCell(4).setCellValue(decimalFormat.format(expectedResult));
//
//                if(currentRow.getCell(5) == null) {
//
//                    currentRow.createCell(5);
//
//                }
//
//                currentRow.getCell(5).setCellValue(actualResult[0]);
//
//
//                if (String.valueOf(decimalFormat.format(expectedResult)).equals(actualResult[0])) {
//                    System.out.println("PASS");
//                } else {
//                    System.out.println("FAIL");
//                }
//
//            }
//
//            outputStream = new FileOutputStream(Config.getProperty("gasmileage.testdata.path"));
//            workbook.write(outputStream);
//            workbook.close();
//            outputStream.close();
//            inputStream.close();
//
//        }
//    }
//
