package Lesson7.FactoryPattern.ProblematicCode;

public class DatabaseConnectionFactory {
    public static DatabaseConnection getDatabaseConnection() {
        return new DatabaseConnection();
    }
}
