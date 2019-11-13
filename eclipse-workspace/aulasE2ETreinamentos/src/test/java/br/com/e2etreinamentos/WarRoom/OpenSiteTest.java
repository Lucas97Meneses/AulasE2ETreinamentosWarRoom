package br.com.e2etreinamentos.WarRoom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Momoku-San\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testOpenSite() {
		driver.get("https://www.superanimes.org/");
	}

}
