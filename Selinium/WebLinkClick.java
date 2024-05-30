package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebLinkClick extends Set{
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions A = new Actions(driver);
		WebElement mobible = driver.findElement(By.xpath("//a[normalize-space()='Mobiles & More']"));
		A.moveToElement(mobible).perform();

		WebElement link = driver.findElement(By.xpath("//a[@alt='Smartphones & Tablet|Apple|NA|NA|CT@Apple']"));
		A.clickAndHold(link).perform();
		
		WebElement apple = driver.findElement(By.xpath("//a[@alt='Home|CT4P7|Mobiles & |NA|Smartphones & Tablet|Apple|NA|NA|CT@Apple']"));
		A.clickAndHold(apple).perform();
		System.out.println(apple.getText());
	}
}
