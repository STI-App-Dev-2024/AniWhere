package com.example.aniwhere.models;

public class HomeProfileModels {
    private String name;
    private String username;
    private int profileImage;
    private int image1, image2, image3, image4, image5;

    public HomeProfileModels(String name, String username, int profileImage, int image1, int image2, int image3, int image4, int image5) {
        this.name = name;
        this.username = username;
        this.profileImage = profileImage;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.image5 = image5;
    }
    public String getName() { return name; }
    public String getUsername() { return username; }
    public int getProfileImage() { return profileImage; }
    public int getImage1() {
        return image1;
    }
    public int getImage2() {
        return image2;
    }
    public int getImage3() {
        return image3;
    }
    public int getImage4() {
        return image4;
    }
    public int getImage5() {
        return image5;
    }
}
