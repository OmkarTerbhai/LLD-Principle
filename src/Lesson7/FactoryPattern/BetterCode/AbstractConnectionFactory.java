package Lesson7.FactoryPattern.BetterCode;

public abstract class AbstractConnectionFactory {
    abstract Connection getConnection();

    public Connection makeConnection() {
        return getConnection();
    }
}
