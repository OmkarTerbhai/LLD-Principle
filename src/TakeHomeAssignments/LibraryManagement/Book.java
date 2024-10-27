package TakeHomeAssignments.LibraryManagement;

public abstract class Book {
    String title;
    String author;
    String ISBN;
    int copiesAvailable;

    BookGenre genre;

    protected abstract void allocate(String userId);

    protected abstract void deallocate();

    protected abstract void reserve(String userId);
}
