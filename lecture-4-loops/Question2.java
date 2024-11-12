import java.util.Scanner;

public class Question2 {

    public static void main(String agrs[]){
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        int mul = 0;
        for(int i = 1; i <= 10; i++){
            mul = n * i;
            System.out.println(n + " x " + i + " = "+ mul);
        }
    }        
}