package character;

import character.classes.GenericClass;

public class PlayerChar {
    // Basic info
    private String name;
    private String gender;
    private Race race;
    private GenericClass genericClass;
    private Background background;
    private Alignment alignment;
    private String playerName;
    private int xp;

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

    // Extra values
    private boolean inspiration;
    private int proficiencyBonus;

    // Saves
    private int strengthSave;
    private int dexteritySave;
    private int constitutionSave;
    private int intelligenceSave;
    private int wisdomSave;
    private int charismaSave;

    // Skills
    private int acrobatics;
    private int animalHandling;
    private int arcana;
    private int athletics;
    private int deception;
    private int history;
    private int insight;
    private int intimidation;
    private int investigation;
    private int medicine;
    private int nature;
    private int perception;
    private int performance;
    private int persuasion;
    private int religion;
    private int sleightOfHand;
    private int stealth;
    private int survival;
    private int passiveWisdom;

    // Battle values
    private int ac;
    private int initiative;
    private int speed;

    //Health
    private int hpTotal;
    private int hpCurrent;
    private int hpTemp;

    // Hit dice
    private String hitDiceType;
    private int hitDiceTotal;
    private int hitDiceCurrent;

}
