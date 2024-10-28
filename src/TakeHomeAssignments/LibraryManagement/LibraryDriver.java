package TakeHomeAssignments.LibraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Book> sherlockHolmes = new ArrayList<>();
        List<Book> richDadPoorDad = new ArrayList<>();
        List<Book> dsaMadeEasy = new ArrayList<>();
        int copies = in.nextInt();
        for(int i = 1; i <= copies; i++) {
            sherlockHolmes.add(new SherlockHolmes(copies));
            richDadPoorDad.add(new RichDadPoorDad(copies));
            dsaMadeEasy.add(new DSAMadeEasy(copies));
        }
        in.nextLine();
        System.out.println("Enter user id: ");
        String id = in.nextLine();
        LibraryUser u = new LibraryUser(id);

        while (true) {
            System.out.println("Enter operation: ");
            System.out.println("1. Borrow");
            System.out.println("2. Return");
            System.out.println("3. Check for overdue books");
            System.out.println("4. Exit");
            int op = in.nextInt();

            if(op == 1) {
                System.out.println("Which book do you want to borrow?");
                System.out.println("1. Sherlock Holmes");
                System.out.println("2. Rich Dad Poor Dad");
                System.out.println("3. DSA Made Easy");

                int ch = in.nextInt();
                Book b = null;
                if (ch == 1) {
                    b = sherlockHolmes.get(sherlockHolmes.size()-1);
                } else if (ch == 2) {
                    b = richDadPoorDad.get(richDadPoorDad.size()-1);
                } else {
                    b = dsaMadeEasy.get(dsaMadeEasy.size()-1);
                }

                b.allocate(u);
            }
            else if(op == 2) {
                u.returnBook();
            }
            else if(op == 3) {
                for(int i = 0; i < copies; i++) {
                    sherlockHolmes.get(i).isOverdue();
                    dsaMadeEasy.get(i).isOverdue();
                    richDadPoorDad.get(i).isOverdue();
                }
            }
            else {
                break;
            }
        }
    }
}
