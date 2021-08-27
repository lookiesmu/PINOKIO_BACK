package application.controller;

import application.service.ItemServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final ItemServiceImpl itemService;



    @Data
    public static class MenuResponse{

    }

    @Data
    public static class ConfirmResponse{

    }


}
