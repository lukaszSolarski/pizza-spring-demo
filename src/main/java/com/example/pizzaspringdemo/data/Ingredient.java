package com.example.pizzaspringdemo.data;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public static enum Type {
        MEAT, VEGGIES, CHEESE, SAUCE
    }
}
