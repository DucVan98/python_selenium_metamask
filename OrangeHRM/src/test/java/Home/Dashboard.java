package Home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Dashboard {
    WebDriver driver = null;
    String link = "https://opensource-demo.orangehrmlive.com/";
    WebElement UserName, Password, LoginButton;

    //login thành công. Nhập đúng Username và password
    @Test(priority = 1)
    public void alo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get(link);
        Thread.sleep(1000);
        UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        UserName.sendKeys("Admin");
        Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.sendKeys("admin123");
        LoginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        LoginButton.click();
        Thread.sleep(3000);
        WebElement CheckDashboard = driver.findElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]"));
        Assert.assertTrue(CheckDashboard.isDisplayed());
        System.out.println("Login thanh cong");
        driver.close();
    }

    WebElement invalidCrendentials;
    String erroTextUserName = "Invalid credentials";

    // Sai username
    @Test (priority = 2)
    public void alo01() throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get(link);
        Thread.sleep(1000);
        //tim trường username
        UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        //Nhập dữ liệu vào trường username
        UserName.sendKeys("Admin1");
        //Tìm trường password
        Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        //Nhập giá trị vào trường password
        Password.sendKeys("admin123");
        // tìm button login
        LoginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        //kiểm tra button login có được bật hay không
        Boolean CheckButtonLogin = LoginButton.isEnabled();
        if(CheckButtonLogin == true) {
            LoginButton.click();
        }else {
            System.out.println("Button login khong enable");
            driver.close();
        }
        Thread.sleep(2000);
        invalidCrendentials = driver.findElement(By.xpath("//div[@role='alert']"));
        Assert.assertTrue(invalidCrendentials.isDisplayed());
        System.out.println("Sai ten username");
        driver.close();

    }

    //    Sai Usernam và Password
    @Test (priority = 3)
    public void alo02() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get(link);
        Thread.sleep(1000);
        //tim trường username
        UserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        //Nhập dữ liệu vào trường username
        UserName.sendKeys("Admin1");
        //Tìm trường password
        Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        //Nhập giá trị vào trường password
        Password.sendKeys("admin1231");
        // tìm button login
        LoginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        //kiểm tra button login có được bật hay không
        Boolean CheckButtonLogin = LoginButton.isEnabled();
        if(CheckButtonLogin == true) {
            LoginButton.click();
        }else {
            System.out.println("Button login khong enable");
            driver.close();
        }
        Thread.sleep(2000);
        invalidCrendentials = driver.findElement(By.xpath("//div[@role='alert']"));
        Assert.assertTrue(invalidCrendentials.isDisplayed());
        System.out.println("Sai ten username");
        driver.close();

    }
    //1. bo trong username
    //2.Nhap dung password
//    WebElement RequiedUserName, RequiedPassWord;
    @Test (priority = 4)
    public void alo03() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get(link);
        Thread.sleep(1000);
        Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        //Nhập giá trị vào trường password
        Password.sendKeys("admin123");
        // tìm button login
        LoginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        //kiểm tra button login có được bật hay không
        Boolean CheckButtonLogin = LoginButton.isEnabled();
        if(CheckButtonLogin == true) {
            LoginButton.click();
        }else {
            System.out.println("Button login khong enable");
            driver.close();
        }
        Thread.sleep(2000);
//        driver.close();
        WebElement RqUserName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));
        Assert.assertTrue(RqUserName.isDisplayed());
        System.out.println(RqUserName.isDisplayed());
        System.out.println("username rong");
        driver.close();

    }

    @AfterTest
    public void Stoptest() throws InterruptedException {

    }

}
