
package com.example.aniwhere.models;

public class LostAndFoundModels {
    private final String type;
    private final String name;
    private final String gender;
    private final String location;
    private final String lastSeen;
    private final String status;
    private final int imageResourceId;

    public LostAndFoundModels(String type, String name, String gender, String location,
                              String lastSeen, String status, int imageResourceId) {
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.location = location;
        this.lastSeen = lastSeen;
        this.status = status;
        this.imageResourceId = imageResourceId;
    }

    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getLocation() {
        return location;
    }
    public String getLastSeen() {
        return lastSeen;
    }
    public String getStatus() {
        return status;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
