package br.com.seleniumeasytest.jussara.page.table;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageTableSortAndSearch extends PageBase {

    @FindBy(id = "example")
    private WebElement tableTest;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement inputSearch;

    public void search(String search) {
        waitForElement(inputSearch);
        writeInField(inputSearch, search);
    }

    public void printAllLineTable() {
        List<WebElement> table = getTableCompleta(tableTest);

        //printando no console a linha inteira
        for (int i = 1; i < table.size(); i++) {
            Log.info(table.get(i).getText());
        }
    }

    public void printOneColumnOfLineTable() {

        List<List<WebElement>> minhatabela = getTable(tableTest);

        //A tabela em questão conta os titulos das linhas como um tr, por isso a remoção abaixo
        minhatabela.remove(0);

        //printando no console apenas a coluna NOME
        for (List<WebElement> colunas : minhatabela) {
            Log.info("NOME: " + colunas.get(0).getText());
        }
    }

    public void printAllColumnOfLineTable() {

        List<List<WebElement>> minhatabela = getTable(tableTest);

        //A tabela em questão conta os titulos das linhas como um tr, por isso a remoção abaixo
        minhatabela.remove(0);

        //printando no console todas as celulas da linha
        for (List<WebElement> linha : minhatabela) {
            for (WebElement coluna : linha) {
                Log.info("CELULA: " + coluna.getText());
            }

        }
    }
}