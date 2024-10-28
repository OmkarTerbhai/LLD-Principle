package TakeHomeAssignments.LibraryManagement;

import java.time.Duration;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

public class DSAMadeEasy extends Book {

    User userId;
    static int copiesAvailable = 100;
    static Queue<User> reservations = new LinkedList<>();
    private static final int overdueCost = 50;
    public DSAMadeEasy() {
        this.author = "Narsimha Kurumanchi";
        this.title = "Data Structures and Algorithms Made Easy";
        this.genre = BookGenre.NON_FICTION;
        this.ISBN = UUID.randomUUID().toString();
    }

    @Override
    protected void allocate(User userId) {
        if(userId == null) {
            System.out.println("No user to allocate");
            return;
        }
        if(copiesAvailable == 0) {
            System.out.println("Sorry, No copies are available");
            System.out.println("Adding you to the waiting queue");
            this.reserve(userId);
            return;
        }
        this.userId = userId;
        userId.borrowBook(this);
        copiesAvailable--;
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
            reservations.add(userId);
            System.out.println("You have been added to the Queue");
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
}
