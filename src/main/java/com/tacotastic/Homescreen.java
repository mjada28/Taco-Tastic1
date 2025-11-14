package com.tacotastic;
import java.util.Scanner;


    // HomeScreen.java
    public class Homescreen {
        public void display() {
            System.out.println("\n===== HOME SCREEN =====");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");
            Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    this.orderScreen();

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        }

        public void orderScreen() {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("\n===== MENU =====");
            System.out.println("1) Add Taco");
            System.out.println("2) Drink");
            System.out.println("3) Chips and Salsa");
            System.out.println("4) Checkout");
            System.out.println("0) Main Menu");
            scanner.nextLine();
            switch (choice) {
                case 1:
                    this.orderScreen();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;


            }
        }
    }

