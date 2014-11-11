package Integration_layer;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Money, Long> {

}
