package ru.alyona.config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:${env}.properties",
}
)
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    Browser getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("baseUrl")
    @DefaultValue("https://rudari.ru/")
    String getBaseUrl();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("remoteUrl")
    String getRemoteUrl();

}

