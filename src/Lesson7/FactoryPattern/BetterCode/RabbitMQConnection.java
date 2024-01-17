package Lesson7.FactoryPattern.BetterCode;

public class RabbitMQConnection implements Connection{
    @Override
    public String getType() {
        return "RabbitMQ Connection";
    }
}
