package br.com.seleniumeasytest.jussara.page.inputforms;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Conversions;
import br.com.seleniumeasytest.jussara.support.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;
import static org.junit.Assert.assertEquals;


/**
 * @author jussaragranja
 * Class represents the page Simple Form Demo from site SeleniumEasy
 */

public class PageSimpleFormDemo extends PageBase {

	@FindBy(id = "user-message")
	private WebElement inputMsg;

	@FindBy(xpath ="//button[@onclick='showInput();']")
	private WebElement buttonShowMessage;
	
	@FindBy(id = "display")
	private WebElement labelTextoSuaMsg;

	@FindBy(id = "sum1")
	private WebElement inputEnterNumberA;

	@FindBy(id = "sum2")
	private WebElement inputEnterNumberB;

	@FindBy(xpath ="//button[@onclick='return total()']")
	private WebElement buttonGetTotal;

	@FindBy(id = "displayvalue")
	private WebElement labelSum;

	private int sumNumberA;
	private int sumNumberB;

	public void assertPageSimpleForm(){
		assertEquals("Selenium Easy Demo - Simple Form to Automate using Selenium", driver.getTitle());
	}

	public void enterMessage(String texto){
		writeInField(inputMsg, texto);
		Log.info("Preechendo texto");

	}

	public void clickShowMessage() throws InterruptedException {
		Thread.sleep(500);
		click(buttonShowMessage);
		Log.info("Click show message");

	}

	public void assertMessage(String texto) {
		assertEquals(texto, labelTextoSuaMsg.getText());
		Log.info("Validaçao de texto da mensagem concluída com sucesso!");

	}

	public void enterA(int numberA){
		waitForElement(inputEnterNumberA);
		writeInField(inputEnterNumberA, Conversions.intToString(numberA));
		Log.info("Escrevendo Número no campo Enter A");
		sumNumberA = numberA;

	}

	public void enterB(int numberB){
		waitForElement(inputEnterNumberB);
		writeInField(inputEnterNumberB, Conversions.intToString(numberB));
		Log.info("Escrevendo Número no campo Enter B");
		sumNumberB = numberB;

	}

	public void clickGetTotal() throws InterruptedException {
		Thread.sleep(1000);
		click(buttonGetTotal);
		Log.info("Clicando no Botão de Soma");

	}

	public void assertSumEnterAEnterBSucess(){
		waitForElement(labelSum);
		assertEquals(Conversions.intToString(sumNumberA+sumNumberB), labelSum.getText());
		Log.info("Validação de soma concluída com sucesso!");
	}

}
