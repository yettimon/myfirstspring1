package sta.edu.myfirstspring.dao.cafedra.interfaces;

import sta.edu.myfirstspring.model.Cafedra;

import java.util.List;

public interface IDaoCafedra {


    Cafedra create (Cafedra cafedra);
    Cafedra get (String id);
    Cafedra delete (String id);
    Cafedra update (Cafedra cafedra);
    List<Cafedra> getAll ();
}
