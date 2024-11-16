package com.example.aniwhere.models;

public class LostAndFoundModels {

    private String type, breed, name, sex, location, lastSeen;
    private int imageResource;

    public LostAndFoundModels(String type, String breed,
                              String name, String sex, String location,
                              String lastSeen, int imageResource) {
        this.type = type;
        this.breed = breed;
        this.name = name;
        this.sex = sex;
        this.location = location;
        this.lastSeen = lastSeen;
        this.imageResource = imageResource;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getLocation() {
        return location;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public int getImageResource() {
        return imageResource;
    }
}
