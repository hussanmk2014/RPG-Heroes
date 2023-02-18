package equipmentsItems;
public abstract class BaseItem {
    private String name;
    private int RequiredLevel;
    private String slot;

    public BaseItem(String name, int RequiredLevel, String slot) {
        this.name = name;       //Name of the equipment
        this.RequiredLevel = RequiredLevel;   // the required level  to equip
        this.slot = slot;       // item slot such as Weapon, Chest, Legs, Head
    }
    public String getName() {
        return name;
    }
    public int getRequiredLevel() {
        return RequiredLevel;
    }
    public String getSlot() {
        return slot;
    }
    @Override
    public String toString() {
        return "PrimaryItem{" +
                "name='" + name + '\'' +
                ", RequiredLevel=" + RequiredLevel +
                ", slot='" + slot + '\'' +
                '}';
    }
}
