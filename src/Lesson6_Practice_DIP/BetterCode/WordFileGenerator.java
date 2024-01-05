package Lesson6_Practice_DIP.BetterCode;

public class WordFileGenerator implements ReportGenerator{
    @Override
    public void generateReports() {
        System.out.println("Generating report in a word file");
    }
}
