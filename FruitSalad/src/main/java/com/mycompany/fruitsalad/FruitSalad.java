/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fruitsalad;

/**
 *
 * @author rskandru
 */
import java.util.ArrayList;
import java.util.Scanner;

public class FruitSalad {

    /**
     * @param args the command line arguments
     */
     private static boolean isRunning = true;
    private static ArrayList<Fruit> Fruits = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        do {
            displayAllFruits();
            displayMostExpensiveFruit();
            displayCheapestFruit();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                addFruit();
            } else if (option == 2) {
                removeFruit();
            } else if (option == 3) {
                emptyList();
            } else if (option == 4) {
                exitProgram();
            }
        } while (isRunning);

    }

    private static void displayAllFruits() {
        if (Fruits.size() > 0) {
            System.out.println();
            System.out.println();
            System.out.println("_____________________________________");
            System.out.println("              - List -               ");
            System.out.println("_____________________________________");
            System.out.println("      Fruits      |      Prices      ");
            System.out.println("------------------+------------------");
            double sum = 0;
            for (Fruit thisFruit : Fruits) {
                System.out.print(String.format("%-18s", thisFruit.getName()) + "|");
                System.out.print(String.format("%18s", String.format("%.2f SEK\n", thisFruit.getPrice())));
                sum += thisFruit.getPrice();
            }
            System.out.println("------------------+------------------");
            System.out.format("SUM               |");
            System.out.print(String.format("%18s", String.format("%.2f SEK\n", sum)));
        } else {
            System.out.println("_____________________________________\n");
            System.out.print("List is empty.\nSelect \"1\" to add a fruit.");
        }
    }

    private static void displayMostExpensiveFruit() {
        String fruitName = null;
        if (Fruits.size() > 1) {
            double maxPrice = 0;
            for (Fruit thisFruit : Fruits) {
                if (thisFruit.getPrice() > maxPrice) {
                    maxPrice = thisFruit.getPrice();
                    fruitName = thisFruit.getName();
                }
            }
            System.out.println("_____________________________________\n");
            System.out.println("Most Expensive Fruit: " + fruitName);
            System.out.format("Price: %.2f SEK\n", maxPrice);
        }
    }

    private static void displayCheapestFruit() {
        String fruitName = null;
        if (Fruits.size() > 1) {
            double minPrice = 0;
            for (Fruit thisFruit : Fruits) {
                if (thisFruit.getPrice() < minPrice || minPrice == 0) {
                    minPrice = thisFruit.getPrice();
                    fruitName = thisFruit.getName();
                }
            }
            System.out.println("-------------------------------------");
            System.out.println("Cheapest Fruit: " + fruitName);
            System.out.format("Price: %.2f SEK", minPrice);
        } else if (Fruits.size() == 1) {
            System.out.println("_____________________________________\n");
            System.out.print("List contains only one fruit.\nAdd more fruits to compare prices.");
        }
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("              - Menu -               \n");
        System.out.println("1 - Add Fruits");
        System.out.println("2 - Remove Fruit");
        System.out.println("3 - Empty List");
        System.out.println("4 - Exit");
        System.out.println("-------------------------------------");
    }

    private static int getOption() {
        System.out.print("\nOption: ");
        while (true) {
            try {
                int option = scanner.nextInt();
                System.out.println();
                return option;
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nOption must be an integer.");
                System.out.print("Option: ");
                scanner.nextLine();
            }
        }
    }

    private static void addFruit() {
        String fruitName;
        double fruitPrice;
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("            - Add Fruit -            \n");
        System.out.println("Add fruits below.");
        System.out.println("Enter \"q\" to go back to main screen.\n");
        do {
            System.out.print("Fruit: ");
            while (!scanner.hasNext("[A-Za-z]+")) {
                System.out.println("\nFruit may contain letters a-z only.");
                System.out.print("Fruit: ");
                scanner.next();
            }
            fruitName = scanner.next();
            if (fruitName.equals("q") || fruitName.equals("Q")) {
                break;
            } else {
                System.out.print("Price (in SEK): ");
                while (true) {
                    try {
                        fruitPrice = scanner.nextDouble();
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("\nPrice must be a number.");
                        System.out.print("Price (in SEK): ");
                        scanner.nextLine();
                    }
                }
                Fruits.add(new Fruit(fruitName, fruitPrice));
                System.out.println();
            }
        } while (true);
    }

    private static void removeFruit() {
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("          - Remove Fruit -           \n");
        System.out.print("Fruit: ");
        while (!scanner.hasNext("[A-Za-z]+")) {
            System.out.println("\nFruit may contain letters a-z only.");
            System.out.print("Fruit: ");
            scanner.next();
        }
        String fruitName = scanner.next();
        int removeIndex = 0;
        boolean isInList = false;
        for (Fruit thisFruit : Fruits) {
            if (thisFruit.getName().equals(fruitName)) {
                removeIndex = Fruits.indexOf(thisFruit);
                isInList = true;
            }
        }
        if (isInList) {
            Fruits.remove(removeIndex);
        } else {
            System.out.println("\nFruit not in list.");
        }
    }

    private static void emptyList() {
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("           - Empty List -            \n");
        System.out.print("Are you sure? (Y/n): ");
        label:
        while (true) {
            String answer = scanner.next();
            switch (answer) {
                case "Y":
                case "y":
                    Fruits.clear();
                    break label;
                case "N":
                case "n":
                    break label;
                default:
                    System.out.print("(Y/n): ");
                    break;
            }
        }
    }

    private static void exitProgram() {
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("              - Exit -               \n");
        System.out.print("Are you sure? (Y/n): ");
        label:
        while (true) {
            String answer = scanner.next();
            switch (answer) {
                case "Y":
                case "y":
                    System.out.println("\nExiting...");
                    isRunning = false;
                case "N":
                case "n":
                    break label;
                default:
                    System.out.print("(Y/n): ");
                    break;
            }
        }
    }

    }
    
