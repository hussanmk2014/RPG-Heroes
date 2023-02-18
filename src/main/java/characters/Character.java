package characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import equipmentsItems.BaseItem;
import exceptions.InvalidWeaponException;
import exceptions.InvalidArmorException;

public abstract class Character implements PrimaryState {
    private String name;
    private int level;
    private String classPrimaryState;
    private static Map<String, BaseItem> items;  //Items character has currently equipped
    private ArrayList<String> availableArmor;      //Details of armor character can use
    private ArrayList<String> availableWeapon;     //Details of weapons character can use
    private ArrayList<Integer> PrimaryState;       //Characters Primary State (Dexterity,Strength,Intelligence)
    private ArrayList<Integer> levelState;      //Characters stat increase per level (Dexterity,Strength,Intelligence)

    public Character(String name, String classPrimaryState, ArrayList<String> availableArmor,
                     ArrayList<String> availableWeapon, ArrayList<Integer> PrimaryState, ArrayList<Integer> levelState) {
        this.items = new HashMap<>();
        this.name = name;
        this.level = 1;
        this.classPrimaryState = classPrimaryState;
        this.availableArmor = availableArmor;
        this.availableWeapon = availableWeapon;
        this.PrimaryState = PrimaryState;
        this.levelState = levelState;
    }

    @Override
    public void plusOneLevel() {
        this.level++;
    }

    public ArrayList<String> getAvailableArmor() {
        return availableArmor;
    }

    public ArrayList<String> getAvailableWeapon() {
        return availableWeapon;
    }

    public ArrayList<Integer> getPrimaryState() {
        return PrimaryState;
    }

    public ArrayList<Integer> getLevelState() {
        return levelState;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getClassPrimaryState() {
        return classPrimaryState;
    }

    public static Map<String, BaseItem> getItems() {
        return items;
    }

    public static BaseItem getItems(String key) {
        return items.get(key);
    }

    // Equip an item for  character by equipArmor() and equipWeapon()
    // Key is items slot and the item is the value
    private static void setItems(String key, BaseItem item) {
        Character.items.put(key, item);
    }

    @Override
    public int getPrimaryDexterity() {
        return getPrimaryState().get(0);
    }

    @Override
    public int getPrimaryStrength() {
        return getPrimaryState().get(1);
    }

    @Override
    public int getPrimaryIntelligence() {
        return getPrimaryState().get(2);
    }

    @Override
    public int getLevelDexterity() {  //Get total Dexterity at current level
        return getLevelState().get(0) * (getLevel() - 1);
    }

    @Override
    public int getLevelStrength() {   //Get total Strength at current level
        return getLevelState().get(1) * (getLevel() - 1);
    }

    @Override
    public int getLevelIntelligence() {   //Get total Intelligence at current level
        return getLevelState().get(2) * (getLevel() - 1);
    }

    //Get total Primary state+ current level state for a character and return as a list [dexterity, strength, intelligence]
    @Override
    public ArrayList<Integer> getTotalState() {
        ArrayList<Integer> total = new ArrayList<>();
        total.add(getPrimaryDexterity() + getLevelDexterity());
        total.add(getPrimaryStrength() + getLevelStrength());
        total.add(getPrimaryIntelligence() + getLevelIntelligence());
        return total;
    }

    // Check if armor type and level requirements are met when equipping an armor
    // Key is armor slot and the value is armor
    public void equipArmor(String key, Armor armor) throws InvalidArmorException {
        boolean cantUse = true;
        for (String str: getAvailableArmor()){
            if (str.equals(armor.getArmorType())){
                cantUse = false;
            }
        }
        if(cantUse){
            throw new InvalidArmorException("You cant use this type (" + armor.getArmorType()+") of armor");
        } else if (armor.getRequiredLevel()>getLevel()) {
            throw new InvalidArmorException("You cant use this armor in your current level");
        } else {
            setItems(key, armor);
        }
    }
    // Check if the level and weapon type requirements are met when equipping a weapon
    // Key is the weapons slot and value is weapon
    public void equipWeapon(String key, Weapon weapon) throws InvalidWeaponException {
        boolean cantUse = true;
        for (String str: getAvailableWeapon()){
            if (str.equals(weapon.getWeaponType())){
                cantUse = false;
            }
        }
        if(cantUse){
            throw new InvalidWeaponException("You cant use this type("+weapon.getWeaponType()+") of weapons");
        } else if (weapon.getRequiredLevel()>getLevel()) {
            throw new InvalidWeaponException("You cant use this weapon in your current level");
        } else {
            setItems(key, weapon);
        }
    }
}