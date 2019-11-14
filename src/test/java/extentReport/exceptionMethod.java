package extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

public class exceptionMethod {
	
	
	
	private static WebElement setCoverageSelects(String label, String value) throws Exception {
		if(value == null ||value.isEmpty()) return null;
		WebElement el = null;
		WebElement select = null;
		int timeout = 0;
		boolean error = true;

		while (error && timeout < 10) {
			try {
				//el = FindUtils.getTableByHeading(label);
				select = el.findElement(By.tagName("select"));
				Select newSelect = new Select(select);
				newSelect.selectByVisibleText(value);
				//  WebDriverWait.until(
						//ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Optional Accident Benefits']"))).click();
				error = false;
			} catch (StaleElementReferenceException e) {
				error = true;
				e.printStackTrace();
			} catch (Exception e) {
				error = false;
		         e.printStackTrace();
			     // extentLogger.info(e);
				 // extentLogger.log(Status.DEBUG, "Get Null poiter Exception when try to find [Optional Accident Benefits]");
				 
			}
			timeout++;
		}

		return select;
	}
	
	

}
