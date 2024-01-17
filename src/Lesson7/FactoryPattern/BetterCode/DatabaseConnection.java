package Lesson7.FactoryPattern.BetterCode;

public class DatabaseConnection implements Connection{
    @Override
    public String getType() {
        return "Database Connection";
    }
}
