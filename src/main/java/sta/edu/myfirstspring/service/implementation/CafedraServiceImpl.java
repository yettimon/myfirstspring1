package sta.edu.myfirstspring.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sta.edu.myfirstspring.dao.cafedra.impls.DaoCafedraImpl;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.repository.CafedraRepository;
import sta.edu.myfirstspring.service.interface1.ICafedraService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service

public class CafedraServiceImpl implements ICafedraService {
//
//    @Autowired
//    DaoCafedraImpl daoCafedra;

    @Autowired
    CafedraRepository cafedraRepository;

    @Override
    public Cafedra create(Cafedra cafedra) {

        cafedra.setUpdateAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {

        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra delete(String id) {

        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;

    }

    @Override
    public Cafedra update(Cafedra cafedra) {

        cafedra.setUpdateAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public List<Cafedra> getAll() {
        return cafedraRepository.findAll();
    }

}
