package Data.ViewModels;

public class BarrelViewModel {
    private int volume;
    private String storedContents;
    private int bodyMaterialCode;

    public BarrelViewModel(int volume, String storedContents, int bodyMaterialCode) {
        this.volume = volume;
        this.storedContents = storedContents;
        this.bodyMaterialCode = bodyMaterialCode;
    }

    public int getVolume() {
        return volume;
    }

    public String getStoredContents() {
        return storedContents;
    }

    public int getBodyMaterialCode() {
        return bodyMaterialCode;
    }
}
