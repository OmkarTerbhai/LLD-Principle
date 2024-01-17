package Lesson7.FactoryPattern.ProblematicCode;

public class Driver {
    //Initially Requirement -> Database Connectivity
    private DatabaseConnection db = DatabaseConnectionFactory.getDatabaseConnection();

    private GraphQLConnection graphQl = GraphQLConnectionFactory.getGraphQLConnection();

    private RabbitMQConnection rabbitMq = RabbitMQConnectionFactory.getRabbitMQConnection();

    public Driver(DatabaseConnection db) {
        this.db = db;
    }

    public Driver(GraphQLConnection grp) {
        this.graphQl = grp;
    }

    public Driver(RabbitMQConnection rbmq) {
        this.rabbitMq = rbmq;
    }

    public String fetchConnectionType(String dataStore) {
        switch (dataStore) {
            case "Database" -> {
                return this.db.getType();
            }

            case "GraphQL" -> {
                return this.graphQl.getType();
            }

            case "RabbitMQ" -> {
                return this.rabbitMq.getType();
            }

            default -> {
                return null;
            }
        }
    }
}
