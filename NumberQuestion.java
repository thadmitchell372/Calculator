package com.company;

import java.util.Scanner;

public class NumberQuestion {
    public static void numberQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add, subtract, multiply, divide, sine, cosine, tangent, factorial, or take the square root?");
        String answer = input.nextLine();


        if (answer.equals("add")){
            Calculations.Add();
        } else if (answer.equals("subtract")){
            Calculations.Subtract();
        } else if (answer.equals("multiply")){
            Calculations.Multiply();
        } else if (answer.equals("divide")){
            Calculations.Divide();
        } else if (answer.equals("square root")){
            Calculations.SquareRoot();
        }else if (answer.equals("sine")){
            Calculations.Sine();
        } else if (answer.equals("cosine")){
            Calculations.Cosine();
        } else if (answer.equals("tangent")){
            Calculations.Tangent();
        } else if (answer.equals("factorial")){
            Calculations.Factorial();
        }
        else {
            System.out.println("I am sorry, but you have entered an incorrect input. Please try again");
            NumberQuestion.numberQuestion();
        }
    }
}
