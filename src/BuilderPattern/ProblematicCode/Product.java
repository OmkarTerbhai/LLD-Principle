package BuilderPattern.ProblematicCode;

public abstract class Product {
    private String name;
    private int cost;
    private String type;

    private String category;

    private int discount;

    public Product(String name, int cost, String type, String category, int discount, boolean isEMIPurchasable, boolean isIntlShippable) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.category = category;
        this.discount = discount;
        this.isEMIPurchasable = isEMIPurchasable;
        this.isIntlShippable = isIntlShippable;
    }

    private boolean isEMIPurchasable;

    private boolean isIntlShippable;
}
