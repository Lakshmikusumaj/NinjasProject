package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserStack {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/Users/dwive/Hello-World/src/test/resources/Drivers/msedgedriver.exe");
	    WebDriver edgedriver =new EdgeDriver();
	    edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    edgedriver.get("https://bstackdemo.com/");
	    //edgedriver.close();

	   /* WebElement addtocart= edgedriver.findElement(By.xpath("//*[@id=\"3\"]/div[4]"));
	    addtocart.click();*/
	    
	    WebElement addToCartBtn = edgedriver.findElement(By.xpath("//div[@id='3']/div[@class='shelf-item__buy-btn']"));
		addToCartBtn.click();
		
		WebElement addtocart= edgedriver.findElement(By.xpath("//div[@id=\"4\"]/div[@class='shelf-item__buy-btn']"));
	    addtocart.click();
	    
	    WebElement checkoutbtn= edgedriver.findElement(By.className("buy-btn"));
	    checkoutbtn.click();
	    
	    WebElement username= edgedriver.findElement(By.id("username"));
	    username.click();
	    
	    WebElement chooseusername = edgedriver.findElement(By.xpath("//div//*[contains(text(),'fav_user')]"));
	    chooseusername.click();
	    
	    
	    WebElement password= edgedriver.findElement(By.id("password"));
	    password.click();
	    
	    WebElement choosepassword = edgedriver.findElement(By.xpath("//div//*[contains(text(),'testingisfun99')]"));
	    choosepassword.click();
	    
	    
	    WebElement loginbtn= edgedriver.findElement(By.id("login-btn"));
	    loginbtn.click();
	    
	    
	    WebElement FirstName= edgedriver.findElement(By.id("firstNameInput"));
	    FirstName.sendKeys("hijkl");
	    
	    WebElement lastName= edgedriver.findElement(By.id("lastNameInput"));
	    lastName.sendKeys("abcd");
	    
	    WebElement address= edgedriver.findElement(By.id("addressLine1Input"));
	    address.sendKeys("115, vegan steet");
	    
	    WebElement province= edgedriver.findElement(By.id("provinceInput"));
	    province.sendKeys("colarado");
	    

	    WebElement postalcode= edgedriver.findElement(By.id("postCodeInput"));
	    postalcode.sendKeys("95768");
	    
	    WebElement submitbtn= edgedriver.findElement(By.id("checkout-shipping-continue"));
	    submitbtn.click();
	    
	    edgedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  WebElement confirmationMsg =edgedriver.findElement(By.id("confirmation-message"));
		  System.out.println(confirmationMsg.getText());
		  
		  WebElement orderNumber =edgedriver.findElement(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/ol/li/div/div/div[2]/strong"));
			
			System.out.println("Order Number is :"+orderNumber.getText());
			
			
         WebElement download =edgedriver.findElement(By.id("downloadpdf"));
			
			System.out.println("Order Number is :"+download.getText());
			download.click();
			
	    
	    
	    
}
	}
