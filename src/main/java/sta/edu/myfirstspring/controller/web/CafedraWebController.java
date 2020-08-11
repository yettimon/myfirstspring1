package sta.edu.myfirstspring.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sta.edu.myfirstspring.form.CafedraForm;
import sta.edu.myfirstspring.model.Cafedra;
import sta.edu.myfirstspring.service.cafedra.impls.CafedraServiceImpl;

import java.util.Map;
import java.util.stream.Collectors;

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

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model){
        cafedraService.delete(id);
        model.addAttribute("list",cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value ="/refresh/", method = RequestMethod.GET)
    String refreshCafedra(){
        cafedraService.refreshDatabase();
        return "redirect:/web/cafedra/list";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createCafedra(Model model){
        CafedraForm cafedraForm = new CafedraForm();
        model.addAttribute("cafedraForm", cafedraForm);
        return "Addcafedralist";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCafedra(Model model, @ModelAttribute("cafedraForm") CafedraForm cafedraForm){
        Cafedra cafedra = new Cafedra();
        cafedra.setName(cafedraForm.getName());
        cafedra.setDescription(cafedraForm.getDescription());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.create(cafedra);

        model.addAttribute("cafedras", cafedraService.getAll());
        return "redirect:/web/cafedra/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCafedra(@PathVariable("id") String id,Model model){
        Cafedra cafedra = cafedraService.get(id);
        CafedraForm cafedraForm = new CafedraForm(
                cafedra.getId(),
                cafedra.getName(),
                cafedra.getDescription(),
                cafedra.getChief()
        );
        model.addAttribute("cafedraForm", cafedraForm);
        return "updateCafedralist";
    }
    }


