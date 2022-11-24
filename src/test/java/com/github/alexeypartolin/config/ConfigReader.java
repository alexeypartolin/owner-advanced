package com.github.alexeypartolin.config;

import com.github.alexeypartolin.config.web.WebConfig;
import org.aeonbits.owner.ConfigFactory;

public enum ConfigReader {
    Instance;

    private static final WebConfig webConfig =
            ConfigFactory.create(
                    WebConfig.class,
                    System.getProperties()
            );

    public WebConfig read() {
        return webConfig;
    }
}
