package character.classes;

import character.Features;
import character.Health;
import character.Skills;
import character.item.Items;

import java.util.List;

public abstract class GenericClass {
    private Health health;
    private List<String> proficiencyList;
    private Skills skills;
    private List<Items> itemsList;
    private List<Features> featuresList;


}
