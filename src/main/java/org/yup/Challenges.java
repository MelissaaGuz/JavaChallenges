package org.yup;
//both are in same package

import java.util.Scanner;

public class Challenges {

    public String greeting(String name,int age){
        if(age >= 21){
            return "Hello, " + name + ", welcome to the party!";
        } else{
            //when condition is false
            return "Hello, " + name + ", I am sorry but we cannot let you into the party";
        }
    }

    public String greetingWithUserInput(){
        Scanner theScanner = new Scanner(System.in);

        //name
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        //age
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        //age formula
        if( age >= 21){
        return "Hello, " + name + ", welcome to the party!";
        //else variable
        } else{
            //when condition is false
        return "Hello, " + name + ", I am sorry but we cannot let you into the party";
        }
    }

    public int addTwoNumbers(){

        Scanner theScanner = new Scanner(System.in);

        //ask the user for number 1
        System.out.print("Give me another number, please. ");
        int number1 = theScanner.nextInt();

        //ask the user for number 2
        System.out.print("Give me another number, please. ");
        int number2 = theScanner.nextInt();

        //return the sum of number1 and number 2 both
        return number1 + number2;
    }

    //create a method like the one shone above, subtractNumbers
    public int subtractTwoNumbers(){

    Scanner theScanner = new Scanner(System.in);

    //ask user for number1
    System.out.print("Give me a number please. ");
    int number1 = theScanner.nextInt();

    //ask for user number2
        System.out.print("Give me another number please.");
        int number2 = theScanner.nextInt();

        return number1 - number2;

}

//create a method like the one shone above, multiplyNumbers
public int multiplyTwoNumbers(){

        Scanner theScanner = new Scanner(System.in);

        //ask user for number1
        System.out.print("Enter a number to multiply please. ");
        int number1 = theScanner.nextInt();

        //ask for user number2
        System.out.print("Enter a second number to multiply please.");
        int number2 = theScanner.nextInt();

        //return the multiplication
        return number1 * number2;

        }

public int interactiveCalculator(){

        Scanner theScanner = new Scanner(System.in);

      // fires up scanner
        System.out.println("Welcome to the calculator! ");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.println("Enter your selection and press ENTER: ");

        //the selection is started in userSelection
        int userSelection = theScanner.nextInt();

        int result;

        switch (userSelection){

        case 1:

        result = This.;
        break;

        case 2:

        result = System.out.println("Press 2 to subtract numbers");

        break;

        case 3:

        result = System.out.println("Press 3 to multiply numbers");

        break;

default:
        result = System.out.println("User chose nonsense");
        result = 0;
        }
        return result;
        }

    public String findBiggestNumber(){
    //lets us take input from user
    Scanner theScanner = new Scanner(System.in);

    //this is where we ask user for input
    System.out.print("give me the first number please: ");

    //capture input and stores into variable called firstNumber
    int firstNumber = theScanner.nextInt();

        //this is where we ask user for input
        System.out.print("give me the second number please: ");

        //capture input and stores into variable called firstNumber
        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.mox(firstNumber, secondNumber);

        return "The Biggest number between " + firstNumber + "and " + secondNumber + "is " + BiggestNumber;
        }


    //public String findSmallestNumber();
        //reference the above method
        //public int findTheDifferneceBetweenTwoNumbers();
        //Math.abs()

}
    public String convertToUppercase();{
        //scanner tjhat lets us take input from the user
        Scanner theScanner = newScanner(System.in);

        System.out.print("Provide a word to convert to all UPPERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + "and we converted to: " + theWord.toUppercase();
        }


public String coinFlip(){
        //attempt to flip a coin
        // return heads or tails
        // this is where we flip the coin
        if(Math.random()>.5){

        //here is where we return heads
        if the number generated was>.5
        return"heads";
        }else{

        //there is where we return
        if the number generated was less than.
        return"tails";}
        }


//method that counts from 1-10
        public void countToTen(){

        for(int i = 1; i <= 10; i++){

        //run some code
        System.out.println(i);
        }
    }

//make a method that counts from 10 to 1
    public void countBackwardsToTen(){

        for(int i = 10; i => 1; i++){
            //run
        System.out.println(i);

        }
    }

//make a method that counts from 1 - 100 but in increments of 2
 public void countsToHundred(){

        for(int i = 1; i <= 100; i++){
            //run
        system.out.println(1);

        }

    }

//make a method that counts free 0 - 50 but only prints even numbers
    public void countToFifty(0{

        for (int i = 0; i <= 50; i+= 2){

        }
    }

    //make method from 0-50 but only even numbers
public void zeroToFiftyEven(){

        int i = 0;
        while(i <= 50){

            //hey code is even
        if(i % 2 == 0)
        }
        }

