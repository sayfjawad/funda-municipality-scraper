package nl.multicode.scraper.scraper;

import java.io.IOException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.multicode.scraper.model.search.Municipality;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FundaMunicipalityScraperService implements StaticScraperService<Municipality> {

    private final StaticScraper<Municipality> municipalityStaticScraper;

    @Override
    public List<Municipality> scrape() throws IOException {
        return municipalityStaticScraper.scrape();
    }
}
