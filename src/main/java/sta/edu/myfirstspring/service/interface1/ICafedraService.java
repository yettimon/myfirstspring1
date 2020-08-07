package sta.edu.myfirstspring.service.interface1;

import sta.edu.myfirstspring.model.Cafedra;

import java.util.List;

public interface ICafedraService {

        Cafedra create (Cafedra cafedra);
        Cafedra get (String id);
        Cafedra delete (String id);
        Cafedra update (Cafedra cafedra);
        List<Cafedra> getAll ();
}
