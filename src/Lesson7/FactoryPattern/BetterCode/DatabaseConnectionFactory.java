package Lesson7.FactoryPattern.BetterCode;

public class DatabaseConnectionFactory extends AbstractConnectionFactory{
    @Override
    public Connection getConnection() {
        return new DatabaseConnection();
    }
}
