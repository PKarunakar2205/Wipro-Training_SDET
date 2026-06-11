package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ExcelUtils;

public class AutomationPracticeTest extends BaseTest {

    @Test(priority = 1)
    public void GUIElements() throws Exception {

        String name =
        ExcelUtils.getCellData(1,0);

        String email =
        ExcelUtils.getCellData(1,1);

        String mobile =
        ExcelUtils.getCellData(1,2);

        String address =
        ExcelUtils.getCellData(1,3);

        System.out.println(name);
        System.out.println(email);
        System.out.println(mobile);
        System.out.println(address);

        p.enterName(name);
        p.enterEmail(email);
        p.enterPhone(mobile);
        p.enterAddress(address);

        p.selectRadioAndCheckbox();
        p.selectCountry();
        p.selectColors();
        p.selectAnimals();
    }

    @Test(priority = 2)
    public void Upload() {

        p.uploadSingleFile(
        "D:/from c drive/Downloads/TestData.xlsx");
    }

    @Test(priority = 3)
    public void Alerts() {

        p.handleAlerts();
    }

    @Test(priority = 4)
    public void Window() {

        p.newtab();
    }

    @Test(priority = 5)
    public void MouseActions() {

        p.mouseHover();
        p.doubleClick();
        p.dragDrop();
    }

    @Test(priority = 6)
    public void Slider() {

        p.slider();
    }
}