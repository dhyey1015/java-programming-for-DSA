import java.util.Scanner;

public class Question1 {

    public static void main(String agrs[]){
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        int total = 0;
        for(int i = 1; i <= n; i++){
            total += i;
        }
        System.out.println("Your total is: " + total);
    }        
}