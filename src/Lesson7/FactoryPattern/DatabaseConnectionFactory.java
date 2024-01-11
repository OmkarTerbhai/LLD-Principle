package Lesson7.FactoryPattern;

public class DatabaseConnectionFactory extends AbstractConnectionFactory{
    @Override
    public Connection getConnection() {
        return new DatabaseConnection();
    }
}
