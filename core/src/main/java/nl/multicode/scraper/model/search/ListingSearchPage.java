package nl.multicode.scraper.model.search;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class ListingSearchPage {

    private final String area;

    private final int numberOfPages;

    private final ListingType listingType;

}
