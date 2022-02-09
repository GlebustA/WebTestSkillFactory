Feature: Checking if the title of the page with the course is correct
  Scenario: click on the button all courses on the main page
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    And make sure the page with the title is open 'Все программы обучения'

  Scenario: click on the button Data Science on the main page
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button Data Science on the main page
    And make sure the title 'Курсы по Data Science'

  Scenario: click on the button Programming on the main page
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button Programming on the main page
    And make sure the title is programming courses 'Курсы программирования'

  Scenario: click on the button Data Analytics on the main page
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button Data Analytics on the main page
    And make sure the title is Data Analytics Courses 'Курсы по аналитике данных'

  Scenario: Check if the button is present profession java developer
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession java developer

  Scenario: Check if the button is present profession QA java engineer
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession QA java engineer

  Scenario: Check if the button is present profession python developer
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession python developer

  Scenario: Check if the button is present profession tester automator
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession tester automator

  Scenario: Check if the button is present profession data scientist
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession data scientist

  Scenario: Check if the button is present course data science
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present course data science

  Scenario: Check if the button is present profession data analytics
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession data analytics

  Scenario: Check if the button is present course data analytics
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present course data analytics

  Scenario: Check if the button is present profession fullstack python developer
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession fullstack python developer

  Scenario: Check if the button is present profession web developer
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession web developer

  Scenario: Check if the button is present profession games developer on unity
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present developer on unity

  Scenario: Check if the button is present profession manual testing engineer
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession manual testing engineer

  Scenario: Check if the button is present profession manual testing engineer
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then assert that button present profession manual testing engineer

  Scenario: Checking if there is a course on creating sites without code in the no-code tab
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    Then click on the tab no-code
    And assert that a course on creating sites without code is present in the tab without code 'Создание сайтов без кода'

  Scenario: Checking if there is a course Mobile application without code in the no-code tab
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    Then click on the tab no-code
    And assert that a course Mobile application without code is present in the tab without code 'Мобильное приложение без кода'

  Scenario: Checking if there is a course Internet Marketer in the marketing tab
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    Then click on the tab marketing
    And assert that a course Internet Marketer is present in the marketing tab '«Интернет-маркетолог»'

  Scenario: Checking if there is a course Targetologist in the marketing tab
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    Then click on the tab marketing
    And assert that a course Targetologist is present in the tab marketing '«Таргетолог»'

  Scenario: Checking if there is a course Marketing Analyst in the design tab
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    Then click on the tab design
    And assert that a Course UX UI designer from scratch to PRO is present in the tab design 'Курс «UX/UI-дизайнер с нуля до PRO»'

  Scenario: Checking if there is a course Marketing Analyst in the design tab
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    Then click on the tab design
    And assert that a Course Graphic designer from scratch to PRO is present in the tab design 'Курс «Графический дизайнер с нуля до PRO»'

  Scenario: Checking if there is a course Marketing Analyst in the design tab
    Given url of site SkillFactory 'https://skillfactory.ru/'
    Then click on the button all courses
    Then click on the tab design
    And assert that a Course Motion designer from scratch to PRO is present in the tab design 'Курс «Моушн-дизайнер с нуля до PRO»'






