package com.example.demoSpringTask.storages;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class ItemStorage {

    private final Map<Long, Integer> items = new HashMap<>();

    public void add(List<Long> ids) {
        for (Long id : ids) {
            if (items.containsKey(id)) {
                items.put(id, items.get(id) + 1);
            } else {
                items.put(id, 1);
            }
        }
    }

    public Map<Long, Integer> getAll() {
        return items;
    }
}
