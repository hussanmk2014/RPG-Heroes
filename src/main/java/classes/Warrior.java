package classes;

import characters.Character;

import java.util.ArrayList;
import java.util.Arrays;

public class Warrior extends Character {
    public Warrior(String name) {
        super(
                name,
                "Strength",                //Primary damage dealing stat
                new ArrayList<>(Arrays.asList("Mail", "Plate")),    //Armor type this class can use
                new ArrayList<>(Arrays.asList("Axe", "Hammer", "Sword")), //Weapons this class can use
                new ArrayList<>(Arrays.asList(2, 5, 1)),  //Primary State (Dexterity,Strength,Intelligence)
                new ArrayList<>(Arrays.asList(2, 3, 1))   //State increase per level (Dexterity,Strength,Intelligence)
        );
    }
}
