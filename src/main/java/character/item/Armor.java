package character.item;

public class Armor extends Items{
    private int acBase;
    private int ac;
    private boolean dexToggle;
    private String ac_description;
    private String strength_req;

    public Armor(int number, String name, String description, String price, float weight, int acBase, boolean dexToggle, String ac_description, String strength_req) {
        super(number, name, description, price, weight);
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

    public int getAcBase() {
        return acBase;
    }

    public void setAcBase(int acBase) {
        this.acBase = acBase;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public boolean isDexToggle() {
        return dexToggle;
    }

    public void setDexToggle(boolean dexToggle) {
        this.dexToggle = dexToggle;
    }

    public String getAc_description() {
        return ac_description;
    }

    public void setAc_description(String ac_description) {
        this.ac_description = ac_description;
    }

    public String getStrength_req() {
        return strength_req;
    }

    public void setStrength_req(String strength_req) {
        this.strength_req = strength_req;
    }
}
