package nl.multicode.scraper.extractor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CssSelectionExtractorTest {

    private CssSelectionExtractor extractor;

    @BeforeEach
    void setUp() {

        extractor = new CssSelectionExtractor();
    }

    @Test
    void getScriptElementContainingURLs_ValidScript_ReturnsElement() {

        String html = "<html><head><script type='application/ld+json'>{'key':'value'}</script></head><body></body></html>";
        Document document = Jsoup.parse(html);

        Element result = extractor.getScriptElementContainingURLs(document);

        assertNotNull(result);
        assertEquals("application/ld+json", result.attr("type"));
    }

    @Test
    void getScriptElementContainingURLs_NoScript_ReturnsNull() {

        String html = "<html><head></head><body></body></html>";
        Document document = Jsoup.parse(html);

        Element result = extractor.getScriptElementContainingURLs(document);

        assertEquals(null, result);
    }
}
