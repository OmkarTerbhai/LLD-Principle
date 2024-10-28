package TakeHomeAssignments.LibraryManagement;

public interface User {
    public void processBookAvailableNotification();
    public void processOverdueNotification();

    public void borrowBook(Book b);

    public void reserveBook(Book b);

    public void returnBook();

    public Book getBook();
}
