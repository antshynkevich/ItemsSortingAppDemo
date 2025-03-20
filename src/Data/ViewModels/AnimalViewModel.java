package Data.ViewModels;

public class AnimalViewModel {
    private String species;
    private int eyesColorCode;
    private boolean hasWool;

    public AnimalViewModel(String species, int eyesColorCode, boolean hasWool) {
        this.species = species;
        this.eyesColorCode = eyesColorCode;
        this.hasWool = hasWool;
    }

    public String getSpecies() {
        return species;
    }

    public int getEyesColorCode() {
        return eyesColorCode;
    }

    public boolean isHasWool() {
        return hasWool;
    }
}