package character.races;

import character.Features;

import java.util.List;

public class HillDwarf extends GenericRace {
    private List<String> proficiencyList;
    private List<Features> featuresList;

    public HillDwarf(String tool) {
        setScoreIncreases(2,2);
        setSize(Size.Medium);
        setSpeed(30);
        featuresList.add(new Features("Darkvision", """
                Accustomed to life underground, you have superior
                vision in dark and dim conditions. You can see in
                dim light within 60 feet of you as if it were bright
                light, and in darkness as if it were dim light. You
                can’t discern color in darkness, only shades of gray."""));
        featuresList.add(new Features("Dwarven Resilience","You have advantage on saving throws against\n" +
                "poison, and you have resistance against poison damage."));
        featuresList.add(new Features("Stonecunning", """
                Whenever you make an Intelligence (History) check
                related to the origin of stonework, you are
                considered proficient in the History skill and add
                double your proficiency bonus to the check, instead
                of your normal proficiency bonus."""));
        proficiencyList.add(tool);
        getLanguages().add("Common");
        getLanguages().add("Dwarvish");

    }
}
