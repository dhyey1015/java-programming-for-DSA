

public class Pattern8 {
    public static void main(String args[]){
        int total = 0;
        for(int i = 0; i < 5; i++){
            for( int j = 0; j <= i; j++){
                total+= 1;
                System.out.print(" "+total);
            }
            System.out.print("\n");
        }
    }    
}
