package sta.edu.myfirstspring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sta.edu.myfirstspring.model.Group;
import sta.edu.myfirstspring.service.group.imps.GroupServiceImpl;

import java.util.List;

@RequestMapping("api/group")
@RestController

public class GroupRestController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Group> getGroups (){
        return groupService.getAll();
    }

}
