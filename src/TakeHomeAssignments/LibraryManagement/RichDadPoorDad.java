package TakeHomeAssignments.LibraryManagement;

import java.time.Duration;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.UUID;

public class RichDadPoorDad extends Book{
    User userId;
    static int copiesAvailable = 100;
    private static final int overdueCost = 50;

    static Queue<User> reservations = new LinkedList<>();
    public RichDadPoorDad(int copies) {
        this.title = "Rich Dad Poor Dad";
        this.author = "Robert Kiyosaki";
        this.ISBN = UUID.randomUUID().toString();
        this.genre = BookGenre.NON_FICTION;
        copiesAvailable = copies;
    }
    @Override
    protected void allocate(User userId) {
        if(userId == null) {
            System.out.println("No user to allocate");
            return;
        }
        if(userId.getBook() != null && userId.getBook().equals(this)) {
            System.out.println("You already have this book");
            return;
        }
        if(copiesAvailable == 0) {
            System.out.println("Sorry, No copies are available");
            System.out.println("Adding you to the waiting queue");
            userId.reserveBook(this);
            return;
        }
        this.userId = userId;
        userId.borrowBook(this);
        copiesAvailable--;
        System.out.println("A great book about Personal Finance! Happy Reading!");
    }

    @Override
    protected void deallocate() {
        if(LocalDate.now().isBefore(this.borrowDate.plusDays(11))) {
            System.out.println("Thank you for returning in due time, hope you had a good read!");
        }
        else {
            System.out.println("Thank you for returning but you past the due date");
            long daysBetween = Duration.between(this.borrowDate, LocalDate.now()).toDays();
            long overdueFees = overdueCost * daysBetween;
            System.out.println("Please pay overdue fees: " + overdueFees);
        }
        this.userId = null;
        copiesAvailable++;
    }

    @Override
    protected void reserve(User userId) {
        if(userId != null) {
            if(reservations.contains(userId)) {
                System.out.println("You are already added in Queue " + this.title);
            }
            else {
                reservations.add(userId);
                System.out.println("You have been added to the Queue");
            }
        }
    }

    @Override
    protected void allocateFromQueue() {
        System.out.println("Thank you being in the queue...");
        if(copiesAvailable > 0) {
            this.userId = reservations.poll();
            System.out.println("Book has been allocated to you...");
        }
        else {
            System.out.println("Sorry, we don't have enough copies yet!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) return false;
        Book b = (Book) o;
        return this.title.equals(b.title);
    }

    @Override
    protected void isOverdue() {
        if(Duration.between(this.borrowDate, LocalDate.now()).toDays() > 15) {
            userId.processOverdueNotification();
        }
    }
}
