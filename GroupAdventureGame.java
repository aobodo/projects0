import java.util.Scanner;
import java.util.Random;

public class WarmUpAssignment {
    Scanner userScanner = new Scanner(System.in);
    Random rand = new Random();
    int playerHealth;
    String playerName;
    String startingWeapon;
    int enemyHealth;
    int choice;


    public void gameStart() {
        playerHealth = 75;    //How much health the player has
        int bossHealth = 100;     // How much health the boss has
        System.out.println("Enter your fighter's name: ");
        playerName = userScanner.nextLine();
        System.out.println("Choose your weapon:");
        System.out.print("Sword" + "\n" + "Whip" + "\n" + "Boomerang");
        startingWeapon = userScanner.nextLine();
        System.out.println("Thanks for playing" + playerName + ". Your current health is" + playerHealth + ". Here we go!");
    }

    public static void main(String[] args) {
        WarmUpAssignment arena;
        arena = new WarmUpAssignment();
        arena.gameStart();
        arena.levelOne(); //Group Member's Part
        arena.levelTwo();//Group Member's Part
        arena.levelThree(); //Group Member's Part
        arena.levelFour(); //Alex Obodo's part
        arena.BossFight(); //Group Member's Part
    }

    public void levelOne() {
        System.out.println("Welcome to your first fight.");
        System.out.println("Your opponent is very skilled in hand to hand combat, try your best to keep your range ");
        System.out.println("Option 1: Use your weapon to keep your distance and strike from a far.");
        System.out.println("Option 2: Play defensively until he is tired");
        System.out.println("Option 1 or 2? Please type the number you want");
        int option = userScanner.nextInt();

        if (option == 1) {
            System.out.println("You used the " + startingWeapon + " to outplay your oppenent.");
            System.out.println("The move was a huge success, the opponenet fell hard and was out");
            System.out.println("You have passed the first level!");
            levelTwo();
        }

        else if (option == 2) {
            System.out.println("You decided to tire him out");
            System.out.println("You didn't consider his mighty power, the opponent hits you once and you are out");
            System.out.println("Better luck next level");
        }
    }

