package com.fresh.javatypereferences.model;

public class DataType {
    private final String name;
    private final String category;
    private final String description;

    public DataType(String name, String category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
