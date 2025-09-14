package librarymanagement;

import java.util.ArrayList;
import java.util.List;

class Member {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }
    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrow();
            borrowedBooks.add(book);
            System.out.print(name + " borrowed ");
            book.showDetails();
        } else {
            System.out.print("Sorry, already borrowed: ");
            book.showDetails();
        }
    }
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnB();
            borrowedBooks.remove(book);
            System.out.print(name + " returned ");
            book.showDetails();
        } else {
            System.out.print("Cannot return, not borrowed: ");
            book.showDetails();
        }
    }
}
