package com.tacotastic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract class Taco {
        private String size; // Single Taco, 3-Taco PLate, Burrito
        private String tortilla;
        private List<Topping> toppings = new ArrayList<>();
        private boolean isDeepFried;

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("===Add Taco===");

 //         Select shell
            System.out.println("Select your shell");
            System.out.println("1) Hard Shell");
            System.out.println("2) Soft Shell");
            String shell = input.nextLine().equals("1") ? "Hard Shell" : "Soft Shell";


 //         Taco Size
            System.out.println("Select taco size:");
            System.out.println("1) Small");
            System.out.println("2) Medium");
            System.out.println("3 Large");
            String sizeChoice = input.nextLine();
//            String size = switch (sizeChoice) {
//                case "1" -> "Small"
//                case "2" -> "Medium"
//                case "3" -> "Large"
//                case
//            }



        }


}
