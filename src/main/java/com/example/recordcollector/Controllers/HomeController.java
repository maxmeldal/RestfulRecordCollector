package com.example.recordcollector.Controllers;

import com.example.recordcollector.Model.Record;
import com.example.recordcollector.Service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    RecordService recordService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("records", recordService.readAll());
        return ("index");
    }

    @GetMapping("/create")
    public String create(){
        return ("create");
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Record record){
        recordService.Create(record);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("record", recordService.read(id));
        return ("update");
    }

    @PostMapping("/update")
    public String update (@ModelAttribute Record record) {
        recordService.update(record);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable("id") int id){
        recordService.delete(id);
        return "redirect:/";
    }

}
