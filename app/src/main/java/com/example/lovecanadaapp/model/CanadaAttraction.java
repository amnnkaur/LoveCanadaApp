package com.example.lovecanadaapp.model;

public class CanadaAttraction
{
    private int placeID;
    private String placeName;
    private String address;
    private String city;
    private String province;
    private String description;
    private int placeImage;

    public CanadaAttraction() {
    }

    public CanadaAttraction(int placeID, String placeName, String address, String city, String province, String description, int placeImage) {
        this.placeID = placeID;
        this.placeName = placeName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.description = description;
        this.placeImage = placeImage;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }
}
