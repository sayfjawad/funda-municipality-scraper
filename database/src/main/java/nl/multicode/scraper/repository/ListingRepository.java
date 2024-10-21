package nl.multicode.scraper.repository;

import nl.multicode.scraper.model.db.ListingForSale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends CrudRepository<ListingForSale, Long> {

}
