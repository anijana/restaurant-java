package com.example.restaurant.model;

public class Restaurant {
    private int restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    private String restaurantSpecialty;
    private String restaurantTotalStaff;

    public Restaurant(int restaurantId, String restaurantName, String restaurantAddress, String restaurantNumber, String restaurantSpecialty, String restaurantTotalStaff) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        this.restaurantSpecialty = restaurantSpecialty;
        this.restaurantTotalStaff = restaurantTotalStaff;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getRestaurantSpecialty() {
        return restaurantSpecialty;
    }

    public void setRestaurantSpecialty(String restaurantSpecialty) {
        this.restaurantSpecialty = restaurantSpecialty;
    }

    public String getRestaurantTotalStaff() {
        return restaurantTotalStaff;
    }

    public void setRestaurantTotalStaff(String restaurantTotalStaff) {
        this.restaurantTotalStaff = restaurantTotalStaff;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantAddress='" + restaurantAddress + '\'' +
                ", restaurantNumber='" + restaurantNumber + '\'' +
                ", restaurantSpecialty='" + restaurantSpecialty + '\'' +
                ", restaurantTotalStaff='" + restaurantTotalStaff + '\'' +
                '}';
    }
}
