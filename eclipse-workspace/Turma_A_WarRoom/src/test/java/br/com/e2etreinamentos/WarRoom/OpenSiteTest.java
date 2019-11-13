package br.com.roomscrool.aulas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteTest {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\Momoku-San\\IdeaProjects\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://www.youtube.com/?hl=pt&gl=BR");
	}

}
