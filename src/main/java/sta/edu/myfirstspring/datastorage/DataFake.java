package sta.edu.myfirstspring.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.model.Group;
import sta.edu.myfirstspring.repository.CafedraRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository

public class DataFake {
    @Autowired
    CafedraRepository cafedraRepository;

//    private List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
//        new Cafedra("ipz", "Ivanov ", "Engeneering","zad"),
//        new Cafedra("ipz1", "Ivanov ", "Engeneering","zad"),
//        new Cafedra("ipz2", "Ivanov ", "Engeneering","zad"),
//        new Cafedra("ipz3", "Ivanov ", "Engeneering","zad"))

    private List<Cafedra> cafedras = new LinkedList<>(Arrays.asList(
            new Cafedra("Ivanov ", "Engeneering","zad"),
            new Cafedra("Ivanov2 ", "Engeneering","zad"),
            new Cafedra("Ivanov3 ", "Engeneering","zad")

    ));


    @PostConstruct
    private void init (){
        cafedraRepository.saveAll(cafedras);
    }

    private List<Group> groups = new LinkedList<>(Arrays.asList(
         new Group("1","543","kn", cafedras.get(0)),
         new Group("2","243","kn", cafedras.get(1)),
         new Group("3","643","kn", cafedras.get(2))));


public List<Cafedra> getCafedras(){
    return cafedras;
}

    public List<Group> getGroups(){
        return groups;
    }

}