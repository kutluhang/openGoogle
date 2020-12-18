package TestAutomation.openGoogle;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void codingBook() {
        //System.out.pcodingrintln("Hello World!");
        System.setProperty("webdriver.chrome.driver", "webdriver\\chromedriver.exe");

        // Navigate to http://www.google.com
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.codingbook.org");
    }
}
