package br.com.aprendaSeleniumComThiago.test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.core.CoreDriver;

public class TesteDragAndDrop extends CoreBaseTest{
	

	@Test
	public void testeDragnDrop() {
		
		WebDriverWait wait = new WebDriverWait(CoreDriver.getDriver(), 30);
		
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='g-container-main']//li[4]//a[1]")));
		
		WebElement numAmount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement creditAmount = driver.findElement(By.xpath("//ol[@id='amt8']"));
		WebElement debitAmount = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement creditAccount = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement debitAccount = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions actionBuilder = new Actions(driver);
		Action multipleDragAndDrop = actionBuilder
				.clickAndHold(numAmount)
				.moveToElement(creditAmount)
				.release()
				.clickAndHold(numAmount)
				.moveToElement(debitAmount)
				.release()
				.clickAndHold(sales)
				.moveToElement(creditAccount)
				.release()
				.clickAndHold(bank)
				.moveToElement(debitAccount)
				.release()
				.build();
				
		 multipleDragAndDrop.perform();
						
		System.out.println("Success from drag and drop");
	}
}
