package menus;

import characters.Character;
import classes.Mage;
import classes.Ranger;
import classes.Rogue;
import classes.Warrior;

import java.util.Scanner;

public class characterCreationMenu {

    public static Character characterCreation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Character creation, creat a Hero :\nChoose class for your character:\n1.Mage, 2.Rogue, 3.Ranger, 4.Warrior, 5.Exit");
        int choice = scanner.nextInt();
        if (choice==5){
            return null;
        }
        scanner.nextLine();
        System.out.println("Write a name for your Hero character:");
        String name = scanner.nextLine();
        if (choice==1){
            return new Mage(name);
        } else if (choice==2) {
            return new Rogue(name);
        } else if (choice==3) {
            return new Ranger(name);
        } else if (choice==4) {
            return new Warrior(name);
        }
        return null;
    }

}
