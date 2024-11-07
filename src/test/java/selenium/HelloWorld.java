package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/Users/dwive/Hello-World/src/test/resources/Drivers/msedgedriver.exe");
	    WebDriver edgedriver =new EdgeDriver();
	    
	    edgedriver.get("https://www.selenium.dev/");
	    edgedriver.close();
	
	}
	
}
