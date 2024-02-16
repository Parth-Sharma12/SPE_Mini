package com.example.spe_task;
////
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
@RestController
public class SpeTaskApplication {
    @GetMapping
    public static void main(String[] args) throws IOException, InterruptedException {
        String c, n, x;
        double a, b, add, div, sub, mul, fct=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\n         Scientific Calculator \n Enter your choice to perform an action:  \n" );
            System.out.println("Enter 1 for Addition(+) \n 2 for Subtraction(-) \n 3 for Multiplication(x) \n 4 for Division(÷) \n 5 for power \n 6 for factorial \n 7 for Squareroot\n  0 for Exit \n=> ");
            x = br.readLine();
            int s = Integer.parseInt(x);
            switch (s) {
                case 1 -> {
                    System.out.println("\n Enter 1st number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" Enter 2nd number: ");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    double ans = add(a,b);
                    System.out.println("The addition of the numbers: " + a + "+" + b + " = " + ans);
                }
                case 2 -> {
                    System.out.println("\n Enter 1st number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" Enter 2nd number: ");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    double ans = subtract(a,b);
                    System.out.println("The subtraction of the numbers: " + a + "-" + b + " = " + ans);
                }
                case 3 -> {
                    System.out.println("\nEnter 1st number:");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println("\nEnter 2nd number:");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    double ans =  multiply(a,b);
                    System.out.println("The Multiplication of the number :" + a + "x" + b + "=" + ans );

                }
                case 4 -> {
                    System.out.println("\n Enter 1st number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println(" Enter 2nd number: ");
                    n = br.readLine();
                    b = Double.parseDouble(n);
                    division(a,b);
                }
                case 5 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    System.out.println("Enter ^ :");
                    n = br.readLine();
                    b=Double.parseDouble(n);
                    power(a,b);
                }
                case 6 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    factorial(a);

                }
                case 7 -> {
                    System.out.println("\n Enter the number: ");
                    c = br.readLine();
                    a = Double.parseDouble(c);
                    root(a);
                }


                case 0 -> {
                    System.out.println("\n Exiting Program...");
                    System.exit(0);
                }
                default -> System.out.println("Enter valid choice!");
            }
            Thread.sleep(2000);
        }
    }
    public static double add(double num1,double num2){
        double add = num1 + num2;
        return add;
    }
    public static double subtract(double num1,double num2){
        double subtract = num1 - num2;
        return subtract;
    }
    public static double multiply(double num1,double num2){
        double mul = num1 * num2;
        return mul;
    }
    public static double division(double num1,double num2){
        double div = num1 / num2;
        System.out.println("The divison of the numbers: " + num1 + "/" + num2 + " = " + div);
        return div;
    }
    public static double power(double num1,double num2){

        System.out.println("Result: " + num1 + "+" + num2 + " = " + Math.pow(num1, num2));
        return Math.pow(num1, num2);
    }
    public static double factorial(double num1){
        double fct =1;
        for(int i=1;i<=num1;i++){
            fct=fct*i;
        }
        System.out.println(num1+"! = "+fct);
        return fct;
    }

    public static double root(double num1){
        System.out.println(" √"+num1+" = "+Math.pow(num1, 0.5));
        return Math.pow(num1, 0.5);
    }


}

