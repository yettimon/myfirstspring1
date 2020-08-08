package sta.edu.myfirstspring.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.service.cafedra.impls.CafedraServiceImpl;

import java.util.List;

@RequestMapping("/api/cafedra")
@RestController
public class CafedraRestController {

    public CafedraRestController(CafedraServiceImpl cafedraServiceImpl) {
        this.cafedraServiceImpl = cafedraServiceImpl;
    }

    @Autowired
    CafedraServiceImpl cafedraServiceImpl;

    @RequestMapping("")
    String getIndex(){
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Cafedra Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List getCafedrasList() {
        return cafedraServiceImpl.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Cafedra getCafedra(@PathVariable("id") String id) {
        return cafedraServiceImpl.get(id);
    }

}