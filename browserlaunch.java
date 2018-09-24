package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserlaunch {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.imdb.com/title/tt1405406/");
		driver.getTitle();
		driver.close();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://tjmaxx.tjx.com/store/index.jsp");
		driver1.close();
		
	}

}
