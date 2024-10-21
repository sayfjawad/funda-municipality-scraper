package nl.multicode.scraper.model.search;

import java.util.Arrays;
import lombok.Getter;

@Getter
public enum RequestedPages {
    SINGLE("single"), ALL("all");

    private final String value;

    RequestedPages(final String name) {

        this.value = name;
    }


    public static RequestedPages fromValue(final String value) {

        return Arrays.stream(RequestedPages.values())
                .filter(v -> v.getValue().equals(value))
                .findFirst()
                .orElse(SINGLE);
    }
}
