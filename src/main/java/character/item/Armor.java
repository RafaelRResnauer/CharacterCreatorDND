package character.item;

public class Armor extends Items{
    private int acBase;
    private int ac;
    private boolean dexToggle;
    private String ac_description;
    private String strength_req;

    public Armor(String name, String description, String price, float weight, int acBase, boolean dexToggle, String ac_description, String strength_req) {
        super(name, description, price, weight);
        this.acBase = acBase;
        this.dexToggle = dexToggle;
        this.ac_description = ac_description;
        this.strength_req = strength_req;
    }

    public void setTrueAC(int dexMod) {
        if (dexToggle) {
            this.ac = acBase + dexMod;
        }else {
            this.ac = acBase;
        }
    }
}
