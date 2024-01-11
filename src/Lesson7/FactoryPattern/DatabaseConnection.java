package Lesson7.FactoryPattern;

public class DatabaseConnection implements Connection{
    @Override
    public String getType() {
        return "Database Connection";
    }
}
