package com.example.aniwhere.models;

public class ReportFoundPetModel {
    private String name;
    private String breed;
    private String gender;
    private String missingSince;
    private String lastSeenLocation;
    private String contactNumber;
    private String note;

    public ReportFoundPetModel(String name, String breed, String gender, String missingSince, String lastSeenLocation, String contactNumber, String note) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.missingSince = missingSince;
        this.lastSeenLocation = lastSeenLocation;
        this.contactNumber = contactNumber;
        this.note = note;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getGender() {
        return gender;
    }
    public String getMissingSince() {
        return missingSince;
    }
    public String getLastSeenLocation() {
        return lastSeenLocation;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getNote() {
        return note;
    }
}
