package com.example.aniwhere.models;

public class CharitiesModel {
    private String name;
    private String username;
    private String description;
    private int profileImage;
    private int image1;
    private int image2;

    public CharitiesModel(String name, String username, String description, int profileImage, int image1, int image2) {
        this.name = name;
        this.username = username;
        this.description = description;
        this.profileImage = profileImage;
        this.image1 = image1;
        this.image2 = image2;
    }

    // Getters
    public String getName() { return name; }
    public String getUsername() { return username; }
    public String getDescription() { return description; }
    public int getProfileImage() { return profileImage; }
    public int getImage1() { return image1; }
    public int getImage2() { return image2; }
}
