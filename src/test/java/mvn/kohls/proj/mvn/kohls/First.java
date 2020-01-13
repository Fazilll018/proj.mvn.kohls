package mvn.kohls.proj.mvn.kohls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\eclipse-workspace\\Sample.proj\\lib\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.kohls.com/");
				driver.findElement(By.id("search")).sendKeys("t-shirt",Keys.ENTER);
				driver.findElement(By.xpath("//img[@alt='Mens T-Shirts Category Image']")).click();
				for(int i=0; i<3;i++){
					List<WebElement> Results = driver.findElements(By.xpath("//div[@class='prod_img_block']"));
				Results.get(i).click();
				String value = driver.findElement(By.xpath("//h1[@class='pdp-product-title']")).getText();

				System.out.println(value);
				String value2 = driver.findElement(By.xpath("//div[@class='main-price']")).getText();
				System.out.println(value2);
				driver.navigate().back();
				} 
				
			}
	}


