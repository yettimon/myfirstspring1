package sta.edu.myfirstspring.service.cafedra.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.repository.CafedraRepository;
import sta.edu.myfirstspring.service.cafedra.interfaces.ICafedraService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CafedraServiceImpl implements ICafedraService {

//    @Autowired
//    DaoCafedraImpl daoCafedra;

    @Autowired
    CafedraRepository cafedraRepository;

    @Override
    public Cafedra create(Cafedra cafedra) {
        cafedra.setCreateAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        cafedra.setUpdateAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra delete(String id) {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public List getAll() {
        return cafedraRepository.findAll();
    }
}
