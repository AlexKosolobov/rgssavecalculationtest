package ru.rgs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RgaSaveCalculationTest {

    @Test
        public void a_buttonOneTrip() {
            ButtonOneTrip buttonOneTrip = new ButtonOneTrip();
            buttonOneTrip.test();
    }

    @Test
        public void b_countryField(){
            CountryField countryField = new CountryField();
            countryField.test();
        }

    @Test
        public void c_dataTrip(){
            DateTrip dateTrip = new DateTrip();
            dateTrip.test();
    }

    @Test
        public void d_nameField(){
            NameField nameField = new NameField();
            nameField.test();
    }

    @Test
        public void e_sportTest(){
        SportTest sportTest = new SportTest();
        sportTest.test();
    }

    @Test
        public void f_popupSport(){
        PopupSportTest popupSportTest = new PopupSportTest();
        popupSportTest.test();
    }

    @Test
        public void g_CheckBox(){
        CheckBox checkBox = new CheckBox();
        checkBox.test();
    }

    @Test
        public void h_CalculateButton(){
        CalculateButton calculateButton = new CalculateButton();
        calculateButton.test();
    }

    @Test
        public void i_OptionsButton(){
        OptionsButton optionsButton = new OptionsButton();
        optionsButton.test();
    }

    @Test
        public void j_OptionCheckbox(){
        OptionsCheckBox optionsCheckBox = new OptionsCheckBox();
        optionsCheckBox.test();
    }
}
