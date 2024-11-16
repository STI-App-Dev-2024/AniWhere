package com.example.aniwhere.models;

import java.util.List;

public class PostModel {
    private String name;
    private String description;
    private int profileImage;
    private List<Integer> galleryImages;

    public PostModel(String name, String description, int profileImage, List<Integer> galleryImages) {
        this.name = name;
        this.description = description;
        this.profileImage = profileImage;
        this.galleryImages = galleryImages;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public List<Integer> getGalleryImages() {
        return galleryImages;
    }
}
