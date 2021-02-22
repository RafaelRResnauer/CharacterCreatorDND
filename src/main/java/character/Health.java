package character;

public class Health {
    //Health
    private int hpTotal;
    private int hpCurrent;
    private int hpTemp;

    // Hit dice
    private String hitDiceType;
    private int hitDiceTotal;
    private int hitDiceCurrent;

    public Health(int hpTotal, int hitDiceTotal, String hitDiceType) {
        this.hpTotal = hpTotal;
        this.hpCurrent = this.hpTotal;
        this.hpTemp = 0;
        this.hitDiceType = hitDiceType;
        this.hitDiceTotal = hitDiceTotal;
        this.hitDiceCurrent = this.hitDiceTotal;
    }

    public int getHpTotal() {
        return hpTotal;
    }

    public void setHpTotal(int hpTotal) {
        this.hpTotal = hpTotal;
    }

    public int getHpCurrent() {
        return hpCurrent;
    }

    public void setHpCurrent(int hpCurrent) {
        this.hpCurrent = hpCurrent;
    }

    public int getHpTemp() {
        return hpTemp;
    }

    public void setHpTemp(int hpTemp) {
        this.hpTemp = hpTemp;
    }

    public String getHitDiceType() {
        return hitDiceType;
    }

    public void setHitDiceType(String hitDiceType) {
        this.hitDiceType = hitDiceType;
    }

    public int getHitDiceTotal() {
        return hitDiceTotal;
    }

    public void setHitDiceTotal(int hitDiceTotal) {
        this.hitDiceTotal = hitDiceTotal;
    }

    public int getHitDiceCurrent() {
        return hitDiceCurrent;
    }

    public void setHitDiceCurrent(int hitDiceCurrent) {
        this.hitDiceCurrent = hitDiceCurrent;
    }
}
