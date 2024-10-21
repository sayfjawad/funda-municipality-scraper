package scrape.src.main.java.nl.multicode.fundascraper.model.listing;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListingAdevrtisementTargetingData {

    private String taal;

    private String postcode;

    private String plaats;

    private String provincie;

    private String huisnummer;

    private String woonoppervlakte;

    private String vraagprijs;

    private String aantalkamers;

    private String soortobject;

    private String energieklasse;

    private String hoofdaanbieder;

    private String bouwvorm;

    private Boolean bedrijfsruimte;

    private String cvketel;

    private String branchevereniging;

    private Boolean dakterras;

    private Boolean tuin;

    private Boolean balkon;

    private String soortaanbieding;

    private String tinyid;

    private String vraagprijsrange;

    private String bouwjaar;

    private Boolean openhuis;

    private String gemeente;

    private String buurt;

    private Boolean monumentalestatus;

    private Boolean rijksmonument;

    private String soortaanbod;

    private Boolean energiezuinig;

    private Boolean kluswoning;

    private String adgroup;

    private String status;

    private Boolean zonnepanelen;

    private String environment;
}