package sta.edu.myfirstspring.dao.group.interfaces;

import sta.edu.myfirstspring.model.Group;

import java.util.List;

public interface 
IDaoGroup {

    Group create (Group Group);
    Group get (String id);
    Group delete (String id);
    Group update (Group Group);
    List<Group> getAll ();
    
}
