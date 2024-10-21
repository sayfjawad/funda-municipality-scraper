//package nl.multicode.fundascraper.scraper;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//import lombok.SneakyThrows;
//import nl.multicode.fundascraper.config.ConfigProperties;
//import nl.multicode.fundascraper.config.ConfigProperties.Header;
//import nl.multicode.fundascraper.extractor.CssSelectionExtractor;
//import nl.multicode.fundascraper.extractor.SearchResultListingUrlsExtractor;
//import nl.multicode.fundascraper.model.search.RequestedPages;
//import nl.multicode.scraper.client.JsoupClient;
//import org.apache.commons.io.IOUtils;
//import org.jsoup.Jsoup;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//class ListingSearchResultsScraperTest {
//
//
//    @Mock
//    private ConfigProperties config;
//
//    @Mock
//    private CssSelectionExtractor cssSelectionExtractor;
//
//    @Mock
//    private JsoupClient client;
//
//    @Mock
//    private SearchResultListingUrlsExtractor urlsExtractor;
//
//    @InjectMocks
//    private FundaListingSearchResultsParallelScraper scraper;
//
//
//    @BeforeEach
//    public void setup() {
//
//        final var header = mock(Header.class);
//        when(config.getHeader()).thenReturn(header);
//        when(header.getUserAgent()).thenReturn("user-agent");
//    }
//
//    @Test
//    @SneakyThrows
//    @DisplayName("given a numberOfRequestedPages equal to 1"
//            + "when the Html contains more than 3 pages"
//            + "then only 1 page will be requested and processed to extract URLs")
//    void scrape() {
//
//        final var content = IOUtils.toString(
//                Objects.requireNonNull(
//                        getClass().getResourceAsStream("/ThreePaginationResults.html")),
//                StandardCharsets.UTF_8);
//
//        final var document = Jsoup.parse(content);
//        when(client.getDocument(anyString(), anyString())).thenReturn(document);
//        final Set<String> url1 = Set.of("url1");
//        final Set<String> url2 = Set.of("url2");
//        final Set<String> url3 = Set.of("url3");
//        when(urlsExtractor.extractURLs(any()))
//                .thenReturn(url1)
//                .thenReturn(url2)
//                .thenReturn(url3);
//
//        var urls = scraper.scrape("place", RequestedPages.SINGLE);
//        assertThat(urls).contains("url1");
//        verify(urlsExtractor, times(1)).extractURLs(any());
//    }
//
//    @Test
//    @SneakyThrows
//    @DisplayName("given highestPage is less than numberOfRequestedPages"
//            + "when the Html has 3 pages"
//            + "and numberOfRequestedPages is 4"
//            + "then only 3 pages will be requested and processed to extract URLs")
//    void scrapeWithLessPages() {
//
//        final var content = IOUtils.toString(
//                Objects.requireNonNull(
//                        getClass().getResourceAsStream("/ThreePaginationResults.html")),
//                StandardCharsets.UTF_8);
//
//        final var document = Jsoup.parse(content);
//        when(client.getDocument(anyString(), anyString())).thenReturn(document);
//
//        // Mock different URL sets for each page
//        final var url1 = new HashSet<String>();
//        url1.add("url1");
//        when(urlsExtractor.extractURLs(any()))
//                .thenReturn(url1)
//                .thenReturn(Set.of("url2"))
//                .thenReturn(Set.of("url3"));
//
//        var urls = scraper.scrape("place", RequestedPages.ALL);
//        assertThat(urls).contains("url1", "url2", "url3");
//        verify(urlsExtractor, times(3)).extractURLs(any());
//    }
//
//    @Test
//    @SneakyThrows
//    @DisplayName("Exception scenario: when dependent services throw exceptions")
//    void scrapeWithException() {
//
//        when(client.getDocument(anyString(), anyString())).thenThrow(
//                new IOException("Test Exception"));
//
//        assertThrows(IOException.class, () -> scraper.scrape("place", RequestedPages.ALL));
//    }
//
//}