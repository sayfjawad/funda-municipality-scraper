# funda-scraper

Scraping property data from Funda (a Dutch website for selling/renting property)

## Requirements

To build the runnable jar you will need:

* Java 17+
* Apache Maven

## How to build

Go to the project directory and run the following command:

```
FundaScraper-Java$ mvn clean package  
```

This will result in a jar file in the project sub dir:

```
FundaScraper-Java/application/target/application-0.0.1-SNAPSHOT.jar
```

## Run

You can run the program by running the command after the building process using the following
command:

```
FundaScraper-Java$ java -jar application/target/application-0.0.1-SNAPSHOT.jar
```

## Usage

Open your browser and use the following link:
[http://localhost:8080/swagger-ui/index.html#/funda-controller/getArea](http://localhost:8080/swagger-ui/index.html#/funda-controller/getArea)

Searchable areas can be found on [funda](https://www.funda.nl/koop/bladeren/heel-nederland/?actpnl=Plaatsnaam)

You will get web-interface to request a scraping of an area:
![img.png](swagger-ui.png)



That will result if used correctly to a result in json format that looks like:

```
[
  {
    "link": "https://www.funda.nl/koop/utrecht/huis-42213771-van-den-broekstraat-98/",
    "price": "€ 625.000 kosten koper",
    "address": "Van den Broekstraat 98",
    "listSince": "1-9-2023",
    "zipCode": "3544 MV",
    "plotSize": "142 m²",
    "year": "2006",
    "livingArea": "138 m²",
    "livingVolume": "488 m³",
    "kindOfHouse": "Eengezinswoning, tussenwoning",
    "buildingType": "Bestaande bouw",
    "numOfRooms": "6 kamers (5 slaapkamers)",
    "numOfBathrooms": "1 badkamer en 1 apart toilet",
    "energyLabel": "A",
    "insulation": "Dubbel glas en volledig geïsoleerd",
    "heating": "Stadsverwarming",
    "ownership": "Volle eigendom",
    "garden": "Achtertuin en voortuin",
    "backyard": "59 m² (11,1 meter diep en 5,3 meter breed)",
    "gardenLocation": "Gelegen op het noordwesten bereikbaar via achterom",
    "location": "Aan rustige weg en in woonwijk",
    "balconyTerrace": "na",
    "parking": "Parkeerplaats",
    "parkingCapacity": "na",
    "parkingType": "Op eigen terrein en openbaar parkeren",
    "neighborhoodName": "utrecht/het-zand-west",
    "listingDate": "1-9-2023",
    "term": "na",
    "lastAskPrice": "na",
    "lastAskPricePerSquareMeter": "4.529"
  },
  {
    "link": "https://www.funda.nl/koop/utrecht/appartement-42992328-villa-rood-bouwnr-4/",
    "price": "€ 950.000 vrij op naam",
    "address": "Villa Rood (Bouwnr. 4)",
    "listSince": "21-10-2022",
    "zipCode": "3541 EN",
    "plotSize": "na",
    "year": "2023",
    "livingArea": "159 m²",
    "livingVolume": "416 m³",
    "kindOfHouse": "na",
    "buildingType": "Nieuwbouw",
    "numOfRooms": "4 kamers (3 slaapkamers)",
    "numOfBathrooms": "1 badkamer en 1 apart toilet",
    "energyLabel": "na",
    "insulation": "Volledig geïsoleerd",
    "heating": "Stadsverwarming en gehele vloerverwarming",
    "ownership": "na",
    "garden": "Zonneterras",
    "backyard": "na",
    "gardenLocation": "na",
    "location": "Aan rustige weg, aan water, in centrum en in woonwijk",
    "balconyTerrace": "na",
    "parking": "na",
    "parkingCapacity": "na",
    "parkingType": "Parkeergarage",
    "neighborhoodName": "utrecht/leeuwesteyn",
    "listingDate": "21-10-2022",
    "term": "na",
    "lastAskPrice": "na",
    "lastAskPricePerSquareMeter": "5.975"
  }
 ]
```

## History

This project is created as an example of how to collect a dataset from a website for the purpose of
usage in machine-learning due to the lack of ways of actually collecting data and doing this in
Java!
It is inspired by a similar project written in Python https://github.com/whchien/funda-scraper. The
reason this project was created is my need for datasets to use in my study and ML-endeavours as
Funda seems to be a useful website full of dirty-data that is relevant for enhancing a programmers
skill in acquiring and using scraped data.

## Disclaimer

Funda-Scaper provides a REST-interface to scrape datasets from Funda, the Dutch housing website for
non-commercial use.

## License
Dear user,

Thank you for your interest in [funda-scraper]. We would like to inform you about the licensing conditions that govern the use, modification, and distribution of our software.

[funda-scraper] is licensed under the GNU Affero General Public License (AGPL). This is a free software license that allows you to:

1) Use the software for any purpose that does not harm funda in any way.
2) Study and modify the source code.
3) Distribute the software to others.
4) Share modifications and improvements with the community.
However, there are certain conditions you need to be aware of:

* If you modify and distribute the software, you must disclose your changes and make the modified source code available. This ensures that improvements and modifications benefit everyone.

* If you run a modified program on a server and let other users communicate with it there, your server must also allow them to download the modified source code. This ensures that users can benefit from improvements even if they're only interacting with the software over a network.

* You cannot sublicense the software. Any user who gets the software (either the original or a modified version) directly or indirectly from you will have the same rights you did, under the same terms.

* The AGPL is designed to ensure that everyone benefits from the software and any improvements made to it, whether those improvements are made public or are used internally on a networked server.

Please ensure that you fully understand and comply with the terms of the AGPL when using, modifying, or distributing [funda-scraper]. The full text of the AGPL can be found at the official GNU website.

Thank you for respecting our choice of license, and we hope you find [funda-scraper] valuable for your needs.

### Please note:
Scraping this website is only allowed for personal use (as per Funda's Terms and Conditions).
Any commercial use of this package is prohibited. The author holds no liability for any
misuse of the program.