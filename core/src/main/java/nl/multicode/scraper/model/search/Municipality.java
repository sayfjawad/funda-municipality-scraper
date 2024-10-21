package nl.multicode.scraper.model.search;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Municipality {

    private final   Date date;

    private final  String name;

    private final  String url;

    private final  int nrOfListings;
}
