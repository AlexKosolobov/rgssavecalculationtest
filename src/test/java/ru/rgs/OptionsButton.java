package ru.rgs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OptionsButton {
    public void test(){

        SelenideElement button = $x("/html/body/div[4]/div[5]/div/div[1]/myrgs-steps-partner-auth/div[1]/div/div/div[2]/div[2]/div/div[1]/div/form/div[1]/div[2]/div[2]/div[7]/button");
        button.click();

        SelenideElement popup = $x("/html/body/div[9]/div/div");
        popup.shouldBe(Condition.visible);
    }
}
