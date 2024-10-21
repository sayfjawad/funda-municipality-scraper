package nl.multicode.scraper.model.search;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class ListingForSaleResult {

    private final String propertyId;

    private final String city;

    private final String url;
}
