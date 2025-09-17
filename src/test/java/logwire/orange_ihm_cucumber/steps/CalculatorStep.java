package logwire.orange_ihm_cucumber.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import logwire.orange_ihm_cucumber.pages.CalculatorPage;
import logwire.orange_ihm_cucumber.tools.DriverTools;

public class CalculatorStep {
    AndroidDriver driver ;
    CalculatorPage cp ;
    @Before
    public void testSetup() throws MalformedURLException {
        driver = DriverTools.initDriver();
        cp = new CalculatorPage(driver);

    }

    @After
    public void tearDown() {
        DriverTools.destroyDriver();
    }


    @Given("jaccepte les cookies")
    public void jaccepte_les_cookies() throws InterruptedException {
        Thread.sleep(5000);
        WebElement popupButton = driver.findElement(AppiumBy.id("android:id/button1"));
        popupButton.click();
    }

    @When("je saisis le premier {string}")
    public void je_saisis_le_premier(String s) throws InterruptedException {
        Thread.sleep(5000);
        cp.clickOnNumber(Integer.parseInt(s));
    }


    @When("je saisis loperateur {string}")
    public void je_saisis_loperateur(String s) {
        cp.clickOnOperator(s);
    }


    @When("je saisis le premier chiffre {string}")
    public void je_saisis_le_premier_chiffre(String s) {
        cp.clickOnNumber(Integer.parseInt(s));
    }

    @When("je clique sur egale")
    public void je_clique_sur_egale() {
        cp.button_equal_click();
    }


    @Then("jobtiens le resultat {string}")
    public void jobtiens_le_resultat(String s) {
        int resultat = Integer.parseInt(cp.getResult().substring(2));

        assertEquals(String.valueOf(resultat), s);
    }





}
