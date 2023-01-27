package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {
    @Test
    public void openSourceLogin(){

//        1.Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

//        2.Page Objesi Olustur
        OpenSourcePage openSourcePage = new OpenSourcePage();

//        3.Bu obj kullanarak o classdaki objelere ulas
        openSourcePage.username.sendKeys("Admin");
        openSourcePage.password.sendKeys("admin123");
        openSourcePage.submitButton.click();
    }
}
