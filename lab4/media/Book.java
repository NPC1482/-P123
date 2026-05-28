package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    private ArrayList<String> authors = new ArrayList<>();

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) authors.add(authorName);

        else System.out.println("Author already exists");
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) authors.remove(authorName);
        else System.out.println("Author not found");
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getCategory() + " - " + getCost() + "$";
    }
}
