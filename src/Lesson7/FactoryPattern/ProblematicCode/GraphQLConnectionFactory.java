package Lesson7.FactoryPattern.ProblematicCode;

public class GraphQLConnectionFactory {
    public static GraphQLConnection getGraphQLConnection() {
        return new GraphQLConnection();
    }
}