    public void levelTwo() {
        System.out.println("Welcome to the second fight.");
        System.out.println("You see a samurai standing in the other corner with his masumane blade");
        System.out.println("What will you do?");
        System.out.println("Option 1: Try to outmatch him with your" + startingWeapon );
        System.out.println("Option 2: Disarm him and use his weapon");
        System.out.println("Option 1 or 2? Please type the number you want");
        int option = userScanner.nextInt();
        if (option == 1) {
            System.out.println("The samurai was way to fast for you, he sliced your hand off to disarm you and you lost");
            System.out.println("Better luck next time");
        }
        else if (option == 2) {
            System.out.println("You slipped behind him and put his right arm in an arm lock, the blade falls...");
            System.out.println("Option 1: Let him go and grab the blade");
            System.out.println("Option 2: Finish him");
            int decision = userScanner.nextInt();
            if (decision == 1) {
                System.out.println("He took advantage of your greediness and hit you while you were grabbing the blade");
                System.out.println("Better luck next time");

            }
            else if (decision == 2) {
                System.out.print("You grab him and throw him out of the arena");
                System.out.print("");
                levelThree(); //ques level three
            }
        }

    }
    //Theos level
    public void levelThree() {
        System.out.println("Welcome to your third fight.");
        System.out.println("Your opponent the Axe Man is very skillful with his axe , one hit can take you out. However, his heavy axe also slows his attack speed.");
        System.out.println("Option 1: Charge at your opponent and land a hard strike with your weapon.");
        System.out.println("Option 2: Swap your weapon for a Bow and Arrow");
        System.out.println("Option 1 or 2? Please type the number you want");
        int option = userScanner.nextInt();

        if (option == 1) {
            System.out.println("You used the " + startingWeapon + " to strike the Axe Man.");
            System.out.println("Oh no! Your opponent dodged your strike and swung his axe to finish you off.");
            System.out.println("You have failed the third level!");

        }

        else if (option == 2) {
            System.out.println("You decided to pick up a Bow and Arrow");
            System.out.println("Your opponent noticed this and decides to rush at you");
            System.out.println("Think fast! You decide to either shoot and aim for the heart or head, Choose 1 for head and 2 for heart.");

        }
        int option2 = userScanner.nextInt();
        if (option2 == 1) {
            System.out.println("Congrats!, Your opponent was knocked out, you have passed this level");
            //que next level
            levelFour();
        }
        else if (option2 == 2) {
            System.out.println("Woops!, You missed and your opponent got the best of you, Better luck next time!");

        }



    }
    public void levelFour(){
        //This Level Was Created By Alex Obodo
        System.out.println("Welcome to the fourth level.");
        System.out.println("Your oppenent is called The Sorcerer.");
        Scanner myObj = new Scanner(System.in);
        String Companion;
        System.out.println("Choose your companion: ");
        System.out.print("Mage" + "\n" + "Warrior" + '\n' + "Hunter" + '\n' + "Cleric" + "\n");
        String Mage = "mage";
        String Cleric = "cleric";
        String Hunter = "hunter";
        String Warrior = "warrior";
        Companion = myObj.nextLine();
        System.out.println("With the help of your " + Companion + ", defeat the Sorcerer to progress to the next location!");
        System.out.println("You approach the Sorcerer. What will you do?");
        System.out.println("Option 1: Command your " + Companion + " to deliver the first strike. Which will take 75% of the Sorcerer's health.");
        System.out.println("Option 2: Use your bow and arrow to attack The Sorcerer and take half of their health.");
        System.out.println("Option 1 or 2? Please type the number you want.");
        int option = userScanner.nextInt();
        if (option == 1) {
            
            System.out.println("The sorcerer is severely wounded.");
            System.out.println("Your " + Companion + " needs to recharge their attack. What will you do?");
            System.out.println("Option 1: Defend yourself and let your " + Companion + " attack.");
            System.out.println("Option 2: Attack the Sorcerer.");
            int option2 = userScanner.nextInt();
            if (option2 == 1){
                System.out.println("Congrats your opponent was defeated. You may go the next and final level.");
                // levelFive(); //Player goes to level 5
                
            }
            if (option2 == 2){
                System.out.println("Congrats your opponent was defeated. You may go the next and final level.");
                // levelFive(); //Player goes to level 5
            }
        }
        if (option == 2){
            System.out.println("You have attacked the Sorcerer. You now have two options.");
            System.out.println("Option 1: Command your " + Companion + " to attack the Sorcerer.");
            System.out.println("Option 2: Use five arrows to attack the Sorcerer.");
            int option3 = userScanner.nextInt();
            if (option3 == 1){
                System.out.println("The Sorcerer casted a spell to divert the attack back to you and your " + Companion + "." );
                System.out.println("Better luck next time!Try your luck with the next level.");
                //levelFive(); //The player goes to the fifth level


            }
            if (option3 == 2){
                System.out.println("Your attack takes 25 percent of the sorcerer's health. So the Sorcerer has 25% health left.");
                System.out.println("You now have two options.");
                System.out.println("Option 1: Attack the Sorcerer.");
                System.out.println("Option 2: Command your companion to attack the Sorcerer.");
                int option4 = userScanner.nextInt();
                if (option4 == 1){
                    System.out.println("The Sorcerer casts a lighting spell and kills you and the companion.");
                    System.out.println("Better luck next time! Try your luck with the next level."); 
                   // levelFive(); //The player goes to the fifth level

                }
                if (option4 == 2){
                    System.out.println("The Sorcerer summons a powerful monster that kills you and your " + Companion + ".");
                    System.out.println("Nice try, but not quite! Try your luck with the next level.");
                   // levelFive(); //The player goes to the fifth level

                }
            }
        }
    }//End of Level Four
    public void BossFight() {
        Scanner input = new Scanner(System.in);
        int choiceOne;
        int choiceTwo;
        int choiceThree;

        //Dialogue
        System.out.println("Boss Fight Time!");
        System.out.println("Two large doors tower over you as you pass through a");
        System.out.println("   hall filled with skeletons. You grab the strongest");
        System.out.println("   looking sword before you push the doors open. \n");
        System.out.println("You walk into a dimly lit chamber with a lone figure");
        System.out.println("   sitting upon a throne.\\n");
        System.out.println("\"Ah, so you have finally arrived " + playerName + "!\"\n");
        System.out.println("They get up and slowly make their way towards you.");
        System.out.println("   The dark figure getting larger as heavy footsteps ");
        System.out.println("   echo throughout the entire room. You slowly ");
        System.out.println("   notice the horns protruding through their head ");
        System.out.println("   and a claw to replace their left hand.\n");

        System.out.println("What will you do? ");
        System.out.println("1) Prepare to fight");
        System.out.println("2) Try to reason with them");
        System.out.println("3) Run away as fast as possible");
        choiceOne = input.nextInt();

        //Part 1
        if (choiceOne == 1) {
            System.out.println("You stand ready, sword aimed towards the ");
            System.out.println("   monster-esque creature. It gives a deep");
            System.out.println("   laugh as it stands a few feet ahead of you. \n");
            System.out.println("\"Ah, straight to the point you are. Well, ");
            System.out.println("   let's get to it!\"\n");

            System.out.println("What will you do?");
            System.out.println("1) Charge ahead before they so anything.");
            System.out.println("2) Prepare to defend yourself.");
            choiceTwo = input.nextInt();

            if (choiceTwo == 1) {
                System.out.println("You muster all your courage and charge");
                System.out.println("   straight towards them. Unfortunately,");
                System.out.println("   they're faster than you and easily");
                System.out.println("   pierce through your body as your");
                System.out.println("   mind starts to go blank.\n");
                System.out.println("BAD FIGHT ENDING");
            } else if (choiceTwo == 2) {
                System.out.println("You muster all your strength to protect");
                System.out.println("   yourself. The monster leaps forward and");
                System.out.println("   meets your block head on. You manage to");
                System.out.println("   slide inside and with one quick slice, ");
                System.out.println("   split it in half.\n");
                System.out.println("GOOD FIGHT ENDING");
            }
        }

        //Part 2
        else if (choiceOne == 2) {
            System.out.println("The monster-like creature regards you, surprised");
            System.out.println("   about wanting to talk.\n");
            System.out.println("What will you ask?");
            System.out.println("1) \"Why are you here?\"");
            System.out.println("2) \"Who are you?\"");
            choiceTwo = input.nextInt();

            if (choiceTwo == 1) {
                System.out.println("\"Why am I here? I live here.");
                System.out.println("   Why are you here?\" The ");
                System.out.println("   creature asks you.\n");
                System.out.println("How do you respond?");
                System.out.println("1) Apologize and leave");
                System.out.println("2) Ask to be roomates");
                choiceThree = input.nextInt();

                if (choiceThree == 1) {
                    System.out.println("You apologize to them and start");
                    System.out.println("   to head out of the chamber.\n");
                    System.out.println("APOLOGY ENDING");
                } else if (choiceThree == 2) {
                    System.out.println("You say that you need a roomate");
                    System.out.println("   and are willing to pay rent.");
                    System.out.println("   They shurg your shoulders and");
                    System.out.println("   give you a tour.\n");
                    System.out.println("ROOMATE ENDING");
                }

            } else if (choiceTwo == 2) {
                System.out.println("\"Who I am is insignificant at the moment.");
                System.out.println("   What matters more is if you are prepared");
                System.out.println("   to face your punishment for trespassing ");
                System.out.println("   into my chamber\"\n");
                System.out.println("The creature leaps forwards, claws at the");
                System.out.println("   ready to slice you.\n");

                System.out.println("What will you do?");
                System.out.println("1) Parry the attack");
                System.out.println("2) Dodge the assult");
                System.out.println("3) Run Away");
                choiceThree = input.nextInt();

                if (choiceThree == 1) {
                    System.out.println("You barely manage to raise your sword");
                    System.out.println("   in time to block the attack. You try");
                    System.out.println("   to go into the offensive, but they");
                    System.out.println("   manage to overpower you. The blade");
                    System.out.println("   breaks and the claws dig deep inside.");
                    System.out.println("   Your vision goes dark.\n");
                    System.out.println("BAD FIGHT ENDING 2");
                } else if (choiceThree == 2) {
                    System.out.println("You roll out of the way as the claw strikes");
                    System.out.println("   right where you once stood. In that moment,");
                    System.out.println("   you lunge right back and stab the creature");
                    System.out.println("   right at its side. It screeches out in pain");
                    System.out.println("   as the body slumps to the ground.\n");
                    System.out.println("GOOD FIGHT ENDING 2");
                } else if (choiceThree == 3) {
                    System.out.println("You try to run away for the creature to");
                    System.out.println("   quickly catch up and sink their claws");
                    System.out.println("   right into you. In the next moment, ");
                    System.out.println("   everything goes black.\n");
                    System.out.println("COWARD ENDING 2");
                }
            }
        }

        //Part 3
        else if (choiceOne == 3) {
            System.out.println("You ran away before they had the");
            System.out.println("   chance to do anything to you.\n");
            System.out.println("COWARD ENDING");
        }
    }
} //end of program

