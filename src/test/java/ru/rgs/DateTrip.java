package ru.rgs;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DateTrip {
    public void test (){

        SelenideElement startDateField = $x("//input[@placeholder='Туда']");
        SelenideElement startDate = $x("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[1]");
        SelenideElement endDateField = $x("//input[@placeholder='Обратно']");
        SelenideElement endDate = $x("/html/body/div[11]/div[1]/table/tbody/tr[5]/td[7]");

        startDateField.scrollTo();

        startDateField.click();
        $x("/html/body/div[11]/div[1]/table/thead/tr[2]/th[3]").click();
        startDate.click();

        endDateField.click();
        endDate.click();

        String markStart = startDateField.attr("class");
        String expMarkStart = "form-control input-trip-date collapsing-in collapsing-out validation-control-has-success";
        String markEnd = endDateField.attr("class");
        String expMarkEnd = "form-control input-trip-date collapsing-in collapsing-out validation-control-has-success";

        Assert.assertEquals("Проверяем Наличие зеленого кружка с галочкой на поле Туда", expMarkStart,markStart);
        Assert.assertEquals("Проверяем Наличие зеленого кружка с галочкой на поле Обратно", expMarkEnd,markEnd);

    }
}
