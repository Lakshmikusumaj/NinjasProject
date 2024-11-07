package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NinjaTutorial {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:/Users/dwive/Hello-World/src/test/resources/Drivers/msedgedriver.exe");
	    WebDriver edgedriver =new EdgeDriver();
	    edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    edgedriver.get("http://tutorialsninja.com/demo/index.php");
	    //edgedriver.close();
	    
	    edgedriver.manage().window().maximize();
	    
	    WebElement currency = edgedriver.findElement(By.className("btn-group"));
	       Actions actions = new Actions(edgedriver);
	       actions.moveToElement(currency).click().perform();
	       
	       
	       WebElement selectcurrency= edgedriver.findElement(By.xpath("//button[@name='EUR']"));
	       selectcurrency.click();
	    
	       WebElement addTocartproduct= edgedriver.findElement(By.xpath("//img[@title='Canon EOS 5D']"));
	       addTocartproduct.click();
	       
	       WebElement selectoption= edgedriver.findElement(By.id("input-option226"));
	       Select select= new Select(selectoption);
	       select.selectByVisibleText(" --- Please Select --- ");
	       
	       WebElement addTocart= edgedriver.findElement(By.id("button-cart"));
	       addTocart.click();
	       
	      WebElement errormessage = edgedriver.findElement(By.xpath("//*[@id='product']/div[1]/div"));
	       System.out.println(errormessage.getText());
	       
	       edgedriver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=common/home']")).click();
	       
	       
	       
	       
	       
	       //WebElement homescreen = edgedriver.findElement(By.xpath("//*[@id=\"product-product\"]/ul/li[1]/a"));
	     // Actions actions1 = new Actions(edgedriver);
	      // actions1.scrollByAmount(x,y).click().perform();
	       
	       
	       WebElement iphone= edgedriver.findElement(By.xpath("//img[@title='iPhone']"));
	       iphone.click();
	       
	       
	       edgedriver.findElement(By.id("input-quantity")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "2");
	       
	       WebElement addTocartiphone= edgedriver.findElement(By.xpath("//button[@id='button-cart']"));
	       addTocartiphone.click();
	       
	       WebElement cart= edgedriver.findElement(By.id("cart-total"));
	       cart.click();
	       
	       
	     
	      
	      WebElement success_message_element= edgedriver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]"));

	       String success_message = success_message_element.getText();

	    	System.out.println("Success message: "+success_message);
	    	
	       
	      // WebElement successmessage= edgedriver.findElement(By.xpath("//div[contain(text(),'Success: You have added')]"));
	       //System.out.println(successmessage.getText());
	       
	       edgedriver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']")).click();
	       
	       
	       
	      // WebElement viewcart= edgedriver.findElement(By.id("cart-total"));
	       //viewcart.click();
	       
	      // edgedriver.findElement(By.xpath("//input[@name='quantity[146257]']")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "3");
	       
	       WebElement changequantityEle=edgedriver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input[@value='1']"));
			changequantityEle.clear();
			changequantityEle.sendKeys("3");
	       
	       WebElement update= edgedriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	       update.click();
	     
	       
	       WebElement ecotax =edgedriver.findElement(By.xpath(" //*[@id='content']/div[2]/div/table/tbody/tr[2]/td[1]/strong"));
		    System.out.println(ecotax.getText());
		    
		    WebElement taxvalue=edgedriver.findElement(By.xpath("//*[@id='content']/div[2]/div/table/tbody/tr[3]/td[2]"));
		    System.out.println(taxvalue.getText());
	     
	     
		    WebElement checkout=edgedriver.findElement(By.xpath("//div[@class='pull-right']/a"));
		    checkout.click();
		    
		    WebElement View=edgedriver.findElement(By.xpath("//*[@id='cart']/button"));
		    View.click();
	    
		    WebElement remove=edgedriver.findElement(By.xpath(" //*[@id='cart']/ul/li[1]/table/tbody/tr/td[5]/button/i"));
		    remove.click();
		    
		    WebElement continue1=edgedriver.findElement(By.xpath(" //*[@id='content']/div/div/a"));
		    continue1.click();
	       
		    edgedriver.findElement(By.xpath("//a[@href ='https://tutorialsninja.com/demo/index.php?route=product/category&amp;path=18']")).click();
		    
		   edgedriver.findElement(By.xpath(" //*[@id='category']/div/div/a")).click();
		   
		   edgedriver.findElement(By.xpath(" //div[@class='caption']/div/div/a")).click();
		   
		   edgedriver.findElement(By.xpath("//img[@title ='HP LP3065']")).click();
		   
		   edgedriver.findElement(By.xpath("//button[@id ='button-cart']")).click();
		   
		   WebElement cart1= edgedriver.findElement(By.id("cart-total"));
	       cart1.click();
		
	       edgedriver.findElement(By.xpath("//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart']")).click();
		   
	       
	       edgedriver.findElement(By.xpath("//a[@class='accordion-toggle']")).click();
	       
	       WebElement applycoupon= edgedriver.findElement(By.xpath("//input[@id='input-coupon']"));
	    		   applycoupon.sendKeys("ABCD123");
	       
	       WebElement applybutton=edgedriver.findElement(By.xpath("//input[@id='button-coupon']"));
	       applybutton.click();
	       
	       WebElement couponmessage= edgedriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));

	       String message = couponmessage.getText();

	    	System.out.println("Success message: "+message);
	    	
	    	WebElement giftcertificate=edgedriver.findElement(By.xpath("//a[@class='accordion-toggle']"));
	    	giftcertificate.click();
	    	
	    	WebElement giftcoupon= edgedriver.findElement(By.xpath("//input[@id='input-coupon']"));
	    	giftcoupon.sendKeys("AXDFGH123");
	    	
	    	WebElement applygiftcoupon= edgedriver.findElement(By.xpath("//input[@id='button-voucher']"));
	    	applygiftcoupon.click();
	    	
	    	
	    	 WebElement giftmessage= edgedriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		       String message1 = giftmessage.getText();
		    	System.out.println("Success message: "+message1);
		    	
		    	
		    	WebElement register= edgedriver.findElement(By.xpath("//ul/a[@href='https://tutorialsninja.com/demo/index.php?route=account/register'"));
		    	register.click();
	    	
	    	
	    	   
	       
	       
	       
	  
		 
		   
		   
		    
		  
	}

}
