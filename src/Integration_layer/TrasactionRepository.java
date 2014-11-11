package Integration_layer;

import org.springframework.data.repository.CrudRepository;

public interface TrasactionRepository extends CrudRepository<Money, Long> {

}