package pro.sky.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.store.service.OrderService;

import java.util.Collection;
import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public String add(@RequestParam List<Integer> ids) {
        return orderService.add(ids) ? "Товары успешно добавлены" : "Товары не добавлены";
    }

    @GetMapping("/get")
    public Collection get() {
        return orderService.get();
    }
}
