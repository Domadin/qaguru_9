package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.google.GoogleMainPage;

public class GoogleTest extends BaseTest {

    GoogleMainPage googlePage = new GoogleMainPage();

    @Test
    @DisplayName("Выполнить поиск selenide в google")
    public void selenideSearch() {
        googlePage.open()
                .searchFor("selenide")
                .assertResultPresence(0, "Selenide: лаконичные и стабильные UI тесты на Java");
    }
}
