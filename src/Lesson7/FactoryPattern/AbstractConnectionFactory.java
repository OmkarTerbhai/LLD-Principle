package Lesson7.FactoryPattern;

public abstract class AbstractConnectionFactory {
    abstract Connection getConnection();

    public Connection makeConnection() {
        return getConnection();
    }
}
