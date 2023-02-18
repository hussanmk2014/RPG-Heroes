package characters;

import java.util.ArrayList;

public interface PrimaryState {
    //Add a level to a character
    public void plusOneLevel();
    //Get characters Primary State
    public int getPrimaryDexterity();
    public int getPrimaryStrength();
    public int getPrimaryIntelligence();
    //Check character level and multiply it with level up State to get total State from level ups for current level
    public int getLevelDexterity();
    public int getLevelStrength();
    public int getLevelIntelligence();
    //Get total State (PrimaryState + level * StatePerEachLevel)
    public ArrayList<Integer> getTotalState();
    //Calculate characters Damage
    public double calculateDamage();


}
