package br.com.seleniumeasytest.jussara.page.table;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static br.com.seleniumeasytest.jussara.support.Driver.driver;
import static org.junit.Assert.assertEquals;

public class PageTableDataSearch extends PageBase {


    @FindBy(id = "task-table-filter")
    private WebElement inputFilterTask;

    @FindBy(xpath = "//*[@id=\"task-table\"]/tbody")
    private List<WebElement> taskTable;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/table/tbody")
    private List<WebElement> tableListedUsers;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-filter']")
    private WebElement buttonFilter;

    @FindBy(xpath = "//input[@placeholder='#']")
    private WebElement filterTextUserId;

    public void assertPageTableDataSearch(){
        assertEquals("Selenium Easy - Table Data search and filter data", driver.getTitle());
    }

    public void filterTask(String task) throws InterruptedException {
        Thread.sleep(1000);
        writeInField(inputFilterTask, task);
        Log.info("Filtrando por task "+task);

    }

    public void assertTableTask(String taskComplete) throws InterruptedException {
        Thread.sleep(1000);
        for(WebElement element: taskTable){
            assertEquals(taskComplete, element.getText());
        }
        Log.info("Validação concluída com sucesso");

    }

    public void clickButtonFilter() throws InterruptedException {
        Thread.sleep(1000);
        click(buttonFilter);
        Log.info("Click botão Filter");

    }

    public void filterUserById(Integer id) throws InterruptedException {
        Thread.sleep(1000);
        writeInField(filterTextUserId, id.toString());
        Log.info("Filtrando Usuário pelo id "+id);

    }

    public void assertTableUsers(String userComplete){

        for(WebElement element: tableListedUsers){
            assertEquals(userComplete, element.getText());
        }
        Log.info("Validação concluída com sucesso");

    }

}
