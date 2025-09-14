package librarymanagement;
/*
 1. Library Management System (Encapsulation & Abstraction) Scenario:
  A library needs to manage books and members. Each book has a title, author, and ISBN.
   Members can borrow and return books. The internal details of how books are tracked should be hidden from users. 
   Key OOPs Concepts: Encapsulation: Book details are private; access via methods. 
   Abstraction: Users interact with borrow/return methods, not internal state.
 */
public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Java Foundations", "James Gosling", "111");
        Book book2 = new Book("Harry Potter", "J K Rowling", "222");

        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");

        member1.borrowBook(book1);

        //Bob want to borrow the same book so not possible.
        member2.borrowBook(book1);
        
        //Alice returns book1
        member2.returnBook(book1);

        //Bob can borrow it now
        member2.borrowBook(book1);

        member1.borrowBook(book2);
    }
}
