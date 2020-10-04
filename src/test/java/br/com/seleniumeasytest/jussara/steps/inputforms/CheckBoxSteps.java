package br.com.seleniumeasytest.jussara.steps.inputforms;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.inputforms.PageCheckboxDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Check Box
 */

public class CheckBoxSteps {

    PageHome homeSeleniumEasy = new PageHome();
    PageCheckboxDemo pageCheckboxDemo = new PageCheckboxDemo();


    @Given("the page CheckBox is visible")
    public void the_page_check_box_is_visible() throws InterruptedException {
        homeSeleniumEasy.acessarCheckBoxDemo();
        pageCheckboxDemo.assertPageCheckBox();
    }

    //Single Checkbox Demo

    @When("click on the single CheckBox")
    public void click_on_the_single_check_box() throws InterruptedException {
        pageCheckboxDemo.clickSingleCheckBoxDemo();
    }

    @Then("the success message should be displayed")
    public void the_success_message_should_be_displayed() throws InterruptedException {
        pageCheckboxDemo.assertClickCheckBoxSingle();
    }

    //Multiple Checkbox Demo
    //Validate CheckAll

    @When("click on the CheckAll button")
    public void click_on_the_check_all_button() throws InterruptedException {
        pageCheckboxDemo.clickButtonCheckAll();
    }

    @Then("all CheckBox must be selected")
    public void all_check_box_must_be_selected() throws InterruptedException {
        pageCheckboxDemo.assertClickCheckAll();
    }

    //Validate UncheckAll

    @When("click on the UnCheckAll button")
    public void click_on_the_uncheck_all_button() throws InterruptedException {
        pageCheckboxDemo.clickButtonCheckAll().clickButtonUncheckAll();
    }

    @Then("no CheckBox must be selected")
    public void no_check_box_must_be_selected() throws InterruptedException {
        pageCheckboxDemo.assertClickUncheckAll();
    }

}
