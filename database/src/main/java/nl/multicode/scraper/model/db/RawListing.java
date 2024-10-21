package nl.multicode.scraper.model.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RawListing {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    private OffsetDateTime date;

    private String link;

    private String document;

    private ListingType type;

    enum ListingType {
        SELL, RENT
    }
}
