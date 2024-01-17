package Lesson7.FactoryPattern.BetterCode;

public class RabbitMQConnectionFactory extends AbstractConnectionFactory{
    @Override
    public Connection getConnection() {
        return new RabbitMQConnection();
    }
}
