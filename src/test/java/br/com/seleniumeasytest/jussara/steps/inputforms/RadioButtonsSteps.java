package br.com.seleniumeasytest.jussara.steps.inputforms;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.inputforms.PageRadioButtons;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Radio Buttons
 */

public class RadioButtonsSteps {

    PageHome homeSeleniumEasy = new PageHome();
    PageRadioButtons pageRadioButtons = new PageRadioButtons();

    @Given("the page Radio Buttons is visible")
    public void the_page_radio_buttons_is_visible() throws InterruptedException {
        homeSeleniumEasy.acessarRadioButtonsDemo();
        pageRadioButtons.assertPageRadioButtons();
    }

    //Radio Button Demo

    @When("click on the radio button {string}")
    public void click_on_the_radio_button(String string) throws InterruptedException {
        pageRadioButtons.clickButtonSex(string);
    }

    @When("click the Get Checked value button")
    public void click_the_get_checked_value_button() throws InterruptedException {
        pageRadioButtons.clickGetCheckedValue();
    }

    @Then("the message with the {string} must be displayed")
    public void the_message_with_the_gender_must_be_displayed(String string) throws InterruptedException {
        pageRadioButtons.assertClickRadioButton(string);
    }

    //not checked

    @Then("the message not checked should be displayed")
    public void the_message_not_checked_should_be_displayed() {
        pageRadioButtons.assertClickGetCheckedValue();
    }

    //Group Radio Buttons Demo

    @When("select gender {string}")
    public void select_gender(String string) {
        pageRadioButtons.clickSexGroupRadioButtons(string);
    }

    @When("select age {string}")
    public void select_age(String string) throws InterruptedException {
        pageRadioButtons.clickAgeGroupRadioButtons(string);
    }

    @When("click Get values button")
    public void click_get_values_button() {
        pageRadioButtons.clickGetValuesGroupButton();
    }

    @Then("the message with the {string} and {string} must be displayed")
    public void the_message_with_the_gender_and_age_must_be_displayed(String string, String string2) throws InterruptedException {
        pageRadioButtons.assertGroupRadioButtons(string, string2);
    }

}
