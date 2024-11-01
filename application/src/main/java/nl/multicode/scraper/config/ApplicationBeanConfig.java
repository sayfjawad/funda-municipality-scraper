package nl.multicode.scraper.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import nl.multicode.scraper.client.JsoupClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfig {

    @Bean
    public JsoupClient getClient() {

        return new JsoupClient();
    }

    @Bean
    public OpenAPI customOpenAPI() {

        final var openapi = new OpenAPI();
        openapi.addServersItem(new Server().url("https://fundamunicipalityscraper.multicode.nl"));
        openapi.addServersItem(new Server().url("http://fundamunicipalityscraper.multicode.nl"));
        openapi.addServersItem(new Server().url("http://localhost:8080"));
        return openapi;
    }
}
