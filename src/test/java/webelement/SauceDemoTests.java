package webelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTests {
WebDriver driver;



    @Test
    public void checkNameOfFirstElement() {
        // get the locator of the first element => get the text of the first element, it should be "Sauce Labs Backpack"

        // optimal way
        var firstInventoryItem = By.xpath("(//div[@class='inventory_item_name'])[1]");
        var actualResult2 = driver.findElement(firstInventoryItem).getText();
        Assertions.assertEquals("Sauce Labs Backpack", actualResult2);



    }

    @BeforeEach
    public void beforeEach(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/inventory.html");
    }

    @AfterEach
    public void afterEach(){

    }
}



