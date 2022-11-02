package seleniumBasics;


import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResponseCodeOfWebsite {
	WebDriver driver;
	
	//We have to use 2 jars 1)Commons.io  2)fluent-hc 
	@Test
	public void f() throws Exception {
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		int response_code=0;
		response_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		
		if(response_code==200) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		}
		else {
			System.out.println("This is not correct response code");
		}
		
	}

}
