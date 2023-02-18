package equipmentsItems;

public class BaseItem {
    private String Name;
    private int RequiredLevel;
    private String Slot;

    public BaseItem(String Name, int RequiredLevel, String Slot) {
        this.Name = Name;       // The Name of the item
        this.RequiredLevel = RequiredLevel;   // the required Level to equip
        this.Slot = Slot;       //Each item is equipped in a specific Slot e.g., Weapon, Chest, Legs, Head
    }
    public String getName() {
        return Name;
    }
    public int getRequiredLevel() {
        return RequiredLevel;
    }
    public String getSlot() {
        return Slot;
    }
}
