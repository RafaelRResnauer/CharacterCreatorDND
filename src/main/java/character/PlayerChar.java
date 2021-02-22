package character;

import character.backgrounds.GenericBackground;
import character.classes.GenericClass;
import character.item.Items;
import character.races.main_races.GenericRace;

import java.util.List;

public class PlayerChar {
    // Basic info
    private int level;
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

    // Health
    private Health health;

    // Equipment
    private List<Items> itemsList;

    // Features

    // Proficiencies and languages

}
