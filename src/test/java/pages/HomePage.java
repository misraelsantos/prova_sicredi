package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	ChromeDriver driver;
	
	public final String COMBO_SWITCH_THEME = "//select[@id='switch-version-select']";
	public final String BOTAO_ADD_RECORD = "//body/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/a[1]";
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void comboSwitch_theme() {
		Select optionYear = new Select(driver.findElement(By.xpath(COMBO_SWITCH_THEME)));
		optionYear.selectByVisibleText("Bootstrap V4 Theme");
	}
	public void botaoAddRecord() {
		driver.findElement(By.xpath(BOTAO_ADD_RECORD)).click();
	}
}
	


