package org.yup;

import java.util.Scanner;
public class JavaChallengesApp {


    //this runs greeting
    //stores in greeting variable created
    public static void main(String[] args) {
        //this code is running greetings :)
        //
        // create new instance to make challenges in the app
        Challenges challenges = new Challenges();
        String greeting = challenges.greeting("Alex", 21);

        System.out.println(greeting);

    }


    // let ppl in if 21 and up
// POLITELY say no if 21 and younger
    public String greetingWithUserInput() {
        Scanner theScanner = new Scanner(System.in);

        //ask user name
        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        //ask user age
        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();


        // let ppl in if 21 and up
        // POLITELY say no if 21 and younger
        if (age >= 21) {
            return "Hello, " + name + ", welcome to the party!";

        } else {

            //when condition is false
            return "Hello, " + name + ", I am sorry but we cannot let you into the party";
        }
    }
}
