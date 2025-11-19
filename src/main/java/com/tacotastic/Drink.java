package com.tacotastic;

public class Drink { import java.util.Scanner;

    public class Drink implements OrderItem {
        private String size;
        private String flavor;
        private double price;


        public double getPrice() {
            return price;
        }

        public void buildFromUser(input) {
            System.out.println("Choose size: 1) Small 2) Medium 3) Large");
            int s = input.nextInt();
            size = switch (s) {
                case 2 -> "Medium";
                case 3 -> "Large";
                default -> "Small";
            };

            if (size.equals("Small")) price = 2.00;
            else if (size.equals("Medium")) price = 2.50;
            else price = 3.00;

            System.out.println("Choose flavor:");
            flavor = input.next();
        }

        @Override
        public String toString() {
            return "Drink (" + size + ", " + flavor + ") - $" + price;
        }
    }


}
