package librarymanagement;
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed = false;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void borrow() {
        isBorrowed = true;
    }
    public void returnB() {
        isBorrowed = false;
    }
    public void showDetails() {
        System.out.println("Book: \"" + title + "\" by " + author +
                " (ISBN: " + isbn + ")" +
                (isBorrowed ? " [Currently Borrowed]" : " [Available]"));
    }
}
