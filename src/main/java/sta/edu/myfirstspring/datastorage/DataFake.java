package sta.edu.myfirstspring.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.model.Group;
import sta.edu.myfirstspring.repository.CafedraRepository;
import sta.edu.myfirstspring.repository.GroupRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository

public class DataFake {
    @Autowired
    CafedraRepository cafedraRepository;
    @Autowired
    GroupRepository groupRepository;



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

    private List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("Engeneering","eshkere",cafedras.get(0)),
            new Group("Engeneering","eshkere",cafedras.get(1)),
            new Group("Engeneering","eshkere",cafedras.get(2))

    ));


    @PostConstruct
    private void init (){
        cafedraRepository.deleteAll(cafedras);
        cafedraRepository.saveAll(cafedras);
        groupRepository.deleteAll(groups);
        groupRepository.saveAll(groups);
    }

public List<Cafedra> getCafedras(){
    return cafedras;
}

    public List<Group> getGroups(){
        return groups;
    }



}