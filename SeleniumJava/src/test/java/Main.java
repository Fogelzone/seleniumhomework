import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    private static WebDriver chromedriver;

    public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
          ChromeDriver chromedriver = new ChromeDriver();
//        firefoxdriver = new firefoxdriver;
//2.      chromedriver.get("https://translate.google.com");
//        System.out.println(chromedriver.findElement(By.className("er8xn")));
//        System.out.println(chromedriver.findElement(By.cssSelector("textarea[jsname=BJE2fc]")));
//3.      chromedriver.get("https://www.youtube.com/");
//        System.out.println(chromedriver.findElement(By.id("logo-icon")));
//5.      chromedriver.get("https://www.amazon.com/");
//        String actualTitle = chromedriver.getTitle();
//        String expectedTitle = "Amazon.com. Spend less. Smile more.";
//        Assert.assertEquals(expectedTitle,actualTitle);
//        chromedriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather shoes");
//        chromedriver.findElement(By.id("nav-search-submit-button")).click();
//7.      chromedriver.get("https://www.youtube.com/");
//        chromedriver.findElement(By.name("search_query")).sendKeys("would");
//        chromedriver.findElement(By.id("search-icon-legacy")).click();
//8.      chromedriver.get("https://www.facebook.com/");
//          chromedriver.findElement(By.name("email")).sendKeys("blabla@yahoo.com");
//          chromedriver.findElement(By.id("pass")).sendKeys("*******");
//          chromedriver.findElement(By.name("login")).click();




    }
}
