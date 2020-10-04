package br.com.seleniumeasytest.jussara.page.inputforms;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author jussaragranja
 * Class represents the page Ajax Form Submit from site SeleniumEasy
 */

public class PageAjaxFormSubmit extends PageBase {

    @FindBy(name = "title")
    private WebElement inputName;

    @FindBy(id = "description")
    private WebElement inputComment;

    @FindBy(name = "btn-submit")
    private WebElement buttonSubmit;

    @FindBy(id = "submit-control")
    private WebElement messageSuccessful;

    public void assertPageSimpleForm(){
        assertEquals("Selenium Easy - Ajax Form submit demo for automation", driver.getTitle());
    }

    public void inputName(String name) throws InterruptedException {
        Thread.sleep(1000);
        writeInField(inputName, name);
        Log.info("Nome inserido");

    }

    public void inputComment(String comment){
        writeInField(inputComment, comment);
        Log.info("Comentario inserido");

    }

    public void clickButtonSubmit() throws InterruptedException {
        Thread.sleep(1000);
        click(buttonSubmit);
        Log.info("Click botão submit");

    }

    public void assertMessageSucessful() throws InterruptedException {
        Thread.sleep(1000);
        assertEquals("Form submited Successfully!", messageSuccessful.getText());
        Log.info("Validação de mensagem concluída com sucesso");

    }

    public void validateHiddenButton() throws InterruptedException {
        Thread.sleep(1000);
        assertFalse(isVisibility(buttonSubmit));
        Log.info("Validação Concluída com sucesso - Botão submit está oculto");

    }
}
