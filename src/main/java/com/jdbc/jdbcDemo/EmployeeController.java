package com.jdbc.jdbcDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String home() {
        return "employee";
    }

    @PostMapping("/find")
    public String find(@RequestParam int id, Model model) {
        Employee emp = employeeRepository.findById(id).orElse(null);
        model.addAttribute("id", id);
        model.addAttribute("employee", emp);
        if (emp == null) model.addAttribute("message", "No employee found with id " + id);
        return "employee";
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee";
    }

    @PostMapping("/update")
    public String update(@RequestParam int id, @RequestParam String department, Model model) {
        Employee emp = employeeRepository.findById(id).orElse(null);
        if (emp != null) {
            emp.setEmployeeDepartment(department);
            employeeRepository.save(emp);
            model.addAttribute("message", "Updated id " + id + " to department " + department);
        } else {
            model.addAttribute("message", "No employee found with id " + id);
        }
        model.addAttribute("employee", emp);
        model.addAttribute("id", id);
        return "employee";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id, Model model) {
        employeeRepository.deleteById(id);
        model.addAttribute("message", "Deleted id " + id + ". Exists now? " + employeeRepository.existsById(id));
        return "employee";
    }
}