package Models;

public class Barrel implements GenericAbstractInterface {
    public enum BodyMaterial {
        WOOD, METAL, PLASTIC, CERAMIC
    }

    private int volume;
    private String storedContents;
    private BodyMaterial bodyMaterial;

    public Barrel(int volume, String storedContents, BodyMaterial bodyMaterial) {
        this.volume = volume;
        this.storedContents = storedContents;
        this.bodyMaterial = bodyMaterial;
    }

    public int getVolume() {
        return volume;
    }

    public String getStoredContents() {
        return storedContents;
    }

    public BodyMaterial getBodyMaterial() {
        return bodyMaterial;
    }
}
