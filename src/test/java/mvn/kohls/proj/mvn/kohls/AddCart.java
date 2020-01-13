package mvn.kohls.proj.mvn.kohls;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\eclipse-workspace\\Sample.proj\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kohls.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("t-shirt",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Mens T-Shirts Category Image']")).click();
driver.findElement(By.xpath("//*[@id=\"pmpMain-rightPanel\"]/div[1]/div[4]/ul/li[1]/div[1]/a/img")).click();
String value = driver.findElement(By.xpath("//h1[@class='pdp-product-title']")).getText();

System.out.println(value);
File loc=new File("C:\\Users\\fazil\\eclipse-workspace\\proj.mvn.kohls\\Data_Ex\\sample.xlsx");
FileOutputStream s=new FileOutputStream(loc);
Workbook w=new XSSFWorkbook();
Cell Cell = w.createSheet().createRow(1).createCell(0);
Cell.setCellValue(value);
w.write(s);


Thread.sleep(5000);

driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[2]/a[2]")).click();
driver.findElement(By.xpath("//*[@id=\"addtobagID\"]")).click();




driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/a[2]")).click();
driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();

	}

}
