package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OWASPJuiceshop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/Users/dwive/Hello-World/src/test/resources/Drivers/msedgedriver.exe");
	    WebDriver edgedriver =new EdgeDriver();
	    edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    edgedriver.get("https://juiceshop.myspreadshop.com/");
	    //edgedriver.close();
	    
	    WebElement item= edgedriver.findElement(By.xpath("//*[@id=\"sprd-content\"]/div[1]/div[1]/a/div/div[1]/img"));
	    
	  
	  //*[@id="sprd-appearance-list__appearance-504"]/svg
	    
	  //*[@id="sprd-appearance-list__appearance-591"]/svg
	    
	 
	    //color.click();
	    item.click();
	    
	  WebElement color= edgedriver.findElement(By.xpath("//*[@id=\"sprd-appearance-list__appearance-504\"]"));
	  color.click();
	  
	  WebElement size= edgedriver.findElement(By.id("sprd-detail-sizes__size-5"));
	  size.click();
	  
	  WebElement addtocart= edgedriver.findElement(By.className("sprd-detail-cta"));
	  addtocart.click();
	
	    
	  WebElement cart= edgedriver.findElement(By.id("sprd-basket-count"));
	  cart.click();
	 
	  
	  
	
	  

}
	}
