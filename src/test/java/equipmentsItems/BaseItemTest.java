package equipmentsItems;

import classes.Mage;
import equipmentsItems.armor.Armor;
import equipmentsItems.weapon.Weapon;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseItemTest {
    @Test
    public void getIntelligence_armorIsCreated_shouldReturnItsIntelligenceState(){
        //Arrange
        Armor armor = new Armor("Common Plate Chest",2,"Chest","Cloth",1,1,1);
        int expected = 1;
        //Act
        int actual = armor.getIntelligence();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getStrength_armorIsCreated_shouldReturnItsStrengthState(){
        //Arrange
        Armor armor = new Armor("Common Plate Chest",2,"Chest","Cloth",1,1,1);
        int expected = 1;
        //Act
        int actual = armor.getStrength();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getDexterity_armorIsCreated_shouldReturnItsDexterityState(){
        //Arrange
        Armor armor = new Armor("Common Plate Chest",2,"Chest","Cloth",1,1,1);
        int expected = 1;
        //Act
        int actual = armor.getDexterity();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getArmorType_armorIsCreated_shouldReturnItsType(){
        //Arrange
        Armor armor = new Armor("Common Plate Chest",2,"Chest","Cloth",1,1,1);
        String expected = "Cloth";
        //Act
        String actual = armor.getArmorType();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getName_itemIsCreated_shouldReturnItsName(){
        //Arrange
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        String expected = "Common Axe";
        //Act
        String actual = weapon.getName();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getRequiredLevel_itemIsCreated_shouldReturnItsRequiredLevel(){
        //Arrange
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        int expected = 1;
        //Act
        int actual = weapon.getRequiredLevel();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getSlot_itemIsCreated_shouldReturnItsSlot(){
        //Arrange
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        String expected = "Weapon";
        //Act
        String actual = weapon.getSlot();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getDamage_weaponIsCreated_shouldReturnItsDamage(){
        //Arrange
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        int expected = 1;
        //Act
        int actual = weapon.getDamage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getAttackSpeed_weaponIsCreated_shouldReturnItsAttackSpeed(){
        //Arrange
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        double expected = 1;
        //Act
        double actual = weapon.getAttackSpeed();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getDamagePerSpeed_weaponIsCreated_shouldReturnItsDamage(){
        //Arrange
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        double expected = 1;
        //Act
        double actual = weapon.getDamage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void getWeaponType_weaponIsCreated_shouldReturnItsType(){
        //Arrange
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        String expected = "Staff";
        //Act
        String actual = weapon.getWeaponType();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void equipWeapon_equipWeaponMoreThanCharactersLevel_throwInvalidWeaponException(){
        //Arrange
        Mage mage = new Mage("Mage");
        Weapon weapon = new Weapon("Common Axe",2,"Weapon",1,1,"Staff");
        String expected = "You cant use this weapon in your current level";
        //Act
        Exception e =assertThrows(Exception.class, ()->mage.equipWeapon(String.valueOf(weapon.getSlot()),weapon));
        String actual = e.getMessage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void equipWeapon_equipWeaponWhichHasTypeClassUnvailable_throwInvalidWeaponException(){
        //Arrange
        Mage mage = new Mage("Mage");
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Axe");
        String expected = "You cant use this type(Axe) of weapons";
        //Act
        Exception e =assertThrows(Exception.class, ()->mage.equipWeapon(String.valueOf(weapon.getSlot()),weapon));
        String actual = e.getMessage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void equipWeapon_characterCanEquipWeaponIfRequirementsForLevelAndTypeAreMet_canEquipWeapon() throws InvalidWeaponException {
        //Arrange
        Mage mage = new Mage("Mage");
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",1,1,"Staff");
        mage.equipWeapon(String.valueOf(weapon.getSlot()),weapon);
        Weapon weaponTwo = (Weapon) mage.getItems().get("Weapon");
        boolean expected = true;
        //Act
        boolean actual = weapon == weaponTwo;
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void equipArmor_equipArmorOverCharactersLevel_throwInvalidArmorException(){
        //Arrange
        Mage mage = new Mage("Mage");
        Armor armor = new Armor("Common Plate Chest",2,"Chest","Cloth",1,1,1);
        String expected = "You cant use this armor in your current level";
        //Act
        Exception e =assertThrows(Exception.class, ()->mage.equipArmor(String.valueOf(armor.getSlot()),armor));
        String actual = e.getMessage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void equipArmor_equipArmorWhichHasTypeClassCantUse_throwInvalidArmorException(){
        //Arrange
        Mage mage = new Mage("Mage");
        Armor armor = new Armor("Common Plate Chest",1,"Chest","Mail",1,1,1);
        String expected = "You cant use this type (Mail) of armor";
        //Act
        Exception e =assertThrows(Exception.class, ()->mage.equipArmor(String.valueOf(armor.getSlot()),armor));
        String actual = e.getMessage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void equipArmor_IfRequirementsForLevelAndTypeAreMet_canEquipArmor() throws InvalidArmorException {
        //Arrange
        Mage mage = new Mage("Mage");
        Armor armor = new Armor("Common Plate Chest",1,"Chest","Cloth",1,1,1);
        mage.equipArmor(String.valueOf(armor.getSlot()),armor);
        Armor armorTwo = (Armor) mage.getItems().get("Chest");
        boolean expected = true;
        //Act
        boolean actual = armor == armorTwo;
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void calculateDamage_noWeaponEquipped_ShouldReturnCorrectDamage(){
        //Arrange
        Mage mage = new Mage("Mage");
        double expected = 1 * (1 + 8 / 100.0);  //1 * (1% for every primary stat)
        //Act
        double actual = mage.calculateDamage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void calculateDamage_WeaponEquipped_ShouldReturnCorrectDamage() throws InvalidWeaponException {
        //Arrange
        Mage mage = new Mage("Mage");
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",5,2,"Staff");
        mage.equipWeapon(String.valueOf(weapon.getSlot()),weapon);
        double expected = 5 * 2 * (1 + 8 / 100.0);    //weapon damage * weapon attack speed * (1% for every primary stat)
        //Act
        double actual = mage.calculateDamage();
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    public void calculateDamage_WeaponAndArmorEquipped_ShouldReturnCorrectDamage() throws InvalidWeaponException, InvalidArmorException {
        //Arrange
        Mage mage = new Mage("Mage");
        Weapon weapon = new Weapon("Common Axe",1,"Weapon",5,1.5,"Staff");
        Armor armor = new Armor("Common Plate Chest",1,"Chest","Cloth",1,1,1);
        mage.equipWeapon(String.valueOf(weapon.getSlot()),weapon);
        mage.equipArmor(String.valueOf(armor.getSlot()),armor);
        double expected = 5 * 1.5 * (1 + (8 + 1) / 100.0);    //weapon damage * weapon attack speed * (1% for every primary stat)
        //Act
        double actual = mage.calculateDamage();
        //Assert
        assertEquals(expected,actual);
    }

}