package character;

public class AbilityScores {
    // Ability scores
    private int strength;
    private int strengthMod;
    private int dexterity;
    private int dexterityMod;
    private int constitution;
    private int constitutionMod;
    private int intelligence;
    private int intelligenceMod;
    private int wisdom;
    private int wisdomMod;
    private int charisma;
    private int charismaMod;

    // Saves
    private int strengthSave;
    private int dexteritySave;
    private int constitutionSave;
    private int intelligenceSave;
    private int wisdomSave;
    private int charismaSave;

    public AbilityScores(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;

        this.strengthMod = setMod(this.strength);
        this.dexterityMod = setMod(this.dexterity);
        this.constitutionMod = setMod(this.constitution);
        this.intelligenceMod = setMod(this.intelligence);
        this.wisdomMod = setMod(this.wisdom);
        this.charismaMod = setMod(this.charisma);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrengthMod() {
        return strengthMod;
    }

    public void setStrengthMod(int strengthMod) {
        this.strengthMod = strengthMod;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDexterityMod() {
        return dexterityMod;
    }

    public void setDexterityMod(int dexterityMod) {
        this.dexterityMod = dexterityMod;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getConstitutionMod() {
        return constitutionMod;
    }

    public void setConstitutionMod(int constitutionMod) {
        this.constitutionMod = constitutionMod;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligenceMod() {
        return intelligenceMod;
    }

    public void setIntelligenceMod(int intelligenceMod) {
        this.intelligenceMod = intelligenceMod;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWisdomMod() {
        return wisdomMod;
    }

    public void setWisdomMod(int wisdomMod) {
        this.wisdomMod = wisdomMod;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getCharismaMod() {
        return charismaMod;
    }

    public void setCharismaMod(int charismaMod) {
        this.charismaMod = charismaMod;
    }

    public int getStrengthSave() {
        return strengthSave;
    }

    public void setStrengthSave(int strengthSave) {
        this.strengthSave = strengthSave;
    }

    public int getDexteritySave() {
        return dexteritySave;
    }

    public void setDexteritySave(int dexteritySave) {
        this.dexteritySave = dexteritySave;
    }

    public int getConstitutionSave() {
        return constitutionSave;
    }

    public void setConstitutionSave(int constitutionSave) {
        this.constitutionSave = constitutionSave;
    }

    public int getIntelligenceSave() {
        return intelligenceSave;
    }

    public void setIntelligenceSave(int intelligenceSave) {
        this.intelligenceSave = intelligenceSave;
    }

    public int getWisdomSave() {
        return wisdomSave;
    }

    public void setWisdomSave(int wisdomSave) {
        this.wisdomSave = wisdomSave;
    }

    public int getCharismaSave() {
        return charismaSave;
    }

    public void setCharismaSave(int charismaSave) {
        this.charismaSave = charismaSave;
    }

    public int setMod(int score){
        float temp = score-10;
        return Math.round((temp)/2);
    }
}
