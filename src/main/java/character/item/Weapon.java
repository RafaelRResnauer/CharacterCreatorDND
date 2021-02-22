package character.item;

public class Weapon extends Items{
    private String damage;
    private String properties;

    public Weapon(String name, String description, String price, float weight, String damage, String properties) {
        super(name, description, price, weight);
        this.damage = damage;
        this.properties = properties;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }
}
