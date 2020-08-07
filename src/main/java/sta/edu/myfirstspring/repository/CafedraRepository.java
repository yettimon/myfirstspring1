package sta.edu.myfirstspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sta.edu.myfirstspring.model.Cafedra;

@Repository

public interface CafedraRepository extends MongoRepository<Cafedra,String> {




}
