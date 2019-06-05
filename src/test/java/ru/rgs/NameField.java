package ru.rgs;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NameField {
    public void test (){

        SelenideElement fieldName = $x("//input[@placeholder='NIKOLAEV NIKOLAY']");
        SelenideElement fieldAge = $x("//input[@placeholder='ДД.ММ.ГГГГ']");

        fieldName.scrollTo();
        fieldName.click();
        fieldName.sendKeys("IVANOV IVAN");

        fieldAge.click();
        fieldAge.sendKeys("01011990");
        fieldAge.sendKeys(Keys.TAB);

        String markName = fieldName.attr("class");
        String expName = "form-control validation-control-has-success";
        String markAge = fieldAge.attr("class");
        String expAge = "form-control width-xs-9rem width-sm-9rem validation-control-has-success";

        Assert.assertEquals(expName,markName);
        Assert.assertEquals(expAge,markAge);
    }
}
