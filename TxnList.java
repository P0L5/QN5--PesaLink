package com.pesalink.notification;

import java.util.ArrayList;
import java.util.List;

public class TxnList<T> {
    private final List<T> items;

    public TxnList() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public List<T> getItems() {
        return new ArrayList<>(items);
    }

    public int size() {
        return items.size();
    }
}
