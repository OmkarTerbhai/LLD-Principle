package Lesson7.FactoryPattern.ProblematicCode;

public class RabbitMQConnectionFactory {
    public static RabbitMQConnection getRabbitMQConnection() {
        return new RabbitMQConnection();
    }
}
