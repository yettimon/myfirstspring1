package sta.edu.myfirstspring.dao.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import sta.edu.myfirstspring.dao.cafedra.interfaces.IDaoCafedra;
import sta.edu.myfirstspring.model.Cafedra;

import java.util.List;

public class DaoCafedraImpl implements IDaoCafedra {

    @Autowired
    DaoCafedraImpl daoCafedra;


    @Override
    public Cafedra create(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra get(String id) {
        return null;
    }

    @Override
    public Cafedra delete(String id) {
        return null;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        return null;
    }

    @Override
    public List<Cafedra> getAll() {
        return null;
    }
}
