package classes;

import characters.Character;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranger extends Character {
    public Ranger(String name) {
        super(
                name,
                "Dexterity",                //Primary damage dealing stat
                new ArrayList<>(Arrays.asList("Leather", "Mail")),    //Armor type this class can use
                new ArrayList<>(Arrays.asList("Bow")), //Weapons this class can use
                new ArrayList<>(Arrays.asList(7, 1, 1)),  //Primary State (Dexterity,Strength,Intelligence)
                new ArrayList<>(Arrays.asList(5, 1, 1))   //State increase per level (Dexterity,Strength,Intelligence)
        );
    }
}
