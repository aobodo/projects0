import java.util.Scanner;
 
public class Main{

    public static void main(String[] args) {

        int k, number, actualNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K:");
        k = sc.nextInt();
        System.out.println("Enter the number between 1 to 100:");
        number = sc.nextInt();
        actualNumber = (int)(Math.random() * 100 + 1); //generates a random number between 1 and 100;           

        for(int i = 1; i <= k; i++){

            if(number < actualNumber)

            {
                System.out.println("You have entered a smaller number");

            }

            else if (number > actualNumber) 

            {

                System.out.println("You have entered a greater number");

            } 
            else     //if the guessed number is equal to the generated number;

            {   

                System.out.println("You have Won !!");   //the user wins; 
                break;    //exits out of the loop; 

            }
            System.out.println("Enter the number again");
            number = sc.nextInt();

        }
        if(number != actualNumber)    //if the user is not able to guess the correct number within K trials; 

        {
            System.out.println("You have Lost !!");
            System.out.println("The actual number was " + actualNumber);

        }         

    }

}// Created by Alex Obodo