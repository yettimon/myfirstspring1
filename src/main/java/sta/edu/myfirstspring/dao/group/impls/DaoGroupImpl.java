package sta.edu.myfirstspring.dao.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sta.edu.myfirstspring.dao.group.interfaces.IDaoGroup;
import sta.edu.myfirstspring.datastorage.DataFake;
import sta.edu.myfirstspring.model.Group;

import java.util.List;

@Repository

public class DaoGroupImpl implements IDaoGroup {

    @Autowired
    DataFake datafake;

    @Override
    public Group create(Group Group) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public Group update(Group Group) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return datafake.getGroups();
    }
}
