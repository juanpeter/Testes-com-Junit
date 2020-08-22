package br.com.aprendaSeleniumComThiago.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import br.com.aprendaSeleniumComThiago.core.CoreDriver;

public class PageAlert{

	protected WebDriver driver;
	public PageAlert() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(name = "cusid")
	private WebElement idField;
	
	@FindBy(name = "submit")
	private WebElement submit;
	
	public void preencherId(String mensagem) {
		idField.sendKeys(mensagem);
	}
	
	public void submit() {
		submit.submit();
	}
	
	public void aceitarAlertLoop(int num) {
		while (num > 1) {
			driver.switchTo().alert().accept();
			num --;
		}
	}
}