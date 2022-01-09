package googletrends;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class GoogleTrendsHome extends UIInteractions {

    @Step("Launch the URL")
    public void launchTrendsURL(){
        openUrl("https://trends.google.com/trends/?geo=IN");
    }

    @Step("Search for {0}")
    public void searchFor(String searchTerm){
        $("#input-254[type=search]").sendKeys(searchTerm, Keys.ENTER);
    }

}
