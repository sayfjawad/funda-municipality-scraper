package scrape.src.main.java.nl.multicode.fundascraper.model.listing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListingGTM {

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("isAnonymous")
    private String isAnonymous;

    @JsonProperty("language")
    private String language;

    @JsonProperty("seriousness")
    private String seriousness;

    @JsonProperty("pagetype")
    private String pagetype;

    @JsonProperty("allowPersonalisatie")
    private String allowPersonalisatie;

    @JsonProperty("allowAdvertenties")
    private String allowAdvertenties;

    @JsonProperty("allowAnalytisch")
    private String allowAnalytisch;

    @JsonProperty("allowFunctioneel")
    private String allowFunctioneel;

    @JsonProperty("explicitAcceptOfCookies")
    private String explicitAcceptOfCookies;

    @JsonProperty("makelaarVestigingnummer")
    private String makelaarVestigingnummer;

    @JsonProperty("makelaarsvereniging")
    private String makelaarsvereniging;

    @JsonProperty("brochure")
    private String brochure;

    @JsonProperty("foto360")
    private String foto360;

    @JsonProperty("plattegrond")
    private String plattegrond;

    @JsonProperty("toppositie")
    private String toppositie;

    @JsonProperty("video")
    private String video;

    @JsonProperty("promolabel")
    private String promolabel;

    @JsonProperty("inbeeld")
    private String inbeeld;

    @JsonProperty("veiling")
    private String veiling;

    @JsonProperty("veilingproduct")
    private String veilingproduct;

    @JsonProperty("openhuizendagpromotiepakket")
    private String openhuizendagpromotiepakket;

    @JsonProperty("soortaanbod")
    private String soortaanbod;

    @JsonProperty("objectType")
    private String objectType;

    @JsonProperty("soortObject")
    private String soortObject;

    @JsonProperty("aangebodensinds")
    private String aangebodensinds;

    @JsonProperty("koopprijs")
    private String koopprijs;

    @JsonProperty("huurprijs")
    private String huurprijs;

    @JsonProperty("aantalfotos")
    private String aantalfotos;

    @JsonProperty("globalId")
    private String globalId;

    @JsonProperty("soortPlaatsing")
    private String soortPlaatsing;

    @JsonProperty("plaats")
    private String plaats;

    @JsonProperty("postcode")
    private String postcode;

    @JsonProperty("provincie")
    private String provincie;

    @JsonProperty("flex")
    private String flex;

    @JsonProperty("functie_context")
    private String functieContext;

}