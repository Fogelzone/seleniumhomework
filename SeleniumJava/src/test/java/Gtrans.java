import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gtrans {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Yehonathan.vogelsang\\Desktop\\קורס אוטומציה\\שיעור שמיני\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.co.il/?hl=iw");
    }

    @Test
    public void writeText() {
    driver.findElement(By.className("er8xn")).sendKeys("נעלי עור");
    }
}
