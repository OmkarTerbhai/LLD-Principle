package TakeHomeAssignments.LibraryManagement;

import java.time.LocalDate;
import java.util.Objects;

public class LibraryUser implements User {

    private String userId;
    public Book book;
    private LocalDate borrowTime;


    public LibraryUser(String id) {
        this.userId = id;
    }
    @Override
    public void processBookAvailableNotification() {
        System.out.println("The book " + book.title + " you requested, is available");
    }

    @Override
    public void processOverdueNotification() {
        System.out.println("Your book " + book.title + " is overdue");
    }

    @Override
    public void borrowBook(Book b) {
        this.book = b;
        this.borrowTime = b.borrowDate;
    }

    @Override
    public void reserveBook(Book b) {
        b.reserve(this);
    }

    @Override
    public void returnBook() {
        this.book.deallocate();
    }

    @Override
    public Book getBook() {
        return this.book;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof LibraryUser u)) {
            return false;
        }
        return this.userId.equals(u.userId);
    }

}
