package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class TodoController {


    Cards cards = new Cards();
    @GetMapping("/")
    public String loadTodo(Model model){
        model.addAttribute("item", new Item());
        if(!cards.getCards().isEmpty()){
            model.addAttribute("cards", cards.getCards());
            System.out.println("Inside if");
        } else {
            ArrayList<Item> empty = new ArrayList<Item>();
            empty.clear();
            model.addAttribute("cards", empty);
            System.out.println("Inside else");
        }
        return "ToDo";
    }
    @PostMapping("/Post")
    public String loadTodo(@Valid Item item, Model model){
        model.addAttribute("item", item);
        cards.setItem(item);
        return "redirect:/";
    }

}
