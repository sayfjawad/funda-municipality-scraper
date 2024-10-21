package nl.multicode.scraper.api;

import java.io.IOException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import nl.multicode.scraper.model.search.Municipality;
import nl.multicode.scraper.scraper.StaticScraperService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/funda/search")
public class FundaController {

    private final StaticScraperService<Municipality> municipalityScraper;

    @GetMapping("/municipalities")
    public ResponseEntity<List<Municipality>> getMunicipalities() throws IOException {

        final var municipalities = municipalityScraper.scrape();
        return ResponseEntity.ok(municipalities);
    }
}
