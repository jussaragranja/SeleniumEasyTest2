package br.com.seleniumeasytest.jussara.page.inputforms;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;
import static org.junit.Assert.assertEquals;

/**
 * @author jussaragranja
 * Class represents the page Checkbox Demo from site SeleniumEasy
 */

public class PageCheckboxDemo extends PageBase {

    @FindBy(id = "isAgeSelected")
    private WebElement inputCheckBoxSingle;

    @FindBy(id = "txtAge")
    private WebElement messageCheckedSingle;

    @FindBy(css = "input[value = 'Check All']")
    private WebElement buttonCheckAll;

    @FindBy(css = "input[value = 'Uncheck All']")
    private WebElement buttonUncheckAll;

    public void assertPageCheckBox(){
        assertEquals("Selenium Easy - Checkbox demo for automation using selenium", driver.getTitle());
    }


    public void clickSingleCheckBoxDemo() throws InterruptedException {
        Thread.sleep(1000);
        click(inputCheckBoxSingle);
        Log.info("Click CheckBox single");

    }

    public void assertClickCheckBoxSingle() throws InterruptedException {
        Thread.sleep(2000);
        assertEquals("Success - Check box is checked", messageCheckedSingle.getText());
        Log.info("Validação concluída com sucesso");

    }

    public PageCheckboxDemo clickButtonCheckAll() throws InterruptedException {
        Thread.sleep(1000);
        click(buttonCheckAll);
        Log.info("Click botão CheckAll");

        return this;
    }

    public PageCheckboxDemo clickButtonUncheckAll() throws InterruptedException {
        Thread.sleep(1000);
        click(buttonUncheckAll);
        Log.info("Click botão UncheckAll");

        return this;
    }

    public void assertClickCheckAll() throws InterruptedException {
        Thread.sleep(1500);
        assertEquals("Uncheck All", buttonUncheckAll.getAttribute("value"));
        Log.info("Validação concluída com sucesso");

    }

    public void assertClickUncheckAll() throws InterruptedException {
        Thread.sleep(500);
        assertEquals("Check All", buttonCheckAll.getAttribute("value"));
        Log.info("Validação concluída com sucesso");

    }

}
