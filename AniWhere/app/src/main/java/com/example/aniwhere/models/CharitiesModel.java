package com.example.aniwhere.models;

public class CharitiesModel {
    private String name;
    private String username;
    private String description;
    private String profileImageUrl;

    public CharitiesModel(String name, String username, String description, String profileImageUrl) {
        this.name = name;
        this.username = username;
        this.description = description;
        this.profileImageUrl = profileImageUrl;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
