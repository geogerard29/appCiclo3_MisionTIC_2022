package com.GADJET.Sprint_3_4.frontControllers;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.entities.Enterprise;
import com.GADJET.Sprint_3_4.frontServices.frontEnterpriseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class frontEnterpriseControllers {
    @Autowired
    frontEnterpriseServices ENT2;

    public frontEnterpriseControllers(frontEnterpriseServices EMPS1) {
        this.ENT2 = ENT2;
    }

    @GetMapping("/enterprises")
    public String enterprises(Model model){
        model.addAttribute("listenterprises", ENT2.getAllEnterprises());
        return "List_of_Enterprises";
    }

    @GetMapping("/newEnterprise")
    public String newEnterprise(Model model) {
        // create model attribute to bind form data
        Enterprise enterprise = new Enterprise();
        model.addAttribute("enterprise", enterprise);
        return "New_Enterprise";
    }

    @PostMapping("/saveEnterprise")
    public String saveEmployee(@ModelAttribute("enterprise") Enterprise enterprise) {
        // save enterprise to database
        ENT2.saveEnterprise(enterprise);
        return "redirect:/enterprises";
    }
    @GetMapping("/updatingEnterprise/{id}")
    public String updatingEnterprise(@PathVariable( value = "id") long id, Model model) {
        // get enterprise from the service
        Enterprise enterprise = ENT2.getEnterpriseById(id);
        // set enterprise as a model attribute to pre-populate the form
        model.addAttribute("enterprise", enterprise);
        return "Updating_Enterprise";
    }
    @GetMapping("/deleteEnterprise/{id}")
    public String deleteEnterprise(@PathVariable(value = "id") long id) {
        // call delete enterprise method
        this.ENT2.deleteEnterpriseById(id);
        return "redirect:/enterprises";
    }
}
