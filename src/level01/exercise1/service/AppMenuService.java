package level01.exercise1.service;

import level01.exercise1.model.Command;
import level01.exercise1.model.Undo;

import java.util.Scanner;

public class AppMenuService {

    static Scanner sc = new Scanner(System.in);

    public void run() {
        performUserChoice();
    }


    public static int getUserChoice() {
        System.out.println("CHOOSE AN OPTION: \n" +
                "\n1. Type command" +
                "\n2. Erase command" +
                "\n3. view command history" +
                "\n4. exit");

        return sc.nextInt();
    }


    public static Command getCommand() {
        System.out.println("TYPE A COMMAND");
        return new Command(sc.next());
    }


    public static void performUserChoice() {

        Undo undo = Undo.getInstance();
        int userChoice;
        String message;

        do {
            userChoice = getUserChoice();

            switch (userChoice) {
                case 1:
                    Command typedCmd = getCommand();
                    undo.addCommand(typedCmd);
                    message = "COMMAND TYPED: " + typedCmd.getName() + "\n";
                    break;
                case 2:
                    Command undone = undo.undoLast();
                    if (undone != null) {
                        message = "COMMAND ERASED: " + undone.getName() + "\n";
                    } else {
                        message = "NO COMMANDS TO ERASE..." + "\n";
                    }
                    break;
                case 3:
                    message = undo.listCommands() + "\n";
                    break;
                case 4:
                    message = "bye!" + "\n";
                    break;
                default:
                    message = "CHOOSE A VALID OPTION (1-3)" + "\n";
            }
            System.out.println(message);

        } while (userChoice != 4);
    }

}
