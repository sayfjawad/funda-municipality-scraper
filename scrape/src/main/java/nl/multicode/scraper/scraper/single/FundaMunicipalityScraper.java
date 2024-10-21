package nl.multicode.scraper.scraper.single;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import nl.multicode.scraper.config.ConfigProperties;
import nl.multicode.scraper.model.search.Municipality;
import nl.multicode.scraper.scraper.MunicipalityMapper;
import nl.multicode.scraper.scraper.StaticScraper;
import nl.multicode.scraper.client.JsoupClient;
import org.jsoup.nodes.Element;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FundaMunicipalityScraper implements StaticScraper<Municipality>, MunicipalityMapper {

    private final JsoupClient client;

    @Override
    public List<Municipality> scrape() throws IOException {

        final var municipalitiesUrl = ConfigProperties.BASE_URL + ConfigProperties.MUNICIPALITIES_URI;

        return getStream(municipalitiesUrl)
                .map(mapElementMunicipalityFunction())
                .toList();
    }

    private Stream<Element> getStream(final String municipalitiesUrl)
            throws IOException {

        return client.getDocument(municipalitiesUrl)
                .select("li.browse-area")
                .stream();
    }
}
