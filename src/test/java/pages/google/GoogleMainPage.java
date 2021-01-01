package pages.google;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleMainPage {
    public GoogleMainPage open() {
        Selenide.open("/");
        return this;
    }

    public GoogleResultsPage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return new GoogleResultsPage();
    }
}