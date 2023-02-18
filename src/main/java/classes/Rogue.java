package classes;

import characters.Character;

import java.util.ArrayList;
import java.util.Arrays;

public class Rogue extends Character {
    public Rogue(String name) {
        super(
                name,
                "Dexterity",                //Primary damage dealing stat
                new ArrayList<>(Arrays.asList("Leather", "Mail")),    //Armor type this class can use
                new ArrayList<>(Arrays.asList("Dagger", "Sword")), //Weapons this class can use
                new ArrayList<>(Arrays.asList(6, 2, 1)),  //Primary State (Dexterity,Strength,Intelligence)
                new ArrayList<>(Arrays.asList(4, 1, 1))   //State increase per level (Dexterity,Strength,Intelligence)
        );
    }

    @Override
    public String toString() {
        return "Rogue{" +
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
