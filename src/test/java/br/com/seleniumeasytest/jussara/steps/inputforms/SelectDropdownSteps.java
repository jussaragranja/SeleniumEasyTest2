package br.com.seleniumeasytest.jussara.steps.inputforms;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.inputforms.PageSelectDropdownList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Select Dropdown
 */

public class SelectDropdownSteps {

    PageHome homeSeleniumEasy = new PageHome();
    PageSelectDropdownList pageSelectDropdownList = new PageSelectDropdownList();

    @Given("the page Select Dropdown is visible")
    public void the_page_select_dropdown_is_visible() throws InterruptedException {
        homeSeleniumEasy.acessarSelectDropdownList();
        pageSelectDropdownList.assertPageRadioButtons();
    }

    //Single selection

    @When("select the day {string}")
    public void select_the_day(String string) throws InterruptedException {
        pageSelectDropdownList.selectADayListDemo(string);
    }

    @Then("the message with the selected day should be displayed {string}")
    public void the_message_with_the_selected_day_should_be_displayed(String string) throws InterruptedException {
        pageSelectDropdownList.assertDaySelected(string);
    }

    //Multiple selection

    @When("select the state {string}")
    public void select_the_state(String string) throws InterruptedException {
        pageSelectDropdownList.selectMultiListDemo(string);
    }

    @When("click first selected button")
    public void click_first_selected_button() throws InterruptedException {
        pageSelectDropdownList.clickButtonFirstSelected();
    }

    @Then("the message with the selected state should be displayed {string}")
    public void the_message_with_the_selected_state_should_be_displayed(String string) throws InterruptedException {
        pageSelectDropdownList.assertSelectMultiListDemo(string);
    }

}
