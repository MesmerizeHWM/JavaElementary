package org.demo.birds.processor;

import org.demo.birds.entities.Bird;
import org.demo.birds.store.BirdStore;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Реализовать интерфейсы IBirdCreator, IUserCommandProcessor, IInfiniteLoopProcessor
 */
public class UserCommandProcessor implements IBirdCreator, IUserCommandProcessor, IInfiniteLoopProcessor {

    BirdStore birdStore = BirdStore.getInstance();
    private boolean isFinished = false;
    Scanner scanner = new Scanner(System.in);

    @Override
    public Bird createBird(Scanner userInputReader) {
        String birdName;
        String birdLivingArea;
        double birdSize = -1;

        System.out.println("Please, enter bird name:");
        birdName = scanner.next();

        System.out.println("Please, enter bird living area:");
        birdLivingArea = scanner.next();

        do {
            try {
                System.out.println("Please, enter bird size:");
                birdSize = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid size was entered." + "\n");
            }
            scanner.nextLine();
        } while (birdSize <= 0);

        System.out.println("Bird was added" + "\n");
        return new Bird(birdName, birdLivingArea, birdSize);
    }

    @Override
    public void processInLoop() {
        while (!isFinished) {
            System.out.println("Please enter command: ");
            System.out.println("    a - add new Bird");
            System.out.println("    s - search bird by name");
            System.out.println("    l - search bird by living area");
            System.out.println("    exit - terminate application" + "\r");
            switch (scanner.next()) {
                case "a":
                    processUserCommand("a", scanner);
                    break;
                case "s":
                    processUserCommand("s", scanner);
                    break;
                case "l":
                    processUserCommand("l", scanner);
                    break;
                case "exit":
                    isFinished = true;
                    System.out.println("Application was terminated");
                    break;
                default:
                    System.out.println("Unknown command" + "\n");            }
        }
    }

    @Override
    public void processUserCommand(String command, Scanner userInputReader) {
        switch (command) {
            case "a":
                birdStore.addBird(createBird(scanner));
                break;
            case "s":
                System.out.println("Please, enter bird name to search:");
                if (birdStore != null) {
                    Bird foundBird = birdStore.searchByName(scanner.next());
                    if (foundBird != null) {
                        System.out.println("Find bird: " + foundBird + "\n");
                    } else {
                        System.out.println("Such bird was not found." + "\n");
                    }
                }
                break;
            case "l":
                System.out.println("Please, enter bird living area to search:");
                List listByLivingArea = birdStore.searchByLivingArea(scanner.next());
                if (listByLivingArea != null) {
                    System.out.println("Find bird: " + Arrays.toString(listByLivingArea.toArray()) + "\n");
                } else {
                    System.out.println("No birds were found in this area." + "\n");
                }
                break;
            default:
                System.out.println("Unknown command");
        }
    }
}
