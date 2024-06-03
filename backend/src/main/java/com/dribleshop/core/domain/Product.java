package com.dribleshop.core.domain;

class Product {

    private String name;
    private String description;
    private String category;
    private String subCategory;
    private String brand;
    private String material;

    public Product(String name, String description, String category, String subCategory, String brand, String material) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.subCategory = subCategory;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}