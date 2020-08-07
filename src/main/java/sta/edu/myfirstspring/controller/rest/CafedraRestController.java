package sta.edu.myfirstspring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.service.implementation.CafedraServiceImpl;

import java.util.List;

@RequestMapping("/api/cafedra")

@RestController

public class CafedraRestController {

    @Autowired
    CafedraServiceImpl service; // можем использовать


    @GetMapping("/Hello")
    String getHello (){
        return "hello form Cafedra controller";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Cafedra> getCafedras(){
        return service.getAll();
    }


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)


    Cafedra getCafedraList(@PathVariable("id") String id){
        return service.get(id);
    }



}
