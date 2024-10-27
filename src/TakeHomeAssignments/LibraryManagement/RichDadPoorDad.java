package TakeHomeAssignments.LibraryManagement;

import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

public class RichDadPoorDad extends Book{
    String userId;
    Queue<String> reservations;
    public RichDadPoorDad() {
        this.title = "Rich Dad Poor Dad";
        this.author = "Robert Kiyosaki";
        this.ISBN = UUID.randomUUID().toString();
        this.genre = BookGenre.NON_FICTION;
        this.userId = "";
        this.reservations = new LinkedList<>();
        this.copiesAvailable = 25;
    }
    @Override
    protected void allocate(String userId) {
        if(userId == null) {
            System.out.println("No user to allocate");
        }
        this.userId = userId;
        copiesAvailable--;
        System.out.println("A great book about Personal Finance! Happy Reading!");
    }

    @Override
    protected void deallocate() {
        this.userId = "";
        this.copiesAvailable++;
    }

    @Override
    protected void reserve(String userId) {

    }
}
