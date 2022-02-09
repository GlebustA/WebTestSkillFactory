package ru.sf;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinitions {



    public static final WebDriver webDriver;
    public static final PageObjectDirections pageObjectDirections;
    public static final PageObjectAllСourses pageObjectCourses;
    public static final PageObjectTab pageObjectTab;

    static {
        System.setProperty("webdriver.chrome.driver", "D:\\CucumberTestSkillFactory\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        pageObjectDirections = new PageObjectDirections(webDriver);
        pageObjectCourses = new PageObjectAllСourses(webDriver);
        pageObjectTab = new PageObjectTab(webDriver);
        webDriver.manage().window().maximize();
    }


    // Тесты кнопок направлений обучения


    @Given("url of site SkillFactory {string}")
    public void url_of_site_skill_factory(String url) {
        webDriver.get(url);
    }

    @Then("click on the button all courses")
    public void click_on_the_button_all_courses() {
        pageObjectDirections.click_on_the_button_all_courses();
    }

    @Then("make sure the page with the title is open {string}")
    public void make_sure_the_page_with_the_title_is_open(String expectedTitle) {
        pageObjectDirections.make_sure_the_page_with_the_title_is_open(expectedTitle);
    }

    @Then("click on the button Data Science on the main page")
    public void click_on_the_button_data_science_on_the_main_page() {
        pageObjectDirections.click_on_the_button_data_science_on_the_main_page();
    }

    @Then("make sure the title {string}")
    public void make_sure_the_title(String expectedTitle) {
        pageObjectDirections.make_sure_the_title(expectedTitle);
    }

    @Then("click on the button Programming on the main page")
    public void click_on_the_button_programming_on_the_main_page() {
        pageObjectDirections.click_on_the_button_programming_on_the_main_page();
        //  не знаю почему не работает эта часть кода по xpath находит только один элемент но не кликает хотя по точно такой же логике работало 3 аналогичных теста
    }

    @Then("make sure the title is programming courses {string}")
    public void make_sure_the_title_is_programming_courses(String expectedTitle) {
        pageObjectDirections.make_sure_the_title_is_programming_courses(expectedTitle);
    }

    @Then("click on the button Data Analytics on the main page")
    public void click_on_the_button_data_analytics_on_the_main_page() {
        pageObjectDirections.click_on_the_button_data_analytics_on_the_main_page();
    }

    @Then("make sure the title is Data Analytics Courses {string}")
    public void make_sure_the_title_is_data_analytics_courses(String expectedTitle) {
        pageObjectDirections.make_sure_the_title_is_data_analytics_courses(expectedTitle);
    }


// Ниже тесты всех кнопок курсов


    @Then("assert that button present profession java developer")
    public void assert_that_button_present_profession_java_developer() {
        pageObjectCourses.assert_that_button_present_profession_java_developer();
    }

    @Then("assert that button present profession QA java engineer")
    public void assert_that_button_present_profession_qa_java_engineer() {
        pageObjectCourses.assert_that_button_present_profession_qa_java_engineer();
    }

    @Then("assert that button present profession python developer")
    public void assert_that_button_present_profession_python_developer() {
        pageObjectCourses.assert_that_button_present_profession_python_developer();
    }

    @Then("assert that button present profession tester automator")
    public void assert_that_button_present_profession_tester_automator() {
        pageObjectCourses.assert_that_button_present_profession_tester_automator();
    }

    @Then("assert that button present profession data scientist")
    public void assert_that_button_present_profession_data_scientist() {
        pageObjectCourses.assert_that_button_present_profession_data_scientist();
    }

    @Then("assert that button present course data science")
    public void assert_that_button_present_course_data_science() {
        pageObjectCourses.assert_that_button_present_course_data_science();
    }

    @Then("assert that button present profession data analytics")
    public void assert_that_button_present_profession_data_analytics() {
        pageObjectCourses.assert_that_button_present_profession_data_analytics();
    }

    @Then("assert that button present course data analytics")
    public void assert_that_button_present_course_data_analytics() {
        pageObjectCourses.assert_that_button_present_course_data_analytics();
    }

    @Then("assert that button present profession fullstack python developer")
    public void assert_that_button_present_profession_fullstack_python_developer() {
        pageObjectCourses.assert_that_button_present_profession_fullstack_python_developer();
    }

    @Then("assert that button present profession web developer")
    public void assert_that_button_present_profession_web_developer() {
        pageObjectCourses.assert_that_button_present_profession_web_developer();
    }

    @Then("assert that button present developer on unity")
    public void assert_that_button_present_developer_on_unity() {
        pageObjectCourses.assert_that_button_present_developer_on_unity();
    }

    @Then("assert that button present profession manual testing engineer")
    public void assert_that_button_present_profession_manual_testing_engineer() {
        pageObjectCourses.assert_that_button_present_profession_manual_testing_engineer();
    }


        //ниже тесты присутсвия курсов во вкладках


    @Then("click on the tab no-code")
    public void click_on_the_tab_no_code() {
        pageObjectTab.click_on_the_tab_no_code();
    }

    @Then("assert that a course on creating sites without code is present in the tab without code {string}")
    public void assert_that_a_course_on_creating_sites_without_code_is_present_in_the_tab_without_code(String expectedTitle) {
            pageObjectTab.assert_that_a_course_on_creating_sites_without_code_is_present_in_the_tab_without_code(expectedTitle);
    }

    @Then("assert that a course Mobile application without code is present in the tab without code {string}")
    public void assert_that_a_course_mobile_application_without_code_is_present_in_the_tab_without_code(String expectedTitle) {
        pageObjectTab.assert_that_a_course_mobile_application_without_code_is_present_in_the_tab_without_code(expectedTitle);
    }

    @Then("click on the tab marketing")
    public void click_on_the_tab_marketing() {
        pageObjectTab.click_on_the_tab_marketing();
    }
    @Then("assert that a course Internet Marketer is present in the marketing tab {string}")
    public void assert_that_a_course_internet_marketer_is_present_in_the_marketing_tab(String expectedTitle) {
        pageObjectTab.assert_that_a_course_internet_marketer_is_present_in_the_marketing_tab(expectedTitle);
    }

    @Then("assert that a course Targetologist is present in the tab marketing {string}")
    public void assert_that_a_course_targetologist_is_present_in_the_tab_marketing(String expectedTitle) {
        pageObjectTab.assert_that_a_course_targetologist_is_present_in_the_tab_marketing(expectedTitle);

    }

    @Then("assert that a course Marketing Analyst is present in the tab marketing {string}")
    public void assert_that_a_course_marketing_analyst_is_present_in_the_tab_marketing(String expectedTitle) {
        pageObjectTab.assert_that_a_course_targetologist_is_present_in_the_tab_marketing(expectedTitle);
    }

    @Then("click on the tab design")
    public void click_on_the_tab_design() {
        pageObjectTab.click_on_the_tab_design();
    }

    @Then("assert that a Course UX UI designer from scratch to PRO is present in the tab marketing {string}")
    public void assert_that_a_course_ux_ui_designer_from_scratch_to_pro_is_present_in_the_tab_marketing(String expectedTitle) {
       pageObjectTab.assert_that_a_course_ux_ui_designer_from_scratch_to_pro_is_present_in_the_tab_marketing(expectedTitle);
    }

    @Then("assert that a Course Graphic designer from scratch to PRO is present in the tab marketing {string}")
    public void assert_that_a_course_graphic_designer_from_scratch_to_pro_is_present_in_the_tab_marketing(String expectedTitle) {
        pageObjectTab.assert_that_a_course_graphic_designer_from_scratch_to_pro_is_present_in_the_tab_marketing(expectedTitle);
    }

    @Then("assert that a Course Motion designer from scratch to PRO is present in the tab marketing {string}")
    public void assert_that_a_course_motion_designer_from_scratch_to_pro_is_present_in_the_tab_marketing(String expectedTitle) {
        pageObjectTab.click_on_the_tab_marketing();
    }


}







