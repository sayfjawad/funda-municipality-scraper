package nl.multicode.scraper.scraper;

public interface SingleArgumentScraper<T, R> {

    R scrape(final T source);

}
