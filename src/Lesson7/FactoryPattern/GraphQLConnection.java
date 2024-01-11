package Lesson7.FactoryPattern;

public class GraphQLConnection implements Connection{
    @Override
    public String getType() {
        return "GraphQL Connection";
    }
}
