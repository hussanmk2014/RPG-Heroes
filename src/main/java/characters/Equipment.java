package characters;

import equipmentsItems.armor.Armor;
import equipmentsItems.weapon.Weapon;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;

public interface Equipment {
    public void equipArmor(String key, Armor armor) throws InvalidArmorException;
    public void equipWeapon(String key, Weapon weapon) throws InvalidWeaponException;

}
