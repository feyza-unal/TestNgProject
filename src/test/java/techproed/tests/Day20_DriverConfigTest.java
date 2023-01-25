package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day20_DriverConfigTest {
    @Test
    public void firstTest(){
//        amazon a git
//       driver -> Driver.getDriver()
//        ConfigReader.getProperty("amazon_url") -> https://www.amazon.com
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url")); // diger kullanim driver.get("https://www.amazon.com")
        //configuration properties den cektik

//        title in amazon icerdigini test et
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));

//        close driver
        Driver.closeDriver();
    }
}
