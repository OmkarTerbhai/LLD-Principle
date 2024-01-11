package Lesson7.FactoryPattern;

public class RabbitMQConnectionFactory extends AbstractConnectionFactory{
    @Override
    public Connection getConnection() {
        return new RabbitMQConnection();
    }
}
