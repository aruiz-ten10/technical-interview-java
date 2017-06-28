package com.ten10.web_front_end;

import cucumber.api.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebFrontEndTestSteps {

   WebDriver driver;
   WebElement langLink;

   @Before("@ui")
   public void before_scenario() {
      driver = new ChromeDriver();
   }

   @After("@ui")
   public void after_scenario() {
      driver.close();
   }


   @Given("^I navigate to the wikipedia homepage$")
   public void i_navigate_to_the_wikipedia_homepage() throws Throwable {
      driver.get("http://www.wikipedia.org");
   }

   @When("^I type (.*?) into the search input field$")
   public void i_type_into_the_search_input_field(String input) throws Throwable {
      WebElement searchField = driver.findElement(By.xpath("//div[contains(@class, 'search-container')]//input[@id='searchInput']"));
      searchField.sendKeys(input);
   }

   @When("^I select English as the search language for the input field$")
   public void i_select_English_as_the_search_language_for_the_input_field() throws Throwable {
      WebElement langSelect = driver.findElement(By.xpath("//div[contains(@class, 'search-container')]//select[@id='searchLanguage']"));
      langSelect.click();
      WebElement langOption = driver.findElement(By.xpath("//div[contains(@class, 'search-container')]//select[@id='searchLanguage']/option[@value='en']"));
      langOption.click();
   }

   @When("^I click the search button$")
   public void i_click_the_search_button() throws Throwable {
      WebElement searchButton = driver.findElement(By.xpath("//form[@id='search-form']//button[@type='submit']"));
      searchButton.click();
   }

   @Then("^the heading of the search results page should match (.*)")
   public void the_heading_of_the_search_results_page_should_match_input(String input) throws Throwable {
      String heading_sz = driver.findElement(By.xpath("//div[@id='content']//h1[@id='firstHeading']")).getText();
      assertEquals(heading_sz.toLowerCase(), input.toLowerCase());
   }

   @Then("^the search results page should be available in (.*)$")
   public void the_search_results_page_should_be_available_in_language(String language) throws Throwable {
      langLink = driver.findElement(By.xpath("//div[@id='p-lang']//a[contains(@class, 'interlanguage-link-target') and text()='" + language + "']"));
      assertNotEquals(langLink, null);
   }

   @When("^I click on the link to view the article in (.*)$")
   public void i_click_on_the_link_to_view_the_article_in_language(String language) throws Throwable {
      langLink.click();
   }
}
