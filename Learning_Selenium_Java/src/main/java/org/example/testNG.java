package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
 * 1.Lợi ích của TestNG
 * - được nhiều tool và plugin hỗ trợ
 * - Hỗ trọ data driver testing
 * - Thực hiê báo cáo theo nhóm chức năng
 * - cấu hình test linh động với file testNG.xml và các annotation
 * - đánh độ ưu tiên và gom nhóm các test
 * - sử dụng assert để kiểm tra các điều kiện test
 * - sử dụng các class listener để lấy log test
 * 2. Luồng (work flow)
 * - Tạo mới java project
 * - tạo mới package
 * - Cài đặt TestNG nếu chưa cài đặt
 * - Thêm các thư viện selenium
 * - tạo mới một class testNG trong package
 * - định nghĩa các annotation/ assertions trong các test
 * - tạo mới file tesnF.xml để thực thi test
 * - thực thi test bằng testNG
 * - Xem kết quả trong testNG teport
 *
 *
 *
 *
 *
 * */

public class testNG {

        public String baseUrl = "https://anhtester.com";
        public WebDriver driver ;

        @Test
        public void verifyHomepageTitle() throws InterruptedException {

            driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.navigate().to(baseUrl);
            Thread.sleep(2000);
            String expectedTitle = "Anh Tester - Automation Testing";
            String actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitle);

            Thread.sleep(2000);
            driver.quit();
        }
}
