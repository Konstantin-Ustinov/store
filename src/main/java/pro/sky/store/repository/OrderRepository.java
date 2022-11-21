package pro.sky.store.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class OrderRepository {

    private List<Integer> items = new ArrayList<>();

    public boolean add(Integer itemId) {
        return items.add(itemId);
    }

    public List<Integer> getItems() {
        return items;
    }
}
