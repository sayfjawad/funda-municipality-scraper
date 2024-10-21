package nl.multicode.scraper.model.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListingForRent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String link;

    private Integer price;

    private String address;

    private String description;

    private Date listSince;

    private String zipCode;

    private Integer size;

    private Integer year;

    private Integer livingArea;

    private String kindOfHouse;

    private String buildingType;

    private Integer numOfRooms;

    private Integer numOfBathrooms;

    private String layout;

    private String energyLabel;

    private String insulation;

    private String heating;

    private String exteriors;

    private String parking;

    private String neighborhoodName;

    private String dateList;

    private String term;
}
