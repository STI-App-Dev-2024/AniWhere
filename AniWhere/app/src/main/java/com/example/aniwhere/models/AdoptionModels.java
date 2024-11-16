package com.example.aniwhere.models;

public class AdoptionModels {
    private String name;
    private int imageResourceId;
    private String breed;
    private String age;
    private String location;

    public AdoptionModels(String name, int imageResourceId, String breed, String age, String location) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.breed = breed;
        this.age = age;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
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
}
