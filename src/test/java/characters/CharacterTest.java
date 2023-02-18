package characters;

import classes.Mage;
import classes.Ranger;
import classes.Rogue;
import classes.Warrior;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    public void getName_characterIsCreated_returnName(){
        //Arrange
        Mage mage = new Mage("Mage");
        String expected = "Mage";
        //Act
        String actual = mage.getName();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getLevel_characterIsCreated_returnCurrentLevel(){
        //Arrange
        Mage mage = new Mage("Mage");
        int expected = 1;
        //Act
        int actual = mage.getLevel();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getClassPrimaryStat_characterIsCreated_returnDamageDealingStat(){
        //Arrange
        Mage mage = new Mage("Mage");
        String expected = "Intelligence";
        //Act
        String actual = mage.getClassPrimaryState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getPrimaryState_characterIsCreated_returnListOfPrimaryState(){
        //Arrange
        Mage mage = new Mage("Mage");
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,1,8));
        //Act
        List<Integer> actual = mage.getPrimaryState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getLevelState_characterIsCreated_returnListOfLevelIncreaseState(){
        //Arrange
        Mage mage = new Mage("Mage");
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,1,5));
        //Act
        List<Integer> actual = mage.getLevelState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getAvailabeArmor_characterIsCreated_returnListOfAvailableArmorsType(){
        //Arrange
        Mage mage = new Mage("Mage");
        List<String> expected = new ArrayList<>(Arrays.asList("Cloth"));
        //Act
        List<String> actual = mage.getAvailableArmor();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getAvailabeWeapon_characterIsCreatede_returnListOfAvailableWeapons(){
        //Arrange
        Mage mage = new Mage("Mage");
        List<String> expected = new ArrayList<>(Arrays.asList("Staff", "Wand"));
        //Act
        List<String> actual = mage.getAvailableWeapon();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getTotalState_AtHigherLevelThanOne_GetListOfTotalStateAtCurrentLevel(){
        //Arrange
        Mage mage = new Mage("Mage");
        mage.plusOneLevel();
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,2,13));
        //Act
        List<Integer> actual = mage.getTotalState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void character_CalledFromMageThroughSuperConstructor_characterIsAtLevelOne() {
        //Arrange
        Mage mage = new Mage("Mage");
        int expected = 1;
        //Act
        int actual = mage.getLevel();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void plusOneLevel_oneLevelIsAddedToCharacter_characterIsAtLevelTwo() {
        //Arrange
        Mage mage = new Mage("Mage");
        mage.plusOneLevel();
        int expected = 2;
        //Act
        int actual = mage.getLevel();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void mage_HasCorrectPrimaryStateInCreation_characterHasCorrectState(){
        //Arrange
        Mage mage = new Mage("Mage");
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,1,8)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = mage.getPrimaryState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void rogue_HasCorrectPrimaryStateInCreation_characterHasCorrectState(){
        //Arrange
        Rogue rogue = new Rogue("Rogue");
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6,2,1)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = rogue.getPrimaryState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void ranger_HasCorrectPrimaryStateInCreation_characterHasCorrectState(){
        //Arrange
        Ranger ranger = new Ranger("Ranger");
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7,1,1)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = ranger.getPrimaryState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void warrior_HasCorrectPrimaryStateInCreation_characterHasCorrectState(){
        //Arrange
        Warrior warrior = new Warrior("Warrior");
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,5,1)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = warrior.getPrimaryState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void mage_HasCorrectStateAfterLevelUp_characterHasCorrectState(){
        //Arrange
        Mage mage = new Mage("Mage");
        mage.plusOneLevel();
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,2,13)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = mage.getTotalState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void rogue_HasCorrectStateAfterLevelUp_characterHasCorrectState(){
        //Arrange
        Rogue rogue = new Rogue("Rogue");
        rogue.plusOneLevel();
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(10,3,2)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = rogue.getTotalState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void ranger_HasCorrectStateAfterLevelUp_characterHasCorrectState(){
        //Arrange
        Ranger ranger = new Ranger("Ranger");
        ranger.plusOneLevel();
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(12,2,2)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = ranger.getTotalState();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void warrior_HasCorrectStateAfterLevelUp_characterHasCorrectState(){
        //Arrange
        Warrior warrior = new Warrior("Warrior");
        warrior.plusOneLevel();
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,8,2)); //(Dexterity,Strength,Intelligence)
        //Act
        ArrayList<Integer> actual = warrior.getTotalState();
        //Assert
        assertEquals(expected,actual);
    }
}