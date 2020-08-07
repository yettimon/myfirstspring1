package sta.edu.myfirstspring.service.group.interfaces;

import sta.edu.myfirstspring.model.Group;

import java.util.List;

public interface IGroupService {


    Group create (Group Group);
    Group get (String id);
    Group delete (String id);
    Group update (Group Group);
    List<Group> getAll ();

}
