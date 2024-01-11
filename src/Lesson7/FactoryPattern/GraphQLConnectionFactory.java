package Lesson7.FactoryPattern;

public class GraphQLConnectionFactory extends AbstractConnectionFactory{
    @Override
    public Connection getConnection() {
        return new GraphQLConnection();
    }
}
