package nl.multicode.scraper.scraper;

import java.io.IOException;
import java.util.List;
import nl.multicode.scraper.model.search.ListingType;
import nl.multicode.scraper.model.search.RequestedPages;

public interface ScraperService<T> {

    List<T> scrape(String area, ListingType listingType, RequestedPages requestedPages)
            throws IOException;

}
