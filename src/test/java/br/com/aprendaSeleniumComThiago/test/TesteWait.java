package br.com.aprendaSeleniumComThiago.test;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.core.CoreDriver;

public class TesteWait extends CoreBaseTest{
	

	@Test
	public void testeWait() {
		driver.navigate().to("http://demo.guru99.com/test/login.html");
		driver.findElement(By.name("email")).sendKeys("johndoe@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("johndoe@gmail.com");
		driver.findElement(By.name("SubmitLogin")).submit();
		
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='error-copy']")));
		Assert.assertEquals("Successfully Logged in...", driver.findElement(By.xpath("//div[@class='error-copy']")).getText());
		System.out.println("Success");
	}
}
