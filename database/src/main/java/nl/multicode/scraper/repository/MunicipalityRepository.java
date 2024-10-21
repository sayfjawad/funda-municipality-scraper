package nl.multicode.scraper.repository;

import nl.multicode.scraper.model.db.Municipality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipalityRepository extends CrudRepository<Municipality, Long> {

}
