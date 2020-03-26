package com.company;

import java.util.Scanner;

public class SystemTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(java.lang.System.in);
        int choice;
        int memorySize;
        int cost;
        double hardDiskSize;
        System system = new System("HP", "4YR38AA", 4);

        do {

            java.lang.System.out.println("Enter a number to select your Choice:");
            java.lang.System.out.println("Choice 1 – Print System Details");
            java.lang.System.out.println("Choice 2 - Display System Properties");
            java.lang.System.out.println("Choice 3 – Diagnose System ");
            java.lang.System.out.println("Choice 4 – Set Details");
            java.lang.System.out.println("Choice 5 – Set Cost");
            java.lang.System.out.println("Choice 6 – Quit the program");
            choice = scanner.nextInt();
            if (choice == 1) {
                java.lang.System.out.println(system.displayDetails());

            }
            else if (choice == 2) {
                java.lang.System.out.println(system.displaySystemProperties());

            }
            else if (choice == 3) {
                java.lang.System.out.println(system.diagnoseSystem());

            }
            else if (choice == 4) {
                java.lang.System.out.println("Please enter new memory size");
                memorySize = scanner.nextInt();
                system.setMemory(memorySize);
                java.lang.System.out.println("Memory size changed to " + memorySize);
                java.lang.System.out.println("Please enter new hard disk size");
                hardDiskSize = scanner.nextDouble();
                system.setHardDisk(hardDiskSize);
                java.lang.System.out.println("Memory size changed to " + hardDiskSize);
            }

            else if (choice == 5) {
                java.lang.System.out.println("Please enter new cost");
                cost = scanner.nextInt();
                system.setPurchaseCost(cost);

            }
            else if (choice == 6) {
                java.lang.System.out.println("Exiting program...");
            }

            else {
                java.lang.System.out.println("Please enter a valid number.");
            }

            //Adding a blank line between choices to make it easier for the user to read
            java.lang.System.out.println("\n");


        }
        while (choice != 6);
    }
}

