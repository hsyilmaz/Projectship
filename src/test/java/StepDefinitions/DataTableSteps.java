package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DataTableSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            if (listElement.get(i).equals("editButton")){
                wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
            }
            dc.findAndClick(listElement.get(i));
            if (listElement.get(i).equals("stageTwo"))
            {
                Actions actions = new Actions(GWD.getDriver());
                actions.keyDown(Keys.TAB).perform();
                actions.keyUp(Keys.TAB).perform();
            }
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
            // listin ilk elemanına(webelement adı), ikinci elemanı yani değeri gönder
        }
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndDelete(listElement.get(i));
            // listin ilk elemanına(webelement adı), ikinci elemanı yani değeri gönder
        }
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successVerify","successfully");
    }

}
