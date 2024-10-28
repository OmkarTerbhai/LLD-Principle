package TakeHomeAssignments.LibraryManagement;

import java.time.LocalDate;

public class LibraryUser implements User {


    private Book book;
    private LocalDate borrowTime;
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
        this.book = book;
        this.borrowTime = b.borrowDate;
    }
}
