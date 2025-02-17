package pages.demoqa.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebUtilities;

import java.util.List;

public class BookRow extends WebUtilities {

    @FindBy(css = ".rt-td")
    public List<WebElement> cells;

    public String getTitle(){
        return cells.get(1).getText();
    }

    public String getAuthor(){
        return cells.get(2).getText();
    }

    public String getPublisher(){
        return cells.get(3).getText();
    }
}
