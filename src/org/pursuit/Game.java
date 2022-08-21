package org.pursuit;

import java.util.Scanner;

public class Game implements GameStartInterface {

    int playerHp;
    int burgerKing;
    int ronaldHP = 20;
    String playerWeapon;
    String playerName;
    Scanner scanner = new Scanner(System.in);
    Scanner enter = new Scanner(System.in);

    public void playerIntro() {

        playerHp = 15;


        System.out.println("                       .,,uod8B8bou,,.\n" +
                "              ..,uod8BBBBBBBBBBBBBBBBRPFT?l!i:.\n" +
                "         ,=m8BBBBBBBBBBBBBBBRPFT?!||||||||||||||\n" +
                "         !...:!TVBBBRPFT||||||||||!!^^\"\"'   ||||\n" +
                "         !.......:!?|||||!!^^\"\"'            ||||\n" +
                "         !.........||||                     ||||\n" +
                "         !.........||||  ##                 ||||\n" +
                "         !.........||||                     ||||\n" +
                "         !.........||||                     ||||\n" +
                "         !.........||||                     ||||\n" +
                "         !.........||||                     ||||\n" +
                "         `.........||||                    ,||||\n" +
                "          .;.......||||               _.-!!|||||\n" +
                "   .,uodWBBBBb.....||||       _.-!!|||||||||!:'\n" +
                "!YBBBBBBBBBBBBBBb..!|||:..-!!|||||||!iof68BBBBBb....\n" +
                "!..YBBBBBBBBBBBBBBb!!||||||||!iof68BBBBBBRPFT?!::   `.\n" +
                "!....YBBBBBBBBBBBBBBbaaitf68BBBBBBRPFT?!:::::::::     `.\n" +
                "!......YBBBBBBBBBBBBBBBBBBBRPFT?!::::::;:!^\"`;:::       `.\n" +
                "!........YBBBBBBBBBBRPFT?!::::::::::^''...::::::;         iBBbo.\n" +
                "`..........YBRPFT?!::::::::::::::::::::::::;iof68bo.      WBBBBbo.\n" +
                "  `..........:::::::::::::::::::::::;iof688888888888b.     `YBBBP^'\n" +
                "    `........::::::::::::::::;iof688888888888888888888b.     `\n" +
                "      `......:::::::::;iof688888888888888888888888888888b.\n" +
                "        `....:::;iof688888888888888888888888888888888899fT!\n" +
                "          `..::!8888888888888888888888888888888899fT|!^\"'\n" +
                "            `' !!988888888888888888888888899fT|!^\"'\n" +
                "                `!!8888888888888888899fT|!^\"'\n" +
                "                  `!988888888899fT|!^\"'\n" +
                "                    `!9899fT|!^\"'\n" +
                "                      `!^\"'");

        System.out.println("It’s 2018 and you are staying up late trying to finish your coding H.W..\n" +
                "\nsadly it’s too much for you to handle in one night and you fall asleep at your computer when all of a sudden...\n" +
                "\n" +
                "You are teleported into a world similar to feudal Japan where the Samurai still roam the land. \n" +
                "\nYou have no idea how you got there but decide to make the most of it \n" +
                "\nwhile you look for a way to get back to your world…\n" +
                "\n" +
                "Looking around you notice your inventory \n");

        playerWeapon = "Sword";

        System.out.println("Your HP: " + playerHp);

        System.out.println("Your Weapon: " + playerWeapon + "\n");

        System.out.println("Please enter your name:");

        playerName = scanner.nextLine();

        System.out.println("\n" + "Welcome " + playerName + " to a viable minimal product (^_^)");

    }

    public void villageRoad() {


        boolean continueGame = true;
        do {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("So to set this journey off you decide to walk in a random direction\n" +
                    "\nBecause well it's not like you'll get lost right ¯\\_(ツ)_/¯...\n");
            System.out.println("How wrong can you be??!! After walking for only 10 secs.. \n" +
                    "\nYou've come to an area in the forest with 4 paths to go through..\n");
            System.out.println("1: Go north");
            System.out.println("2: Go east");
            System.out.println("3: Go south");
            System.out.println("4: Go west");
            System.out.println("\n------------------------------------------------------------------\n");

            System.out.println("Please enter a number choice");


            String decision;
            decision = scanner.nextLine();

            switch (decision) {
                case "1":
                    north();
                    break;
                case "2":
                    east();
                    break;

                case "3":
                    continueGame = villageEntrance();
                    break;

                case "4":
                    west();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }

            if (!continueGame) {
                break;
            }
        } while (continueGame);


    }

