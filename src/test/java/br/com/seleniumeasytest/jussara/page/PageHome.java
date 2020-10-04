package br.com.seleniumeasytest.jussara.page;

import br.com.seleniumeasytest.jussara.support.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author jussaragranja
 * Class represents the page Home from site SeleniumEasy
 */

public class PageHome extends PageBase {

	@FindBy(id = "image-darkener")
	private WebElement alertLearnSelenium;

	@FindBy(xpath = "//a[contains(text(), 'No, thanks!')]")
	private WebElement buttonNoThanks;

	@FindBy(linkText="Input Forms")
	private WebElement inputForms;

	@FindBy(linkText="Simple Form Demo")
	private WebElement simpleFormDemo;

	@FindBy(linkText="Checkbox Demo")
	private WebElement checkBoxDemo;

	@FindBy(linkText="Radio Buttons Demo")
	private WebElement radioButtonsDemo;

	@FindBy(linkText="Select Dropdown List")
	private WebElement selectDropdownList;

	@FindBy(linkText="Input Form Submit")
	private WebElement inputFormSubmit;

	@FindBy(linkText="Ajax Form Submit")
	private WebElement ajaxFormSubmit;

	@FindBy(linkText="JQuery Select dropdown")
	private WebElement jQuerySelectDropdown;

	@FindBy(id="btn_basic_example")
	private WebElement botaoStart;

	@FindBy(linkText="Table")
	private WebElement table;

	@FindBy(linkText = "Table Data Search")
	private WebElement tableDataSearch;

	@FindBy(linkText="Date pickers")
	private WebElement datePickers;

	@FindBy(linkText = "Bootstrap Date Picker")
	private WebElement bootstrapDatePicker;


	public void refuseAlertLearnSelenium(){
		if(isVisibility(alertLearnSelenium)){
			click(buttonNoThanks);
		}
	}

	public void accessSimpleFormDemo() throws InterruptedException {
		Thread.sleep(10000);
		refuseAlertLearnSelenium();
		click(inputForms);
		waitForElement(simpleFormDemo);
		click(simpleFormDemo);
		Log.info("Acessando página SimpleFormDemo");
	}

	public void acessarCheckBoxDemo(){
		refuseAlertLearnSelenium();
		click(inputForms);
		waitForElement(checkBoxDemo);
		click(checkBoxDemo);
		Log.info("Acessando página CheckBoxDemo");
	}

	public void acessarRadioButtonsDemo(){
		refuseAlertLearnSelenium();
		click(inputForms);
		waitForElement(radioButtonsDemo);
		click(radioButtonsDemo);
		Log.info("Acessando página RadioButtonsDemo");
	}

	public void acessarSelectDropdownList(){
		refuseAlertLearnSelenium();
		click(inputForms);
		waitForElement(selectDropdownList);
		click(selectDropdownList);
		Log.info("Acessando página SelectDropdown List");
	}

	public void acessarAjaxFormSubmit(){
		refuseAlertLearnSelenium();
		click(inputForms);
		waitForElement(ajaxFormSubmit);
		click(ajaxFormSubmit);
		Log.info("Acessando página Ajax Form Submit");
	}

	public void acessarTableDataSearch(){
		refuseAlertLearnSelenium();
		click(table);
		waitForElement(tableDataSearch);
		click(tableDataSearch);
	}

	public void acessarBootstrapDatePicker(){
		refuseAlertLearnSelenium();
		click(datePickers);
		waitForElement(bootstrapDatePicker);
		click(bootstrapDatePicker);
	}
}
