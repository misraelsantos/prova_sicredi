package scenarios;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AdicionarClientePage;
import pages.HomePage;

public class Testes {
	static ChromeDriver driver = new ChromeDriver();
	
	HomePage pageHome = new HomePage(driver);
	AdicionarClientePage pageAdd = new AdicionarClientePage(driver);
	
	@BeforeClass
	public 	static void beforeClass() {
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
	}
	
	@Test
	public void cadastrarCliente() {
		pageHome.comboSwitch_theme();
		pageHome.botaoAddRecord();
		pageAdd.escreverNome();
		pageAdd.escreverLastName();
		pageAdd.escreverFirstName();
		pageAdd.escreverPhone();
		pageAdd.escreverAddressLine1();
		pageAdd.escreverAddressLine2();
		pageAdd.escreverCity();
		pageAdd.escreverState();
		pageAdd.escreverPostalCode();
		pageAdd.escreverCountry();
		pageAdd.escreverSalesRepEmployeeNumber();
		pageAdd.escreverCreditLimit();
		pageAdd.clicarBotaoSave();
		pageAdd.validarMensagemSucesso();
	}
	@AfterClass	
	public static void fechar() {
		driver.quit();
	}
}