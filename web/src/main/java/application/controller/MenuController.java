package application.controller;

import application.domain.Category;
import application.domain.Item;
import application.service.ItemServiceImpl;
import application.service.StoreService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final StoreService storeService;


    @GetMapping("/menu")
    public List<MenuDto> getMenu(@RequestParam String storeName, @RequestParam String branch){
        List<Category> storeCategory = storeService.findStoreCategory(storeName, branch);
        return storeCategory.stream()
                .map(MenuDto::new)
                .collect(Collectors.toList());
    }


    @Data
    public static class MenuDto{
        List<ItemDto> items;
        String category;

        public MenuDto(Category category){
        this.category=category.getCategoryName();
        items=category.getItems()
                        .stream()
                        .map(ItemDto::new)
                .collect(Collectors.toList());

        }
    }

    @Data
    public static class ItemDto{
        String name;
        Long price;

        public ItemDto(Item item){
            this.name= item.getItemName();
            this.price=item.getPrice();
        }
    }


}
