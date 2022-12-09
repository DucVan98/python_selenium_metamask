package ddsolution.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
    public void Setup() {
        WebDriver driver;
        String link = "http://52.77.14.129:3030";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
