package scrape.src.main.java.nl.multicode.fundascraper.model.listing;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListingDataTracking {

    @JsonProperty("listing_offering_type")
    private String listingOfferingType;

    @JsonProperty("content_tags")
    private List<String> contentTags;

    @JsonProperty("site")
    private String site;

    @JsonProperty("site_section")
    private String siteSection;

    @JsonProperty("site_locale")
    private String siteLocale;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("page_type")
    private String pageType;

    @JsonProperty("logged_in")
    private boolean loggedIn;

    @JsonProperty("full_path")
    private String fullPath;

    @JsonProperty("full_url")
    private String fullUrl;

    @JsonProperty("hashedemail")
    private String hashedEmail;

    @JsonProperty("hashedemailsalted")
    private String hashedEmailSalted;

    @JsonProperty("funda_user_id")
    private String fundaUserId;

}
