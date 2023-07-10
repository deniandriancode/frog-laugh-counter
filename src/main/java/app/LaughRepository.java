package app;

import org.springframework.data.repository.*;

public interface LaughRepository extends CrudRepository<Laugh, Long> {

    Laugh findFirstByOrderByIdDesc();

}
