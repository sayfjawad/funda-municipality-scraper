package nl.multicode.scraper.model.search;

import java.util.Arrays;
import lombok.Getter;

@Getter
public enum ListingType {
    BUY("buy"), RENT("rent");

    private final String value;

    ListingType(final String name) {

        this.value = name;
    }


    public static ListingType fromValue(final String value) {

        return Arrays.stream(ListingType.values())
                .filter(v -> v.getValue().equals(value))
                .findFirst()
                .orElse(BUY);
    }
}

