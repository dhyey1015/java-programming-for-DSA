import java.util.Scanner;

public class IfElse{
    public static void main(String agrs[]){
        Scanner scanf = new Scanner(System.in);
        //Question1

        int age = scanf.nextInt();
        System.out.println("your age is: " + age);
        if(age>= 18){
            System.out.println("Your are an adult");
        }
        else{
            System.out.println("Your are not an adult");
        }
        //Question2
        int x = scanf.nextInt();

        if(x % 2 == 0){
            System.out.println("Number is Even!!");
        }
        else{
            System.out.println("Number is Odd!!");
        }
    }
}