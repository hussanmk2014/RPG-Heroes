package classes;

import characters.Character;

import java.util.ArrayList;
import java.util.Arrays;

public class  Mage extends Character {

    public Mage(String name) {
        super(
                name,
                "Intelligence",                //character damage attribute
                new ArrayList<>(Arrays.asList("Cloth")),    //Armor type that this character can use
                new ArrayList<>(Arrays.asList("Staff", "Wand")), //Weapons type this character can use
                new ArrayList<>(Arrays.asList(1, 1, 8)),  //Primary State (Dexterity,Strength,Intelligence)
                new ArrayList<>(Arrays.asList(1, 1, 5))   //State increasing per level (Dexterity,Strength,Intelligence)
        );
    }
    @Override
    public String toString() {
        return "Mage{" +
                "name=" + getName()+
                ", level=" + getLevel()+
                ", PrimaryDexterity=" + getPrimaryDexterity() +
                ", PrimaryStrength=" + getPrimaryStrength() +
                ", PrimaryIntelligence=" + getPrimaryIntelligence() +
                ", LevelDexterity=" + getLevelDexterity() +
                ", LevelStrength=" + getLevelStrength() +
                ", LevelIntelligence=" + getLevelIntelligence() +
                ", armor='"+ getAvailableArmor() +  '\'' +
                ", weapon='"+ getAvailableWeapon() +  '\'' +
                ", equipped='" + getItems() + '\'' +
                '}';
    }
}