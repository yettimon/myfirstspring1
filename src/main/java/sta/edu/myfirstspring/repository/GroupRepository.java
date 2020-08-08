package sta.edu.myfirstspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.model.Group;

@Repository

public interface GroupRepository extends MongoRepository<Group,String> {
}
