package br.com.seleniumeasytest.jussara.page.inputforms;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;
import static org.junit.Assert.assertEquals;

/**
 * @author jussaragranja
 * Class represents the page Radio Buttons Demo from site SeleniumEasy
 */

public class PageRadioButtons extends PageBase {
    
    @FindBy(css = "input[value = 'Male']")
    private WebElement inputRadioButtonMale;

    @FindBy(css = "input[value = 'Female']")
    private WebElement inputRadioButtonFemale;

    @FindBy(id = "buttoncheck")
    private WebElement buttonGetCheckedValue;

    @FindBy(css = ".radiobutton")
    private WebElement messageRadioButtonChecked;

    @FindBy(css = "input[value = '0 - 5']")
    private WebElement inputRadioButtonAge0to5;

    @FindBy(css = "input[value = '5 - 15']")
    private WebElement inputRadioButtonAge5to15;

    @FindBy(css = "input[value = '15 - 50']")
    private WebElement inputRadioButtonAge15to50;

    @FindBy(xpath = "//button[text()='Get values']")
    private WebElement buttonGetValuesGroup;

    @FindBy(xpath = "//p[@class='groupradiobutton']")
    private WebElement messageValuesGroupRadioButtons;

    public void assertPageRadioButtons(){
        assertEquals("Selenium Easy Demo - Radio buttons demo for Automation", driver.getTitle());
    }

    public void clickButtonSex(String sex) throws InterruptedException {
        WebElement buttonSex = driver.findElement(By.cssSelector("input[value = '"+sex+"']"));
        Thread.sleep(1000);
        Log.info("Aguardando aparecer radio button "+sex);
        waitForElement(buttonSex);
        click(buttonSex);
        Log.info("Click Button Sex "+sex);
    }

    public void clickGetCheckedValue() throws InterruptedException {
        Thread.sleep(500);
        waitForElement(buttonGetCheckedValue);
        click(buttonGetCheckedValue);
        Log.info("Click Button Get Checked Value");
    }

    public void assertClickRadioButton(String sex) throws InterruptedException {
        waitForElement(messageRadioButtonChecked);
        Assert.assertEquals("Radio button '"+sex+"' is checked", messageRadioButtonChecked.getText());
        Log.info("Validação Concluída com sucesso");
    }

    public void assertClickGetCheckedValue(){
        waitForElement(messageRadioButtonChecked);
        Assert.assertEquals("Radio button is Not checked", messageRadioButtonChecked.getText());
        Log.info("Validação Concluída com sucesso");
    }

    public void clickSexGroupRadioButtons(String gender){
        waitForElement(driver.findElement(By.xpath("//input[@value='"+gender+"'][@name='gender']")));
        driver.findElement(By.xpath("//input[@value='"+gender+"'][@name='gender']")).click();
        Log.info("Sexo "+gender+" selecionado");

    }

    public PageRadioButtons clickAgeGroupRadioButtons(String age) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[value = '"+age+"']")).click();
        Log.info("Idade "+age+" selecionada");

        return this;
    }

    public void clickGetValuesGroupButton(){
        click(buttonGetValuesGroup);
        Log.info("Click botão GetValues");

    }

    public void assertGroupRadioButtons(String sex, String age) throws InterruptedException {
        waitForElement(messageValuesGroupRadioButtons);
        Assert.assertEquals("Sex : "+sex+"\nAge group: "+age, messageValuesGroupRadioButtons.getText());
        Log.info("Validação Concluída com sucesso");

    }
}
