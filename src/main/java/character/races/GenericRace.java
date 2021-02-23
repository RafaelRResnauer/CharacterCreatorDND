package character.races;

import character.Languages;

import java.util.List;

public abstract class GenericRace {
    private int[] scoreIncreases = {0, 0, 0, 0, 0, 0};
    private Size size;
    private int speed;
    private List<String> languages;

    public int[] getScoreIncreases() {
        return scoreIncreases;
    }

    public void setScoreIncreases(int score, int index) {
        this.scoreIncreases[index] = score;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
