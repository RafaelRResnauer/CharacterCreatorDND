package character;

import character.backgrounds.GenericBackground;
import character.classes.GenericClass;
import character.item.Items;
import character.races.GenericRace;

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
    private int maxWeight;
    private int xp;

    // Ability Scores
    private AbilityScores abilityScores;

    // Extra values
    private boolean inspiration;
    private int proficiencyBonus;

    // Battle values
    private int ac;
    private int initiative;

    // Health
    private Health health;
}
