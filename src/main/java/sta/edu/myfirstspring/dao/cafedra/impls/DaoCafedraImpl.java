package sta.edu.myfirstspring.dao.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sta.edu.myfirstspring.dao.cafedra.interfaces.IDaoCafedra;
import sta.edu.myfirstspring.datastorage.DataFake;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.repository.CafedraRepository;

import java.util.List;
@Repository
public class DaoCafedraImpl implements IDaoCafedra {

    @Autowired
    DataFake dataFake;

    @Override
    public Cafedra create(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra get(String id) {
        return null;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return  dataFake.getCafedras();
    }
}
