package br.com.seleniumeasytest.jussara.steps.inputforms;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.inputforms.PageSimpleFormDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Simple Form
 */

public class SimpleFormSteps {

    PageSimpleFormDemo pageSimpleFormDemo = new PageSimpleFormDemo();
    PageHome homeSeleniumEasy = new PageHome();

    @Given("the page Simple Form is visible")
    public void the_page_Simple_Form_is_visible() throws InterruptedException {
        homeSeleniumEasy.accessSimpleFormDemo();
        pageSimpleFormDemo.assertPageSimpleForm();
    }

    //Single Input Field

    @When("that the {string} was entered in the entry field")
    public void that_the_was_entered_in_the_entry_field(String string) {
        pageSimpleFormDemo.enterMessage(string);
    }

    @When("click the Show message button")
    public void click_the_show_message_button() throws InterruptedException {
        pageSimpleFormDemo.clickShowMessage();
    }

    @Then("it should be displayed Your Message: {string}")
    public void it_should_be_displayed_your_message(String string) {
        pageSimpleFormDemo.assertMessage(string);
    }

    //Two Input Fields

    @When("filling in field A with the value {int}")
    public void filling_in_field_a_with_the_value(Integer valueA) {
        pageSimpleFormDemo.enterA(valueA);
    }

    @When("filling in field B with the {int} value")
    public void filling_in_field_b_with_the_value(Integer valueB) {
        pageSimpleFormDemo.enterB(valueB);
    }

    @When("click the Get Total button")
    public void click_the_get_total_button() throws InterruptedException {
        pageSimpleFormDemo.clickGetTotal();
    }

    @Then("it should be displayed Total")
    public void it_should_be_displayed_total_a_b() {
        pageSimpleFormDemo.assertSumEnterAEnterBSucess();
    }

}
