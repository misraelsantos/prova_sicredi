package scenarios;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AdicionarClientePage;
import pages.HomePage;

public class Testes {
	static ChromeDriver driver = new ChromeDriver();
	HomePage pageHome = new HomePage();
	AdicionarClientePage pageAdd = new AdicionarClientePage();
	
	@BeforeClass
	public 	static void beforeClass() {
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
	}
	
	@Test
	public void cadastrarCliente() {
		pageHome.comboSwitch_theme(driver);
		pageHome.botaoAddRecord(driver);
		pageAdd.escreverNome(driver);
		pageAdd.escreverLastName(driver);
		pageAdd.escreverFirstName(driver);
		pageAdd.escreverPhone(driver);
		pageAdd.escreverAddressLine1(driver);
		pageAdd.escreverAddressLine2(driver);
		pageAdd.escreverCity(driver);
		pageAdd.escreverState(driver);
		pageAdd.escreverPostalCode(driver);
		pageAdd.escreverCountry(driver);
		pageAdd.escreverSalesRepEmployeeNumber(driver);
		pageAdd.escreverCreditLimit(driver);
		pageAdd.clicarBotaoSave(driver);
		pageAdd.validarMensagemSucesso(driver);
	}
	@AfterClass	
	public static void fechar() {
		driver.quit();
	}
}
