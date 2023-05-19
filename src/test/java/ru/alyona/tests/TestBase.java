package ru.alyona.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import ru.alyona.config.ConfigReader;
import ru.alyona.config.WebConfig;
import ru.alyona.config.WebConfigForProject;


public class TestBase {
    private static final WebConfig config = ConfigReader.Instance.read();

    @BeforeAll
    public static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebConfigForProject webConfigForProject = new WebConfigForProject(config);
        webConfigForProject.webConfig();
    }
}
