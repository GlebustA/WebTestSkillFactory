package ru.sf;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class PageObjectTab {

    private final WebDriver webDriver;

    public PageObjectTab(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void click_on_the_tab_no_code() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-tab-rec-ids='372523289']"))).click();
    }


    public void assert_that_a_course_on_creating_sites_without_code_is_present_in_the_tab_without_code(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@field='st_title__482765228281']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }


    public void assert_that_a_course_mobile_application_without_code_is_present_in_the_tab_without_code(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@field='st_title__731963007361']"))).getText();
        assertEquals(expectedTitle, actualTitle);

    }


    public void click_on_the_tab_marketing() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-tab-rec-ids='372518106']"))).click();
    }


    public void assert_that_a_course_internet_marketer_is_present_in_the_marketing_tab(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@field='st_title__676224715481']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }


    public void assert_that_a_course_targetologist_is_present_in_the_tab_marketing(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@field='st_title__205117461691']"))).getText();
        assertEquals(expectedTitle, actualTitle);

    }
    
    
    public void click_on_the_tab_design() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-tab-rec-ids='396372826,396382614,372517798']"))).click();
    }


    public void assert_that_a_course_ux_ui_designer_from_scratch_to_pro_is_present_in_the_tab_design(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@field='st_title__931572920051']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }


    public void assert_that_a_course_graphic_designer_from_scratch_to_pro_is_present_in_the_tab_design(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@field='st_title__234799977111']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }


    public void assert_that_a_course_motion_designer_from_scratch_to_pro_is_present_in_the_tab_design(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        final var actualTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@field='st_title__825744425001']"))).getText();
        assertEquals(expectedTitle, actualTitle);
    }
}
