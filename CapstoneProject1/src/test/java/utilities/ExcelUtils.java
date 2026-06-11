package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(int row, int col)
            throws Exception {

        FileInputStream fis =
        new FileInputStream(
        "D:/from c drive/Downloads/TestData.xlsx");

        XSSFWorkbook wb =
        new XSSFWorkbook(fis);

        // YOUR EXCEL SHEET NAME
        XSSFSheet sheet =
        wb.getSheet("Sheet1");

        String value =
        sheet.getRow(row)
             .getCell(col)
             .toString();

        wb.close();
        fis.close();

        return value;
    }
}