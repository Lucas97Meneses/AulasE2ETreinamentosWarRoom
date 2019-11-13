package br.com.e2etreinamentos.WarRoom;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenTextoTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Momoku-San\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.google.com.br/"); 
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		WebElement buscar = driver.findElement(By.name("q"));
		buscar.sendKeys("E2E Treinamentos");
		buscar.submit();
		WebElement texto = driver.findElement(By.xpath("//*[@id=\"rhs_block\"]/div/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div/span"));
		assertTrue("Texto encontrado", texto.getText().contentEquals("E2E Treinamentos"));
		
	}
}