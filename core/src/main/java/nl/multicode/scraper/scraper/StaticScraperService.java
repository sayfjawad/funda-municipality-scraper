package nl.multicode.scraper.scraper;

import java.io.IOException;
import java.util.List;

public interface StaticScraperService<T> {

    List<T> scrape() throws IOException;

}
