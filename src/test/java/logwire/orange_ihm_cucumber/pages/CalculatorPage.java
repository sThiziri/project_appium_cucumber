package logwire.orange_ihm_cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage {
public CalculatorPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.miui.calculator:id/digit_0")
    public WebElement button_0;
    @FindBy(id = "com.miui.calculator:id/digit_1")
    public WebElement button_1;
    @FindBy(id = "com.miui.calculator:id/digit_2")
    public WebElement button_2;
    @FindBy(id = "com.miui.calculator:id/digit_3")
    public WebElement button_3;
    @FindBy(id = "com.miui.calculator:id/digit_4")
    public WebElement button_4;
    @FindBy(id = "com.miui.calculator:id/digit_5")
    public WebElement button_5;
    @FindBy(id = "com.miui.calculator:id/digit_6")
    public WebElement button_6;
    @FindBy(id = "com.miui.calculator:id/digit_7")
    public WebElement button_7;
    @FindBy(id = "com.miui.calculator:id/digit_8")
    public WebElement button_8;
    @FindBy(id = "com.miui.calculator:id/digit_9")
    public WebElement button_9;
    @FindBy(id = "com.miui.calculator:id/op_add")
    public WebElement button_plus;
    @FindBy(id = "com.miui.calculator:id/op_sub")
    public WebElement button_minus;
    @FindBy(id = "com.miui.calculator:id/op_mul")
    public WebElement button_multiply;
    @FindBy(id = "com.miui.calculator:id/op_div")
    public WebElement button_divide;
    @FindBy(id = "com.miui.calculator:id/btn_equal_s")
    public WebElement button_equal;
    @FindBy(id = "com.miui.calculator:id/clr")
    public WebElement button_clear;
    @FindBy(id = "com.miui.calculator:id/result")
    public WebElement result_field;

    public void clear() {
        button_clear.click();
    }

    public String getResult() {
        return result_field.getText();
    }

    public void button_plus_click() {
        button_plus.click();
    }

    public void button_minus_click() {
        button_minus.click();
    }

    public void button_multiply_click() {
        button_multiply.click();
    }

    public void button_divide_click() {
        button_divide.click();
    }

    public void button_equal_click() {
        button_equal.click();
    }

    // click on a specific number
    public void clickOnNumber(int number) {
        switch (number) {
            case 0:
                button_0.click();
                break;
            case 1:
                button_1.click();
                break;
            case 2:
                button_2.click();
                break;
            case 3:
                button_3.click();
                break;
            case 4:
                button_4.click();
                break;
            case 5:
                button_5.click();
                break;
            case 6:
                button_6.click();
                break;
            case 7:
                button_7.click();
                break;
            case 8:
                button_8.click();
                break;
            case 9:
                button_9.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid number: " + number);
        }
    }

    public void clickOnOperator(String operator) {
        switch (operator) {
            case "+":
                button_plus.click();
                break;
            case "-":
                button_minus.click();
                break;
            case "*":
                button_multiply.click();
                break;
            case "/":
                button_divide.click();
                break;
        }
    }
}
