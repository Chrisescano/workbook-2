package org.pluralsight;

public class Book {

    private int id;
    private boolean isCheckedOut;
    private String isbn;
    private String title;
    private String checkedOutTo;

    Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
    }

    /*-----Functions-----*/
    public void checkOut(String name) {
        checkedOutTo = name;
        isCheckedOut = true;
    }

    public void checkIn() {
        checkedOutTo = "";
        isCheckedOut = false;
    }

    /*-----Getters/Setters-----*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
