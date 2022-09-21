package com.GADJET.Sprint_3_4.frontControllers;

import com.GADJET.Sprint_3_4.entities.Employee;
import com.GADJET.Sprint_3_4.frontServices.frontEmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class frontEmployeeControllers {

    @Autowired
    frontEmployeeServices EMPS2;

    public frontEmployeeControllers(frontEmployeeServices EMPS2) {
        this.EMPS2 = EMPS2;
    }

    @GetMapping("/employees")
    public String employees(Model model){
        model.addAttribute("listemployees", EMPS2.getAllEmployees());
        return "List_of_Employees";
    }

    @GetMapping("/newEmployee")
    public String newEmployee(Model model) {
        // create model attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "New_Employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        // save employee to database
        EMPS2.saveEmployee(employee);
        return "redirect:/employees";
    }
    @GetMapping("/updatingEmployee/{id}")
    public String updatingEmployee(@PathVariable( value = "id") long id, Model model) {
        // get employee from the service
        Employee employee = EMPS2.getEmployeeById(id);
        // set employee as a model attribute to pre-populate the form
        model.addAttribute("employee", employee);
        return "Updating_Employee";
    }
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {
        // call delete employee method
        this.EMPS2.deleteEmployeeById(id);
        return "redirect:/employees";
    }
}
