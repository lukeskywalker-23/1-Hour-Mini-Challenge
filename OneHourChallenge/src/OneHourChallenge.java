import java.util.Scanner;

public class OneHourChallenge {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Wlcome to the two number calculator app");
        System.out.println("What is the first number you would like to use?");
        int a= scan.nextInt();
        System.out.println("What is the second number you would like to use?");
        int b= scan.nextInt();
        System.out.println("Your addition number is");
        Addition(a, b);
        System.out.println("Your subtraction number is");
        Subtraction(a,b);

    }
    public static void Addition(int a, int b){
        System.out.println(a+b);


    }
    public static void Subtraction(int a, int b){
        System.out.println(a-b);


    }
}
