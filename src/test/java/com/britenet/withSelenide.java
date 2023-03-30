package com.britenet;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static common.constants.Constants.*;

public class withSelenide {


    @Test
    public void openBrowser() {
        open(URL);
        $("button[data-cookiebanner='accept_button']").click();
        $(By.id("email")).setValue(EMAIL);
        $(By.id("pass")).setValue(PASSWORD);
        $(By.name("login")).click();
        $("div[aria-label='Messenger'][tabindex='0']").shouldBe(Condition.visible);


    }


}
