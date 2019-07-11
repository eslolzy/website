package com.example.website.model;

public class Movie {
    private String name;
    private String releaseDate;
    private String descritpion;
    private String genre;
    private String boxOffice;
    private String image;

    public Movie(String name, String releaseDate, String descritpion, String genre, String boxOffice, String image) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.descritpion = descritpion;
        this.genre = genre;
        this.boxOffice = boxOffice;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() { return releaseDate; }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }
}

