package sta.edu.myfirstspring.service.cafedra.interfaces;

import sta.edu.myfirstspring.model.Cafedra;

import java.util.List;

public interface ICafedraService {
    Cafedra create (Cafedra cafedra);
    Cafedra get (String id);
    Cafedra update (Cafedra cafedra);
    Cafedra delete (String id);
    List getAll ();
}
