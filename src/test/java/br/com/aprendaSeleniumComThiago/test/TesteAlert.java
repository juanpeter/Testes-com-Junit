package br.com.aprendaSeleniumComThiago.test;


import org.junit.Test;
import org.openqa.selenium.By;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;

public class TesteAlert extends CoreBaseTest{
	
	@Test
	public void testeAlert() {
						
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("automação");
		driver.findElement(By.name("submit")).submit();
				
		int retries = 1;

		while (retries > 0) {
			driver.switchTo().alert().accept();
			retries --;
		}
										
		System.out.println("Success from Alert");
	}
}
