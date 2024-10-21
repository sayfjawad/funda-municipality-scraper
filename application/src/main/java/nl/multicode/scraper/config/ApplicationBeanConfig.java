package nl.multicode.scraper.config;

import nl.multicode.scraper.client.JsoupClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfig {

    @Bean
    public JsoupClient getClient() {

        return new JsoupClient();
    }
}
