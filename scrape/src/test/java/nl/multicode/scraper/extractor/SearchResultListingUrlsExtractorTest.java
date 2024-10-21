package nl.multicode.scraper.extractor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Set;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SearchResultListingUrlsExtractorTest {

    private SearchResultListingUrlsExtractor extractor;

    private ObjectMapper mapper;

    private Element mockElement;

    @BeforeEach
    public void setUp() {

        mapper = new ObjectMapper();
        mockElement = mock(Element.class);
        extractor = new SearchResultListingUrlsExtractor(mapper);
    }

    @Test
    public void testExtractURLs_validElement_returnsURLs() throws Exception {

        String mockJsonData = "{\"itemListElement\": [{\"url\": \"http://example.com\"}]}";

        when(mockElement.data()).thenReturn(mockJsonData);

        Set<String> result = extractor.extractURLs(mockElement);

        assertThat(result).isNotEmpty();
        assertThat(result).hasSize(1);
        assertThat(result).contains("http://example.com");
    }

    @Test
    @DisplayName("Given a null Element\n"
            + "When extractURLs is called\n"
            + "Then an empty Set is returned\n")
    void testExtractURLs_nullElement_returnsEmptySet() throws JsonProcessingException {

        Set<String> result = extractor.extractURLs(null);

        assertThat(result).isEmpty();
    }

    // Additional test scenarios can be added for JsonProcessingException or malformed JSONs.
}
