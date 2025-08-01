package com.chiragrathava.step.definitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {
    private WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("I login as {string} with password {string}")
    public void i_login_as_with_password(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("/logged-in-successfully/"));

        WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
        Assert.assertTrue(logout.isDisplayed());

        driver.quit();
    }

    @Then("I should see error {string}")
    public void i_should_see_error(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));

        Assert.assertTrue(error.isDisplayed());
        Assert.assertEquals(expectedMessage, error.getText().trim());

        driver.quit();
    }
}
