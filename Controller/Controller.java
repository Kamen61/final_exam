package Controller;

import Services.Services;
import View.View;

public class Controller {
    Services animalUtil = new Services();

    public void run() {
        while (true) {
            View.showMenu();
            String input = View.userInput();

            switch (input) {
                case "1" -> animalUtil.createAnimal();
                case "2" -> animalUtil.showAllCommands();
                case "3" -> animalUtil.addNewCommand();
                case "4" -> {
                    return;
                }

                default -> System.err.println("\nВведена не корректная команда\n");
            }
        }
    }
}
