package equipmentsItems.armor;

import equipmentsItems.BaseItem;

public class Armor extends BaseItem {
    private final String armorType;
    private final int dexterity;
    private final int strength;
    private final int intelligence;

    public Armor(String name, int RequiredLevel, String slot, String armorType,
                 int dexterity, int strength, int intelligence) {
        super(name, RequiredLevel, slot);
        this.dexterity = dexterity;         //Armor dexterity
        this.strength = strength;           //Armor strength
        this.intelligence = intelligence;   //Armor intelligence
        this.armorType = armorType;         // type of armor
    }
    public String getArmorType() {
        return armorType;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getStrength() {
        return strength;
    }
    public int getIntelligence() {
        return intelligence;
    }
    @Override
    public String toString() {
        return "Cloth{" +
                "name='" + getName() + '\'' +
                ",RequiredLevel=" + getRequiredLevel() +
                ",slot='" + getSlot() + '\'' +
                ",armorType='" + getArmorType() + '\'' +
                ",dexterity='" + getDexterity() + '\'' +
                ",strength='" + getStrength() + '\'' +
                ",intelligence='" + getIntelligence() + '\'' +
                '}';
    }
}
