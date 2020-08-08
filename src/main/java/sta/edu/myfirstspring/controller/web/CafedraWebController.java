package sta.edu.myfirstspring.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sta.edu.myfirstspring.service.cafedra.impls.CafedraServiceImpl;

@Controller
@RequestMapping("/web/cafedra")
public class CafedraWebController {

    @Autowired
    CafedraServiceImpl cafedraService;

    @RequestMapping("/list")
    String showAll(Model model){
        model.addAttribute("list", cafedraService.getAll());


        return "cafedra";
    }



}

