
public class Pattern5 {

    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            //for space
            for(int j = 0; j < 4 - i; j++){
                System.out.print("  ");
            }

            //for star
            for(int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}