package nl.multicode.scraper.scraper;

import java.io.IOException;
import java.util.List;

public interface StaticScraper<T> {

    List<T> scrape() throws IOException;
}
