package nl.multicode.scraper.scraper;

import java.util.Date;
import java.util.function.Function;
import nl.multicode.scraper.model.search.Municipality;
import org.jsoup.nodes.Element;

public interface MunicipalityMapper {

    String A = "a";
    String HREF = "href";
    String EMPTY_STRING = "";
    String NUMBER_SELECT_REGEX = "[^0-9]";

    default Function<Element, Municipality> mapElementMunicipalityFunction() {

        return municipality -> Municipality.builder()
                .date(new Date())
                .name(municipality.select(A).text())
                .url(municipality.select(A).attr(HREF))
                .nrOfListings(
                        Integer.parseInt(
                                municipality.text().replaceAll(NUMBER_SELECT_REGEX, EMPTY_STRING)))
                .build();
    }

}
