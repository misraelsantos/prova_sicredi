package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdicionarClientePage {

	public final String NAME = "//input[@id='field-customerName']";
	public final String LASTNAME = "//input[@id='field-contactLastName']";
	public final String FIRSNAME = "//input[@id='field-contactFirstName']";
	public final String PHONE = "//input[@id='field-phone']";
	public final String ADDRES_LINE_1 = "//input[@id='field-addressLine1']";
	public final String ADDRES_LINE_2 = "//input[@id='field-addressLine2']";
	public final String CITY = "//input[@id='field-city']";
	public final String STATE = "//input[@id='field-state']";
	public final String POSTAL_CODE = "//input[@id='field-postalCode']";
	public final String COUNTRY = "//input[@id='field-country']";
	public final String SALESREPEMPLOYEENUMBER = "//*[@name='salesRepEmployeeNumber']";
	public final String CREDITLIMIT = "//input[@id='field-creditLimit']";
	public final String BOTAO_SAVE = "//button[@id='form-button-save']";
	public final String MENSAGEM_SUCESSO = "//div[@id='report-success']";
	
	public void escreverNome(ChromeDriver driver) {
		driver.findElement(By.xpath(NAME)).sendKeys("Teste Sicredi");	
	}
	public void escreverLastName(ChromeDriver driver) {
		driver.findElement(By.xpath(LASTNAME)).sendKeys("Teste");
	}
	public void escreverFirstName(ChromeDriver driver) {
		driver.findElement(By.xpath(FIRSNAME)).sendKeys("Misrael Santos");
	}
	public void escreverPhone(ChromeDriver driver) {
		driver.findElement(By.xpath(PHONE)).sendKeys("51 9999-9999");
	}
	public void escreverAddressLine1(ChromeDriver driver) {
		driver.findElement(By.xpath(ADDRES_LINE_1)).sendKeys("Av Assis Brasil, 3970");

	}
	public void escreverAddressLine2(ChromeDriver driver) {
		driver.findElement(By.xpath(ADDRES_LINE_2)).sendKeys("Torre D");
		
	}
	public void escreverCity(ChromeDriver driver) {
		driver.findElement(By.xpath(CITY)).sendKeys("Porto Alegre");
	}
	public void escreverState(ChromeDriver driver) {
		driver.findElement(By.xpath(STATE)).sendKeys("RS");
	}
	public void escreverPostalCode(ChromeDriver driver) {
		driver.findElement(By.xpath(POSTAL_CODE)).sendKeys("91000-000");
	}
	public void escreverCountry(ChromeDriver driver) {
		driver.findElement(By.xpath(COUNTRY)).sendKeys("Brasil");
	}
	public void escreverSalesRepEmployeeNumber(ChromeDriver driver) {
		driver.findElement(By.xpath(SALESREPEMPLOYEENUMBER)).sendKeys("Fixter");
	}
	public void escreverCreditLimit(ChromeDriver driver) {
		driver.findElement(By.xpath(CREDITLIMIT)).sendKeys("200");
	}
	public void clicarBotaoSave(ChromeDriver driver) {
		driver.findElement(By.xpath(BOTAO_SAVE)).click();
	}
	public void validarMensagemSucesso(ChromeDriver driver) {
		driver.findElement(By.xpath(MENSAGEM_SUCESSO)).getText().contentEquals("Your data has been successfully stored into the database.");
	}
}
