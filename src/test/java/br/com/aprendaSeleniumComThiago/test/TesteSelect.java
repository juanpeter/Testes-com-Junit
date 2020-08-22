package br.com.aprendaSeleniumComThiago.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;

public class TesteSelect extends CoreBaseTest{
	

	@Test
	public void testeSelect() {
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Doe");
		driver.findElement(By.name("phone")).sendKeys("999999999999");
		driver.findElement(By.name("userName")).sendKeys("johndoe@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("John doe street, 999");
		driver.findElement(By.name("city")).sendKeys("Acity");
		driver.findElement(By.name("state")).sendKeys("Astate");
		driver.findElement(By.name("postalCode")).sendKeys("99999999");
		
		Select dropwdownCountry = new Select(driver.findElement(By.name("country")));
		dropwdownCountry.selectByValue("BRAZIL");
		
		driver.findElement(By.name("submit")).submit();

										
		System.out.println("Success from Select");
	}
}
