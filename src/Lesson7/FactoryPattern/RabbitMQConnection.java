package Lesson7.FactoryPattern;

public class RabbitMQConnection implements Connection{
    @Override
    public String getType() {
        return "RabbitMQ Connection";
    }
}
