package com.example.aniwhere.models;

public class PetModels {
    private String name;
    private String breed;
    private String age;
    private String location;
    private int imageResourceId;

    public PetModels(String name, String breed, String age, String location, int imageResourceId) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getAge() {
        return age;
    }
    public String getLocation() {
        return location;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}

