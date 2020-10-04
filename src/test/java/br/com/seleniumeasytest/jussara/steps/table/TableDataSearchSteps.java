package br.com.seleniumeasytest.jussara.steps.table;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.table.PageTableDataSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Table Data Search
 */

public class TableDataSearchSteps {

    PageHome homeSeleniumEasy = new PageHome();
    PageTableDataSearch pageTableDataSearch = new PageTableDataSearch();

    @Given("the page Table Data Search is visible")
    public void the_page_table_data_search_is_visible() throws InterruptedException {
        homeSeleniumEasy.acessarTableDataSearch();
        pageTableDataSearch.assertPageTableDataSearch();
    }

    //Tasks

    @When("to filter by task {string}")
    public void to_filter_by_task(String string) throws InterruptedException {
        pageTableDataSearch.filterTask(string);
    }

    @Then("the corresponding task should be displayed {string}")
    public void the_corresponding_task_should_be_displayed(String taskComplete) throws InterruptedException {
        pageTableDataSearch.assertTableTask(taskComplete);
    }

    //Listed Users


    @When("click filter button")
    public void click_filter_button() throws InterruptedException {
        pageTableDataSearch.clickButtonFilter();
    }

    @When("to filter user by id {int}")
    public void to_filter_user_by_id(Integer int1) throws InterruptedException {
        pageTableDataSearch.filterUserById(int1);
    }

    @Then("the corresponding user should be displayed {string}")
    public void the_corresponding_user_should_be_displayed(String string) {
        pageTableDataSearch.assertTableUsers(string);
    }
}
