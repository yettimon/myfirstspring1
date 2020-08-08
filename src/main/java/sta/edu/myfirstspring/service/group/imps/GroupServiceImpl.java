package sta.edu.myfirstspring.service.group.imps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sta.edu.myfirstspring.dao.group.impls.DaoGroupImpl;
import sta.edu.myfirstspring.model.Group;
import sta.edu.myfirstspring.repository.GroupRepository;
import sta.edu.myfirstspring.service.group.interfaces.IGroupService;

import java.util.List;

@Service

public class GroupServiceImpl implements IGroupService {

    @Autowired
    DaoGroupImpl daoGroup;

    @Override
    public Group create(Group cafedra) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group update(Group cafedra) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return daoGroup.getAll();
    }

}
