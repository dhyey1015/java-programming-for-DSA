
public class Pattern7 {

    public static void main(String args[]){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < ((4-i)+1); j++){
                System.out.print((j+1) + " ");
            }
            System.out.print("\n");
        }
    }
}