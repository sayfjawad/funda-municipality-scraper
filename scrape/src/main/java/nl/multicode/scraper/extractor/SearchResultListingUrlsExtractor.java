package nl.multicode.scraper.extractor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashSet;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SearchResultListingUrlsExtractor {

    private final ObjectMapper mapper;

    public Set<String> extractURLs(final Element scriptElementContainingURLs)
            throws JsonProcessingException {

        if (scriptElementContainingURLs != null) {
            final var jsonNode = mapper.readTree(scriptElementContainingURLs.data());
            final var urls = new HashSet<String>();

            jsonNode.get("itemListElement").forEach(item -> urls.add(item.get("url").textValue()));
            return urls;
        }
        return Set.of();
    }
}
