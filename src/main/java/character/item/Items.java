package character.item;

public class Items {
    private int number;
    private String name;
    private String description;
    private String price;
    private float weight;

    public Items(int number, String name, String description, String price, float weight) {
        this.number = number;
        this.name = name;
        this.description = description;
        this.price = price;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
