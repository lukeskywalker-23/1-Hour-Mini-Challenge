import java.util.Scanner;
public class Mini_Challange{
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("welcome to the celculator app");
    System.out.println("We are small so we can only add and subtract");
    System.out.println("Enter your first number ");
int a = scan.nextInt();
System.out.println("Enter your second number");
int b= scan.nextInt();
System.out.println("your addation number is");
Add(a,b);
System.out.println("yout subtraction number is");
sub(a,b);
}

public static void Add(int a, int b ){
    System.out.println(a+b);
}

public static void sub(int a, int b){
    System.out.println(a-b);
}







}