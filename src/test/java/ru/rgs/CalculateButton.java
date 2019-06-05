package ru.rgs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CalculateButton {
    public void test(){

        SelenideElement calculateButton = $x("//*[@id=\"calc-vzr-steps\"]/myrgs-steps-partner-auth/div[1]/div/div/div[1]/div[2]/div/div[1]/div/form/div[4]/button");
        SelenideElement conditions = $x("//*[@id=\"calc-vzr-steps\"]/myrgs-steps-partner-auth/div[1]/div/div/div[1]/div[3]/div/div/div/div[1]/span[2]/strong");
        SelenideElement price = $x("/html/body/div[4]/div[5]/div/div[1]/myrgs-steps-partner-auth/div[1]/div/div/div[2]/div[2]/div/div[1]/div/form/div[1]/div[2]/div[2]/div[8]/div[1]/span");

        calculateButton.scrollTo();
        calculateButton.click();

        conditions.waitUntil(Condition.visible,10000);
        conditions.scrollTo();

        $x("//*[@id=\"calc-vzr-steps\"]/myrgs-steps-partner-auth/div[1]/div/div/div[2]/div[2]/div/div[1]/div/form/div[1]/div[2]/div[1]").shouldBe(Condition.visible);
        $x("//*[@id=\"calc-vzr-steps\"]/myrgs-steps-partner-auth/div[1]/div/div/div[2]/div[2]/div/div[1]/div/form/div[1]/div[2]/div[2]").shouldBe(Condition.visible);
        $x("//*[@id=\"calc-vzr-steps\"]/myrgs-steps-partner-auth/div[1]/div/div/div[2]/div[2]/div/div[1]/div/form/div[1]/div[2]/div[3]").shouldBe(Condition.visible);

        Assert.assertEquals("4 дня",conditions.text());
        Assert.assertEquals("2 217,44",price.text());
    }
}
