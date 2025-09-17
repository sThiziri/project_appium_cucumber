package logwire.orange_ihm_cucumber.tools;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import logwire.orange_ihm_cucumber.pages.CalculatorPage;

public class DriverTools {
    private static AndroidDriver driver;

    static UiAutomator2Options options;
    static String deviceName = "Pixel_6";
    static String appPackage = "com.miui.calculator";
    static String appActivity = "com.miui.calculator.cal.CalculatorActivity";
    static String platformName = "Android";
    static String platformVersion = "14.0";
    static String automationName = "UiAutomator2";
    static CalculatorPage cp;

    public static AndroidDriver initDriver() throws MalformedURLException{
        options = new UiAutomator2Options()
                .setDeviceName(deviceName)
                .setAppPackage(appPackage)
                .setAppActivity(appActivity)
                .setPlatformName(platformName)
                .setPlatformVersion(platformVersion)
                .setAutomationName(automationName)
                .setApp("C:\\Users\\PC\\Desktop\\Formation\\APPI\\demo\\src\\main\\java\\com\\example\\apk\\Calculator.apk");

        try{
            driver = new AndroidDriver(new URL("http://192.168.1.103:4725/"), options);
            cp = new CalculatorPage(driver);
        }catch(Exception e){
            e.getMessage();
        }
        
        
        return driver;
        
    }

    public static void destroyDriver(){
        if (driver != null) {
            driver.quit();
        }
    }

    
}
