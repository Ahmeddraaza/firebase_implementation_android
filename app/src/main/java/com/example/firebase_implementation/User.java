package com.example.firebase_implementation;

public class User {
    String id;
    String fullname;
    String email;
    String Country;
    String City;
    String Message;

    public User() {
        // Default constructor required for Firebase
    }



    public User(String id, String fullname , String email, String Country, String City, String message){
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.Country = Country;
        this.City = City;
        this.Message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
