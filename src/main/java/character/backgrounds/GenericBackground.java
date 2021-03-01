package character.backgrounds;

import character.Features;
import character.Skills;
import character.item.Items;

import java.util.List;

public abstract class GenericBackground {
    private List<String> proficiencyList;
    private Skills skills;
    private List<Items> itemsList;
    private Features feature;

    public GenericBackground() {
    }

    public List<String> getProficiencyList() {
        return proficiencyList;
    }

    public void setProficiencyList(List<String> proficiencyList) {
        this.proficiencyList = proficiencyList;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public Features getFeature() {
        return feature;
    }

    public void setFeature(Features feature) {
        this.feature = feature;
    }
}
