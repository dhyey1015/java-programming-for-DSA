import java.util.Scanner;

public class Switch{
    public static void main(String args[]){
        Scanner scanf = new Scanner(System.in);
        int button  = scanf.nextInt();

        switch (button) {
            case 1:
                System.err.println("Hello");
                break;
            case 2:
                System.err.println("Namaste");
                break;
            case 3:
                System.err.println("Bonjour");
                break;
        
            default:
                break;
        }
    }
}