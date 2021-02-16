package character;

import character.backgrounds.GenericBackground;
import character.classes.GenericClass;
import character.races.main_races.GenericRace;

public class PlayerChar {
    // Basic info
    private String name;
    private String gender;
    private GenericRace genericRace;
    private GenericClass genericClass;
    private GenericBackground genericBackground;
    private Alignment alignment;
    private String playerName;
    private int xp;

    // Ability Scores
    private AbilityScores abilityScores;

    // Extra values
    private boolean inspiration;
    private int proficiencyBonus;

    // Skills
    private Skills skills;

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
