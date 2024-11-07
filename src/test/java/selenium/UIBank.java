package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UIBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/Users/dwive/Hello-World/src/test/resources/Drivers/msedgedriver.exe");
	    WebDriver edgedriver =new EdgeDriver();
	    edgedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    edgedriver.get("https://uibank.uipath.com/welcome");
	    //edgedriver.close();
	    
	    edgedriver.manage().window().maximize();
	    
	    // Register Account
	    WebElement registeracc= edgedriver.findElement(By.xpath("//a[@href='/register-account']//small[@id='emailHelp']"));
	    registeracc.click();
	    
        WebElement email= edgedriver.findElement(By.id("email"));
        email.sendKeys("martin.chris@outlook.com");
        
        WebElement password= edgedriver.findElement(By.id("password"));
        password.sendKeys("Martinchris@99999");
        
        WebElement firstname= edgedriver.findElement(By.id("firstName"));
        firstname.sendKeys("Chris");
        
	    
        WebElement lastname= edgedriver.findElement(By.id("lastName"));
        lastname.sendKeys("Martin");
        
        
        WebElement middlename= edgedriver.findElement(By.id("middleName"));
        middlename.sendKeys("hogan");
        
        
        WebElement gender = edgedriver.findElement(By.xpath("//select[@id='sex']"));

        Actions actions = new Actions(edgedriver);

        actions.moveToElement(gender).click().perform();
        //WebElement gender= edgedriver.findElement(By.xpath("//select[@id='sex']"));
        //gender.click();
         
        
       WebElement selectgender= edgedriver.findElement(By.id("sex"));
       Select select = new Select(selectgender);
       select.selectByValue("female");
       
       WebElement title = edgedriver.findElement(By.id("title"));
       Actions actions1 = new Actions(edgedriver);
       actions1.moveToElement(title).click().perform();
       
       
       WebElement selecttitle= edgedriver.findElement(By.id("title"));
       Select select1= new Select(selecttitle);
       select1.selectByIndex(2);
       
       
       
       WebElement employment = edgedriver.findElement(By.id("employmentStatus"));
       Actions actions2 = new Actions(edgedriver);
       actions2.moveToElement(employment).click().perform();
       
       
       WebElement selectempstatus= edgedriver.findElement(By.id("employmentStatus"));
       Select status= new Select(selectempstatus);
       status.selectByIndex(1);
       
       WebElement age= edgedriver.findElement(By.xpath("//div/input[@id ='age']"));
       age.sendKeys("09/15/1988");
       
       WebElement maritalStatus = edgedriver.findElement(By.id("maritalStatus"));
       Actions action3= new Actions(edgedriver);
       action3.moveToElement(maritalStatus).click().perform();
       
       WebElement marriedstatus = edgedriver.findElement(By.id("maritalStatus"));
       Select married=new Select(marriedstatus);
       married.selectByVisibleText("Married");
       
       WebElement dependents= edgedriver.findElement(By.id("numberOfDependents"));
       dependents.sendKeys("2");
       
       
       WebElement username= edgedriver.findElement(By.id("username"));
       username.sendKeys("hoganmartin");
       
       //WebElement agreeCheckbox = edgedriver.findElement(By.id("agreeCheckbox"));
       //agreeCheckbox.click();
       
  
       WebElement agreeCheckbox = edgedriver.findElement(By.id("agreeCheckbox"));
       Actions actions4 = new Actions(edgedriver);
       actions4.moveToElement(agreeCheckbox).click().perform();
       
      
       
       WebElement register = edgedriver.findElement(By.xpath("//div/button[@type='submit']"));
       Actions actions5 = new Actions(edgedriver);
       actions5.moveToElement(register).click().perform();
       
       WebElement confirmationMsg = edgedriver.findElement(By.xpath("/html/body/app-root/body/div/app-register-landing/app-register-success/div[1]/div/div[3]/div/h2"));
    			  System.out.println(confirmationMsg.getText());
     
       
       
       		
     
       
        
        
        
        
        
        
      
	    
	    
	    
	    

	    
	
}
	}

