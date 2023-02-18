package menus;
import characters.Character;
import exceptions.InvalidWeaponException;
import static menus.EquipItemsMenu.equipItems;
import static menus.characterCreationMenu.characterCreation;

import java.util.Scanner;



public class MainMenu {


    public static void GameMenu() throws InvalidWeaponException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<<< Start the Game !>>>>");
        Character character = characterCreation();
        boolean goOn = true;
        do {
            System.out.println("The main Menu:");
            System.out.println("1.Create new character (Hero)\n2.Equip some Equipments\n3.Level up\n4.Show character State\n5.Quit");
            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    character = characterCreation();
                    break;
                case 2:
                    try {
                        character = equipItems(character);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    character.plusOneLevel();
                    System.out.println("You reached level " + character.getLevel() + "!\n");
                    break;
                case 4:
                    System.out.println(character.displayCharacterStatistics());
                    break;
                case 5:
                    goOn=false;
                    System.out.println("The Game is cancelled");
                    break;
            }

        }while (goOn);
    }
}
