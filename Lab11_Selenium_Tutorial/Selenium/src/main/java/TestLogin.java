import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestLogin {
    public static void main(String[] args) {

        String csvFile = "C:\\Users\\Dell\\Documents\\GitRoot\\advance-programming-labs\\Lab11_Selenium_Tutorial\\Book1.csv";
        String line;

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dell\\Documents\\GitRoot\\advance-programming-labs\\Lab11_Selenium_Tutorial\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try  {

            BufferedReader reader = new BufferedReader(new FileReader(csvFile));
            while ((line = reader.readLine()) != null) {

                // use comma as separator
                String[] loginCredentials = line.split(",");

                driver.get("http://localhost/login/login.php");
                WebElement username = driver.findElement(By.id("user"));
                System.out.println("Username: " + loginCredentials[0]);
                username.sendKeys(loginCredentials[0]);
                WebElement password = driver.findElement(By.id("pass"));
                System.out.println("Password: " + loginCredentials[1]);
                password.sendKeys(loginCredentials[1]);
                WebElement login = driver.findElement(By.id("login"));
                login.click();
                WebElement response = driver.findElement(By.id("sucfail"));
                System.out.println(response.getText()+"\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
