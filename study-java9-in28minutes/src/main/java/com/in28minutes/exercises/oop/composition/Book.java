package com.in28minutes.exercises.oop.composition;

import java.util.ArrayList;

public class Book {

    private Integer id;
    private String title;
    private String author;

    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return String.format("Book{" +
                "id = %d" +
                ", title = %s" +
                ", author = %s" +
                ", reviews = %s " +
                "}", id, title, author, reviews);
    }
}