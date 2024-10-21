package nl.multicode.scraper.extractor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CssSelectionExtractor {

    public Element getScriptElementContainingURLs(final Document searchPageResult) {

        return searchPageResult.select(
                "script[type=application/ld+json]").first();
    }

}
