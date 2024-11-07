package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SauceDemoTest {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/Users/dwive/Hello-World/src/test/resources/Drivers/msedgedriver.exe");
	    WebDriver edgedriver =new EdgeDriver();
	    edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    edgedriver.get("https://www.saucedemo.com");
	    //edgedriver.close();
	
	    WebElement userNameEle= edgedriver.findElement(By.name("user-name"));
	    userNameEle.sendKeys("problem_user");
	    
	    WebElement passwrodEle= edgedriver.findElement(By.name("password"));
	    passwrodEle.sendKeys("secret_sauce");
	    
	    WebElement loginBtnEle= edgedriver.findElement(By.name("login-button"));
	    loginBtnEle.click();
	    
	    String expected_title= "Swag Labs";
	    String actual_title= edgedriver.getTitle();
	    
	    if(expected_title.equals(actual_title)) {
	    System.out.println("Login Successful");
	    }
	    else {
	    	System.out.println("Login Fail");
	    }
	    
	    WebElement openmenubtn= edgedriver.findElement(By.id("react-burger-menu-btn"));
	    openmenubtn.click();
	    
	    
	     WebElement allitem= edgedriver.findElement(By.id("inventory_sidebar_link"));
	    allitem.click();
	    
	    WebElement resetapp= edgedriver.findElement(By.id("reset_sidebar_link"));
	    resetapp.click();
	    
	    edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	  WebElement closemenubtn= edgedriver.findElement(By.id("react-burger-cross-btn"));
	    closemenubtn.click();

	    //WebElement logout= edgedriver.findElement(By.id("logout_sidebar_link"));
	    //logout.click();
	    
	    
	    
	    WebElement sortcontainer= edgedriver.findElement(By.className("product_sort_container"));
	  sortcontainer.click();
	  
	  
	   List< WebElement> totalitems= edgedriver.findElements(By.className("inventory_item"));
		  int count = totalitems.size();
		  System.out.println("links"+count);
		  
		for (int i=0; i<count;i++) {
			System.out.println(totalitems.get(i).getText());
		  }
		
		 
		WebElement products1= edgedriver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		products1.click();
		
		String expectedurl = "https://www.saucedemo.com/inventory-item.html?id=4";
		String actualurl= edgedriver.getCurrentUrl();
		
		System.out.println(actualurl);
		
		if(expectedurl.equals(actualurl)) {
			System.out.println("you are on correct page");
		}
		else {
			
			System.out.println("you are on wrong page");
		}
	  
		WebElement backbtn= edgedriver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backbtn.click();
		
		
		
		WebElement addtocart= edgedriver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		addtocart.click();
		
		
		WebElement products2= edgedriver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
		products2.click();
		
		String expectedurl2 = "https://www.saucedemo.com/inventory-item.html?id=0";
		String actualurl2= edgedriver.getCurrentUrl();
		
		System.out.println(actualurl2);
		
		if(expectedurl2.equals(actualurl2)) {
			System.out.println("you are on correct page");
		}
		else {
			
			System.out.println("you are on wrong page");
		}
	  
		WebElement backbtn1= edgedriver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backbtn1.click();
		
		WebElement addtocart1= edgedriver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		addtocart1.click();
		

		WebElement products3= edgedriver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
		products3.click();
		
		String expectedurl3 = "https://www.saucedemo.com/inventory-item.html?id=1";
		String actualurl3= edgedriver.getCurrentUrl();
		
		System.out.println(actualurl3);
		
		if(expectedurl3.equals(actualurl3)) {
			System.out.println("you are on correct page");
		}
		else {
			
			System.out.println("you are on wrong page");
		}
	    
		WebElement backbtn2= edgedriver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backbtn2.click();
		
		
		WebElement products4= edgedriver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
		products4.click();
		
		String expectedurl4 = "https://www.saucedemo.com/inventory-item.html?id=5";
		String actualurl4= edgedriver.getCurrentUrl();
		
		System.out.println(actualurl4);
		
		if(expectedurl4.equals(actualurl4)) {
			System.out.println("you are on correct page");
		}
		else {
			
			System.out.println("you are on wrong page");
		}
	    
		WebElement backbtn3= edgedriver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backbtn3.click();
		
		
		WebElement products5= edgedriver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
		products5.click();
		
		String expectedurl5 = "https://www.saucedemo.com/inventory-item.html?id=2";
		String actualurl5= edgedriver.getCurrentUrl();
		
		System.out.println(actualurl5);
		
		if(expectedurl5.equals(actualurl5)) {
			System.out.println("you are on correct page");
		}
		else {
			
			System.out.println("you are on wrong page");
		}
		
		
		WebElement backbtn4= edgedriver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backbtn4.click();
		
	    
		WebElement products6= edgedriver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
		products6.click();
		
		String expectedurl6 = "https://www.saucedemo.com/inventory-item.html?id=3";
		String actualurl6= edgedriver.getCurrentUrl();
		
		System.out.println(actualurl6);
		
		if(expectedurl6.equals(actualurl6)) {
			System.out.println("you are on correct page");
		}
		else {
			
			System.out.println("you are on wrong page");
		}
	    
		WebElement backbtn5= edgedriver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
		backbtn5.click();
		
	    
		WebElement cart= edgedriver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		cart.click();		
		
		
		List< WebElement> cartitems= edgedriver.findElements(By.className("shopping_cart_link"));
		  int item = cartitems.size();
		  for(int i = 0; i<item;i++) {
			  System.out.println("Total items in Cart:"+cartitems.get(i).getText());
		  }
		  
		  WebElement removebtn= edgedriver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
		  removebtn.click();	
		
		  
		 /*WebElement continueshopppingbtn= edgedriver.findElement(By.className("btn btn_secondary back btn_medium"));
		 continueshopppingbtn.click();*/
		
		
		  
			 WebElement checkoutbtn= edgedriver.findElement(By.id("checkout"));
			 checkoutbtn.click();
			 
			/* String expected_title7= "Checkout: Your Information";
			    String actual_title7= edgedriver.getTitle();
			    
			    if(expected_title7.equals(actual_title7)) {
			    System.out.println("Correct page");
			    }
			    else {
			    	System.out.println("Wrong");
			    }
			 */
			 edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			 
			 WebElement firstName= edgedriver.findElement(By.id("first-name"));
			 firstName.sendKeys("xyz");
			 
			 edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
			    
			   WebElement lastName= edgedriver.findElement(By.id("last-name"));
			    lastName.sendKeys("Martin");
			    
			    
			    edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			    WebElement zipcode= edgedriver.findElement(By.id("postal-code"));
			    zipcode.sendKeys("07945");
			    
			   /* WebElement cancelbtn= edgedriver.findElement(By.name("cancel"));
			    cancelbtn.click();*/
			    
			    WebElement continuebtn= edgedriver.findElement(By.id("continue"));
			    continuebtn.click();
			    
			    
				WebElement finishbtn = edgedriver.findElement(By.id("finish"));
				finishbtn.click();

				WebElement ThankYouText = edgedriver.findElement(By.cssSelector("h2.complete-header"));
				String confirmationText = ThankYouText.getText();

				System.out.println(confirmationText);
				
				WebElement Menubtn = edgedriver.findElement(By.id("react-burger-menu-btn"));
				Menubtn.click();
				

				edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
				
				WebElement logout = edgedriver.findElement(By.id("logout_sidebar_link"));
				logout.click();
			}
			
			 
	}


