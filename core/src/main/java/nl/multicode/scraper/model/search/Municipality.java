package nl.multicode.scraper.model.search;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Municipality {

    private Date date;

    private String name;

    private String url;

    private int nrOfListings;
}
