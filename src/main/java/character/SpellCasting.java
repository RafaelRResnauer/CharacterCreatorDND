package character;

import java.util.List;

public class SpellCasting {
    private String ability;
    private int saveDC;
    private int attackBonus;
    private List<Spell> listOfSpells;

    public SpellCasting(String ability, int saveDC, int attackBonus, List<Spell> listOfSpells) {
        this.ability = ability;
        this.saveDC = saveDC;
        this.attackBonus = attackBonus;
        this.listOfSpells = listOfSpells;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getSaveDC() {
        return saveDC;
    }

    public void setSaveDC(int saveDC) {
        this.saveDC = saveDC;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public List<Spell> getListOfSpells() {
        return listOfSpells;
    }

    public void setListOfSpells(List<Spell> listOfSpells) {
        this.listOfSpells = listOfSpells;
    }
}
