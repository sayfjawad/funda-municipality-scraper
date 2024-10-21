package nl.multicode.scraper.model.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListingUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private OffsetDateTime date;

    private String url;

    private String area;
}
