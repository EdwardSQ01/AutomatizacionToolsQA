package PageObjects;

import Definitions.Hooks;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class WebBasePage extends PageObject {

    public void openPageToolsQA(String url) {
        Hooks.getDriver().get(url);
    }

    public WebElement getElement(String xpath, String option){
        return element(By.xpath(xpath.replace("Replaceable", option)));
    }

    public boolean isVisible(WebElement element){
        try {
            return element.isDisplayed();
        }catch (Exception e) {
            return false;
        }
    }

    public void waitUntilElementIsVisible(WebElement element,int time){
        new WebDriverWait(Hooks.getDriver(),time).until(ExpectedConditions.visibilityOf(element));

    }

    public void waitTime (int time) {

        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
