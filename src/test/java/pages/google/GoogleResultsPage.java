package pages.google;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GoogleResultsPage {
    private final ElementsCollection results = $("#search").$$(".g");

    @Step("Убедиться в количестве результатов поиска равному {size}")
    public GoogleResultsPage assertResultsCount(int size) {
        results.shouldHaveSize(size);
        return this;
    }

    @Step("Убедиться в наличии результата поиска {text} по порядковому номеру {index}")
    public GoogleResultsPage assertResultPresence(int index, String text) {
        results.get(index).shouldHave(text(text));
        return this;
    }
}
