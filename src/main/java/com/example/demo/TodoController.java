package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TodoController {

    @GetMapping("/ToDo")
    public String loadTodo(Model model){
        model.addAttribute("item", new Item());
        return "ToDo";
    }
    @PostMapping("/ToDo")
    public String loadTodo(@Valid Item item, Model model){
        model.addAttribute("item", item);
        return "ToDo";
    }

}
