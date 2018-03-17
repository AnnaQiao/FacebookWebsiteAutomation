//Author :  ANNA QIAO
//date:     4/3/2018
//WRITER OF TEST SCRIPT :ANNA QIAO
//Time: 12/01/2018  

package web.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.marionette", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/login/");
	}

	@After
	public void tearDown() throws Exception {
		// close browser
		driver.quit();
	}

	@Test
	public void login() {
		// step1
		driver.findElement(By.id("email")).sendKeys("02108681389");
		// step2
		driver.findElement(By.id("pass")).sendKeys("eeddd11111");
		// step3
		driver.findElement(By.id("loginbutton")).click();
		String acrualRST = driver.findElement(By.xpath("//div[@_4rbf _53ij']")).getText();

		assertEquals("The password that you've entered is incorrect.", acrualRST);
	}
}
