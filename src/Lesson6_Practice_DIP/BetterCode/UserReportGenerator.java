package Lesson6_Practice_DIP.BetterCode;

public class UserReportGenerator {
    private Database db;
    private ReportGenerator fileProcessor;

    public UserReportGenerator(Database db, ReportGenerator fileProcessor) {
        this.db = db;
        this.fileProcessor = fileProcessor;
    }

    public void getRecords() {
        db.getRecords();
    }

    public void generateReport() {
        fileProcessor.generateReports();
    }
}
