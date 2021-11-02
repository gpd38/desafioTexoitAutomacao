package com.texoit.core;

import com.texoit.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static String nomeCenario;
    private static File diretorio;

    public Driver(Browser navegador) {

        switch (navegador) {
            case CHROME:
                startChrome();
                break;
            case FIREFOX:
                startFirefox();
                break;
            case EDGE:
                startEdge();
                break;
            case IE:
                startIE();
                break;
        }

        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    public static void setNomeCenario(String nomeCenario) {
        Driver.nomeCenario = nomeCenario;
    }

    public static void criaDiretorio() {
        String caminho = "src/test/resources/evidencias";
        diretorio = new File(caminho + "/" + getNowDate() + nomeCenario);
        diretorio.mkdir();
    }

    public static void printScreen(String passo) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String caminho = diretorio.getPath() + "/" + getNowDate() + " - " + passo + ".png";
        FileUtils.copyFile(file, new File(caminho));
    }

    public static String getNowDate() {
        String mask = "yyyy-MM-dd_HH-mm-ss";
        DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void visibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void ScrollToElementJavaScript(String deslocamento) {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("window.scrollTo(0, " + deslocamento + ")");
        //executeScript("arguments[0].scrollIntoView(true);",element);
    }

    private void startIE() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
    }

    private void startEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    private void startFirefox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    private void startChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
        chromeOptions.setHeadless(headless);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1280, 720));
    }
}