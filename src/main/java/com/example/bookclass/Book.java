package com.example.bookclass;

public class Book {
    private String title;
    private String author;
    private String description;
    private String price;
    private String instock;

    public Book() {

    }

    public Book(String price, String instock) {
        this.price = price;
        this.instock = instock;
    }

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInstock() {
        return instock;
    }

    public void setInstock(String instock) {
        this.instock = instock;
    }


    public void getDisplayText() {
        System.out.println(getAuthor());
        System.out.println(getTitle());
        System.out.println(getDescription());
    }
}