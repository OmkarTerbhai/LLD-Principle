package TakeHomeAssignments.LibraryManagement;

import java.time.LocalDate;

public abstract class Book {
    String title;
    String author;
    String ISBN;
    LocalDate borrowDate;

    BookGenre genre;

    protected abstract void allocate(User userId);

    protected abstract void deallocate();

    protected abstract void reserve(User userId);

    protected abstract void allocateFromQueue();
}
