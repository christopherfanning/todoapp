package dev.cfan.todolist.service;

import dev.cfan.todolist.model.Item;
import dev.cfan.todolist.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ItemService(ItemRepository itemRepository) {


    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }
}
