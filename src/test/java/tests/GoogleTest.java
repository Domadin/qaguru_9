package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.google.GoogleMainPage;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    GoogleMainPage googlePage = new GoogleMainPage();

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "http://google.com/";
    }

    @Test
    public void userCanSearch() {
        googlePage.open()
                .searchFor("selenide")

                .assertResultsCount(7)
                .assertResultPresence(0, "Selenide: лаконичные и стабильные UI тесты на Java");
    }

    @Test
    void searchYandex() {
        open("https://www.yandex.ru/");
        $("#text").setValue("Selenide").pressEnter();
        $("html").shouldHave(Condition.text("selenide.org"));
    }
}
