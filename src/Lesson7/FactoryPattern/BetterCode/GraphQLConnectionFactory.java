package Lesson7.FactoryPattern.BetterCode;

public class GraphQLConnectionFactory extends AbstractConnectionFactory{
    @Override
    public Connection getConnection() {
        return new GraphQLConnection();
    }
}
