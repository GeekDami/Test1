package tf1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleiumTest {
	
	//private WebDriver driver;
	
	@Test
	public void mainTest() throws Exception {
		System.out.println("open browser");	
		//driver = createFireFoxDriver();
		//driver.navigate().to("http://www.cisco.com/");
	}
	
	private FirefoxDriver createFireFoxDriver() {
		FirefoxProfile profile = new FirefoxProfile(); //new ProfilesIni().getProfile("default");
		profile.setPreference("webdriver.load.stratagy", "fast");
		profile.setPreference("browser.download.useToolkitUI", "true");
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");
		return new FirefoxDriver(profile);
	}

}
