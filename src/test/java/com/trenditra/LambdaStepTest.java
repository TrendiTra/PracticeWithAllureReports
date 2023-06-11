package com.trenditra;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepTest {

    private final String Url = "https://github.com";
    private final String Repository = "TrendiTra/PracticeWithAllureReports";

    @Test
    public void issueSearchTestInGithubWithLambda() {
        step("Открыть сайт: " + Url, () -> {
            open(Url);
        });
        step("Выполнить поиск репозитория: " + Repository, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(Repository);
            $(".header-search-input").submit();
        });
        step("Открыть найденный репозиторий", () -> {
            $(linkText(Repository)).click();
        });
        step("Проверить название Issue в репозитории", () -> {
            $("#issues-tab").shouldHave(text("Issues"));
        });
    }
}
