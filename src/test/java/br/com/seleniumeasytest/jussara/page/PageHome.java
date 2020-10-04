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

	public void accessInputForms() throws InterruptedException {
		refuseAlertLearnSelenium();
		Thread.sleep(2000);
		waitForElement(inputForms);
		click(inputForms);
	}

	public void accessTable() throws InterruptedException {
		Thread.sleep(1000);
		refuseAlertLearnSelenium();
		waitForElement(table);
		click(table);
	}

	public void accessDatePickers() throws InterruptedException {
		Thread.sleep(1000);
		refuseAlertLearnSelenium();
		waitForElement(datePickers);
		click(datePickers);
	}

	public void refuseAlertLearnSelenium() throws InterruptedException {
		Thread.sleep(10000);
		if(isVisibility(alertLearnSelenium)){
			click(buttonNoThanks);
		}
	}

	public void accessSimpleFormDemo() throws InterruptedException {
		accessInputForms();
		waitForElement(simpleFormDemo);
		click(simpleFormDemo);
		Log.info("Acessando página SimpleFormDemo");
	}

	public void acessarCheckBoxDemo() throws InterruptedException {
		accessInputForms();
		Thread.sleep(1000);
		click(checkBoxDemo);
		Log.info("Acessando página CheckBoxDemo");
	}

	public void acessarRadioButtonsDemo() throws InterruptedException {
		accessInputForms();
		waitForElement(radioButtonsDemo);
		click(radioButtonsDemo);
		Log.info("Acessando página RadioButtonsDemo");
	}

	public void acessarSelectDropdownList() throws InterruptedException {
		accessInputForms();
		waitForElement(selectDropdownList);
		click(selectDropdownList);
		Log.info("Acessando página SelectDropdown List");
	}

	public void acessarAjaxFormSubmit() throws InterruptedException {
		accessInputForms();
		waitForElement(ajaxFormSubmit);
		click(ajaxFormSubmit);
		Log.info("Acessando página Ajax Form Submit");
	}

	public void acessarTableDataSearch() throws InterruptedException {
		accessTable();
		waitForElement(tableDataSearch);
		click(tableDataSearch);
	}

	public void acessarBootstrapDatePicker() throws InterruptedException {
		accessDatePickers();
		waitForElement(bootstrapDatePicker);
		click(bootstrapDatePicker);
	}
}
