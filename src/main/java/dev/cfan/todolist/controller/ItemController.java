package dev.cfan.todolist.controller;

import dev.cfan.todolist.model.Item;
import dev.cfan.todolist.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    ItemService itemService;


    @GetMapping("/item")
    public List<Item> getAllItems(){
       return itemService.getAllItems();
    }

    @PostMapping("/item")
    public Item createItem(@RequestBody Item item){
       return itemService.createItem(item);
    }


}
