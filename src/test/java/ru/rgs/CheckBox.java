package ru.rgs;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBox {
    public void test(){

        SelenideElement checkBox = $x("//*[@id=\"calc-vzr-steps\"]/myrgs-steps-partner-auth/div[1]/div/div/div[1]/div[2]/div/div[1]/div/form/div[3]/adaptive-checkbox/label/label");

        //checkBox.scrollTo();
        checkBox.click();

        String check = checkBox.getAttribute("checked");
        Assert.assertEquals("true",check);
    }
}
