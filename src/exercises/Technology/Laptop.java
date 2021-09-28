package exercises.Technology;

public class Laptop extends Computer {
    private String operatingSystem;
    private Boolean isNotMac = true;

    public Laptop(int storage, int ram, boolean hasKeyboard, String operatingSystem) {
        super(storage, ram, hasKeyboard);
        this.operatingSystem = operatingSystem;

    }

    public boolean getNotMac() {
        if (operatingSystem.contains("MacOS")) {
            return false;
        }
        return isNotMac;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

}
