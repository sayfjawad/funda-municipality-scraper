package nl.multicode.scraper.repository;

import nl.multicode.scraper.model.db.ListingUrl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingUrlRepository extends CrudRepository<ListingUrl, Long> {

}
