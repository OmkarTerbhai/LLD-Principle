package Lesson6_Practice_DIP.ProblematicCode;

import Lesson6_Practice_DIP.BetterCode.ReportGenerator;

public class UserReportGenerator {
    private PostgresDatabase db;
    private ReportGenerator fileProcessor;

    public UserReportGenerator(PostgresDatabase pgdb, ReportGenerator efp) {
        this.db = pgdb;
        this.fileProcessor = efp;
    }

    public void getRecords() {
        db.getRecords();
    }

    public void generateReport() {
        fileProcessor.generateReports();
    }
}
