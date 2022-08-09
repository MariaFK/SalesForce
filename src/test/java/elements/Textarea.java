package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Textarea {
    private static final String TEXTAREA_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::label//following-sibling::textarea";
    private String labelText;
    private WebDriver driver;

    public Textarea(WebDriver driver, String labelText){
        this.labelText = labelText;
        this.driver = driver;
    }

    public void inputText(String text){
        String finalXpath = String.format(TEXTAREA_XPATH, labelText);
        driver.findElement(By.xpath(finalXpath)).sendKeys(text);
    }
}
