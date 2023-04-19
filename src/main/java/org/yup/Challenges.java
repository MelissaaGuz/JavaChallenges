package org.yup;
//both are in same package

import java.util.Scanner;

public class Challenges {

    public String greetingWithUserInput{
        if(age >= 21){
            return "Hello, " + name + ", welcome to the party!";
        } else{
            //when condition is false
            return "Hello, " + name + ", I am sorry but we cannot let you into the party";
        }
    }
    public String greetingWithUserInput{

    }
        if( age >= 21){
        return "Hello, " + name + ", welcome to the party!";
        } else{
            //when condition is false
        return "Hello, " + name + ", I am sorry but we cannot let you into the party";
        }
}
    //
            //when condition is false
            return "Hello, " + name + ", I am sorry but we cannot let you into the party";
        }
    }
    \
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
\
    //create a method like the one shone above, subtractNumbers
    public int subtractTwoNumbers(){

    Scanner theScanner = newScanner(System.in);

    //ask user for number1
    System.out.print("Give me a number please. ");
    int number1 = theScanner.nextInt();

    //ask for user number2
        System.out.print("Give me another number please.");
        int number2 = theScanner.nextInt();

        return number1 - number2;

}
\
//create a method like the one shone above, multiplyNumbers
public int multiplyTwoNumbers(){

        Scanner theScanner = newScanner(System.in);

        //ask user for number1
        System.out.print("Enter a number to multiply please. ");
        int number1 = theScanner.nextInt();

        //ask for user number2
        System.out.print("Enter a second number to multiply please.");
        int number2 = theScanner.nextInt();

        //return the multiplication
        return number1 * number2;

        }
\
public int interactiveCalculator(){

        Scanner theScanner = new Scanner(System.in);

      \  // fires up scanner
        System.out.println("Welcome to the calculator! ");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.println("Enter your selection and press ENTER: ");

        //the selection is started in userSelection
        int userSelection = theScanner.nextInt();

        switch (userSelection){

        case 1:

        result = System.out.println("Press 1 to add numbers");

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
        \

        public String findBiggestNumber(){
    //lets us take input from user
    Scanner theScanner = newScanner(system.in);

    //this is where we ask user for input
    System.out.print("give me the first number please: ");

    //capture input and stores into variable called firstNumber
    int firstNumber = theScanner.nextInt();
    \
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
        \//scanner tjhat lets us take input from the user
        Scanner theScanner = newScanner(System.in);

        System.out.print("Provide a word to convert to all UPPERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + "and we converted to: " + theWord.toUppercase();
        }
}

