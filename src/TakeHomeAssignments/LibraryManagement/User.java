package TakeHomeAssignments.LibraryManagement;

public interface User {
    public void processBookAvailableNotification();
    public void processOverdueNotification();

    public void borrowBook(Book b);

}
