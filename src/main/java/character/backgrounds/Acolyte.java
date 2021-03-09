package character.backgrounds;

import java.util.List;
import character.item.Items;

public class Acolyte extends GenericBackground{
    private List<String> languages;

    public Acolyte(String language1, String language2) {
        this.getSkills().setInsight(true);
        this.getSkills().setReligion(true);
        languages.add(language1);
        languages.add(language2);
        this.getItemsList().add(new Items(1,"Holy Symbol", "A gift from when you entered priesthood","10gp", 1.00f));
    }
}
