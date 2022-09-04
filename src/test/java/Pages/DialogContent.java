package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    private WebElement successVerify;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement searchInputOne;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement searchInputTwo;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton2;

    @FindBy(css = "ms-search-button button")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(css = "ms-edit-button>button")
    private WebElement editButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "(//ms-text-field//input)[3]")
    private WebElement name_F;

    @FindBy(xpath = "(//ms-text-field//input)[4]")
    private WebElement code_F;

    @FindBy(xpath = "(//mat-select[@role]//div[@cdk-overlay-origin])[2]")
    private WebElement fieldType;

    @FindBy (xpath = "(//mat-option[@role='option'])[2]")
    private WebElement text;

    @FindBy(css = "[formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "//*[contains(@formcontrolname,'Stage')]")
    private WebElement stageOne;

    @FindBy(xpath = "(//*[@role='option'])[2]")
    private WebElement stageTwo;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "searchInputOne":
                myElement = searchInputOne;
                break;
            case "searchInputTwo":
                myElement = searchInputTwo;
                break;
            case "name_F":
                myElement = name_F;
                break;
            case "code_F":
                myElement = code_F;
                break;
            case "description":
                myElement = description;
                break;


        }

        // burda string isimden webelemente ulaşıcam
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "addButton2":
                myElement = addButton2;
                break;
            case "searchButton":
                myElement = searchButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "editButton":
                myElement = editButton;
                break;
            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;
            case "fieldType":
                myElement = fieldType;
                break;
            case "text":
                myElement = text;
                break;
            case "stageOne":
                myElement = stageOne;
                break;
            case "stageTwo":
                myElement = stageTwo;
                break;


        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "successVerify":
                myElement = successVerify;
                break;

        }
        verifyContainsText(myElement, text);
    }


    public void searchAndDelete(String searchText) {
        findAndSend("searchInputOne", searchText);// arama kutucuguna kelimeyi yaz
        findAndClick("searchButton");// arama butonuna bas
        waitUntilLoading();
        findAndClick("deleteButton");// silme butonuna bas
        findAndClick("deleteDialogButton");// diyalogdaki silme butonuna bas
    }


}
