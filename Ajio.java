//SAMPLE PROGRAM TO IMPLEMENT LIST :
//**********************************
//1. Launch the URL https://www.ajio.com/
//2. In the search box, type as "bags" and press enter
//3. To the left  of the screen under " Gender" click the "Men"
//4. Under "Category" click "Fashion Bags"
//5. Print the count of the items Found. 
//6. Get the list of brand of the products displayed in the page and print the list.
//7. Get the list of names of the bags and print it

package week3.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser and load the URL "https://www.ajio.com/"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Type "bags" and press ENTER key in Search Box
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(2000);

		// Select the Gender filter as "Male"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);

		// Select the Category filter as "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);

		// Find and print the count of search results found
		System.out.println("\n");
		String searchResultCount = driver.findElement(By.className("length")).getText();
		System.out.println("Item Count: "+ searchResultCount+" found");

		// Get the list of product brand displayed in the search result page and print
		// the list
		System.out.println("\n");
		System.out.println("*BAG BRANDS LIST*");
		List<WebElement> bagBrandsList = driver.findElements(By.className("brand"));
		System.out.println(" Total # of Brands: " + bagBrandsList.size());

		for (WebElement webElement : bagBrandsList) {
			String text = webElement.getText();
			System.out.println(text);
		}

		// Get the list of names of the bags and print it
		System.out.println("\n");
		System.out.println("*BAG NAMES LIST*");
		List<WebElement> bagNamesList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNamesList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNamesList) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}