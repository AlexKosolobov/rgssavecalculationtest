package ru.rgs;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SportTest {
    public void test(){

        SelenideElement sport = $x("//div[@class='sections']/div[1]/div[1]/div[1]");
        SelenideElement approveSport = $x("//div[@class='toggle toggle-rgs']/div/label[1]");

        sport.scrollTo();
        sport.click();

        String markColor = approveSport.getCssValue("background-color");
        String expColor = "rgb(230, 190, 138)";

        String markText = approveSport.text();


        Assert.assertEquals(expColor,markColor);
        Assert.assertEquals("да", markText);

    }
}
