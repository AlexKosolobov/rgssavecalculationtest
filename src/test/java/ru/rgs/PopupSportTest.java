package ru.rgs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PopupSportTest {
    public void test () {

        $x("//div[@class='pull-left margin-top-ms--5']/a[1]").click();

        SelenideElement amateurSportButton = $x("//button[@data-active-rest-type='AmateurSports']/span[contains(text(),'Любительский спорт')]");

        amateurSportButton.click();

        String buttonColor = amateurSportButton.getCssValue("background-color");
        String expButtonColor = "rgb(224, 186, 135)";

        Assert.assertEquals(buttonColor,expButtonColor);

    }
}
