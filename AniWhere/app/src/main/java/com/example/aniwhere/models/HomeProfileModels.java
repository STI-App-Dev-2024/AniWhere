package com.example.aniwhere.models;

public class HomeProfileModels {
    private String name;
    private String username;
    private int profileImage;
    private int mainImage;
    private int[] smallImages; // array for smaller images

    public HomeProfileModels(String name, String username, int profileImage, int mainImage, int[] smallImages) {
        this.name = name;
        this.username = username;
        this.profileImage = profileImage;
        this.mainImage = mainImage;
        this.smallImages = smallImages;
    }


    public String getName() { return name; }
    public String getUsername() { return username; }
    public int getProfileImage() { return profileImage; }
    public int getMainImage() { return mainImage; }
    public int[] getSmallImages() { return smallImages; }
}
