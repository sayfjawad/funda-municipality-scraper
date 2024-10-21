package nl.multicode.scraper.model.search;

import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class ListingSearchPageResult {

    private final int searchPageNumber;

    private final Set<String> propertyForSaleUrls;

}
