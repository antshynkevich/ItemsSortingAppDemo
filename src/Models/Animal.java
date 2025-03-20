package Models;

public class Animal  implements GenericAbstractInterface {
    public enum EyesColor {
        BROWN, BLUE, GREEN, AMBER, HETEROCHROMIC
    }

    private String species;
    private EyesColor eyesColor;
    private boolean hasWool;

    public Animal(String species, EyesColor eyesColor, boolean hasWool) {
        this.species = species;
        this.eyesColor = eyesColor;
        this.hasWool = hasWool;
    }

    public String getSpecies() {
        return species;
    }

    public EyesColor getEyesColor() {
        return eyesColor;
    }

    public boolean hasWool() {
        return hasWool;
    }
}
