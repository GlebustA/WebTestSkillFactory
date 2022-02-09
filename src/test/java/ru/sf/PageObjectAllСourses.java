package ru.sf;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class PageObjectAllСourses {

    private final WebDriver webDriver;

    public PageObjectAllСourses(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void assert_that_button_present_profession_java_developer() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629985369359']/a")).click();
        String expectedResult = "Java-разработчик";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1574084285922']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_qa_java_engineer() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629985163775']/a")).click();
        String expectedResult = "Профессия Тестировщик на Java";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1619783883087']/div"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_python_developer() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629983754922']/a")).click();
        String expectedResult = "Python-разработчик";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1584968372208']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_tester_automator() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629983972128']/a")).click();
        String expectedResult = "Тестировщик на Python";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1574084285922']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_data_scientist() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1619610331224']/a")).click();
        String expectedResult = "Data Scientist";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1584968372208']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_course_data_science() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629983663779']/a")).click();
        String expectedResult = "Полный курс по Data Science";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1588174360783']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_data_analytics() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629983701186']/a")).click();
        String expectedResult = "Аналитик Данных";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1606643379558']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_course_data_analytics() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629983908119']/a")).click();
        String expectedResult = "Полный курс по анализу данных";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1606643359587']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_fullstack_python_developer() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1637657901001']/a")).click();
        String expectedResult = "Fullstack-разработчик на Python";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1584968372208']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_web_developer() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629985163770']/a")).click();
        String expectedResult = "Веб-разработчик с нуля";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1574084285922']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_developer_on_unity() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629985163763']/a")).click();
        String expectedResult = "Разработчик игр на Unity";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1626348777326']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }


    public void assert_that_button_present_profession_manual_testing_engineer() {
        webDriver.findElement(By.xpath("//div[@data-elem-id='1629985369351']/a")).click();
        String expectedResult = "Инженер по ручному тестированию";
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-elem-id='1625214265435']/h1"))).getText();
        assertEquals(expectedResult, actualResult);
    }
}
