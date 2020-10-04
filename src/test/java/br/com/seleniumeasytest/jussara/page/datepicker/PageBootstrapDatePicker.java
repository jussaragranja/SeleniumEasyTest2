package br.com.seleniumeasytest.jussara.page.datepicker;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import br.com.seleniumeasytest.jussara.support.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;
import static org.junit.Assert.assertEquals;

/**
 * @author jussaragranja
 * Class represents the page Bootstrap Date Picker from site SeleniumEasy
 */

public class PageBootstrapDatePicker extends PageBase {

    @FindBy(xpath = "//i[@class='glyphicon glyphicon-th']")
    private WebElement buttonSelectDate;

    @FindBy(xpath = "/html/body/div[3]/div[1]/table/tfoot/tr[1]/th")
    private WebElement todayDate;

    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/input")
    private WebElement date;

    public void assertPageBootstrapDatePickers(){
        assertEquals("Selenium Easy - Best Demo website for Bootstrap Date picker", driver.getTitle());
    }

    public void clickSelectDate() throws InterruptedException {
        Thread.sleep(1000);
        click(buttonSelectDate);
        Log.info("Click selecionar data");

    }

    public void clickTodayDate() throws InterruptedException {
        Thread.sleep(1000);
        click(todayDate);
        Log.info("Data atual selecionada");

    }

    public void assertTodayDate() {
        assertEquals(Utils.getDataAtualFormatddMMyyyy(), date.getAttribute("value"));
        Log.info("Validação concluída com sucesso");

    }
}
