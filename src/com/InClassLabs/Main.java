package com.InClassLabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

	System.out.println("Welcome to Mystery Jungle!");
	System.out.println("You are flying over the Amazon and your plane crash lands. " +
                        "Will you stay with your group, or venture for help?");
	System.out.println("Enter 'stay' or 'go alone':");

        String stayGo = scan.nextLine();

        if (stayGo.equals("stay")){

            System.out.println("A villager approaches your group and asks you to follow him. Do you go? Enter 'yes' or 'no'.");
            String villagerYesNo = scan.nextLine();
                if (villagerYesNo.equals("yes")) {
                    System.out.println("The villager leads you into a trap and robs you. You have now lost all your valuables.");
                    System.out.println("Will you fight him to get your valuables back? (yes or no)");
                    String fightYesNo = scan.nextLine();
                    if (fightYesNo.equals("yes")) {
                        System.out.println("The villager is impressed by your bravery and decides to lead you to safety.");
                        System.out.println("You have been rescued! You win!");
                    }
                    else {
                        System.out.println("Without any valuables your group is unprotected from the elements.");
                        System.out.println("Your group perishes within a few days.");
                        System.out.println("Your game has ended. Better luck next time.");
                    }
            }
            else {
                System.out.println("You remain waiting for 10 days. You and your group starve to death.");
                System.out.println("Your game has ended. Better luck next time.");
            }
        }
        else {
            System.out.println("While you are venturing alone for help, you are eaten by a tiger.");
            System.out.println("Your game has ended. Better luck next time.");
        }
    }
}
