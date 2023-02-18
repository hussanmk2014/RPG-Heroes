package menus;
import characters.Character;
import exceptions.InvalidArmorException;
import exceptions.InvalidWeaponException;
import equipmentsItems.armor.Armor;
import equipmentsItems.weapon.Weapon;

import java.util.Scanner;

public class EquipItemsMenu {


    // this menu is to choose equipment ( armor or weapon) to create and equip
    public static Character equipItems(Character character) throws InvalidWeaponException, InvalidArmorException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Equipment Menu:");
        System.out.println("1.Create and equip new weapons\n2.Create and equip new armors\n3.Exit");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                Weapon weapon = createWeapon();
                character.equipWeapon(weapon.getSlot(),weapon);
                System.out.println(weapon.getName() + " is successed equipped!\n");
                break;
            case 2:
                Armor armor = createArmor();
                character.equipArmor(armor.getSlot(),armor);
                System.out.println(armor.getName() + " is successed equipped!\n");
                break;
            case 3:
                break;
        }
        return character;
    }
    public static Weapon createWeapon(){        // Create a new weapon to equip
        String name,slot = "Weapon",type;
        int RequiredLevel, damage;
        double attackSpeed;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your weapon a name:");
        name = scanner.nextLine();
        System.out.println("Choose type for your weapon:\nAxe, Hammer, Sword, Staff, Wand, Bow, Dagger");
        type = scanner.nextLine();
        System.out.println("Level requirement for your weapon:");
        RequiredLevel = scanner.nextInt();
        System.out.println("Damage for your weapon:");
        damage = scanner.nextInt();
        System.out.println("Attack speed for your weapon:");
        attackSpeed = scanner.nextDouble();
        scanner.nextLine();
        return new Weapon(name,RequiredLevel,slot,damage,attackSpeed,type);
    }
    public static Armor createArmor(){      // Create a new armor to equip
        String name,slot,type;
        int RequiredLevel, dexterity,strength,intelligence;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your armor a name:");
        name = scanner.nextLine();
        System.out.println("Choose slot for the armor:\nHead, Chest, Legs");
        slot = scanner.nextLine();
        System.out.println("Choose type for the armor:\nCloth, Leather, Mail, Plate");
        type = scanner.nextLine();
        System.out.println("Level requirement for the armor:");
        RequiredLevel = scanner.nextInt();
        System.out.println("Dexterity for the armor:");
        dexterity = scanner.nextInt();
        System.out.println("Strength for the armor:");
        strength = scanner.nextInt();
        System.out.println("Intelligence for the armor:");
        intelligence = scanner.nextInt();
        return new Armor(name,RequiredLevel,slot,type,dexterity,strength,intelligence);
    }

}

