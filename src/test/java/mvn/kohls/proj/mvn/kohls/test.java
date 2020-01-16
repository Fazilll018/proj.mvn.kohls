package mvn.kohls.proj.mvn.kohls;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\eclipse-workspace\\Sample.proj\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kohls.com/product/prd-923076/urban-pipeline-heather-tee-men.jsp?color=Zinfandel&prdPV=1");
	
	

		
		Thread.sleep(5000);

driver.findElement(By.xpath("//a[@title='M']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"addtobagID\"]")).click();

	}

}
