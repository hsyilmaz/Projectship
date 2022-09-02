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

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[@table='true']//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    private WebElement successVerify;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(css = "[data-icon='square-xmark']>path")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;//input[aria-required='false']


    @FindBy(css = "ms-search-button button")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(css = "[type='submit']")
    private WebElement deleteDialogButton;

    @FindBy(css = "[formcontrolname='budgetAccountIntegrationCode']>input")
    private WebElement integrationCode;

    @FindBy(css = "[formcontrolname='priority']>input")
    private WebElement priorityCode;

    @FindBy(css = "[formcontrolname='firstName']>input")
    private WebElement firstName;

    @FindBy(css = "[formcontrolname='lastName']>input")
    private WebElement lastName;

    @FindBy(css = "[aria-label='Open calendar']")
    private WebElement dateOfBirth;

    @FindBy(css = "[class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")
    private WebElement dateOfBirth1;

    @FindBy(css = "[formcontrolname='gender']")
    private WebElement gender;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement male;

    @FindBy(css = "[formcontrolname='types']")
    private WebElement employeeType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement superVisor;

    @FindBy(css = "[formcontrolname='employeeId']")
    private WebElement employeeId;

    @FindBy(css = "[formcontrolname='qualification']")
    private WebElement qualification;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement secondaryTechnical ;

    @FindBy(css = "[data-placeholder='Citizenship']")
    private WebElement citizenship ;


    @FindBy(css = "[data-placeholder='Nationality']")
    private WebElement nationality ;

    @FindBy(css = "[formgroupname='documentInfo'] mat-select")
    private WebElement documentType ;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement passport ;

    @FindBy(css = "[data-placeholder='Document Number']")
    private WebElement documentNumber ;

    @FindBy(css = "[data-placeholder='Personal ID']")
    private WebElement personelId ;

    @FindBy(css = "[placeholder='School Department']")
    private WebElement schoolDepartment ;

    @FindBy(css = "[formcontrolname='phone']")
    private WebElement phone ;

    @FindBy(css = "[formcontrolname='email']")
    private WebElement email ;

    @FindBy(css = "[formcontrolname='country']")
    private WebElement country ;


    @FindBy(css = "[formcontrolname='city']")
    private WebElement city ;

    @FindBy(css = "[formcontrolname='street']")
    private WebElement street ;

    @FindBy(css = "[formcontrolname='postalCode']")
    private WebElement postalCode ;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton2 ;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priorityCode":
                myElement = priorityCode;
                break;
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "employeeId":
                myElement = employeeId;
                break;
            case "citizenship":
                myElement = citizenship;
                break;
            case "nationality":
                myElement = nationality;
                break;
            case "documentNumber":
                myElement = documentNumber;
                break;
            case "personelId":
                myElement = personelId;
                break;
            case "schoolDepartment":
                myElement = schoolDepartment;
                break;
            case "phone":
                myElement = phone;
                break;
            case "email":
                myElement = email;
                break;
            case "country":
                myElement = country;
                break;
            case "city":
                myElement = city;
                break;
            case "street":
                myElement = street;
                break;
            case "postalCode":
                myElement = postalCode;
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
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogButton":
                myElement = deleteDialogButton;
                break;
            case "acceptCookies":
                myElement = acceptCookies;
                break;
            case "dateOfBirth":
                myElement = dateOfBirth;
                break;
            case "dateOfBirth1":
                myElement = dateOfBirth1;
                break;
            case "gender":
                myElement = gender;
                break;
            case "male":
                myElement = male;
                break;
            case "employeeType":
                myElement = employeeType;
                break;
            case "superVisor":
                myElement = superVisor;
                break;
            case "qualification":
                myElement = qualification;
                break;
            case "secondaryTechnical":
                myElement = secondaryTechnical;
                break;
            case "documentType":
                myElement = documentType;
                break;
            case "passport":
                myElement = passport;
                break;
            case "deleteButton2":
                myElement = deleteButton2;
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
            case "alreadyExist":
                myElement = alreadyExist;
                break;


        }
        verifyContainsText(myElement, text);
    }

    public void searchAndDelete(String searchText) {
        findAndSend("searchInput", searchText);// arama kutucuguna kelimeyi yaz
        findAndClick("searchButton");// arama butonuna bas
        waitUntilLoading();
        findAndClick("deleteButton");// silme butonuna bas
        findAndClick("deleteDialogButton");// diyalogdaki silme butonuna bas
    }


}
