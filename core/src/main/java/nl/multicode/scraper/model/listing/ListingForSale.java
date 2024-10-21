package nl.multicode.scraper.model.listing;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ListingForSale {

    private final String link;

    private final String price;

    private final String address;

    private final String description;

    private final String listSince;

    private final String zipCode;

    private final String plotSize;

    private final String year;

    private final String livingArea;

    private final String livingVolume;

    private final String kindOfHouse;

    private final String buildingType;

    private final String numOfRooms;

    private final String numOfBathrooms;

    private final String energyLabel;

    private final String insulation;

    private final String heating;

    private final String ownership;


    private final String garden;

    private final String backyard;

    private final String gardenLocation;

    private final String location;

    private final String balconyTerrace;

    private final String parking;

    private final String parkingCapacity;

    private final String parkingType;

    private final String neighborhoodName;

    private final String listingDate;

    private final String dateSold;

    private final String term;

    private final String priceSold;

    private final String lastAskPrice;

    private final String lastAskPricePerSquareMeter;
}
