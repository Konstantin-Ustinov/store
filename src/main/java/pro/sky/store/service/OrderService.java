package pro.sky.store.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.store.repository.OrderRepository;

import java.util.List;

@Service
@SessionScope
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public boolean add(List<Integer> ids) {
        boolean flag = false;
        for (Integer id : ids) {
            flag = orderRepository.add(id);
        }
        return flag;
    }

    public List get() {
        return orderRepository.getItems();
    }
}
