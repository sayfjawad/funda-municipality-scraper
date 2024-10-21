package nl.multicode.scraper.service;


import java.io.IOException;
import java.time.OffsetDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.multicode.scraper.model.search.Municipality;
import nl.multicode.scraper.repository.MunicipalityRepository;
import nl.multicode.scraper.scraper.StaticScraper;
import nl.multicode.scraper.service.config.SchedulerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MunicipalityService {

    private final MunicipalityRepository repository;

    private final StaticScraper<Municipality> scraper;

    @Scheduled(cron = "0 42 4 * * *")
    public void updateMunicipalities() throws IOException {

        log.info("Updating municipalities!");
        final var municipalities = scraper.scrape().stream()
                .map(m -> nl.multicode.scraper.model.db.Municipality.builder()
                        .date(OffsetDateTime.now())
                        .url(m.getUrl())
                        .name(m.getName())
                        .nrOfListings(m.getNrOfListings())
                        .build())
                .toList();
        log.info("Scraped {} municipalities!", municipalities.size());
        log.info("Started - saving {} municipalities!", municipalities.size());
        repository.saveAll(municipalities);
        log.info("Finished - saving {} municipalities!", municipalities.size());
    }
}