    public void north() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("There is a river. You drink the water and rest at the riverside.");
        System.out.println("Your HP is recovered.");
        playerHp = playerHp + 5;

        System.out.println("Your HP is " + playerHp);


        if (playerHp >= 40) {
            System.out.println("Your are super bloated and cannot drink any more water... your HP is " + playerHp);
            playerHp = playerHp - 5;
        }


        System.out.println("\n\n1: Go to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        String decision = scanner.nextLine();


    }

    public void west() {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You encounter Ronald McDonald!!!\n");
        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        String decision = scanner.nextLine();

        if (decision.contains("1")) {
            fight();
        } else if (decision.contains("2")) {

        } else {

        }
    }

    public void east() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You walked into a clearing and find the Masamune!!!");
        playerWeapon = "Masamune";
        System.out.println("Your Weapon is now the : " + playerWeapon);
        System.out.println("\n\n1: Go to the crossroad?");
        System.out.println("\n------------------------------------------------------------------\n");

        String decision = scanner.nextLine();

        if (decision.equals("1")) {

        } else {
        }
    }

    public boolean villageEntrance() {


        while (true) {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You are at the gate of the town.\n");
            System.out.println("An old Samurai is standing in front of you.");
            System.out.println("");
            System.out.println("What do you want to do?");
            System.out.println("");
            System.out.println("1: Talk to the Samurai?");
            System.out.println("2: Attack the Samurai?");
            System.out.println("3: Leave");
            System.out.println("\n------------------------------------------------------------------\n");

            String decision = scanner.nextLine();

            if (decision.contains("1") && burgerKing == 1) {
                ending();
                return false;


            } else if (decision.contains("1")) {
                System.out.println("Samurai: Hello there, stranger. So your name is " + playerName + "...?\n" +
                        " \nSorry but we cannot let a stranger enter into our town.\n" +
                        " \nPlus we are super hungry so come back another time..\n");
                System.out.println("Press Enter to continue..");

                enter.nextLine();



            } else if (decision.contains("2")) {
                playerHp = playerHp - 1;
                System.out.println("Old Samurai: Hey don't be stupid " + playerName + "...\n\nThe samurai hit you so hard and you gave up.\n(You receive 3 damage)\n");
                System.out.println("Your HP: " + playerHp);
                enter.nextLine();


            } else if (decision.contains("3")) {
                break;
            }
        }
        return true;
    }


    private void ending() {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Guard: Oh you killed Ronald McDonald!?? Great..He stole our Burger King\n" +
                "\nThat's why we've been so hungry..!\n");
        System.out.println("Guard: It seems you are a trustworthy person. Welcome to our town!");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n------------------------------------------------------------------\n");



    }


    private void fight() {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: " + playerHp);
        System.out.println("Ronald's HP is : " + ronaldHP);
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        String decision = scanner.nextLine();

        if (decision.contains("1")) {
            attack();
        } else if (decision.contains("2")) {

        } else {

        }

    }

    private void attack() {

        int playerDamage = 0;


        if (playerWeapon.equals("Knife")) {
            playerDamage = new java.util.Random().nextInt(5);
        } else if (playerWeapon.equals("Masamune")) {
            playerDamage = new java.util.Random().nextInt(8);
        }

        System.out.println("You attacked Ronald McDonald.. and gave " + playerDamage + " damage!");

        ronaldHP = ronaldHP - playerDamage;

        System.out.println("Ronald's HP: " + ronaldHP);

        if (ronaldHP < 1) {
            win();
        } else if (ronaldHP > 0) {

            int monsterDamage = 0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("Ronald attacked you and gave " + monsterDamage + " damage!");

            playerHp = playerHp - monsterDamage;

            System.out.println("Player HP :" + playerHp);

            if (playerHp < 1) {
                dead();
            } else if (playerHp > 0) {
                fight();
            }
        }

    }

    private void dead() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n------------------------------------------------------------------\n");


    }

    private void win() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You killed Ronald McDonald!!!");
        System.out.println("Ronald dropped a bag full of Burger King!!");
        System.out.println("You obtained Burger King!\n\n");
        System.out.println("1: Go back to crossroads");
        System.out.println("\n------------------------------------------------------------------\n");

        burgerKing = 1;

        String decision = scanner.nextLine();

        if (decision.contains("1")) {

        } else {
        }


    }


    @Override
    public void startGame() {
        playerIntro();
        villageRoad();
    }
}
