package Lesson7.FactoryPattern.BetterCode;

public class GraphQLConnection implements Connection{
    @Override
    public String getType() {
        return "GraphQL Connection";
    }
}
