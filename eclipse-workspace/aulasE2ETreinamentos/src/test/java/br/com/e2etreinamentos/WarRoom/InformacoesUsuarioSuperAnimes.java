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

public class InformacoesUsuarioSuperAnimes {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Momoku-San\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.superanimes.org/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.id("geral")).findElement(By.xpath("/html/body/div[10]/div/div[1]/span/img")).click();
		driver.findElement(By.xpath("/html/body")).click();
		driver.findElement(By.id("boxLogo")).findElement(By.xpath("//*[@id=\"menuHbox\"]/nav/div[2]/div[1]/img")).findElement(By.id("myLogin")).click();;
	}
}
