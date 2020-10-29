package br.com.seleniumeasytest.jussara.steps.table;

import br.com.seleniumeasytest.jussara.page.PageHome;
import br.com.seleniumeasytest.jussara.page.table.PageTableSortAndSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author jussaragranja
 * Steps Table Sort And Search
 */

public class TableSortAndSearchSteps {

    PageHome homeSeleniumEasy = new PageHome();
    PageTableSortAndSearch pageTableSortAndSearch = new PageTableSortAndSearch();

    @Given("the page Table Sort And Search is visible")
    public void the_page_table_sort_and_search_is_visible() throws InterruptedException {
        homeSeleniumEasy.acessarTableSortAndSearch();
    }

    @When("search for {string}")
    public void search_for_string(String string) {
        pageTableSortAndSearch.search(string);
    }

    @Then("print all line table")
    public void print_all_line_table() {
        pageTableSortAndSearch.printAllLineTable();
    }

    @Then("print one column of table line")
    public void print_one_column_of_table_line() {
        pageTableSortAndSearch.printOneColumnOfLineTable();
    }

    @Then("print all column of table line")
    public void print_all_column_of_table_line() {
        pageTableSortAndSearch.printAllColumnOfLineTable();
    }
}
