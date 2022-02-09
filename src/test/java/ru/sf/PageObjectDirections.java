package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class PageObjectDirections {

    private final WebDriver webDriver;

    public PageObjectDirections(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void go(String url) {
        webDriver.get(url);
    }

    public void click_on_the_button_all_courses() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1635084795781']/a"))).click();
       // webDriver.findElement(By.xpath("//div[@data-elem-id='1563736002507']/a")).click();
    }

    public void make_sure_the_page_with_the_title_is_open(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@field='tn_text_1470209944682']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }

    public void click_on_the_button_data_science_on_the_main_page() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1614853390676']/a")).click();
    }

    public void make_sure_the_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='t795__title t-title t-title_xs t-margin_auto']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }

    public void click_on_the_button_programming_on_the_main_page() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1614853390704']/a"))).click();
      //  не знаю почему не работает эта часть кода по xpath находит только один элемент но не кликает хотя по точно такой же логике работало 3 аналогичных теста
    }

    public void make_sure_the_title_is_programming_courses(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='t795__title t-title t-title_xs t-margin_auto']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }

    public void click_on_the_button_data_analytics_on_the_main_page() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1614853390700']/a")).click();
    }

    public void make_sure_the_title_is_data_analytics_courses(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='t795__title t-title t-title_xs t-margin_auto']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }
}





















