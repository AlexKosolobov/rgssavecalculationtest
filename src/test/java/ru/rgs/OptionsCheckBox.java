package ru.rgs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class OptionsCheckBox {
    public void test(){

        SelenideElement economCheck = $x("/html/body/div[8]/div/div/div/div/table/tbody/tr[25]/td[2]");
        SelenideElement comfortCheck = $x("/html/body/div[8]/div/div/div/div/table/tbody/tr[25]/td[3]");


        economCheck.shouldNot(Condition.exist);
        comfortCheck.shouldNot(Condition.exist);


    }
}
