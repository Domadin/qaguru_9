package pages.google;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleMainPage {

    @Step("Открыть страницу google")
    public GoogleMainPage open() {
        Selenide.open("http://google.com/");
        return this;
    }

    @Step("Выполнить поиск по запросу '{text}'")
    public GoogleResultsPage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return new GoogleResultsPage();
    }
}