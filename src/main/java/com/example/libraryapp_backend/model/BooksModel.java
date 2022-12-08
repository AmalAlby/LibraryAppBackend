package com.example.libraryapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookslist")
public class BooksModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String author;
    private String description;
    private String publisher;
    private String distributor;
    private String language;
    private String image;
    private int year;
    private int price;

    public BooksModel() {
    }

    public BooksModel(int id, String name, String author, String description, String publisher, String distributor, String language, String image, int year, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.distributor = distributor;
        this.language = language;
        this.image = image;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
