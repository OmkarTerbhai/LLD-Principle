package TakeHomeAssignments.LibraryManagement;

import java.util.Queue;
import java.util.UUID;

public class SherlockHolmes extends Book {
    String userId;
    Queue<String> reservations;
    public SherlockHolmes() {
        this.author = "Arthur Conyan Doyle";
        this.title = "Sherlock Holmes";
        this.genre = BookGenre.FICTION;
        this.ISBN = UUID.randomUUID().toString();
        this.copiesAvailable = 50;
        userId = "";
    }
    @Override
    protected void allocate(String userId) {
        if(userId == null) {
            System.out.println("No user to allocate");
        }
        this.userId = userId;
        copiesAvailable--;
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
