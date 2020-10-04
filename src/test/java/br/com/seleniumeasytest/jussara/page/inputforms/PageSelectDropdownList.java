package br.com.seleniumeasytest.jussara.page.inputforms;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;
import static org.junit.Assert.assertEquals;

/**
 * @author jussaragranja
 * Class represents the page Select Dropdown List from site SeleniumEasy
 */

public class PageSelectDropdownList extends PageBase {


    @FindBy(id = "select-demo")
    private WebElement selectDay;

    @FindBy(css = ".selected-value")
    private WebElement messageSelectedValue;

    @FindBy(id = "multi-select")
    private WebElement multiSelectListDemo;

    @FindBy(id = "printMe")
    private WebElement buttonFirstSelected;

    @FindBy(css = "button[value = 'Print First']")
    private WebElement buttonGetAllSelected;

    @FindBy(css = ".getall-selected")
    private WebElement messageOptionsSelected;

    public void assertPageRadioButtons(){
        assertEquals("Selenium Easy Demo - Automate All Scenarios", driver.getTitle());
    }

    public void selectADayListDemo(String day) throws InterruptedException {
        Thread.sleep(1000);
        selectElementByVisibleText(selectDay, day);
        Log.info(day+" selecionado");

    }

    public void assertDaySelected(String day) throws InterruptedException {
        Thread.sleep(1000);
        assertEquals("Day selected :- "+day, messageSelectedValue.getText());
        Log.info("Validação Concluída com sucesso");

    }

    public void selectMultiListDemo(String state) throws InterruptedException {
        Thread.sleep(1000);
        selectElementByVisibleValue(multiSelectListDemo, state);
        Log.info(state+" selecionado");

    }

    public void clickButtonFirstSelected() throws InterruptedException {
        Thread.sleep(1000);
        click(buttonFirstSelected);
        Log.info("click botão FirstSelected");

    }

    public void assertSelectMultiListDemo(String state) throws InterruptedException {
        Thread.sleep(1000);
        assertEquals("First selected option is : "+state, messageOptionsSelected.getText());
        Log.info("Validação Concluída com sucesso");

    }


}
