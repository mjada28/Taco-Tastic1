package com.tacotastic;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Taco> tacos = new ArrayList<>();
    private String customerName;

    public Order(String customerName){
        this.customerName = customerName;

    }
}
