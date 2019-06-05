package ru.rgs;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ButtonOneTrip {
    public void test () {
        open("https://www.rgs.ru/products/private_person/tour/strahovanie_turistov/calc/index.wbp");
        SelenideElement button = $x("//button[@data-test-value='One']");
        button.click();
        String color = button.getCssValue("background-color");
        String expColor = "rgb(224, 186, 135)";

        Assert.assertEquals(expColor,color);
    }
}
