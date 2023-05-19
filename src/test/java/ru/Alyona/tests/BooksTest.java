package ru.Alyona.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



@Tag("DNS")
public class BooksTest extends TestBase {

    @Test
    public void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://rudari.ru/");
        $(".catalog-search__input").setValue("великие русские художники").pressEnter();
        $$("article.catalog__list").first().shouldHave(text("великие русские художники"));


    }

}


