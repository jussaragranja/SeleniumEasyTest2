package br.com.seleniumeasytest.jussara.steps.inputforms;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.inputforms.PageAjaxFormSubmit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Ajax Form Submit
 */

public class AjaxFormSubmitSteps {

    PageHome homeSeleniumEasy = new PageHome();
    PageAjaxFormSubmit pageAjaxFormSubmit = new PageAjaxFormSubmit();

    @Given("the page Ajax Form Submit is visible")
    public void the_page_ajax_form_submit_is_visible() throws InterruptedException {
        homeSeleniumEasy.acessarAjaxFormSubmit();
        pageAjaxFormSubmit.assertPageSimpleForm();
    }

    @When("filling in the name field {string}")
    public void filling_in_the_name_field(String string) throws InterruptedException {
        pageAjaxFormSubmit.inputName(string);
    }

    @When("filling in the comment field {string}")
    public void filling_in_the_comment_field(String string) {
        pageAjaxFormSubmit.inputComment(string);
    }

    @When("click submit button")
    public void click_submit_button() throws InterruptedException {
        pageAjaxFormSubmit.clickButtonSubmit();
    }

    @Then("success message should be displayed")
    public void success_message_should_be_displayed() throws InterruptedException {
        pageAjaxFormSubmit.assertMessageSucessful();
    }

    @Then("the submit button must be hidden")
    public void the_submit_button_must_be_hidden() throws InterruptedException {
        pageAjaxFormSubmit.validateHiddenButton();
    }
}
