package nl.multicode.scraper.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "scheduler")
public class SchedulerConfig {

    private String municipalityCron;

}
