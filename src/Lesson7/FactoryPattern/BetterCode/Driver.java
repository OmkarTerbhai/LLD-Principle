package Lesson7.FactoryPattern.BetterCode;

public class Driver {
    public static void main(String[] args) {
        AbstractConnectionFactory connectionFactory = null;

        String dataSource = args[0];

        if("GraphQL".equals(dataSource)) {
            connectionFactory = new GraphQLConnectionFactory();
        }
        else if ("Database".equals(dataSource)) {
            connectionFactory = new DatabaseConnectionFactory();
        }
        else if ("RabbitMQ".equals(dataSource)) {
            connectionFactory = new RabbitMQConnectionFactory();
        }

        connectionFactory.makeConnection();
    }
}
