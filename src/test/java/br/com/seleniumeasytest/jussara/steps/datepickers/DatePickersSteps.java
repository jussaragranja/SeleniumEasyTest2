package br.com.seleniumeasytest.jussara.steps.datepickers;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.datepicker.PageBootstrapDatePicker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Date Pickers
 */

public class DatePickersSteps {

    PageHome homeSeleniumEasy = new PageHome();
    PageBootstrapDatePicker pageBootstrapDatePicker = new PageBootstrapDatePicker();

    @Given("the page Date Pickers is visible")
    public void the_page_date_pickers_is_visible() {
        homeSeleniumEasy.acessarBootstrapDatePicker();
        pageBootstrapDatePicker.assertPageBootstrapDatePickers();
    }

    @When("click to select the date")
    public void click_to_select_the_date() throws InterruptedException {
        pageBootstrapDatePicker.clickSelectDate();
    }

    @When("click the Today button")
    public void click_the_today_button() throws InterruptedException {
        pageBootstrapDatePicker.clickTodayDate();
    }

    @Then("the current date must be selected")
    public void the_current_date_must_be_selected() {
        pageBootstrapDatePicker.assertTodayDate();
    }

}
