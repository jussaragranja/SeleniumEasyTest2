package br.com.seleniumeasytest.jussara.support;

import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

/**
 * @author jussaragranja
 * Class for set Options Chrome
 */

public class OptionChrome {

    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        /*options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");*/

        //options.addArguments("--incognito");

        //System.setProperty("webdriver.chrome.driver",new File("src/test/resources/driver/linux/chromedriver").getAbsolutePath());
        return options;
    }
}
