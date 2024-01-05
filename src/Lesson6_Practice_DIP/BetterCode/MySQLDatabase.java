package Lesson6_Practice_DIP.BetterCode;

public class MySQLDatabase implements Database{
    @Override
    public void getRecords() {
        System.out.println("Fetching records from MYSQL DB");
    }
}
