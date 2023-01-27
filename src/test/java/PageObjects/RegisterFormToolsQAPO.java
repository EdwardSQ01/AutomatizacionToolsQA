package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterFormToolsQAPO extends WebBasePage {

    @FindBy(id = "firstName")
    private WebElement inputFirstName;

    @FindBy(id = "lastName")
    private WebElement inpuLastName;

    @FindBy(id = "userEmail")
    private WebElement inputEmail;
    @FindBy(xpath = "//label[text()='Male']")
    private WebElement radioButtonMale;
    @FindBy(id = "userNumber")
    private WebElement inputUserNumber;

    @FindBy(xpath = "//label[text()='Subjects']//following::input")
    private WebElement inputSubjects;
    @FindBy(xpath = "//label[text()='Sports']")
    private WebElement radioButtonSports;

    @FindBy(xpath = "//label[text()='Current Address']")
    private WebElement inputAdress;


    public void sendKeysInputFirstName(String firstName) {
        waitUntilElementIsVisible(inputFirstName, 20);
        inputFirstName.sendKeys(firstName);
    }

    public void sendKeysInputLastName(String lastName) {
        waitUntilElementIsVisible(inpuLastName, 20);
        inpuLastName.sendKeys(lastName);
    }

    public void sendKeysInputEmail(String email) {
        waitUntilElementIsVisible(inputEmail, 20);
        inputEmail.sendKeys(email);
    }

    public void clickRadioButtonMale() {
        waitUntilElementIsVisible(radioButtonMale, 5);
        radioButtonMale.click();
    }

    public void sendKeysUserNumber(String usernumber) {
        waitUntilElementIsVisible(inputUserNumber, 5);
        inputUserNumber.sendKeys(usernumber);
    }

    public void sendKeysinputSubjects() {
        waitUntilElementIsVisible(inputSubjects, 5);
        inputSubjects.sendKeys("Economics");
        inputSubjects.sendKeys(Keys.TAB);
    }

    public void clickRadioButtonSports() {
        waitUntilElementIsVisible(radioButtonSports, 5);
        radioButtonSports.click();

    }

    public void setInputAdress () {
        waitUntilElementIsVisible(inputAdress, 3);
        inputAdress.sendKeys("Prueba");


    }

}

