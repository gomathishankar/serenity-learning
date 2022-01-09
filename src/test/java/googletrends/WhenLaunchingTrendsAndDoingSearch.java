package googletrends;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLaunchingTrendsAndDoingSearch {

    @Managed
    WebDriver driver;

    GoogleTrendsHome googleTrendsHome;

    @Test
    @Title("Sally launches the URL and completes a search")
    public void testSearchTerm(){
        googleTrendsHome.launchTrendsURL();
        googleTrendsHome.searchFor("Cricket");
    }
}
