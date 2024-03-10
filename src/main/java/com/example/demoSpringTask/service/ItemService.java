package com.example.demoSpringTask.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

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
