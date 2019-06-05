package ru.rgs;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CountryField {
    public void test () {
        SelenideElement field = $x("//input[@class='form-control-multiple-autocomplete-actual-input tt-input']");
        field.click();
        field.sendKeys("ни");
        field.sendKeys(Keys.DOWN.toString()+Keys.DOWN.toString()+Keys.DOWN.toString()+ Keys.ENTER.toString());

        String nameCountry = $x("//span[@class='label label-primary']").getText();
        String expCountry = "Нигерия";

        Assert.assertEquals(nameCountry, expCountry);
    }
}
