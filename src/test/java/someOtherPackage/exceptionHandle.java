package someOtherPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exceptionHandle {
	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().fullscreen();
		
		driver.get("https://amazon.com");

        String searchTerm = "wooden spoon";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
        driver.findElement(By.className("nav-input")).click();

        WebElement result1 = driver.findElement(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(result1.getText());

          // check the prime checkbox
          driver.findElement(By.cssSelector("i[class='a-icon a-icon-checkbox']")).click();

        // refresh, locate the same element again
          result1 = driver.findElement(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']"));
         System.out.println(result1.getText());
////
//        WebDriverWait wait = new WebDriverWait(driver,15);
//        WebElement element=null;
////
////        // Waits for to redraw the element that was stale
//        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
	}

}
