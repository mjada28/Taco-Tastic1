package com.tacotastic;

public class ChipsAndSalsa { import java.util.Scanner;

    public class ChipsSalsa implements OrderItem {
        private String salsa;
        private double price = 1.50;

        @Override
        public double getPrice() {
            return price;
        }

        public void buildFromUser(Scanner input) {
            System.out.println("Choose salsa: verde / roja / chipotle / habanero");
            salsa = input.next();
        }

        @Override
        public String toString() {
            return "Chips & Salsa (" + salsa + ") - $1.50";
        }
    }

}
